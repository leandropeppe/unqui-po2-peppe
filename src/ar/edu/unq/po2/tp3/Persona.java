package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {
	
	private String nombre ; 
	private LocalDate fechaNac ; 
	private int edad; 
	
	LocalDate ahora = LocalDate.now() ;
	
	public Persona(String nombre, LocalDate fechaNac2) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac2;
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
		return this.getFechaNac().isBefore(persona.getFechaNac()) ;   
	}
	
	
	public static Persona persona(String nombre , LocalDate fechaNac) {
		return new Persona(nombre,fechaNac);
	}
	
	
	
}
