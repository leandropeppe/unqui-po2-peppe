
package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
  
  
  public String asDeCorazones;
  public String asDePica;
  public String asDeTreboles;
  public String asDeDiamantes;
  
  public String dosDeCorazones;
  public String dosDePica;
  public String dosDeTreboles;
  public String dosDeDiamantes;
  
  public String kDeCorazones;
  public String kDePica;
  public String kDeTreboles;
  public String kDeDiamantes;
  
  
  public String diezDeCorazones;
  public String diezDePica;
  public String diezDeTrebol;
  public String diezDeDiamantes;
  
  public PokerStatus pk;
  
  
  @BeforeEach
  void setUp() throws Exception { // *1 desde aca 
    pk = new PokerStatus();
	  
    asDeCorazones="1C";
    asDePica="1P";
    asDeTreboles="1T";
    asDeDiamantes="1D";
    
    dosDeCorazones="2C";
    dosDePica="2P";
    dosDeTreboles="2T";
    dosDeDiamantes="2D";
    
    kDeCorazones="KC";
    kDePica="KP";
    kDeTreboles="KT";
    kDeDiamantes="KD";
    
    diezDeCorazones="10C";
    diezDePica="10P";
    diezDeTrebol="10T";
    diezDeDiamantes="10D";
    
    
  } // *1 hasta aca es el Setup del test JUnit

  // Comienza el Verify
  @Test
  void testVerificarSiHayPoker() {
    assertTrue(pk.verificar(asDeCorazones,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones));// hay poker
    assertFalse(pk.verificar(dosDeTreboles,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones));// no hay poker
    
  }

  
//Termina el Verify
// El Teardown esta implicito, se ejecuta una vez terminado el verify
}