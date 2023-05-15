package ar.edu.unq.po2.tp7bis;

public enum DiaDeLaSemana {
	
	Lunes(500),Martes(500),Miercoles(500),Jueves(1000),Viernes(1000),Sabado(1000),Domingo(1000);
	
	private int costo;

	DiaDeLaSemana(int i) {
		this.costo = i ;
	}
	
	public int costo() {
		return costo ;
	}
	
}
