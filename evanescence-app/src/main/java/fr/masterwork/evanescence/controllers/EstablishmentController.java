package fr.masterwork.evanescence.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import javax.validation.Valid;

import fr.masterwork.evanescence.entities.Establishment;
import fr.masterwork.evanescence.repositories.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.masterwork.evanescence.dtos.EstablishmentCreateDto;
import fr.masterwork.evanescence.dtos.EstablishmentUpdateDto;
import fr.masterwork.evanescence.services.EstablishmentService;

@RestController
@RequestMapping("/establishment")
@CrossOrigin(origins = "http://localhost:3006", allowedHeaders = "*", allowCredentials = "true")
public class EstablishmentController {
    // TODO
    // https://stackoverflow.com/questions/46288437/set-cookies-for-cross-origin-requests

    @Autowired
    private EstablishmentService establishmentService;

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @PostMapping()
    public ResponseEntity<?> create(@Valid @RequestBody EstablishmentCreateDto dto) throws URISyntaxException {
	establishmentService.createEstablishment(dto);
	URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(dto.getBusinessName()).toUri();
	return ResponseEntity.created(location).build();
    }

    @GetMapping("/establishments")
    public ResponseEntity<Page<Establishment>> establishmentsList(Pageable pageable) {
	return new ResponseEntity<>(establishmentRepository.findAll(pageable), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/getone/{id}")
    public Optional<EstablishmentUpdateDto> getEstablishmentById(@PathVariable Long id) {
	return establishmentService.findById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateEstablishmentById(@PathVariable Long id, @RequestBody EstablishmentUpdateDto dto) {
	establishmentService.update(id, dto);
	return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEstablishment(@PathVariable Long id) {
	establishmentService.deleteById(id);
	return ResponseEntity.ok().build();
    }

}
