package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	private Counter counter;
	private Counter contador;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
		counter = new Counter();
		contador = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
		contador.addNumber(0);
		contador.addNumber(4444);
		contador.addNumber(5525);
		contador.addNumber(66666);
	}
	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int impares = counter.cantidadImpares();
		int pares = counter.cantidadPares();
		// I check the amount is the expected one
		assertEquals(impares, 9);
		assertEquals(pares, 1);
		assertEquals(counter.cantidadMultiplosDe(9), 1);
		assertEquals(counter.cantidadMultiplosDe(7), 1);
		assertEquals(counter.cantidadMultiplosDe(3), 2);
		assertEquals(counter.cantidadMultiplosDe(5), 1);
		assertEquals(counter.cantidadMultiplosDe(4), 1);
		assertEquals(counter.cantidadMultiplosDe(1), 10);
		
	}
	
	
	@Test
	public void desarmandoNumerosTest() {
		assertEquals(contador.desarmandoNumeros(), 66666);
	}
	
	@Test
	public void multiploTest() {
		assertEquals(contador.multiplo(10, 9), 990);
		assertEquals(contador.multiplo(900, 7), -1);
	}
	
	@SuppressWarnings("null")
	@Test
	
	public void testString() {
		String a = "abc";
		String s = a;
		String t = null;
		
		assertEquals(s.length(), 3);
		//assertEquals(t.length(), 0);   No se puede obtener el largo de t porque el String t no esta definido, es Null
		assertEquals(s.length(), 3);
		System.out.println(1+a);  //
		assertEquals(1+a, "1abc");
		assertEquals(a.toUpperCase(), "ABC");
		assertEquals("Libertad".indexOf("r"), 4);
		assertEquals("Universidad".lastIndexOf('i'), 7);
		assertEquals("Quilmes".substring(2,4), "il");
		assertEquals((a.length() + a).startsWith("a"),false); // preguntar
		System.out.println((a.length() + a).startsWith("a"));
		assertTrue(s = a,true);
		assertTrue(a.substring(1,3).equals("bc"));
	}
	
}
