package ar.edu.unq.po2.tp2;
//import java.util.Date;

import java.time.LocalDate;
import java.util.Date;

public class EmpleadoPlantaTemporal extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int cantHorasExtras;
	
	public EmpleadoPlantaTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			double sueldoBasico, LocalDate fechaFinDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
	
	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	public void setFechaFinDesignacion(LocalDate fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
	@Override
	protected double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.extrasMensuales() ;
	}
	private double extrasMensuales() {
		return 40 * this.getCantHorasExtras();
	}
	
	@Override
	protected double calcularRetenciones() {
		return this.retencionesOS() + this.retencionPorEdadAvanzada() + this.aportesJub() + this.retencionesSobreExtras();
	} 
	
	private double retencionesSobreExtras() {
		return 5 * this.getCantHorasExtras();
	}
	private double retencionPorEdadAvanzada() {
		if(this.edad() >= 50) {
			return 25;
		}
		else {
			return 0 ;
		}
	}
	
	@Override
	protected double aportesJub() {
		return 0.1 * this.calcularSueldoBruto();
	}



	@Override 
	public ReciboDeHaberes generarRecibo() {
		Date fechaActual = new Date();
		ReciboDeHaberes reciboEmpleado = new ReciboDeHaberes(this.getNombre(), this.getDireccion(), fechaActual , this.calcularSueldoBruto(), this.calcularSueldoNeto() );
		
		return reciboEmpleado ;
	}
	
	
	
	
	
	
}
