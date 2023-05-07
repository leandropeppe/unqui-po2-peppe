package ar.edu.unq.po2.tp7;

import java.util.Collections;
import java.util.List;

public class ChequeadorPoker implements IChequadorDeJugada {
	
	private List<Carta> manoAChequear ;
	
	
	public ChequeadorPoker(List<Carta> manoAChequear) {
		super();
		this.manoAChequear = manoAChequear;
	}

	
	public boolean chequear() {  // Verifica si la mano es poker
		
		List<Integer> valores = manoAChequear.stream().map(c->c.getValor()).toList();
		
		// Condiciones para formar Poker
		boolean condPoquer1 = Collections.frequency(valores, valores.get(0)) == 4 ;
		boolean condPoquer2 = Collections.frequency(valores, valores.get(1)) == 4 ;
		
		
		return condPoquer1 | condPoquer2 ;
	}
	
	@Override
	public String nombreJugada() { // Devuelve "Poker" si lo es "Nada" sino
		if(this.chequear()) {
			return "Poquer";
		}else {
			return "Nada";
		}
		
	}

	

	
	/*
	public valorPoker(List<Carta> cartas) {
		
	}
	*/

}
