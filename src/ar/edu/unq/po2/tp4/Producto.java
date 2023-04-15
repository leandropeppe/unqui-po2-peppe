package ar.edu.unq.po2.tp4;

public class Producto {
	
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
	
	public double getPrecio() {
		return precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setPreciosCuidados(boolean preciosCuidados) {
		this.preciosCuidados = preciosCuidados;
	}
	
	
	public void aumentarPrecio(double valor) {
		this.setPrecio(this.getPrecio() + valor);
	}
	
	

	public boolean esPrecioCuidado() {
		return preciosCuidados;
	}

	
	


	
	
}
