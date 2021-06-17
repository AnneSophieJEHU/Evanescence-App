package fr.masterwork.evanescence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.masterwork.evanescence.entities.Customer;

public interface InformationsCustomerIdentifierRepository extends JpaRepository<Customer, Long>{
    
    boolean existsByCustomerIdentifierIgnoreCase(String customerIdentifier);

}
