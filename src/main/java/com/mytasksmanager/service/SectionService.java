package com.mytasksmanager.service;

import java.util.List;
import java.util.Optional;

import com.mytasksmanager.model.Section;

public interface SectionService {
	
	public List <Section> getAllSections();
	public Optional<Section> getSectionById(Long id);
	public Section addSection(Section section);
	public void deleteSection(Long id);
	public Optional<Section> editSection(Section section);

}
