package com.mytasksmanager.error;

public class SectionExistException extends RuntimeException {
	
	public SectionExistException (String message) {
        super(message);
    }
	
	public SectionExistException () {
        super("La section no puede ser creada porque ya existe");
    }

}
