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
		//this.siguiente = siguiente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public ColorLesiones getSiguiente() {
		ColorLesiones[] valores = ColorLesiones.values();
		if(this.ordinal()<3) {
			return valores[(this.ordinal()+1)];
		}else {
			return Rojo;
		}
	}
	/*
	public ColorLesiones getSiguiente2() {
	    Skill mySkill = Skill.INTERMEDIATE;
	    switch(mySkill) {
	      case BEGINNER:
	        System.out.println("Beginner");
	        break;
	      case INTERMEDIATE:
	         System.out.println("Intermediate");
	        break;
	      case PROFICIENT:
	        System.out.println("Proficient");
	        break;
	      case EXPERT:
	        System.out.println("Expert");
	    }
	  }
	}*/
}
