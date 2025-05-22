package com.mytasksmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytasksmanager.model.Section;
import com.mytasksmanager.repository.SectionRepository;

import jakarta.transaction.Transactional;

@Service
public class SectionService {

	@Autowired
	SectionRepository sectionRepository;
	
	
	
	public List <Section> getAllSections(){
		
		return sectionRepository.getAllSections();
	}
	
	
	public Optional<Section> getSectionById(Long id) {
		
		return sectionRepository.getSectionById(id);
	}
	
	
	
	public Section addSection(Section section) {
		
		return sectionRepository.createSection(section);
	}
	
	
	@Transactional
	public void deleteSection(Long id) {
		
		 sectionRepository.deleteSection(id);
	}
	
	

	public Optional<Section> editSection(Section section){
		
		return sectionRepository.updateSection(section);
	}
	
	
}
