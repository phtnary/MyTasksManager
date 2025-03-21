package com.mytasksmanager.repository;

import java.util.List;


import com.mytasksmanager.model.Section;

public interface SectionRepository {
	
	List <Section> getAllSections();
	String getNameSectionById(int id);
	Section createSection(Section section);
	Section updateSection(Section section);
	Section deleteSection(int id);
	
}
