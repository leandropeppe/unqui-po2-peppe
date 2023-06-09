package ar.edu.unq.po2.tp2;

import java.util.*;

public class Empresa {
	
	private String nombre;
	private String cuit;
	public List<Empleado> empleados = new ArrayList<Empleado>();
	public List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();

	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuit() {
		return cuit;
	}
	
	public double calcularMontoTotalSueldoBruto() {
		
		int acumulador = 0;
		for(Empleado empleado: empleados) {
			acumulador += empleado.calcularSueldoBruto();
		}
		return acumulador;
		
	}
	
	public double calcularMontoTotalRetenciones() {
		int acumulador = 0;
		for(Empleado empleado: empleados) {
			acumulador += empleado.calcularRetenciones();
		}
		return acumulador;
	}
	
	public double calcularMontoTotalSueldoNeto() {
		return this.calcularMontoTotalSueldoBruto() - this.calcularMontoTotalRetenciones() ;
	}
	
	
	public List<ReciboDeHaberes> liquidarSueldos() {
		
		for(Empleado empleado: empleados) {
			recibos.add(empleado.generarRecibo());
		}
		return recibos;
	}
	
}
