package ar.edu.unq.po2.tp7bis;

public enum ColorLesiones {
	Gris("Lesion avanzada",  3 , Amarillo),
	Rojo("Lesion recien provocada",  2 , Gris), 
	Miel("Lesion casi curada",  1 , Rojo) ,
	Amarillo("Lesion curandose", 2  , Miel);
	
	String descripcion ;
	int nivelDeRiesgo ;
	ColorLesiones siguiente;
	
	ColorLesiones(String descripcion, int nivelDeRiego , ColorLesiones siguiente){
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiego ;
		this.siguiente = siguiente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public ColorLesiones getSiguiente() {
		return siguiente;
	}
}
