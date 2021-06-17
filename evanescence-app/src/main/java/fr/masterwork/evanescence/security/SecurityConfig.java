package fr.masterwork.evanescence.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String SESSION_COOKIE = "JSESSIONID";

    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth, DataSource datasource) throws Exception {
	auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("SELECT username, password, true FROM t_client WHERE username=?")
		.authoritiesByUsernameQuery("SELECT cl.username, ro.role\r\n" + "FROM public.t_client as cl\r\n"
			+ "INNER JOIN public.t_clients_roles as clro ON clro.id_client = cl.id \r\n"
			+ "INNER JOIN public.t_role as ro ON clro.id_role = ro.id\r\n" + "WHERE username =?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	// https://docs.spring.io/spring-security/site/docs/5.0.x/reference/html/csrf.html
	// https://stackoverflow.com/questions/41827388/spring-security-keeps-redirecting-me-to-login-page
	// https://github.com/spring-guides/tut-react-and-spring-data-rest/blob/master/security/src/main/java/com/greglturnquist/payroll/SecurityConfiguration.java
	http.csrf().disable().authorizeRequests()
		.antMatchers("/individualizedProject/**").hasRole("MANAGER")
		.antMatchers("/establishment/**").hasRole("CONTRACTMANAGER")
		.anyRequest().authenticated().and().formLogin()
		.successHandler(successHandler()).failureHandler(failureHandler()).and().exceptionHandling()
		.authenticationEntryPoint(authenticationEntryPoint()).and().logout().clearAuthentication(true)
		.invalidateHttpSession(true).deleteCookies(SESSION_COOKIE);
    }

    private AuthenticationEntryPoint authenticationEntryPoint() {
	return new AuthenticationEntryPoint() {
	    @Override
	    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
		    AuthenticationException e) throws IOException {
		httpServletResponse.getWriter().append("Not authenticated");
		httpServletResponse.setStatus(401);
	    }
	};
    }

    private AuthenticationSuccessHandler successHandler() {
	return new AuthenticationSuccessHandler() {
	    @Override
	    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
		    HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
		httpServletResponse.getWriter().append("OK");
		httpServletResponse.setStatus(200);
		Cookie jsessionid = new Cookie("JSESSIONID",
			RequestContextHolder.currentRequestAttributes().getSessionId());
		jsessionid.setMaxAge(3600);
		httpServletResponse.addCookie(jsessionid);
		System.out.println(RequestContextHolder.currentRequestAttributes().getSessionId());
	    }
	};
    }

    private AuthenticationFailureHandler failureHandler() {
	return new AuthenticationFailureHandler() {
	    @Override
	    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
		    HttpServletResponse httpServletResponse, AuthenticationException e)
		    throws IOException, ServletException {
		httpServletResponse.getWriter().append("Authentication failure");
		httpServletResponse.setStatus(401);
	    }
	};
    }

    @Bean
    public PasswordEncoder encoder() {
	return new BCryptPasswordEncoder();
    }
}
