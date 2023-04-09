package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Empleado;


public class Counter {
	
	List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	public int cantidadImpares() {
		int acumulador = 0;
		for(Integer numero: numeros) {
			if(numero % 2 != 0)
				acumulador += 1 ;
		}
		return acumulador; 
	}
	
	public int cantidadPares() {
		int acumulador = 0;
		for(Integer numero: numeros) {
			if(numero % 2 == 0)
				acumulador += 1 ;
		}
		return acumulador; 
	}
	
	public int cantidadMultiplosDe(int multiplo) {
		int acumulador = 0;
		for(Integer numero: numeros) {
			if(numero % multiplo == 0)
				acumulador += 1 ;
		}
		return acumulador; 
	}
	
	public int desarmandoNumeros(List numeros) {
		
		int masDigitosPares = (int) numeros.get(0);
		
		for(int i = (int) numeros.get(1); i <= numeros.size() - 1; i = i + 1){
			if(this.cantidadPares(generarArreglo(numeros.get(i))) > this.cantidadPares(generarArreglo(masDigitosPares)) ) {
				masDigitosPares = numeros.get(i) ;
			}
		}
		return masDigitosPares ;
		
			
	}
	
	public List<Integer> generarArreglo(int numero){
		List<Integer> arreglo = new ArrayList<Integer>();
		
		
		2546
		largo del numero = 4

		while (largoDelNumero != 0) {
			divisor = 10 ;
			if(es divisible ){
				2546 mod divisor 
			}
			
			divisor = divisor * 10
			largoDelNumero -= 1

		}
		
		int largoDelNumero = ;
		return arreglo;
	}
	
}
