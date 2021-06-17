package fr.masterwork.evanescence.serviceImpl;

import javax.validation.Valid;

import fr.masterwork.evanescence.dtos.IndividualizedProjectDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.masterwork.evanescence.dtos.IndividualizedProjectCreateDto;
import fr.masterwork.evanescence.entities.IndividualizedProject;
import fr.masterwork.evanescence.repositories.IndividualizedProjectRepository;
import fr.masterwork.evanescence.repositories.PersonalDataRepository;
import fr.masterwork.evanescence.services.IndividualizedProjectService;

import java.util.Optional;

@Service
public class IndividualizedProjectServiceImpl implements IndividualizedProjectService {

    @Autowired
    private IndividualizedProjectRepository individualizedProjectRepository;

    @Autowired
    private PersonalDataRepository personalDataRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public void createIndividualizedProject(@Valid IndividualizedProjectCreateDto dto) {
	IndividualizedProject entity = modelMapper.map(dto, IndividualizedProject.class);
	individualizedProjectRepository.save(entity);
	personalDataRepository.save(entity.getPersonalData());
    }

    @Override
    public IndividualizedProjectDto findById(Long id) {
        IndividualizedProject project = individualizedProjectRepository.findById(id).get();
        return modelMapper.map(project, IndividualizedProjectDto.class);
    }

    @Override
    public void update(Long id, IndividualizedProjectDto dto) {
        IndividualizedProject project = individualizedProjectRepository.findById(id).get();
        modelMapper.map(dto, project);
        individualizedProjectRepository.save(project);
        personalDataRepository.save(project.getPersonalData());
    }

    @Override
    public void deleteById(Long id) {
        individualizedProjectRepository.deleteById(id);
    }

}
