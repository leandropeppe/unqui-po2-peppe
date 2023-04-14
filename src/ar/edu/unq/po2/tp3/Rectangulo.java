package ar.edu.unq.po2.tp3;



public class Rectangulo {
	
	private Point inicio ;
	private Point vertSE ;
	private Point vertNO ;
	private Point vertNE ;
	private int largo;
	private int alto;
	
	public Rectangulo(Point inicio, int largo , int alto) {
		super();
		this.inicio = inicio;
		this.vertSE = new Point(inicio.getX() + largo , inicio.getY());
		this.vertNO = new Point(inicio.getX() , inicio.getY() + alto);
		this.vertNE = new Point(inicio.getX() + largo , inicio.getY() + alto);
		this.largo  = largo ;
		this.alto   = alto;
	}
	
	
	public int area() {
		return this.alto * this.largo;
	}
	
	public int perimetro() {
		return 2 * (this.alto + this.largo) ;
	}
	
	
	public String orientacion() {
		if(largo > alto) {
			return "Horizontal";
		}
		else {
			return "Vertical";
		}
	}
	
	
	
	public Point getInicio() {
		return inicio;
	}

	public void setInicio(Point inicio) {
		this.inicio = inicio;
	}

	public Point getVertSE() {
		return vertSE;
	}

	public void setVertSE(Point vertSE) {
		this.vertSE = vertSE;
	}

	public Point getVertNO() {
		return vertNO;
	}

	public void setVertNO(Point vertNO) {
		this.vertNO = vertNO;
	}

	public Point getVertNE() {
		return vertNE;
	}

	public void setVertNE(Point vertNE) {
		this.vertNE = vertNE;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	
	
}

// SE = INICIO.GETX + LARGO , INICIO.GETY
// NO = inicio.getX , inicio.getY + alto
// NE = INICIO.GETX + LARGO, inicio.getY + alto


