package com.cpilosenlaces.daw.ordenacion;

import java.util.Comparator;

public class ApellidoNombreComp implements Comparator {
	public int compare(Object persona, Object otraPersona){
		Persona p1, p2;
		p1 = (Persona)persona;
		p2 = (Persona)otraPersona;
		int comparar = p1.getApellido().compareTo(p2.getApellido());
		if (comparar == 0)
			return p1.getNombre().compareTo(p2.getNombre());
		else
			return comparar;
	}
}
