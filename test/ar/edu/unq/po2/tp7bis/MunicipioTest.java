package ar.edu.unq.po2.tp7bis;

import static org.junit.Assert.*;
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
	
	
	
	@BeforeEach
	void setUp() {
		quilmes = new Municipio();
		futbol5 = new ActividadSemanal(DiaDeLaSemana.Martes,15,1,Deporte.Futbol);
		futbol11 = new ActividadSemanal(DiaDeLaSemana.Jueves,15,1,Deporte.Futbol);
		papiFutbol = new ActividadSemanal(DiaDeLaSemana.Lunes,12,1,Deporte.Futbol);
		jabalina = new ActividadSemanal(DiaDeLaSemana.Lunes,20,1,Deporte.Jabalina);
		
		quilmes.agregarActividadSemanal(futbol5);
		quilmes.agregarActividadSemanal(futbol11);
		quilmes.agregarActividadSemanal(papiFutbol);
		quilmes.agregarActividadSemanal(jabalina);
	}

	@Test
	void soloFutbolTest() {
		assertTrue(futbol5.toString()==quilmes.soloFutbol().get(0).toString());
	}
	
	
	@Test
	void cantidadHorasTotalesTest() {
		assertEquals(4,quilmes.cantidadHorasTotales());
	}
	
	
	@Test
	void actividadesDeXComplejidadTest() {
		//assertEquals(/* lista con solo jabalina */,quilmes.actividadesDeXComplejidad(4));
	}
	
	
	@Test
	void actividadDeMenorCostoTest() {
		//assertTrue(quilmes.actividadDeMenorCosto(Deporte.Futbol));
	}
	
	
	@Test
	void imprimirActividadesDelMunicipioTest() {
		quilmes.imprimirActividadesDelMunicipio();
	}
	
}
