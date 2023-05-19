package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaTest {
	// Nodo
	ParcelaMixta parcelaNodo1 ;
	
	// nivel 1
	
	ParcelaPura parcelaPura1 ;
	ParcelaPura parcelaPura2 ;
	ParcelaPura parcelaPura3 ;
	ParcelaMixta parcelaNodo2 ;
	
	
	//Nivel 2
	ParcelaPura parcelaPura4 ;
	ParcelaPura parcelaPura5 ;
	ParcelaPura parcelaPura6 ;
	ParcelaPura parcelaPura7 ;
	

	@BeforeEach
	void setUp()  {
		parcelaNodo1 =  new ParcelaMixta();
		
		
		parcelaPura1 =  new ParcelaPura("Soja");
		parcelaPura2 =  new ParcelaPura("Trigo");
		parcelaPura3 =  new ParcelaPura("Soja");
		parcelaNodo2 =  new ParcelaMixta();
		
		parcelaNodo1.agregarParcelas(parcelaPura1, parcelaPura2, parcelaPura3, parcelaNodo2);
		
		////////////////////////////////
		
		parcelaPura4 =  new ParcelaPura("Soja");
		parcelaPura5 =  new ParcelaPura("Soja");
		parcelaPura6 =  new ParcelaPura("Trigo");
		parcelaPura7 =  new ParcelaPura("Trigo");
		
		parcelaNodo2.agregarParcelas(parcelaPura4, parcelaPura5, parcelaPura6, parcelaPura7);
	}

	
	
	@Test
	void primerNivel() {
		
		assertEquals(0,parcelaNodo1.getNivel());
		
		assertEquals(1,parcelaPura1.getNivel());
		assertEquals(1,parcelaPura2.getNivel());
		assertEquals(1,parcelaPura3.getNivel());
		assertEquals(1,parcelaNodo2.getNivel());
		
		//assertEquals(500,parcelaPura1.recaudacionAnual());
		//assertEquals(300,parcelaPura2.recaudacionAnual());
		//assertEquals(500,parcelaPura3.recaudacionAnual());
		//assertEquals(75,parcelaNodo2.recaudacionAnual());
		
			
	}
	
	@Test
	void segundoNivel() {
		
		assertEquals(2,parcelaPura4.getNivel());
		assertEquals(2,parcelaPura5.getNivel());
		assertEquals(2,parcelaPura6.getNivel());
		assertEquals(2,parcelaPura7.getNivel());
		
		assertEquals(400,parcelaNodo2.recaudacionAnual());
		
		assertEquals(125,parcelaPura4.recaudacionAnual());
		assertEquals(125,parcelaPura5.recaudacionAnual());
		assertEquals(75,parcelaPura6.recaudacionAnual());
		assertEquals(75,parcelaPura7.recaudacionAnual());
		
	}

}
