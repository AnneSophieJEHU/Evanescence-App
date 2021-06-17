package fr.masterwork.evanescence.services;

import fr.masterwork.evanescence.dtos.IndividualizedProjectCreateDto;
import fr.masterwork.evanescence.dtos.IndividualizedProjectDto;

import javax.validation.Valid;

public interface IndividualizedProjectService {

    void createIndividualizedProject(@Valid IndividualizedProjectCreateDto dto);
    IndividualizedProjectDto findById(Long id);
    void update(Long id, IndividualizedProjectDto dto);
    void deleteById(Long id);

}
