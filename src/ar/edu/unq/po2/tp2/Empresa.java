package ar.edu.unq.po2.tp2;

import java.util.*;
import java.util.ArrayList;


public class Empresa {
	
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();

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
		
		List<Empleado> sueldosBrutos = new ArrayList<Empleado>();
		Foreach(Empleado empleados: empleados){
			empleado.calcularSueldoBruto().add(sueldosBrutos);
		}
		return sueldosBrutos.sum();
	}
	
	public double calcularMontoTotalRetenciones() {
		return 0 ;
	}
	
	public double calcularMontoTotalSueldoNeto() {
		return this.calcularMontoTotalSueldoBruto() - this.calcularMontoTotalRetenciones() ;
	}
	
}
