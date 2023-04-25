package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MascotaTest {
	Mascota mascota1;
	Mascota mascota2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		mascota1 = new Mascota("Pepita","Canario");
		mascota2 = new Mascota("Pepon","Golondrina");
	}

	@Test
	void nombreTest() {
		assertEquals("Pepita",mascota1.getNombre());
		assertEquals("Pepon",mascota2.getNombre());
	}
	
	@Test
	void razaTest() {
		assertEquals("Canario",mascota1.getRaza());
		assertEquals("Golondrina",mascota2.getRaza());
	}

}
