package ar.edu.unq.po2.tp5;

import ar.edu.unq.po2.tp4.Producto;
import java.util.List;

import ar.edu.unq.po2.tp4.Producto;

public class Caja implements Agencia{
	
	private List<Producto> stockMercado ;
	private List<Cobrable> compra ;
	
	
	public Caja(List<Cobrable> compra , List<Producto> stockMercado) {
		super();
		this.compra = compra;
		this.stockMercado = stockMercado;
	}
	
	
	
	public void sacarDelStock(Producto producto) {
		stockMercado.remove(producto);
	}
	

	public List<Producto> getStock() {
		return stockMercado;
	}



	@Override
	public void registrarPago(Factura factura) {
		System.out.print("Se pago la factura");
	}


	public List<Cobrable> getCompra() {
		return compra;
	}


	public double cobrar(List<Cobrable> cobrables) {
		double acumulador = 0;
		for(Cobrable cobrable : cobrables) {
			cobrable.informarPago(this);
			acumulador += cobrable.getMontoAPagar();
		}
		return acumulador ;
	}
	
	
	
}
