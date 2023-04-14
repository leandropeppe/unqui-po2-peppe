package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	
	Point punto1 = new Point(2,5) ;
	Point punto2 = new Point(5,2) ;
	Point punto3 = new Point();
	
	Point puntoNuevo = punto1.sumarPunto(punto2);
	
	@BeforeEach
	public void setUp() throws Exception {
		
		
		punto2.moverPunto(3, 3);
		
	}
	
	@Test
	void test() {
		assertEquals(punto3.getX(), 0);
		assertEquals(punto3.getY(), 0);
		assertEquals(puntoNuevo.getX() , 7 );
		assertEquals(puntoNuevo.getY() , 7 );
		assertEquals(punto2.getX() , 3 );
		assertEquals(punto2.getY() , 3 );
	}

}
