package com.mytasksmanager.repository;

import java.util.List;
import java.util.Optional;

import com.mytasksmanager.model.Section;

public interface SectionRepository {
	
	List <Section> getAllSections();
	Optional<Section> getSectionById(Long id);
	Section createSection(Section section);
	Optional<Section> updateSection(Section section);
	void deleteSection(Long id);
	
}
