package ar.edu.unq.po2.tp7bis;


import static org.junit.jupiter.api.Assertions.*;


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
		assertEquals(futbol5,quilmes.soloFutbol().get(0));
		assertEquals(futbol11,quilmes.soloFutbol().get(1));
		assertEquals(papiFutbol,quilmes.soloFutbol().get(2));
		assertTrue(quilmes.soloFutbol().size()==3);
	}
	
	
	@Test
	void cantidadHorasTotalesTest() {
		assertEquals(6,quilmes.cantidadHorasTotales());
	}
	
	
	@Test
	void actividadesDeXComplejidadTest() {
		assertEquals(jabalina, quilmes.actividadesDeXComplejidad(4).get(0));
		
		assertEquals(tenis, quilmes.actividadesDeXComplejidad(3).get(0));
		
		assertTrue(quilmes.actividadesDeXComplejidad(1).isEmpty());
	}
	
	
	@Test
	void actividadDeMenorCostoTest() {
		assertEquals(futbol5,quilmes.actividadDeMenorCosto(Deporte.Futbol));
		assertEquals(tenis , quilmes.actividadDeMenorCosto(Deporte.Tenis));
		assertEquals(jabalina , quilmes.actividadDeMenorCosto(Deporte.Jabalina));
		
		assertTrue(quilmes.actividadDeMenorCosto(Deporte.Running).isEmpty());
	}
	
	
	@Test
	void imprimirActividadesDelMunicipioTest() {
		quilmes.imprimirActividadesDelMunicipio();
	}
	
}
