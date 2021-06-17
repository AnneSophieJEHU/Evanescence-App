package fr.masterwork.evanescence.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import fr.masterwork.evanescence.entities.IndividualizedProject;

@Repository
public interface IndividualizedProjectRepository extends PagingAndSortingRepository<IndividualizedProject, Long>{

}
