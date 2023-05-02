package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private double edad;
	private double sueldoNetoMensual;
	private double ahorros ; //Para corroborar si recibio la tarasca
	private PropiedadInmobiliaria jauz;
	
	public Cliente(String nombre, String apellido, String direccion, double edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public void recibirGuita(double monto) {
		ahorros += monto;
	}
	
	public void solicitudCreditoPersonal(double monto, double plazo) {
		
	}
	
	public void solicitudCreditoHipotecario(double monto, double plazo, PropiedadInmobiliaria jauz) {
		
	}
	
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public double calcularSueldoAnual() {
		return sueldoNetoMensual * 12;
	}

	public double getEdad() {
		return edad;
	}

	public double getAhorros() {
		return ahorros;
	}
	
}
