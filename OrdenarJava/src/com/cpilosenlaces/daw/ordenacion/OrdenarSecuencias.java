package com.cpilosenlaces.daw.ordenacion;

import java.util.ArrayList;
import java.util.Collections; // Para ordenar el ArrayList
import java.util.Arrays;	// Para ordenar el Array o vector


public class OrdenarSecuencias {

	/**
	 * @param args
	 * Ejemplos de ordenación de secuencias
	 */
	public static void main(String[] args) {
		// 1. Array o vectores
		String animales[] = new String[5];
		animales[0] = "Perro";
		animales[1] = "Gato";
		animales[2] = "Vaca";
		animales[3] = "Caballo";
		animales[4] = "León";
		
		System.out.println("\n======= Array de cadenas sin ordenar =======\n");
		mostrar(animales);
		Arrays.sort(animales);
		System.out.println("\n======= Ordenación con Arrays.sort() para Array o vector de cadenas =======\n");
		mostrar(animales);

		// 2. ArrayList
		ArrayList<String> animaleslista = new ArrayList<String>();
		animaleslista.add("Perro");
		animaleslista.add("Gato");
		animaleslista.add("Vaca");
		animaleslista.add("Caballo");
		animaleslista.add("León");
		
		System.out.println("\n======= ArrayList de cadenas sin ordenar =======\n");
		mostrar(animaleslista);
		Collections.sort(animaleslista);
		System.out.println("\n======= Ordenación con Collections.sort() para ArrayList de cadenas =======\n");
		mostrar(animales);
		
		// 3. Personas
		Persona[] personas = new Persona[4];
		personas[0] = new Persona();
		personas[0].setNombre("Luis");
		personas[0].setApellido("Morillas");
		personas[0].setEdad(45);
		personas[1] = new Persona("Ana", "García", 20);
		personas[2] = new Persona("María", "García", 22);
		personas[3] = new Persona("Juan", "García");
		
		System.out.println("\n======= Array de personas =======\n");
		mostrar(personas);
		Arrays.sort(personas, new ApellidoNombreComp());
		System.out.println("\n======= Ordenación de Array.sort() de personas =======\n");
		mostrar(personas);
		
	}
	
	// Mostrar Array o vectores de cadenas
	public static void mostrar(String[] v){
		for (int i = 0; i < v.length; i++){
			System.out.println(i+1 + ": " + v[i]);
		}
	}
	
	// Mostrar ArrayList
	public static void mostrar(ArrayList<String> ar){
		for (int i = 0; i < ar.size(); i++){
			System.out.println(i+1 + ": " + ar.get(i));
		}
	}
	
	// Mostrar Array o vectores de personas
	public static void mostrar(Persona[] v){
		for (int i = 0; i < v.length; i++){
			System.out.println(i+1 + ": " + v[i].getNombre() + " " + v[i].getApellido() + " " + v[i].getEdad());
		}
	}
		
}
