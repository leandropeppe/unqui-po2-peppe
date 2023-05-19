package ar.edu.unq.po2.tp7bis;




import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorLesionesTest {

	
	@BeforeEach
	void setUp()  {
	}

	@Test
	void testSiguiente() {
		assertEquals(0,ColorLesiones.Gris.compareTo(ColorLesiones.Rojo.getSiguiente()));
		assertEquals(0,ColorLesiones.Amarillo.compareTo(ColorLesiones.Gris.getSiguiente()));
		assertEquals(0,ColorLesiones.Miel.compareTo(ColorLesiones.Amarillo.getSiguiente()));
		assertEquals(0,ColorLesiones.Rojo.compareTo(ColorLesiones.Miel.getSiguiente()));
	}
	
	@Test 
	void testOrdinal() {
		assertEquals(1,ColorLesiones.Gris.ordinal());
	}
	

}
