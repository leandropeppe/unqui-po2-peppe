package ar.edu.unq.po2.tp9.VideoJuego;

public class MaquinaVideoJuego {
	
	private Ranura ranura ;
	private EstadoMaquina estadoActual ;
	
	
	
	public MaquinaVideoJuego(Ranura ranura) {
		super();
		this.ranura = ranura;
		this.estadoActual = new EsperandoFichas();  // deberia tener el estado en donde no tiene ninguna fichas en la misma
	}
	

	
	public void presionarBotonInicio() {
		
		this.estadoActual.estado();
	}


	public void insertarFicha() {
		ranura.setFichasRecibidas(ranura.cantidadFichas() + 1);
	}

	public String estado() {
		return this.estadoActual.estado();
	}



	public Ranura getRanura() {
		return ranura;
	}
	
	
	
}
