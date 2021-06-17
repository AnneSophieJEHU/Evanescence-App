package fr.masterwork.evanescence.services;

public interface InformationsEstablishmentService {

    boolean emailAddressIsUnique(String emailAddress);
    
    boolean siretNumberIsUnique(String siretNumber);

}
