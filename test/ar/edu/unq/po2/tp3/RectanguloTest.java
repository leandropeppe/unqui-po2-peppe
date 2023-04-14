package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	
	Point inicio = new Point();
	Rectangulo r = new Rectangulo(inicio,7,8);
	
	Cuadrado c = new Cuadrado(inicio,5);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void rectanguloTest() {
		assertEquals(r.getVertSE().getX(), 7 );
		assertEquals(r.getVertSE().getY(), 0 );
		assertEquals(r.getVertNE().getX(), 7);
		assertEquals(r.getVertNE().getY(), 8);
		assertEquals(r.getVertNO().getX(), 0);
		assertEquals(r.getVertNO().getY(), 8);
		
		assertEquals(r.area(), 56 );
		assertEquals(r.perimetro(), 30);
		assertFalse(r.orientacion() == "Horizontal");
		
		
	}
	
	@Test
	void cuadradoTest() {
		assertEquals(c.getVertSE().getX(), 5 );
		assertEquals(c.getVertSE().getY(), 0 );
		assertEquals(c.getVertNE().getX(), 5);
		assertEquals(c.getVertNE().getY(), 5);
		assertEquals(c.getVertNO().getX(), 0);
		assertEquals(c.getVertNO().getY(), 5);
		
		assertEquals(c.area(), 25 );
		assertEquals(c.perimetro(), 20);
		assertFalse(c.orientacion() == "Horizontal");
		
		
	}

}
