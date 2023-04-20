package ar.edu.unq.po2.tp4;

import java.util.*;

public class Supermercado {
	
	private String nombre ;
	private String direccion ;
	private List<Producto> productos ;
	
	
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double acumulador = 0 ;
		for(Producto producto : productos) {
			acumulador += producto.getMontoAPagar();
		}
		return acumulador;
	}
}
