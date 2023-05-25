package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EncriptadorNaiveTest {
	
	EncriptadorNaive nuevoEncriptador;
	
	ModificarVocal encriptadorVocal;
	ModificarLetraPorNumero encriptadorLyN ;
	ModificarOrdenPalabra encriptadorOrden ;

	@BeforeEach
	void setUp() {
		encriptadorVocal = new ModificarVocal();
		encriptadorLyN = new ModificarLetraPorNumero();
		encriptadorOrden = new ModificarOrdenPalabra();
		
		nuevoEncriptador = new EncriptadorNaive(encriptadorVocal);
	}

	@Test
	void ModificarVocalTest() {
		assertEquals("hule mo numbri is liendru",nuevoEncriptador.encriptar("hola mi nombre es leandro"));
		assertEquals("afe",nuevoEncriptador.encriptar("ufa"));
		assertEquals("hola",nuevoEncriptador.desencriptar("hule"));
		assertEquals("ufa",nuevoEncriptador.desencriptar("afe"));
	}
	
	@Test
	void ModificarLetraPorNumeroTest() {
		nuevoEncriptador.modificadorEstrategia(encriptadorLyN);
		
		assertEquals("1,2,0,3,4",nuevoEncriptador.encriptar("ab cd"));
		assertEquals("ab cd",nuevoEncriptador.desencriptar("1,2,0,3,4"));
	}
	
	void ModificarOrdenPalabraTest() {
		nuevoEncriptador.modificadorEstrategia(encriptadorOrden);
		//encriptadorOrden.separarPalabras("Hola soy leandro");
		
		assertEquals("todos a hola",nuevoEncriptador.encriptar("hola a todos"));
		assertEquals("hola a todos",nuevoEncriptador.desencriptar("todos a hola"));
	}

}
