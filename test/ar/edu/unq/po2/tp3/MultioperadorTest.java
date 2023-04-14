package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	private Multioperador multi ;	
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		multi = new Multioperador();
		
		multi.addNumber(1);
		multi.addNumber(2);
		multi.addNumber(3);
		multi.addNumber(4);
		
	}
	
	
	@Test
	void test() {
		assertEquals(multi.suma(), 10);
		assertEquals(multi.resta(), -10);
		assertEquals(multi.multiplicador(), 24);
	}

}
