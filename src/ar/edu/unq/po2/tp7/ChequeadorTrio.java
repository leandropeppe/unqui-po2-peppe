package ar.edu.unq.po2.tp7;

import java.util.Collections;
import java.util.List;

public class ChequeadorTrio implements IChequadorDeJugada{
	
	private List<Carta> manoAChequear ;
	
	public ChequeadorTrio(List<Carta> manoAChequear) {
		super();
		this.manoAChequear = manoAChequear;
	}

	public boolean chequear() {
		
		List<Integer> valores = manoAChequear.stream().map(c->c.getValor()).toList();
		
		//Condiciones para formar Trio
		boolean condTrio1 = Collections.frequency(valores, valores.get(0)) == 3 ;
		boolean condTrio2 = Collections.frequency(valores, valores.get(1)) == 3 ;
		boolean condTrio3 = Collections.frequency(valores, valores.get(2)) == 3 ;
		
		
		return condTrio1 | condTrio2 | condTrio3;
		
	}
	
	public String nombreJugada() {
		if(this.chequear()) {
			return "Trio";
		}else {
			return "Nada";
		}
		
	}

	
	
}
