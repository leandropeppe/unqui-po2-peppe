package ar.edu.unq.po2.tp7bis;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MunicipioTest {

	Municipio quilmes; 
	ActividadSemanal futbol5;
	ActividadSemanal futbol11;
	ActividadSemanal papiFutbol;
	ActividadSemanal jabalina;
	ActividadSemanal tenis;
	
	
	
	@BeforeEach
	void setUp() {
		quilmes = new Municipio();
		futbol5 = new ActividadSemanal(DiaDeLaSemana.Martes,15,1,Deporte.Futbol);
		futbol11 = new ActividadSemanal(DiaDeLaSemana.Jueves,15,1,Deporte.Futbol);
		papiFutbol = new ActividadSemanal(DiaDeLaSemana.Lunes,12,1,Deporte.Futbol);
		jabalina = new ActividadSemanal(DiaDeLaSemana.Lunes,20,1,Deporte.Jabalina);
		tenis = new ActividadSemanal(DiaDeLaSemana.Lunes,20,2,Deporte.Tenis);
		
		quilmes.agregarActividadSemanal(futbol5);
		quilmes.agregarActividadSemanal(futbol11);
		quilmes.agregarActividadSemanal(papiFutbol);
		quilmes.agregarActividadSemanal(jabalina);
		quilmes.agregarActividadSemanal(tenis);
	}

	@Test
	void soloFutbolTest() {
		equals(futbol5.equals(quilmes.soloFutbol().get(0)));
		equals(futbol11.equals(quilmes.soloFutbol().get(1)));
		equals(papiFutbol.equals(quilmes.soloFutbol().get(2)));
		assertTrue(quilmes.soloFutbol().size()==3);
	}
	
	
	@Test
	void cantidadHorasTotalesTest() {
		assertEquals(6,quilmes.cantidadHorasTotales());
	}
	
	
	@Test
	void actividadesDeXComplejidadTest() {
		equals(jabalina.equals(quilmes.actividadesDeXComplejidad(4).get(0)));
		
		equals(tenis.equals(quilmes.actividadesDeXComplejidad(3).get(0)));
		
		assertTrue(quilmes.actividadesDeXComplejidad(1).isEmpty());
	}
	
	
	@Test
	void actividadDeMenorCostoTest() {
		equals(futbol5.equals(quilmes.actividadDeMenorCosto(Deporte.Futbol)));
		equals(tenis.equals(quilmes.actividadDeMenorCosto(Deporte.Tenis)));
		equals(jabalina.equals(quilmes.actividadDeMenorCosto(Deporte.Jabalina)));
		
		assertTrue(quilmes.actividadDeMenorCosto(Deporte.Running).isEmpty());
	}
	
	
	@Test
	void imprimirActividadesDelMunicipioTest() {
		quilmes.imprimirActividadesDelMunicipio();
	}
	
}
