package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
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
	  public Carta diezDeTrebol;
	  public Carta diezDeDiamantes;
	  
	  public Carta qDeCorazones;
	  public Carta qDeDiamantes;
	  public Carta qDeTreboles;

	@BeforeEach
	void setUp() {
		asDeCorazones= new Carta();
	    asDePica= new Carta();
	    asDeTreboles= new Carta();
	    asDeDiamantes= new Carta();
	    
	    dosDeCorazones= new Carta();
	    dosDePica= new Carta();
	    dosDeTreboles= new Carta();
	    dosDeDiamantes= new Carta();
	    
	    kDeCorazones= new Carta();
	    kDePica= new Carta();
	    kDeTreboles= new Carta();
	    kDeDiamantes= new Carta();
	    
	    diezDeCorazones= new Carta();
	    diezDePica= new Carta();
	    diezDeTrebol= new Carta();
	    diezDeDiamantes= new Carta();
	    
	    qDeCorazones = new Carta();
	    qDeDiamantes = new Carta();
	    qDeTreboles  = new Carta();
	}

	@Test
	void esMayorQueTest() {
		assertTrue(qDeTreboles.esMayorQue(diezDePica));
		assertFalse(dosDePica.esMayorQue(kDePica));
		assertFalse(dosDeTreboles.esMayorQue(dosDeDiamantes));
	}
	
	void esMismoPaloTest() {
		assertFalse(qDeTreboles.esMismoPalo(diezDePica));
		assertTrue(dosDePica.esMismoPalo(kDePica));
		assertFalse(dosDeTreboles.esMismoPalo(dosDeDiamantes));
	}
}
