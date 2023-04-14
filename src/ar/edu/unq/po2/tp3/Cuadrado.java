package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{
	
	
	public Cuadrado(Point inicio, int lado) {
		super(inicio, lado, lado);
	}
	
	@Override
	public String orientacion() {
		return "Es un cuadrado";
	}
	
}
