package ar.edu.unq.po2.tp4;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Cobrable;

public class Producto implements Cobrable{
	
	private String nombre;
	protected double precio;
	private boolean preciosCuidados = false ;
	
	
	public Producto(String nombre, double precio, boolean preciosCuidados) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = preciosCuidados;
	}
	
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getMontoAPagar() {
		return precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setPreciosCuidados(boolean preciosCuidados) {
		this.preciosCuidados = preciosCuidados;
	}
	
	
	public void aumentarPrecio(double valor) {
		this.setPrecio(this.getMontoAPagar() + valor);
	}
	
	

	public boolean esPrecioCuidado() {
		return preciosCuidados;
	}


	public boolean esCooperativa() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void informarPago(Caja caja) {
		caja.sacarDelStock(this);
	}

	
	


	
	
}
