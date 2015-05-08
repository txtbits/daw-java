package com.cpilosenlaces.daw.ordenacion;

public class Persona implements Comparable {
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Constructor con this
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	// Constructor sin this y con la edad por defecto a 0 cuando no nos la dicen
	public Persona(String _nombre, String _apellido) {
		super();
		nombre = _nombre;
		apellido = _apellido;
		edad = 0;
	}
	public Persona() {
		super();
	}
	
	@Override
	public int compareTo(Object otraPersona) {
		return this.edad - ((Persona) otraPersona).getEdad();
	}
	/*
	@Override
	public int compareTo(Object otraPersona) {
		Persona p2;
		p2 = (Persona) otraPersona;
		int comparar = this.getApellido().compareTo(p2.getApellido());
		if (comparar == 0)
			return this.getNombre().compareTo(p2.getNombre());
		else
			return comparar;
	}
	*/
}
