package ar.edu.unq.po2.tp2;

public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String fechaDeNacimiento;
	private float sueldoBasico;
	
	
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
	
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public Empleado(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
}
