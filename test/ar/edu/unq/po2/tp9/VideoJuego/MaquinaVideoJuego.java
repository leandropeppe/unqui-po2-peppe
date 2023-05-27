package ar.edu.unq.po2.tp9.VideoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaVideoJuegoTest {

	MaquinaVideoJuego maquina1 ; 
	Ranura ranura;

	@BeforeEach
	void setUp() {
		maquina1 = new MaquinaVideoJuego(ranura);
		
	}

	@Test
	void testMaquinaEsperando() {
		assertEquals("Inserte ficha/s para jugar",maquina1.estado());
	}
	
	@Test
	void testMaquinaCon1Ficha() {
		maquina1.insertarFicha();
		assertEquals("Inserte 1 ficha para multijugador o presione el boton de inicio para jugar",maquina1.estado());
		maquina1.presionarBotonInicio();
		assertEquals("Jugando",maquina1.estado());
	}
	
	@Test
	void testMaquina() {
		maquina1.insertarFicha();
		assertEquals("Inserte 1 ficha para multijugador o presione el boton de inicio para jugar",maquina1.estado());
		maquina1.insertarFicha();
		assertEquals("Presione el boton de inicio para jugar",maquina1.estado());
		maquina1.presionarBotonInicio();
		assertEquals("Jugando",maquina1.estado());
	}
	
	

}
