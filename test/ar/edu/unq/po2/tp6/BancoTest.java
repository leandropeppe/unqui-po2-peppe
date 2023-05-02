package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	//Crear clientes
	private List<Cliente> clientes ;
	private Cliente cliente1 ;
	private Cliente cliente2 ;
	private Cliente cliente3 ;
	private Cliente cliente4 ;
	
	//Crear Banco
	private Banco bbva;
	
	//Crear propiedad
	private PropiedadInmobiliaria jauz;
					
	// Crear solicitudes
	private SolicitudDeCreditoHipo hipo1 ;
	private SolicitudDeCreditoPers pers1 ;
		
	
	@BeforeEach
	void setUp() {
		// Crear banco y clientes
		cliente1 = new Cliente("Persona", "Grande", "Av. siempre viva 123", 60, 20000);
		cliente2 = new Cliente("Persona", "joven", "Av. siempre viva 123", 20, 14000);
		cliente3 = new Cliente("Leandro", "Peppe", "San martin 121", 28, 50000);
		cliente4 = new Cliente("Persona", "Cuatro", "en frente", 40, 30000);
		
		clientes = new ArrayList<Cliente>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		bbva = new Banco(clientes);
		
		jauz = new PropiedadInmobiliaria("mi casa", "Av. siempre viva 123", 30000);
		hipo1 = new SolicitudDeCreditoHipo(cliente1, 20000, 30, jauz);
		pers1 = new SolicitudDeCreditoPers(cliente2, 20000 , 10);
		
		//Agregar solicitudes al banco
		bbva.recibirSolicitudCred(hipo1);
		
	}
	@Test
	void recibirSolicitudCred() {
		assertEquals(1,bbva.getSolicitudes().size());
		bbva.recibirSolicitudCred(pers1);
		assertEquals(2,bbva.getSolicitudes().size());
	}
	

	@Test
	void otorgarCreditoSiCorrespondeTest() {
		// la solicitud del banco es la hipo1 del cliente1
		SolicitudDeCredito solicitudVerificada = bbva.getSolicitudes().get(0) ;
		assertEquals(hipo1,solicitudVerificada);
		bbva.otorgarCreditoSiCorresponde(solicitudVerificada);
		assertEquals(20000,cliente1.getAhorros());
	}
	
	@Test
	void añadirCliente() {
		bbva.añadirCliente(cliente4);
		assertEquals(4,bbva.getClientes().size());
	}

}
