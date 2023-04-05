package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//import java.util.Date;
import org.junit.jupiter.api.Test;

// assertTrue, assertEquals.

public class EmpleadoTest {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacAriel = LocalDate.parse("15/08/1963", fmt);
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	LocalDate fechaNacTemp = LocalDate.parse("29/03/1985", fmt);
	LocalDate fechaExpTemp = LocalDate.parse("30/12/2023", fmt);
	
	EmpleadoPlantaPermanente empleadoP  = new EmpleadoPlantaPermanente("Leandro", "Bernal", "Soltero", fechaNacLeandro , 50000, 0, 10 );
	EmpleadoPlantaTemporal   empleadoT  = new EmpleadoPlantaTemporal("Temporal", "Bernal", "Casado", fechaNacTemp , 50000, fechaExpTemp , 10 );
	EmpleadoContratado       empleadoC  = new EmpleadoContratado("Ariel", "Bernal", "Casado", fechaNacAriel , 50000, "54056", "cheque" );
	
	
	@Test
	public void calcularSueldoBrutoTest() {
		
		double sueldobrutoP = empleadoP.calcularSueldoBruto();
		double sueldoEsperadoP = 50050;
		
		double sueldobrutoT = empleadoT.calcularSueldoBruto();
		double sueldoEsperadoT = 50400;
		
		double sueldobrutoC = empleadoC.calcularSueldoBruto();
		double sueldoEsperadoC = 50000;
		
		assertEquals(sueldobrutoP,sueldoEsperadoP);
		assertEquals(sueldobrutoT,sueldoEsperadoT);
		assertEquals(sueldobrutoC,sueldoEsperadoC);
	}
	
	
	@Test
	public void calcularRetencionesTest() {
		
		double retencionesP = empleadoP.calcularRetenciones();
		double retencionesEsperadaP = 12512.5;
		
		double retencionesT = empleadoT.calcularRetenciones();
		double retencionesEsperadaT = 10130;
		
		double retencionesC = empleadoC.calcularRetenciones();
		double retencionesEsperadaC = 50;
		
		assertEquals(retencionesP,retencionesEsperadaP);
		assertEquals(retencionesT,retencionesEsperadaT);
		assertEquals(retencionesC,retencionesEsperadaC);
		
	}
	
	@Test
	public void calcularSueldoNeto() {
		
		double netoP = empleadoP.calcularSueldoNeto();
		double netoEsperadaP = 37537.5;
		
		double netoT = empleadoT.calcularSueldoNeto();
		double netoEsperadaT = 40270;
		
		double netoC = empleadoC.calcularSueldoNeto();
		double netoEsperadaC = 49950;
		
		assertEquals(netoP,netoEsperadaP);
		assertEquals(netoT,netoEsperadaT);
		assertEquals(netoC,netoEsperadaC);
	}
	
	@Test
	public void edad() {
		
		int edadL = empleadoP.edad();
		int edadT = empleadoT.edad();
		int edadC = empleadoC.edad();
		
		assertEquals(edadL,28);
		assertEquals(edadT,38);
		assertEquals(edadC,59);
	}
		
}
