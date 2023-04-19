package ar.edu.unq.po2.tp5;

import ar.edu.unq.po2.tp4.Producto;
import java.util.List;

import ar.edu.unq.po2.tp4.Producto;

public class Caja {
	
	private Cliente cliente1;
	private List<Producto> stockMercado ;
	
	
	public Caja(Cliente cliente1, List<Producto> stockMercado) {
		super();
		this.stockMercado = stockMercado;
	}
	
	
	public double calcularPrecioCompra(List<Producto> stockMercado,List<Producto> compra) {
		double precioTotal = 0;
		for(Producto producto:compra) {
			if(producto.esCooperativa()) {
				precioTotal += (producto.getPrecio() * 0.9 );
			}
			else {
				precioTotal += producto.getPrecio();
			}
			this.sacarDelStock(producto);
		}
		System.out.println ("El precio de su compra es: $" + precioTotal);
		return precioTotal;
	}


	public void sacarDelStock(Producto producto) {
		stockMercado.remove(producto);
	}


	public List<Producto> getStock() {
		return stockMercado;
	}


	public Cliente getCliente1() {
		return cliente1;
	}


	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}
	
	
	
}
