package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Persona implements Nombrable {
	
	private String nombre ; 
	private LocalDate fechaNac ; 
	
	LocalDate ahora = LocalDate.now() ;
	//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Persona(String nombre, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	public int edad() {
		Period periodo = Period.between(fechaNac,ahora) ; //  LocalDate.now() - this.fechaDeNacimiento;
		return periodo.getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

		
	
	public Boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();   
	}
	
	
	
	
}
