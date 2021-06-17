package fr.masterwork.evanescence.serviceImpl;

import fr.masterwork.evanescence.entities.Client;
import fr.masterwork.evanescence.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements UserDetailsService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientRepository.findByUsername(username);
        if(client == null){
            throw new UsernameNotFoundException("Evanescence application don't know this user!" + username);
        }
        return new User(client.getUsername(), client.getPassword(), client.getAuthorities());
    }


}
