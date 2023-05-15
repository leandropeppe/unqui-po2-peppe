package ar.edu.unq.po2.tp7bis;

public enum Deporte {
	
	Running(1),Futbol(2),Basket(2),Tenis(3),Jabalina(4);
	
	private int complejidad ;
	
	private Deporte(int complejidad) {
		this.complejidad = complejidad;
	}

	public int getComplejidad() {
		return complejidad;
	}
	
	

}

	