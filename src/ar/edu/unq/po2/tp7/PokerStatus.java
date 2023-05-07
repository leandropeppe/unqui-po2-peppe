package ar.edu.unq.po2.tp7;

import java.util.*;
import java.util.stream.Stream;


public class PokerStatus {
	
	private List<Carta> mano1 ; // =  new ArrayList<Carta>();
	private List<Carta> mano2 ;
	
	
	public PokerStatus(List<Carta> mano1, List<Carta> mano2) {
		super();
		this.mano1 = mano1;
		this.mano2 = mano2;
	}
	
	
	public List<Carta> getMano1() {
		return mano1;
	}
	
	public List<Carta> getMano2() {
		return mano2;
	}
	
	
	public String verificar(List<Carta> mano) {
		
		
		List<String> jugadas = new ArrayList<String>();
		
		ChequeadorPoker checkP = new ChequeadorPoker(mano) ;
		ChequeadorColor checkC = new ChequeadorColor(mano) ;
		ChequeadorTrio checkT = new ChequeadorTrio(mano);
		
		
		jugadas.add(checkP.nombreJugada());
		jugadas.add(checkC.nombreJugada());
		jugadas.add(checkT.nombreJugada());
		//["Poker","Nada","Trio"]
		int n = 0;
		while(jugadas.get(n) == "Nada" & n != jugadas.size()-1) {
			n += 1 ;
		}
		
		
		return jugadas.get(n);
		
		// lo metes en una lista 
		// sacas el primero de cada una [2, 1 ,2 , 2, 2 ]
		// preguntar a los primeros dos si hay 4 de su valor en la lista
		
		
		//List<Integer> valores = mano.stream().map(c->c.getValor()).toList();
		//List<String> palos = mano.stream().map(c->c.getPalo()).toList();
		
		
		
		// Condiciones para formar Poker
		//boolean condPoquer1 = Collections.frequency(valores, valores.get(0)) == 4 ;
		//boolean condPoquer2 = Collections.frequency(valores, valores.get(1)) == 4 ;
		
		
		//Condiciones para formar Trio
		//boolean condTrio1 = Collections.frequency(valores, valores.get(0)) == 3 ;
		//boolean condTrio2 = Collections.frequency(valores, valores.get(1)) == 3 ;
		//boolean condTrio3 = Collections.frequency(valores, valores.get(2)) == 3 ;
		
		// Condiciones para Color
		//boolean condColor = Collections.frequency(palos, palos.get(0)) == 5 ;
		
		/*
		if(condColor) {
			return "Color";
		}
		else if(condPoquer1 | condPoquer2) {
			return "Poquer";
		}
		else if(condTrio1 | condTrio2 | condTrio3){
			return "Trio";
		}
		else {
		return "Nada";
		}
		*/
		
	}

	
	public String ganadorDeMano(List<Carta> mano1,List<Carta> mano2) {
		
		return "H";
	}

	
	
	
	
	
}