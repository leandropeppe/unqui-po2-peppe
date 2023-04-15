package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	Persona persona1 = new Persona("leandro", fechaNacLeandro);
	
	LocalDate fechaNacpersona2 = LocalDate.parse("29/03/1992", fmt);
	Persona persona2 = new Persona("persona2", fechaNacpersona2);
	
	LocalDate fechaNac3 = LocalDate.parse("29/07/1993", fmt);
	Persona persona3 = new Persona("leandro", fechaNac3);
	
	LocalDate fechaNacpersona4 = LocalDate.parse("29/03/1999", fmt);
	Persona persona4 = new Persona("persona2", fechaNacpersona4);
	
	LocalDate fechaNac5 = LocalDate.parse("29/07/1998", fmt);
	Persona persona5 = new Persona("leandro", fechaNac5);

	private List<Persona> integrantes = new ArrayList<Persona>();
	
	
	
	EquipoDeTrabajo equipo = new EquipoDeTrabajo("tiburones",integrantes) ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		equipo.agregarIntegrante(persona1);
		equipo.agregarIntegrante(persona2);
		equipo.agregarIntegrante(persona3);
		equipo.agregarIntegrante(persona4);
		equipo.agregarIntegrante(persona5);
		
	}

	
	@Test
	void test() {
		
		
		assertEquals(27, equipo.promedioIntegrantes(),0);
		System.out.println(equipo.promedioIntegrantes());
		
	}

}
