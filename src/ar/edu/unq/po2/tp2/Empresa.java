package ar.edu.unq.po2.tp2;

import java.util.*;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;

	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>() ;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuit() {
		return cuit;
	}

	
	
}
