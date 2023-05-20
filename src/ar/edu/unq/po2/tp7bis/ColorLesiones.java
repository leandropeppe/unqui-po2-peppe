package ar.edu.unq.po2.tp7bis;


import java.util.*;

public enum ColorLesiones {
	Rojo("Lesion recien provocada",2), 
	Gris("Lesion avanzada",3),
	Amarillo("Lesion curandose",2),
	Miel("Lesion casi curada",1) ;
	
	String descripcion ;
	int nivelDeRiesgo ;
	//ColorLesiones siguiente;
	
	ColorLesiones(String descripcion, int nivelDeRiego ){
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiego ;
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}
	
	public ColorLesiones getSiguiente() {
		int indiceSiguiente = (this.ordinal() + 1) % ColorLesiones.values().length;
		return ColorLesiones.values()[indiceSiguiente];
	}
	
	
}
