package ar.edu.unq.po2.tp2;

import java.util.Date;

public class ReciboDeHaberes {
	private String nombreDelEmpleado;
	private String direccionDelEmpleado;
	private Date fechaEmision ; //= new Date();
	private double sueldoBruto;
	private double sueldoNeto;
	//private String desgloce;
	
	
	public ReciboDeHaberes(String nombreDelEmpleado, String direccionDelEmpleado, Date fechaEmision, double sueldoBruto,
			double sueldoNeto) {
		super();
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccionDelEmpleado = direccionDelEmpleado;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	} 
	
	
}


