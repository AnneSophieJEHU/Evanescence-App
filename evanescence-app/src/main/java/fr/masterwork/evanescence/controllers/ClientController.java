package fr.masterwork.evanescence.controllers;

import fr.masterwork.evanescence.serviceImpl.ClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    private static Logger logger = LogManager.getLogger("ClientController");

    @GetMapping("/users")
    private UserDetails user(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        logger.info(auth);
        logger.info(auth.getDetails());
        return  clientService.loadUserByUsername(auth.getName());
    }

}
