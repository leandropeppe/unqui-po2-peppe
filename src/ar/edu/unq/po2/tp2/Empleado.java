package ar.edu.unq.po2.tp2;


import java.util.Date;

public abstract class Empleado {
	// Attributes
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNacimiento;
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
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	//////////////////////////////////////77
	
	// Constructor
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento2, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento2;
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
		return 0 ; //  LocalDate.now() - this.fechaDeNacimiento;
	}
	
	
}
