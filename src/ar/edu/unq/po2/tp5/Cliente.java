package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp4.Producto;

public class Cliente {

	private List<Producto> compra;
	
	public Cliente() {
		super();
		this.compra = new ArrayList<Producto>();
	}

	

	public List<Producto> getCompra() {
		return compra;
	}

	public void agregarProductoACompra(Producto producto) {
		compra.add(producto);
	}
	
	
}
