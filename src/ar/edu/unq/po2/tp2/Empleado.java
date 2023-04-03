package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public abstract class Empleado {
	// Attributes
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate ahora = LocalDate.now();
	
	
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento ;
	private double sueldoBasico;
	
	// setter y getter attributes
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	//////////////////////////////////////77
	
	// Constructor
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	////////
	
	protected abstract double calcularSueldoBruto();
	
	protected abstract double calcularRetenciones();
	
	public double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones() ;
	}
	
	public double retencionesOS() {
		return this.calcularSueldoBruto() * 0.1;
	}
	
	protected abstract double aportesJub() ;
	
	public int edad() {
		Period periodo = Period.between(fechaDeNacimiento,ahora) ; //  LocalDate.now() - this.fechaDeNacimiento;
		return periodo.getYears();
		
		
	}
	
	public abstract ReciboDeHaberes generarRecibo() ;
	
}
