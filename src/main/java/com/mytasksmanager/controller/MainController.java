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

import com.mytasksmanager.model.Section;
import com.mytasksmanager.service.SectionService;

@RestController
public class MainController {
	
	
	@Autowired
	SectionService sectionService;

	@GetMapping("/hello")
	
	public String sayHello() {

	return "Hello";
	
	}
	
	
	//GetAllSections
	
	@GetMapping("/sections")
	
	public ResponseEntity <List <Section>> ShowSections() {
	
		List <Section> sections= sectionService.getAllSections();
		
		if (sections.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
	
		return ResponseEntity.ok(sections);

	}
	
	//AddSection
	
	@PostMapping("/section")
	
	public ResponseEntity <Section> createSection (@RequestBody Section section){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(sectionService.addSection(section));
		
	}
	
	//GetSectionByID
	//return 200 si la sección se ha encontrado y 404 si no se ha encontrado, está devolviendo un optional
	
	@GetMapping("/section/{id}")	
	
	public ResponseEntity<Section> getById (@PathVariable Long id){
		return ResponseEntity.of(sectionService.getSectionById(id));
	}
	
	
	//Modificar section por ID
	
	@PutMapping("/section")
	
	public ResponseEntity<Section> editSection(@RequestBody Section section){
		
		return ResponseEntity.of(sectionService.editSection(section));
	}
	
	
	@DeleteMapping("/section/{id}")
	public ResponseEntity<?> deleteSection(@PathVariable Long id){
		sectionService.deleteSection(id);
		return ResponseEntity.noContent().build();
		
	}
}
