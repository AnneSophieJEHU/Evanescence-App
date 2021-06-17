package fr.masterwork.evanescence.serviceImpl;

import org.springframework.stereotype.Service;

import fr.masterwork.evanescence.repositories.InformationsCustomerIdentifierRepository;
import fr.masterwork.evanescence.services.InformationsCustomerIdentifierService;

@Service
public class InformationsCustomerIdentifierServiceImpl implements InformationsCustomerIdentifierService {

    private final InformationsCustomerIdentifierRepository repository;

    public InformationsCustomerIdentifierServiceImpl(InformationsCustomerIdentifierRepository repository) {
	this.repository = repository;
    }
    
    @Override
    public boolean customerIdentifierIsUnique(String customerIdentifier) {
	return !repository.existsByCustomerIdentifierIgnoreCase(customerIdentifier);
    }
    
    
}
