package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	Persona persona1 = new Persona("leandro", fechaNacLeandro);
	
	LocalDate fechaNacpersona2 = LocalDate.parse("29/03/1994", fmt);
	Persona persona2 = new Persona("persona2", fechaNacpersona2);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(persona1.edad() , 28);
		assertTrue(persona1.menorQue(persona2));
	}

}
