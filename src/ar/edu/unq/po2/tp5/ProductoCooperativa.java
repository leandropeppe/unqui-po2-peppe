package ar.edu.unq.po2.tp5;

import ar.edu.unq.po2.tp4.Producto;

public class ProductoCooperativa extends Producto {
	
	
	public ProductoCooperativa(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public boolean esCooperativa() {
		return true;
	}
	
	
	

}
