package fr.masterwork.evanescence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.masterwork.evanescence.entities.Establishment;

@Repository
public interface InformationsEstablishmentRepository extends JpaRepository<Establishment, Long> {

    boolean existsByEmailAddressIgnoreCase(String emailAddress);

    boolean existsBysiretNumberIgnoreCase(String siretNumber);
}
