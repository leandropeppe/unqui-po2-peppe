package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	Trabajador trabajador ;
	Ingreso ingresoEnero ;
	Ingreso ingresoFebrero;
	IngresoPorHorasExtras ingresoExtra ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		trabajador     = new Trabajador();
		
		ingresoEnero   = new Ingreso( 1 , 1000, "Sueldo");
 		ingresoFebrero = new Ingreso( 2 , 1100, "Sueldo");
		ingresoExtra   = new IngresoPorHorasExtras( 2 , 500, "Horas extras", 10);
		
		
	}

	@Test
    void testTrabajador() {
        trabajador.agregarIngreso(ingresoEnero);
        assertEquals(1000, trabajador.getTotalPercibido());

        trabajador.agregarIngreso(ingresoFebrero);
        assertEquals(2100, trabajador.getMontoImponible());

        trabajador.agregarIngreso(ingresoExtra);
        assertEquals(2600, trabajador.getTotalPercibido());
        assertEquals(2100, trabajador.getMontoImponible());
        assertEquals(42 , trabajador.getImpuestoAPagar());

 
	}

}
