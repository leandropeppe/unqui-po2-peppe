package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPermanente extends Empleado {
	private int cantHijos;
	private int antiguedad;
	
	
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
	
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			float sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	
	
	
	
}
