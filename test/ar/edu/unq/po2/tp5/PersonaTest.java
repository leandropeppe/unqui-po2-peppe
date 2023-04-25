package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona persona1;
	Persona persona2;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacWalter = LocalDate.parse("15/08/1963", fmt);
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	
	
	@BeforeEach
	void setUp() throws Exception {
		persona1 = new Persona("Leandro",fechaNacLeandro);
		persona2 = new Persona("Walter",fechaNacWalter);
	}

	@Test
	void nombretest() {
		assertEquals("Leandro",persona1.getNombre());
		assertEquals("Walter",persona2.getNombre());
		
	}
	
	@Test
	void edadestest() {
		
		assertEquals(28,persona1.edad());
		assertEquals(59,persona2.edad());
	}

	@Test
	void menorQuetest() {
		assertTrue(persona1.menorQue(persona2));
		assertFalse(persona2.menorQue(persona1));
	}
}
