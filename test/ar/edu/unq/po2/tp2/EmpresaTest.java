package ar.edu.unq.po2.tp2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
//import java.util.Date;
import org.junit.jupiter.api.Test;

// assertTrue, assertEquals.

public class EmpresaTest {
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacAriel = LocalDate.parse("15/08/1963", fmt);
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	LocalDate fechaNacTemp = LocalDate.parse("29/03/1985", fmt);
	LocalDate fechaExpTemp = LocalDate.parse("30/12/2023", fmt);
	
	EmpleadoPlantaPermanente empleadoP  = new EmpleadoPlantaPermanente("Leandro", "Bernal", "Soltero", fechaNacLeandro , 50000, 0, 10 );
	EmpleadoPlantaTemporal   empleadoT  = new EmpleadoPlantaTemporal("Temporal", "Bernal", "Casado", fechaNacTemp , 50000, fechaExpTemp , 10 );
	EmpleadoContratado       empleadoC  = new EmpleadoContratado("Ariel", "Bernal", "Casado", fechaNacAriel , 50000, "54056", "cheque" );
	
	@BeforeEach
	public void setUp() throws Exception {
		
		
		
		// A la lista a los empleados
		empleados.add(empleadoP);
		empleados.add(empleadoT);
		empleados.add(empleadoC);


	}
	
	
	
	Empresa exo = new Empresa("Exo","20384405143", empleados ) ;
	
	
	@Test
	public void calcularMontoTotalSueldoBrutoTest() {
		
		double montoTotalBruto = exo.calcularMontoTotalSueldoBruto();
		
		assertEquals(montoTotalBruto,150450);
		
	}
	
	@Test
	public void calcularMontoTotalRetencionesTest() {
		
		double montoTotalRetenciones = exo.calcularMontoTotalRetenciones();
		
		assertEquals(montoTotalRetenciones,22692.5,1);
		
	}
	
	@Test
	public void calcularMontoTotalSueldoNetoTest() {
		
		double montoTotalNeto = exo.calcularMontoTotalSueldoNeto();
		
		assertEquals(montoTotalNeto,127758,1);
	
	}
	
	@Test
	public void liquidarRecibosTest() {
		
		List<ReciboDeHaberes> reciboDeHaberes = exo.liquidarSueldos();
		
		assertEquals(empleadoP,empleados.get(0));
		
		// assertEquals(empleadoP.generarRecibo(),reciboDeHaberes.get(0));   Que pasa aca loco ?? 
	
		
	}
	
}
