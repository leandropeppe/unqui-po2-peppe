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
	EmpleadoPlantaPermanente empleadoP2 = new EmpleadoPlantaPermanente("Ariel", "Bernal", "Casado", fechaNacAriel , 50000, 2, 30 );
	
	
	@Test
	public void calcularSueldoBrutoTest() {
		
		double sueldobrutoP = empleadoP.calcularSueldoBruto();
		double sueldoEsperadoP = 50050;
		
		double sueldobrutoT = empleadoT.calcularSueldoBruto();
		double sueldoEsperadoT = 50400;
		
		double sueldobrutoA = empleadoP2.calcularSueldoBruto();
		double sueldoEsperadoA = 50550;
		
		assertEquals(sueldobrutoP,sueldoEsperadoP);
		assertEquals(sueldobrutoT,sueldoEsperadoT);
		assertEquals(sueldobrutoA,sueldoEsperadoA);
	}
	
	
	@Test
	public void calcularRetencionesTest() {
		
		double retencionesP = empleadoP.calcularRetenciones();
		double retencionesEsperadaP = 12512.5;
		
		double retencionesT = empleadoT.calcularRetenciones();
		double retencionesEsperadaT = 10130;
		
		double retencionesA = empleadoP2.calcularRetenciones();
		double retencionesEsperadaA = 12677.5;
		
		assertEquals(retencionesP,retencionesEsperadaP);
		assertEquals(retencionesT,retencionesEsperadaT);
		assertEquals(retencionesA,retencionesEsperadaA);
		
	}
	
	@Test
	public void calcularSueldoNeto() {
		
		double netoP = empleadoP.calcularSueldoNeto();
		double netoEsperadaP = 37537.5;
		
		double netoT = empleadoT.calcularSueldoNeto();
		double netoEsperadaT = 40270;
		
		double netoA = empleadoP2.calcularSueldoNeto();
		double netoEsperadaA = 37872.5;
		
		assertEquals(netoP,netoEsperadaP);
		assertEquals(netoT,netoEsperadaT);
		assertEquals(netoA,netoEsperadaA);
	}
	
	@Test
	public void edad() {
		
		int edadL = empleadoP.edad();
		int edadT = empleadoT.edad();
		int edadA = empleadoP2.edad();
		
		assertEquals(edadL,28);
		assertEquals(edadT,38);
		assertEquals(edadA,59);
	}
		
}
