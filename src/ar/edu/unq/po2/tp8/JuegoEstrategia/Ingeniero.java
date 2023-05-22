package ar.edu.unq.po2.tp8.JuegoEstrategia;



public class Ingeniero extends CaracterPersonaje {
	
	private int cantidadDeLajas ;

	public Ingeniero(int cantidad) {
		super();
		this.cantidadDeLajas = cantidad;
	}

	@Override
	public void caminar(Casillero casilleroPartida,Casillero casilleroLlegada) {
		while(/*No llegue a destino*/) {
			this.construirCamino();
			this.avanzar();
		}
	}
	
	
	public void avanzar() {
		// caminar en diagonal
		
	}

	public void construirCamino() {
		if( !Casillero.tieneLaja() && this.cantidadDeLajas != 0) {
			this.ponerLaja();
			Casillero.ponerLaja();
		}
	}

	private void ponerLaja() {
		this.cantidadDeLajas -= 1;
	}

}
