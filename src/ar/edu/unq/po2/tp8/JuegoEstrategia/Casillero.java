package ar.edu.unq.po2.tp8.JuegoEstrategia;

public class Casillero {
	
	private int x ;
	private int y ;
	private boolean tieneLaja = false ;
	

	public Casillero(int x, int y, boolean tieneLaja) {
		super();
		this.x = x;
		this.y = y;
		this.tieneLaja = tieneLaja;
	}
	
	
	public boolean tieneLaja() {
		return this.tieneLaja;
	}

	public void ponerLaja() {
		this.tieneLaja = true ;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}
	
	
}
