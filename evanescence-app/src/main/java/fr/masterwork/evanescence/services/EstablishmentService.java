package fr.masterwork.evanescence.services;


import java.util.Optional;

import javax.validation.Valid;

import fr.masterwork.evanescence.dtos.EstablishmentCreateDto;
import fr.masterwork.evanescence.dtos.EstablishmentUpdateDto;


public interface EstablishmentService {

    public void createEstablishment(@Valid EstablishmentCreateDto dto);

    //public Page<EstablishmentDto> findAll(Integer page, Integer size, String sort);

    public Optional<EstablishmentUpdateDto> findById(Long id);

    public void update(Long id, EstablishmentUpdateDto dto);

    public void deleteById(Long id);

}
