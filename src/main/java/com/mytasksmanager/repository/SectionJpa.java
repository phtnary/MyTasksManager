package com.mytasksmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mytasksmanager.model.Section;



public interface SectionJpa extends JpaRepository<Section, Integer> {

	String findByName(String name);
	Optional<Section> findById(Long id);
	void deleteById(Long id);
	
	

	
	
}
