package fr.masterwork.evanescence.serviceImpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.masterwork.evanescence.entities.Establishment;
import fr.masterwork.evanescence.repositories.AddressRepository;
import fr.masterwork.evanescence.repositories.CustomerRepository;
import fr.masterwork.evanescence.repositories.EstablishmentRepository;
import fr.masterwork.evanescence.dtos.EstablishmentCreateDto;
import fr.masterwork.evanescence.dtos.EstablishmentDto;
import fr.masterwork.evanescence.dtos.EstablishmentUpdateDto;
import fr.masterwork.evanescence.services.EstablishmentService;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public void createEstablishment(EstablishmentCreateDto dto) {
        Establishment establishmentEntity = modelMapper.map(dto, Establishment.class);
        establishmentRepository.save(establishmentEntity);
        addressRepository.save(establishmentEntity.getAddressEstablishment());
        customerRepository.save(establishmentEntity.getCustomerEstablishment());
    }

/*    @Override
    public Page<EstablishmentDto> findAll(Integer page, Integer size, String sort) {
        Pageable pageEstablishment = PageRequest.of(page, size, Sort.by("businessName"));
        Page<Establishment> establishmentsEntityPage = establishmentRepository.findAll(pageEstablishment);
        List<EstablishmentDto> establishmentDtos = establishmentsEntityPage
                .stream()
                .map(establishment -> mapEntityToDto(establishment))
                .collect(Collectors.toList());
        return new PageImpl<EstablishmentDto>(establishmentDtos);
    }*/

    @Override
    public Optional<EstablishmentUpdateDto> findById(Long id) {
        Optional<Establishment> establishment = establishmentRepository.findById(id);
        EstablishmentUpdateDto establishmentDto = modelMapper.map(establishment.get(), EstablishmentUpdateDto.class);
        return Optional.of(establishmentDto);
    }

    @Override
    public void update(Long id, EstablishmentUpdateDto dto) {
        Establishment entity = establishmentRepository.findById(id).get();
        modelMapper.map(dto, entity);
        establishmentRepository.save(entity);
        addressRepository.save(entity.getAddressEstablishment());
        customerRepository.save(entity.getCustomerEstablishment());
    }

    @Override
    public void deleteById(Long id) {
        establishmentRepository.deleteById(id);
    }

}
