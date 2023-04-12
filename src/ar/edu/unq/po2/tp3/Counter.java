package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Empleado;


public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
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
	
	
	/////////////////////////////////////////////////////
	
	
	public int desarmandoNumeros() {
		
		int masDigitosPares = numeros.get(0);
		/*
		for(int i = numeros.get(1) ; i <= numeros.size() - 1; i = i++){
			masDigitosPares = this.numeroConMasPares(masDigitosPares,numeros.get(i));
		}	
		*/
		for (int num:numeros ) {
			masDigitosPares = this.numeroConMasPares(masDigitosPares,num);
		}

		return masDigitosPares ;
	}
	
	
	
	public int numeroConMasPares(int num1, int num2) {
		List<Integer> arr1 = this.separadorDeNumeros(num1);
		List<Integer> arr2 = this.separadorDeNumeros(num2);
		if(this.cantidadPares(arr1) >= this.cantidadPares(arr2)) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	
	public List<Integer> separadorDeNumeros(int num){
		List<Integer> arr1 = new ArrayList<Integer>();
        
        while(num > 0){
        	arr1.add(num % 10);
            num = num / 10;
        }
        
        return arr1;
	}
	
	
	public int cantidadPares(List<Integer> num) {
		int acumulador = 0;
		for(Integer numero: num) {
			if(numero % 2 == 0)
				acumulador += 1 ;
		}
		return acumulador; 
	}
	
	
	
	
	//////////////////////////////////////////////////////////
	
	// 3 9
	public int multiplo(int x, int y) {
	    for (int i = 1000; i > 0; i--) {
	        if (i % x == 0 && i % y == 0) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	
	
	//////////////////////////////////////////7
	
	
	
	
	
	
}
