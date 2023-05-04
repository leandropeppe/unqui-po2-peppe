package ar.edu.unq.po2.tp7;

import java.util.*;
import java.util.stream.Stream;


public class PokerStatus {
	
	
	
	public String verificar(String carta1 ,String carta2,String carta3 ,String carta4,String carta5) {
		// lo metes en una lista 
		// sacas el primero de cada una [2, 1 ,2 , 2, 2 ]
		// preguntar a los primeros dos si hay 4 de su valor en la lista
		
		
		List<String> valores = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		
		List<String> numeros = new ArrayList<String>();
		List<String> ultimos = new ArrayList<String>();
		
		for(String valor : valores) {
			numeros.add(valor.substring(0, valor.length()-1));
		}
		
		for(String valor : valores) {
			ultimos.add(valor.substring(valor.length()-1));
		}
		// Condiciones para formar Poker
		boolean condPoquer1 = Collections.frequency(numeros, numeros.get(0)) == 4 ;
		boolean condPoquer2 = Collections.frequency(numeros, numeros.get(1)) == 4 ;
		
		
		//Condiciones para formar Trio
		boolean condTrio1 = Collections.frequency(numeros, numeros.get(0)) == 3 ;
		boolean condTrio2 = Collections.frequency(numeros, numeros.get(1)) == 3 ;
		boolean condTrio3 = Collections.frequency(numeros, numeros.get(2)) == 3 ;
		
		// Condiciones para Color
		boolean condColor = Collections.frequency(ultimos, ultimos.get(0)) == 5 ;
		
		
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
	}
	
	
	
	
}
