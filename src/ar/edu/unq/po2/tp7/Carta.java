package ar.edu.unq.po2.tp7;

import java.util.function.BooleanSupplier;

public class Carta {
	int valor;
	String palo;
	
	
	public int getValor() {
		return valor;
	}



	public String getPalo() {
		return palo;
	}



	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}



	public boolean esMayorQue(Carta diezDePica) {
		// TODO Auto-generated method stub
		return true;
	}

	

	public boolean esMismoPalo(Carta carta) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
