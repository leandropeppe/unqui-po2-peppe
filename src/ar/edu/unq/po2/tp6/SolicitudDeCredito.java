package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	private Cliente solicitante;
	private double monto;
	private double plazo;
	
	public SolicitudDeCredito(Cliente solicitante, double monto, double plazo) {
		super();
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public double valorDeCuota() {
		return monto / plazo ;
	}
	
	public abstract boolean esAceptable();

	public Cliente getSolicitante() {
		return solicitante;
	}

	public double getMonto() {
		return monto;
	}

	public double getPlazo() {
		return plazo;
	}
	
	
}


