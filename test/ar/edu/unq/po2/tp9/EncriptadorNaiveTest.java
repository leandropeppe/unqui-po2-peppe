package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EncriptadorNaiveTest {

	ModificarVocal encriptador;

	@BeforeEach
	void setUp() {
		encriptador = new ModificarVocal();
	}

	@Test
	void test() {
		assertEquals("hule",encriptador.doEncriptar("hola"));
		assertEquals("afe",encriptador.doEncriptar("ufa"));
		assertEquals("hola",encriptador.doDesencriptar("hule"));
		assertEquals("ufa",encriptador.doDesencriptar("afe"));
	}

}
