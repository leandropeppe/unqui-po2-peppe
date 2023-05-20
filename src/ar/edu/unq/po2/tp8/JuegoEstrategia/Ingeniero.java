package ar.edu.unq.po2.tp8.JuegoEstrategia;



public class Ingeniero extends CaracterPersonaje {
	
	private int cantidadDeLajas ;

	public Ingeniero(int cantidad) {
		super();
		this.cantidadDeLajas = cantidad;
	}

	@Override
	public void caminar() {
		while(/*No llegue a destino*/) {
			this.construirCamino();
			this.avanzar();
		}
	}
	
	
	private void avanzar() {
		// TODO Auto-generated method stub
		
	}

	public void construirCamino() {
		if(Camino.tieneLaja() && this.cantidadDeLajas != 0) {
			this.ponerLaja();
		}
	}

	private void ponerLaja() {
		this.cantidadDeLajas -= 1;
	}

}
