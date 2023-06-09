
package ar.edu.unq.po2.tp7;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusTest {
	  
	  
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
	  
	  
	  //Cartas mock
	  public Carta cincoDeTreboles;
	  public Carta cincoDeCorazones;
	  public Carta cincoDeDiamantes;
	  public Carta cincoDePica;
	  public Carta sieteDePica;
	  
	  
	  
	  public PokerStatus pk1;
	  public PokerStatus pk2;
	  public PokerStatus pk3;
	  public PokerStatus pk4;
	  
	  public List<Carta> manoPoquer ;
	  public List<Carta> manoTrio ;
	  public List<Carta> manoColor ;
	  public List<Carta> manoNada1 ;
	  public List<Carta> manoNada2 ;
	  
	  public List<Carta> manoMock ;
	  
	  
	  @BeforeEach
	  void setUp() throws Exception { // *1 desde aca 
	    
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
	    
	    // cartas mock
	    
	    
	    cincoDeTreboles = mock(Carta.class);
		cincoDeCorazones = mock(Carta.class);
		cincoDeDiamantes = mock(Carta.class);
		cincoDePica = mock(Carta.class);
		sieteDePica = mock(Carta.class);
		
		
	    
	    manoPoquer = Arrays.asList(asDeCorazones,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones);
	    manoTrio = Arrays.asList(dosDeTreboles,asDePica,asDeTreboles,asDeDiamantes,dosDeCorazones);
	    manoColor = Arrays.asList(asDeCorazones,qDeCorazones,diezDeCorazones,kDeCorazones,dosDeCorazones);
	    manoNada1 = Arrays.asList(kDeDiamantes,qDeTreboles,diezDeTreboles,diezDePica,dosDeCorazones);
	    manoNada2 = Arrays.asList(dosDeTreboles,asDePica,diezDeCorazones,asDeDiamantes,dosDeCorazones);
	    manoMock = Arrays.asList(cincoDeTreboles,cincoDeCorazones,cincoDeDiamantes,cincoDePica,sieteDePica);
	    
	    pk1 = new PokerStatus(manoPoquer,manoTrio);
	    pk2 = new PokerStatus(manoTrio,manoNada1);
	    pk3 = new PokerStatus(manoColor,manoNada1);
	    pk4 = new PokerStatus(manoNada1,manoNada2);
		  
	    
	  } // *1 hasta aca es el Setup del test JUnit

	  
	  
	  
	  // Comienza el Verify
	  @Test
	  void testVerificarSiHayPoker() {
	    assertEquals("Poquer",pk1.verificar(pk1.getMano1()));// hay Poquer
	    assertEquals("Trio",pk2.verificar(pk2.getMano1()));// hay Trio
	    assertEquals("Color",pk3.verificar(pk3.getMano1()));// hay color
	    assertEquals("Nada",pk4.verificar(pk4.getMano1()));// no hay nada
	  }
	  
	 
	  @Test
	  void testVerificarPoker() {
	    assertEquals("Poquer",pk1.verificar(pk1.getMano1()));// hay Poquer
	    assertEquals("Nada",pk4.verificar(pk4.getMano2()));// no hay Poquer
	    
	  }
	  
	  @Test
	  void testVerificarColor() {
	    assertEquals("Color",pk3.verificar(pk3.getMano1()));// hay color
	    assertEquals("Nada",pk4.verificar(pk4.getMano1()));// no hay color
	    
	  }
	  
	  @Test
	  void testVerificarTrio() {
	    assertEquals("Trio",pk2.verificar(pk2.getMano1()));// hay trio
	    assertEquals("Nada",pk4.verificar(pk4.getMano1()));// no hay trio
	    
	  }
	  
	  @Test
	  void testGanadorDeMano() {
		  assertEquals("Mano1",pk1.ganadorDeMano(pk1.getMano1(),pk1.getMano2()));
		  assertEquals("Mano1",pk2.ganadorDeMano(pk2.getMano1(),pk2.getMano2()));
		  assertEquals("Mano2",pk4.ganadorDeMano(pk4.getMano1(),pk4.getMano2()));
	  }

	  
	  
//Termina el Verify
// El Teardown esta implicito, se ejecuta una vez terminado el verify
}