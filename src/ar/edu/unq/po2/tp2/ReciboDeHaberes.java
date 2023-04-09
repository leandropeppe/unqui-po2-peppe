package ar.edu.unq.po2.tp2;

import java.util.Date;
import java.util.Objects;

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

	
	@Override
    public int hashCode() {
        return Objects.hash(nombreDelEmpleado, direccionDelEmpleado , fechaEmision , sueldoBruto , sueldoNeto);
    }
	
	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}


	public void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.nombreDelEmpleado = nombreDelEmpleado;
	}


	public String getDireccionDelEmpleado() {
		return direccionDelEmpleado;
	}


	public void setDireccionDelEmpleado(String direccionDelEmpleado) {
		this.direccionDelEmpleado = direccionDelEmpleado;
	}


	public Date getFechaEmision() {
		return fechaEmision;
	}


	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	public double getSueldoBruto() {
		return sueldoBruto;
	}


	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}


	public double getSueldoNeto() {
		return sueldoNeto;
	}


	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	} 
	
	
	
}


