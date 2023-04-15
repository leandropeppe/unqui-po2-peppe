package ar.edu.unq.po2.tp3;

import java.util.*;

public class EquipoDeTrabajo {
	
	
	private String nombre ;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		super();
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	
	
	public String getNombre() {
		return nombre;
	}
	
	public double promedioIntegrantes() {
		int totalEdades = 0 ;
		
		for(Persona persona: integrantes) {
			totalEdades += persona.edad();
		}
		return totalEdades / integrantes.size() ;
	}
	
	public void agregarIntegrante(Persona persona){
		this.integrantes.add(persona);
	}	
	
	
	
	
	
	
	
	
	
}
