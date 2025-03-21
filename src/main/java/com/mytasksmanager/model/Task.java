package com.mytasksmanager.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "tasks")

public class Task {
	

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		
		
		private String name;
		private Long id_section;
		private LocalDate created_at;
		private Boolean isDone;
		private LocalDate done_at;
		
		
					
		public Task() {
			
		}
		
		
			
		
		public Task(Long id, String name, Long id_section, LocalDate creationDate, Boolean isDone,
				LocalDate done_at) {
			super();
			this.id = id;
			this.name = name;
			this.id_section = id_section;
			this.created_at = creationDate;
			this.isDone = isDone;
			this.done_at = done_at;
		}




		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getId_section() {
			return id_section;
		}
		public void setId_section(Long id_section) {
			this.id_section = id_section;
		}
		public LocalDate getCreationDate() {
			return created_at;
		}
		public void setCreationDate(LocalDate creationDate) {
			this.created_at = creationDate;
		}
		public Boolean getIsDone() {
			return isDone;
		}
		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}
		public LocalDate getTaskCompletionDate() {
			return done_at;
		}
		public void setTaskCompletionDate(LocalDate taskCompletionDate) {
			this.done_at = taskCompletionDate;
		}
		
		
		
		
		
}
