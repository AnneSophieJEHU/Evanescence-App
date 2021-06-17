package fr.masterwork.evanescence.controllers;

import fr.masterwork.evanescence.dtos.IndividualizedProjectCreateDto;
import fr.masterwork.evanescence.dtos.IndividualizedProjectDto;
import fr.masterwork.evanescence.entities.IndividualizedProject;
import fr.masterwork.evanescence.repositories.IndividualizedProjectRepository;
import fr.masterwork.evanescence.services.IndividualizedProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/individualizedProject")
@CrossOrigin(origins = "http://localhost:3006", allowedHeaders = "*", allowCredentials = "true")
public class IndividualizedProjectController {

    @Autowired
    private IndividualizedProjectService individualizedProjectService;

    @Autowired
    private IndividualizedProjectRepository individualizedProjectRepository;
    
    
    @PostMapping()
    public ResponseEntity<?> create(@Valid @RequestBody  IndividualizedProjectCreateDto dto) throws URISyntaxException {
	individualizedProjectService.createIndividualizedProject(dto);
	URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(dto.getPersonalData().getLastName()).toUri();
	return ResponseEntity.created(location).build();
    }

    @GetMapping("/individualizedProjects")
    public ResponseEntity<Page<IndividualizedProject>> projectsList(Pageable pageable) {
        return new ResponseEntity<>(individualizedProjectRepository.findAll(pageable), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/getone/{id}")
    public IndividualizedProjectDto getProjectById(@PathVariable Long id) {
        return individualizedProjectService.findById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateProjectById(@PathVariable Long id, @RequestBody IndividualizedProjectDto dto) {
        individualizedProjectService.update(id, dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id) {
        individualizedProjectService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
