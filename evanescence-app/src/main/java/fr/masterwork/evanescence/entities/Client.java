package fr.masterwork.evanescence.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "t_client", uniqueConstraints = {
	@UniqueConstraint(columnNames = "username", name = "client_username_UNIQUE") }, indexes = {
		@Index(name = "client_id_IDX", columnList = "id") })
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_clients_roles", joinColumns = @JoinColumn(name = "idClient"), inverseJoinColumns = @JoinColumn(name = "idRole"))
    private List<Role> roles;
    
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "client_establishment_id_FK"), nullable = false)
    private Establishment establishment;

    public String getUsername() {
	return username;
    }

    public String getPassword() {
	return password;
    }

    public List<Role> getRoles() {
	return roles;
    }

    public List<GrantedAuthority> getAuthorities() {
	ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
	for (Role role : getRoles()) {
	    grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
	}
	return grantedAuthorities;
    }

}
