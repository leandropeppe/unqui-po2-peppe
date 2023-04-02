package ar.edu.unq.po2.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Date;
import ar.edu.unq.po2.tp2.*;

// assertTrue, assertEquals.

public class EmpleadoTest {
	
	Empleado empleado1 = new Empleado("Leandro", "Bernal", "soltero", 1994 , 50000 );
	
	
	@Test
	public double calcularSueldoBrutoTest() {
		
		double sueldobruto = empleado1.calcularSueldoBruto();
		double sueldoEsperado = 50050;
		
		assertEquals(sueldobruto,sueldoEsperado,0);
	}
	
	@Test
	public double calcularRetencionesTest() {
		
		double retenciones = empleado1.calcularRetenciones();
		double retencionEsperada = 50050;
		
		assertEquals(retenciones,retencionEsperada,0);
	}
	
	@Test
	public double calcularSueldoNeto() {
		
		double neto = empleado1.calcularSueldoNeto();
		double netoEsperada = 50050;
		
		assertEquals(neto,netoEsperada,0);
	}
	
	
	
}
