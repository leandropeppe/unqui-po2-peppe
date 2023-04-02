package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPermanente extends Empleado {
	
	private int cantHijos;
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, int fechaDeNacimiento,
			float sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}



	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
	public double salarioFamiliar() {
		return this.asignacionXHijo() + this.asignacionXConyuje() + this.asignacionXAntiguedad() ;
	}
	
	private float asignacionXAntiguedad() {
		return 5 * this.getAntiguedad();
	}


	private float asignacionXHijo() {
		return 150 * this.getCantHijos();
	}
	

	private float asignacionXConyuje() {
		// Preguntar
		if(this.getEstadoCivil() != "Soltero") {
			return 100;
		}
		else {
			return 0;
		}
	}


	@Override
	protected double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}
	
	@Override
	protected double calcularRetenciones() {
		return this.retencionesOS() + (20 * this.getCantHijos()) + this.aportesJub() ;
	}
	
	@Override
	protected double aportesJub() {	
		return 0.15 * this.calcularSueldoBruto();
	}
	
	
	
	
	
}
