package ar.edu.unq.po2.tp6;

import java.util.*;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	
	
	public Banco(List<Cliente> clientes) {
		super();
		this.clientes = clientes; //new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	public void recibirSolicitudCred(SolicitudDeCredito sc) {
		solicitudes.add(sc);
	}
	
	
	public void otorgarCreditoSiCorresponde(SolicitudDeCredito sc) {
		if (this.verificarSolicitud(sc)) {
			sc.getSolicitante().recibirGuita(sc.getMonto());
		} else {
			System.out.print("No cumple con los requisitos");
		}
	}

	public boolean verificarSolicitud(SolicitudDeCredito sc) {
		return sc.esAceptable();
	}


	public void añadirCliente(Cliente cl) {
		clientes.add(cl);
	}
	
	public void añadirClientes(List<Cliente> cl) {
		
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
}
