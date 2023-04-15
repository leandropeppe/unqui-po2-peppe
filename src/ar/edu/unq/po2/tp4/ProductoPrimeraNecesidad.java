package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean preciosCuidados,double descuento) {
		super(nombre, precio, preciosCuidados);
		this.descuento = descuento;
	}

	@Override
	public double getPrecio(){
		return precio * (1 - descuento);
	}
	
}
