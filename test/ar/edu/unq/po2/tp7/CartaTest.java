package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	  public Carta asDeCorazones;
	  public Carta asDePica;
	  public Carta asDeTreboles;
	  public Carta asDeDiamantes;
	  
	  public Carta dosDeCorazones;
	  public Carta dosDePica;
	  public Carta dosDeTreboles;
	  public Carta dosDeDiamantes;
	  
	  public Carta kDeCorazones;
	  public Carta kDePica;
	  public Carta kDeTreboles;
	  public Carta kDeDiamantes;
	  
	  
	  public Carta diezDeCorazones;
	  public Carta diezDePica;
	  public Carta diezDeTreboles;
	  public Carta diezDeDiamantes;
	  
	  public Carta qDeCorazones;
	  public Carta qDeDiamantes;
	  public Carta qDeTreboles;

	@BeforeEach
	void setUp() {
		asDeCorazones= new Carta(1, "Corazon");
	    asDePica= new Carta(1, "Pica");
	    asDeTreboles= new Carta(1, "Treboles");
	    asDeDiamantes= new Carta(1, "Diamantes");
	    
	    dosDeCorazones= new Carta(2, "Corazon");
	    dosDePica= new Carta(2, "Pica");
	    dosDeTreboles= new Carta(2, "Treboles");
	    dosDeDiamantes= new Carta(2, "Diamantes");
	    
	    kDeCorazones= new Carta(13, "Corazon");
	    kDePica= new Carta(13, "Pica");
	    kDeTreboles= new Carta(13, "Treboles");
	    kDeDiamantes= new Carta(13, "Diamantes");
	    
	    diezDeCorazones= new Carta(10, "Corazon");
	    diezDePica= new Carta(10, "Pica");
	    diezDeTreboles= new Carta(10, "Treboles");
	    diezDeDiamantes= new Carta(10, "Diamantes");
	    
	    qDeCorazones = new Carta(12,"Corazon");
	    qDeDiamantes = new Carta(12,"Diamantes");
	    qDeTreboles  = new Carta(12,"Treboles");
	}

	@Test
	void esMayorQueTest() {
		assertTrue(qDeTreboles.esMayorQue(diezDePica));
		assertFalse(dosDePica.esMayorQue(kDePica));
		assertFalse(dosDeTreboles.esMayorQue(dosDeDiamantes));
	}
	
	@Test
	void esMismoPaloTest() {
		assertFalse(qDeTreboles.esMismoPalo(diezDePica));
		assertTrue(dosDePica.esMismoPalo(kDePica));
		assertFalse(dosDeTreboles.esMismoPalo(dosDeDiamantes));
		assertEquals("12 Treboles",qDeTreboles.toString());
	}
}