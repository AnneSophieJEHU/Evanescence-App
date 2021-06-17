package fr.masterwork.evanescence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.masterwork.evanescence.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
