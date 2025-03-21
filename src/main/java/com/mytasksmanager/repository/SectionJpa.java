package com.mytasksmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mytasksmanager.model.Section;



public interface SectionJpa extends JpaRepository<Section, Integer> {

	String findByName(String name);
	String findById(int id);
	//Section save(Section section);
	Section deleteById(int id);

	
	
}
