package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;

class ClienteTest {
	
	private Producto arroz;
	private ProductoCooperativa galletas;
	private ProductoCooperativa harina;
	private Cliente cliente1;
	
	@BeforeEach
	void setUp() throws Exception {
		//creacion cliente y agregar producto a compra
		
		cliente1 = new Cliente();
		cliente1.agregarProductoACompra(arroz);
		cliente1.agregarProductoACompra(galletas);
		cliente1.agregarProductoACompra(harina);
	}

	@Test
	void test() {
		assertEquals(cliente1.getCompra().get(0),arroz);
		assertEquals(cliente1.getCompra().get(1),galletas);
		assertEquals(cliente1.getCompra().get(2),harina);
	}

}
