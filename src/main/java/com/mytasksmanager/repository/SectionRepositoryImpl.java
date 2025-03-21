package com.mytasksmanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mytasksmanager.model.Section;


@Repository
public class SectionRepositoryImpl implements SectionRepository {
	
	@Autowired
	SectionJpa sectionJpa;

	@Override
	public List<Section> getAllSections() {
		
		return sectionJpa.findAll();
	}

	@Override
	public String getNameSectionById(int id) {
		
		return sectionJpa.findById(id);
	}

	

	@Override
	public Section createSection(Section section) {
		
		return sectionJpa.save(section);
	}

	@Override
	public Section updateSection(Section section) {
		
		return sectionJpa.save(section);
	}

	@Override
	public Section deleteSection(int id) {
		
		return sectionJpa.deleteById(id);
	}

}
