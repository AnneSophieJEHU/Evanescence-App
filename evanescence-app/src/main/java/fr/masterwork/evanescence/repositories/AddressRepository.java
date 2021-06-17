package fr.masterwork.evanescence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.masterwork.evanescence.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
