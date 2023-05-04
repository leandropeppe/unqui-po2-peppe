package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColeccionadorDeObjetosTest {
	
	ColeccionadorDeObjetos coleccionador = new ColeccionadorDeObjetos();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Creo lista de colecciones
		List<Collection> collection = new ArrayList<Collection>();
		
		// Creo lista de string autos
		List<String> autos = new ArrayList<String>();
		// Creo lista de string personas
		List<String> personas = new ArrayList<String>();
	}

	@BeforeEach
	void setUp() throws Exception {
		List<String> autos = Arrays.asList("Corvette","Corsa","208", "Fox");
		List<String> personas = Arrays.asList("leandro","andrea","208");
		
		List<Collection> collection = Arrays.asList(autos,personas);
		
		
	}

	@Test
	void getFirstFromTest() {
		
	}

}
