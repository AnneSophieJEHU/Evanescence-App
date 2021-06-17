package fr.masterwork.evanescence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.masterwork.evanescence.entities.PersonalData;

public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {

}
