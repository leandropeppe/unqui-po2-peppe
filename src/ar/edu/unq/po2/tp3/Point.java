package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x ;
	private int y ;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void moverPunto(int nuevoX, int nuevoY) {
		this.x = nuevoX;
		this.y = nuevoY;
	}
	
	
	public Point sumarPunto(Point punto1) {
		int nuevoX = this.x + punto1.getX() ;
		int nuevoY = this.y + punto1.getY() ;
		return new Point(nuevoX,nuevoY);
	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	
}

	