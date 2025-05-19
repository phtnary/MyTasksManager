package com.mytasksmanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	public Optional<Section> getSectionById(Long id) {
		
		return sectionJpa.findById(id);
	}

	

	@Override
	public Section createSection(Section section) {
		
		return sectionJpa.save(section);
	}

	@Override
	public Optional<Section> updateSection(Section section) {
		
		return Optional.ofNullable(sectionJpa.save(section));
	}
	

	//@Transactional
	@Override
	public void deleteSection(Long id) {
		
		 sectionJpa.deleteById(id);

	}

}
