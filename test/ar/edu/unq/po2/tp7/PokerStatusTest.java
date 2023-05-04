
package ar.edu.unq.po2.tp7;

import static org.junit.Assert.*;
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
  
  public String qDeCorazones;
  public String qDeDiamantes;
  public String qDeTreboles;
  
  
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
    
    qDeCorazones = "QC" ;
    qDeDiamantes = "QD" ;
    qDeTreboles = "QT";
    
    
  } // *1 hasta aca es el Setup del test JUnit

  
  
  
  // Comienza el Verify
  @Test
  void testVerificarSiHayPoker() {
    assertEquals("Poquer",pk.verificar(asDeCorazones,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones));// hay Poquer
    assertEquals("Trio",pk.verificar(dosDeTreboles,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones));// hay Trio
    assertEquals("Color",pk.verificar(asDeCorazones,qDeCorazones,diezDeCorazones,kDeCorazones,dosDeCorazones));// hay color
    assertEquals("Nada",pk.verificar(dosDeTreboles,asDePica,diezDeCorazones,asDeDiamantes,dosDeCorazones));// no hay nada
  }
  
 
  @Test
  void testVerificarPoker() {
    assertEquals("Poquer",pk.verificar(asDeCorazones,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones));// hay Poquer
    assertEquals("Nada",pk.verificar(dosDeTreboles,asDePica,diezDeCorazones,asDeDiamantes,dosDeCorazones));// no hay Poquer
    
  }
  @Test
  void testVerificarColor() {
    assertEquals("Color",pk.verificar(asDeCorazones,dosDeCorazones,kDeCorazones,diezDeCorazones,qDeCorazones));// hay color
    assertEquals("Nada",pk.verificar(dosDeTreboles,asDePica,diezDeCorazones,asDeDiamantes,dosDeCorazones));// no hay color
    
  }
  
  @Test
  void testVerificarTrio() {
    assertEquals("Trio",pk.verificar(qDeCorazones,qDeDiamantes,kDeCorazones,diezDeCorazones,qDeTreboles));// hay trio
    assertEquals("Nada",pk.verificar(dosDeTreboles,asDePica,asDeTreboles,diezDeCorazones,dosDeCorazones));// no hay trio
    
  }

  
  
//Termina el Verify
// El Teardown esta implicito, se ejecuta una vez terminado el verify
}