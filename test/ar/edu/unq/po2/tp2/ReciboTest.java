package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ReciboTest {
	
List<Empleado> empleados = new ArrayList<Empleado>();
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNacAriel = LocalDate.parse("15/08/1963", fmt);
	LocalDate fechaNacLeandro = LocalDate.parse("29/07/1994", fmt);
	LocalDate fechaNacTemp = LocalDate.parse("29/03/1985", fmt);
	LocalDate fechaExpTemp = LocalDate.parse("30/12/2023", fmt);
	
	EmpleadoPlantaPermanente empleadoP  = new EmpleadoPlantaPermanente("Leandro", "Bernal", "Soltero", fechaNacLeandro , 50000, 0, 10 );
	EmpleadoPlantaTemporal   empleadoT  = new EmpleadoPlantaTemporal("Temporal", "Bernal", "Casado", fechaNacTemp , 50000, fechaExpTemp , 10 );
	EmpleadoContratado       empleadoC  = new EmpleadoContratado("Ariel", "Bernal", "Casado", fechaNacAriel , 50000, "54056", "cheque" );
	
	
	Empresa exo = new Empresa("Exo","20384405143", empleados ) ;
	
	
	
	@Test
	public void ReciboDeHaberesTest() {
		
		
		
	}
	
	
	
	
}
