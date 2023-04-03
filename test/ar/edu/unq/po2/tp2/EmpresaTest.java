package ar.edu.unq.po2.tp2;

import java.util.ListIterator;

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
	EmpleadoPlantaPermanente empleadoP2 = new EmpleadoPlantaPermanente("Ariel", "Bernal", "Casado", fechaNacAriel , 50000, 2, 30 );
	
	@BeforeEach
	public void setUp() throws Exception {
		
		
		
		// A la lista a los empleados
		empleados.add(empleadoP);
		empleados.add(empleadoT);
		empleados.add(empleadoP2);


	}
	
	
	
	Empresa exo = new Empresa("Exo","20384405143", empleados ) ;
	
	
	@Test
	public void calcularMontoTotalSueldoBrutoTest() {
		
		double montoTotalBruto = exo.calcularMontoTotalSueldoBruto();
		
		assertEquals(montoTotalBruto,151000);
		
	}
	
	@Test
	public void calcularMontoTotalRetencionesTest() {
		
		double montoTotalRetenciones = exo.calcularMontoTotalRetenciones();
		
		assertEquals(montoTotalRetenciones,35320,1);
		
	}
	
	@Test
	public void calcularMontoTotalSueldoNetoTest() {
		
		double montoTotalNeto = exo.calcularMontoTotalSueldoNeto();
		
		assertEquals(montoTotalNeto,115681);
	
	}
	
}
