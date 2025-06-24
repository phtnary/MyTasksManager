package com.mytasksmanager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mytasksmanager.error.SectionExistException;
import com.mytasksmanager.error.SectionNotFoundException;
import com.mytasksmanager.model.Section;
import com.mytasksmanager.repository.SectionRepository;

import jakarta.transaction.Transactional;

@Service
public class SectionServiceImpl implements SectionService {

	@Autowired
	SectionRepository sectionRepository;
	
	
	
	public List <Section> getAllSections(){
		
		 List <Section> sections = sectionRepository.getAllSections();
		
		 if(sections.isEmpty())
			 throw new SectionNotFoundException();
		 return sections;
	}
	
	
	
	public Optional<Section> getSectionById(Long id) {
		
		Optional<Section> section = sectionRepository.getSectionById(id);
		if (section.isEmpty()) {
			throw new SectionNotFoundException(id);
		} 
		return section;
				
	}
	
	
	
	public Section addSection(Section section) {
		
		Long id=section.getId();
		Optional<Section> section2= getSectionById(id);
		if(!section2.isEmpty()) {
			throw new SectionExistException();
		}else {
			return sectionRepository.createSection(section);
		}
	}
	
	
	@Transactional
	public void deleteSection(Long id) {
		
		 sectionRepository.deleteSection(id);
	}
	
	

	public Optional<Section> editSection(Section section){
		
		
		return sectionRepository.updateSection(section);
	}
	
	
}
