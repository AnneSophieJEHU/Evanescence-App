package fr.masterwork.evanescence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fr.masterwork.evanescence.entities.Establishment;

@Repository
public interface EstablishmentRepository extends PagingAndSortingRepository<Establishment, Long> {

}
