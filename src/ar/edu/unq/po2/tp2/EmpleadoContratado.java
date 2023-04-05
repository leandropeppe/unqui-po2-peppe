package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Date;

public class EmpleadoContratado extends Empleado{
	private String numContrat;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			double sueldoBasico, String numContrat, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numContrat = numContrat;
		this.medioDePago = medioDePago;
	}

	
	
	public String getNumContrat() {
		return numContrat;
	}


	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}



	@Override
	protected double calcularSueldoBruto() {
		return this.getSueldoBasico();
	}



	@Override
	protected double calcularRetenciones() {
		return 50 ;
	}



	@Override
	protected double aportesJub() {
		return 0;
	}



	@Override
	public ReciboDeHaberes generarRecibo() {
		Date fechaActual = new Date();
		ReciboDeHaberes reciboEmpleado = new ReciboDeHaberes(this.getNombre(), this.getDireccion(), fechaActual , this.calcularSueldoBruto(), this.calcularSueldoNeto() );
		
		return reciboEmpleado ;
	} 
	
	
	
}
