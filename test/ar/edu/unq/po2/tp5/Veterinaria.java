package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Veterinaria {
	
	Persona persona1;
	Persona persona2;
	Mascota mascota1;
	Mascota mascota2;
	//List<Nombrables> nombrables;
	
	
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacWalter = LocalDate.parse("15/08/1963", fmt);
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	
	
	@BeforeEach
	void setUp() throws Exception {
		persona1 = new Persona("Leandro",fechaNacLeandro);
		persona2 = new Persona("Walter",fechaNacWalter);
		mascota1 = new Mascota("Pepita","Canario");
		mascota2 = new Mascota("Pepon","Golondrina");
		
		
	}
	


	@Test
	void test() {
		
		List<Nombrable> nombrables = Arrays.asList(persona1,persona2,mascota1,mascota2);
		
		nombrables.stream().forEach(n-> System.out.print(n.getNombre()+"\n")); 
		
	}

}
