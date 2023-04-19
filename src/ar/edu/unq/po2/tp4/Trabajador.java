package ar.edu.unq.po2.tp4;

import java.util.*;

public class Trabajador {

	
	private List<Ingreso> ingresosPorAño ;
	
	
	public Trabajador() {
		super();
		this.ingresosPorAño = new ArrayList<Ingreso>();
	}

	public void agregarIngreso(Ingreso ingreso) {
		ingresosPorAño.add(ingreso);
	}

	
	
	public double getTotalPercibido() {
		//retornar el monto total percibido por el trabajador
		double acumulador = 0;
		for(Ingreso ingreso : ingresosPorAño) {
			acumulador += ingreso.getMonto();
		}
		return acumulador;
	}
	
	
	public double getMontoImponible() {
		//retornar el monto imponible al impuesto al trabajador
		double acumulador = 0;
		for(Ingreso ingreso : ingresosPorAño) {
			acumulador += ingreso.montoImponible();
		}
		return acumulador;
	}

	
	public double getImpuestoAPagar() {
		//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
		return 0.02 * this.getMontoImponible();
	}

	
	
	
	
}
