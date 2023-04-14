package ar.edu.unq.po2.tp3;

import java.util.*;

public class Multioperador {
	
	List<Integer> arreglo = new ArrayList<Integer>();
	
	public void addNumber(int numero) {
		arreglo.add(numero);
	}
	
	public int suma() {
		int acumulador = 0;
		for (int entero:arreglo ) {
			acumulador += entero;
		}
		return acumulador;
	}
	
	public int resta() {
		int acumulador = 0;
		for (int entero:arreglo ) {
			acumulador -= entero;
		}
		return acumulador;
	}
	
	public int multiplicador() {
		int acumulador = 1;
		for (int entero:arreglo ) {
			acumulador *= entero;
		}
		return acumulador;
	}
}
