package ar.edu.unq.po2.tp5;
import ar.edu.unq.po2.tp4.Producto;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp4.Supermercado;

class CajaTest {
	
	private Producto arroz;
	private Producto detergente;
	private ProductoCooperativa galletas;
	private ProductoCooperativa harina;
	private Caja caja1;
	private Cliente cliente1;
	
	
	private List<Producto> stockMercado;
	
	@BeforeEach
	public void setUp() {
		
		//creacion de productos
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		galletas = new ProductoCooperativa("Galletas", 18.9d);
		harina = new ProductoCooperativa("Harina", 75d);
		
		
		//creacion de stock y agregado del mismo en el almacen
		stockMercado = new ArrayList<Producto>();
		stockMercado.add(arroz);
		stockMercado.add(detergente);
		stockMercado.add(galletas);
		stockMercado.add(harina);
		
		
		
		
		//creacion cliente y agregar producto a compra
		
		cliente1 = new Cliente();
		cliente1.agregarProductoACompra(arroz);
		cliente1.agregarProductoACompra(galletas);
		cliente1.agregarProductoACompra(harina);
		
		//creacion de caja
		caja1 = new Caja(cliente1,stockMercado);
	}
	
	

	@Test
	void test() {
		assertEquals(103.41,caja1.calcularPrecioCompra(stockMercado, cliente1.getCompra()));
		assertSame(detergente, caja1.getStock().get(0));
		assertEquals(1,caja1.getStock().size());
		caja1.sacarDelStock(arroz);
		assertFalse(caja1.getStock().contains(arroz));
	}

}
