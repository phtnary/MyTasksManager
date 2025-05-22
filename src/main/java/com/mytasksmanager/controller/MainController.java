package com.mytasksmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mytasksmanager.model.Section;
import com.mytasksmanager.service.SectionService;

import jakarta.validation.Valid;

@RestController
public class MainController {
	
	
	@Autowired
	SectionService sectionService;

	@GetMapping("/hello")
	
	public String sayHello() {

	return "Hello";
	
	}
	
	
	
	@GetMapping("/sections")
	
	public ResponseEntity <List <Section>> ShowSections() {
	
		List <Section> sections= sectionService.getAllSections();
		
		if (sections.isEmpty()) {
			//return ResponseEntity.notFound().build();
		   throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay elementos para ese criterio de búsqueda");
		}
	
		return ResponseEntity.ok(sections);
		

	}
	
	
	@PostMapping("/section")
	
	public ResponseEntity <Section> createSection (@Valid @RequestBody Section section){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(sectionService.addSection(section));
		
	}
	
	
	@GetMapping("/section/{id:[0-9]+}")	
	
	public ResponseEntity<Section> getById (@PathVariable Long id){
		//return ResponseEntity.of(sectionService.getSectionById(id));
		if (sectionService.getSectionById(id).isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe section con ese id");
		}
		return ResponseEntity.of(sectionService.getSectionById(id));
								
	}
		
		
	@PutMapping("/section/{id:[0-9]+}")
	
	public ResponseEntity<Section> editSection(@Valid @RequestBody Section section){
		
		return ResponseEntity.of(sectionService.editSection(section));
	}
	
	
	@DeleteMapping("/section/{id:[0-9]+}")
	public ResponseEntity<?> deleteSection(@PathVariable Long id){
		sectionService.deleteSection(id);
		return ResponseEntity.noContent().build();
		
	}
}
