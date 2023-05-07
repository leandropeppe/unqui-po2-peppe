package ar.edu.unq.po2.tp7;

import java.util.Collections;
import java.util.List;

public class ChequeadorColor implements IChequadorDeJugada{
	
	private List<Carta> manoAChequear ;
	
	
	public ChequeadorColor(List<Carta> manoAChequear) {
		super();
		this.manoAChequear = manoAChequear;
	}
	
	public boolean chequear() {
		
		List<String> palos = manoAChequear.stream().map(c->c.getPalo()).toList();
		
		// Condiciones para Color
		
		
		return Collections.frequency(palos, palos.get(0)) == 5 ;

	}
	
	@Override
	public String nombreJugada() {
		if(this.chequear()) {
			return "Color";
		}else {
			return "Nada";
		}
		
	}

	
	
	
}
