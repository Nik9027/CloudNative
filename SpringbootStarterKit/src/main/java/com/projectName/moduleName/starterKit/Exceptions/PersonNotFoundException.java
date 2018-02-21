package com.projectName.moduleName.starterKit.Exceptions;

public class PersonNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String name;

	public PersonNotFoundException(String name,String message) {
		super(message);
		this.name = name;
	}

}
