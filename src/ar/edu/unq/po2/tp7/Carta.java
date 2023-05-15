package ar.edu.unq.po2.tp7;

//import java.util.function.BooleanSupplier;

public class Carta {
	int valor;
	String palo;
	
	
	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String toString() {
		return this.valor + " " + this.palo;
	}

	public String getPalo() {
		return palo;
	}


	public boolean esMayorQue(Carta carta) {
		return valor > carta.getValor() ;
	}


	public boolean esMismoPalo(Carta carta) {
		// TODO Auto-generated method stub
		return palo == carta.getPalo();
	}
	
}
