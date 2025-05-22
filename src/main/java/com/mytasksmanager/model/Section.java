package com.mytasksmanager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table (name = "sections")
public class Section {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "El nombre de sección es obligatorio")
	@Pattern(regexp = "^[A-Za-z0-9ÁÉÍÓÚáéíóúñ]+$", message = "El nombre de sección no puede tener caracteres especiales")
	private String name;

	

	public Section() {
		
	}
	

	public Section(Long id, String name) {
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
