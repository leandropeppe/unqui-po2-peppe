package ar.edu.unq.po2.tp7;

import java.util.*;
import java.util.stream.Stream;


public class PokerStatus {
	
	
	
	public boolean verificar(String carta1 ,String carta2,String carta3 ,String carta4,String carta5) {
		// lo metes en una lista 
		// sacas el primero de cada una [2, 1 ,2 , 2, 2 ]
		// preguntar a los primeros dos si hay 4 de su valor en la lista
		
		
		List<String> valores = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		
		List<String> numeros = new ArrayList<String>();
		for(String valor : valores) {
			numeros.add(valor.substring(0, valor.length()-1));
		}
		
		boolean condicion1 = Collections.frequency(numeros, numeros.get(0)) == 4 ;
		boolean condicion2 = Collections.frequency(numeros, numeros.get(1)) == 4 ;
		
		
		return condicion1 | condicion2;	
	}
	
	
	
	
}
