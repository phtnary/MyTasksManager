package com.mytasksmanager.error;

public class SectionNotFoundException extends RuntimeException{
	
	public SectionNotFoundException(String message) {
        super(message);
    }
	
	public  SectionNotFoundException(){
		super("No hay sections con esos requisitos de búsqueda");
	}
	
	public SectionNotFoundException(Long id	) {
		
		super("No hay section con ese id %d".formatted(id));
		
	}
	
}
