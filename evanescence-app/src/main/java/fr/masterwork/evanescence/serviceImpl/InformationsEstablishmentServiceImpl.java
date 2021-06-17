package fr.masterwork.evanescence.serviceImpl;


import org.springframework.stereotype.Service;

import fr.masterwork.evanescence.repositories.InformationsEstablishmentRepository;
import fr.masterwork.evanescence.services.InformationsEstablishmentService;

@Service
public class InformationsEstablishmentServiceImpl implements InformationsEstablishmentService {


    private final InformationsEstablishmentRepository repository;

    public InformationsEstablishmentServiceImpl(InformationsEstablishmentRepository repository) {
	this.repository = repository;
    }

    @Override
    public boolean emailAddressIsUnique(String emailAddress) {
	return !repository.existsByEmailAddressIgnoreCase(emailAddress);
    }

    @Override
    public boolean siretNumberIsUnique(String siretNumber) {
	return !repository.existsBysiretNumberIgnoreCase(siretNumber);
    }
}
