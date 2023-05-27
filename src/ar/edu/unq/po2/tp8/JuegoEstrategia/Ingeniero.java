package ar.edu.unq.po2.tp8.JuegoEstrategia;



public abstract class Ingeniero extends CaracterPersonaje {
	
	private int cantidadDeLajas ;
	private Casillero posicionActual ;

	public Ingeniero(int cantidad,Casillero posicion) {
		super();
		this.cantidadDeLajas = cantidad;
		this.posicionActual = posicion;
	}

	public void caminar(Casillero casilleroLlegada) {
		while(this.posicionActual != casilleroLlegada ) {
			this.construirCamino();
			this.avanzar();
		}
	}
	
	
	public void avanzar() {
		// caminar en diagonal
		
	}

	public void construirCamino() {
		if( !this.posicionActual.tieneLaja() && this.cantidadDeLajas != 0) {
			this.ponerLaja();
			this.posicionActual.ponerLaja();
		}
	}

	private void ponerLaja() {
		this.cantidadDeLajas -= 1;
	}

}
