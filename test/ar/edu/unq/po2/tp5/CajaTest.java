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
	private FacturaImpuesto facturaImp;
	private FacturaServicio facturaServ;
	private Caja caja1;

	
	private List<Cobrable> compra;
	private List<Producto> stockDelMercado;
	
	@BeforeEach
	public void setUp() {
		
		//creacion de productos
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		galletas = new ProductoCooperativa("Galletas", 18.9d);
		harina = new ProductoCooperativa("Harina", 75d);
		
		//creacion de factura
		
		facturaImp = new FacturaImpuesto("AYSA" , "Automotor" , 900);
		facturaServ = new FacturaServicio("Edesur" , 0.5 ,  1000 ,  4);
				
		
		
		//creacion de stock y agregado del mismo en el almacen
		stockDelMercado = new ArrayList<Producto>();
		stockDelMercado.add(arroz);
		stockDelMercado.add(detergente);
		stockDelMercado.add(galletas);
		stockDelMercado.add(harina);
		
		
		//creacion de compra y agregado del mismo en el almacen
		compra = new ArrayList<Cobrable>();
		compra.add(arroz);
		compra.add(galletas);
		compra.add(harina);
		compra.add(facturaServ);
		compra.add(facturaImp);
		
		
		
		//creacion de caja
		caja1 = new Caja(compra,stockDelMercado);
	}
	
	

	
	
	@Test
	void getStockTest() {
		assertTrue(caja1.getStock().contains(arroz));
		assertTrue(caja1.getStock().contains(detergente));
		assertTrue(caja1.getStock().contains(galletas));
		assertTrue(caja1.getStock().contains(harina));
	}
	
	
	@Test
	void getCompraTest() {
		assertTrue(caja1.getCompra().contains(arroz));
		assertTrue(caja1.getCompra().contains(harina));
		assertTrue(caja1.getCompra().contains(galletas));
	}
	
	@Test
	void sacarDelStockTest() {
		caja1.sacarDelStock(detergente);
		assertFalse(caja1.getStock().contains(detergente));
	}
	
	@Test
	void cobrarTest() {
		double montoTotalAPagar = caja1.cobrar(compra);
		
		assertFalse(caja1.getStock().contains(arroz));
		assertFalse(caja1.getStock().contains(galletas));
		assertFalse(caja1.getStock().contains(harina));
		assertTrue(caja1.getStock().contains(detergente));
		
		assertEquals(17.01,galletas.getMontoAPagar(),0.1);
		assertEquals(67.5,harina.getMontoAPagar());
		assertEquals(18.9,arroz.getMontoAPagar());
		
		assertEquals(900,facturaImp.getMontoAPagar());
		assertEquals(500,facturaServ.getMontoAPagar());
		
		assertEquals(1503.41,montoTotalAPagar,0.1);
	}
	
	
	
}
