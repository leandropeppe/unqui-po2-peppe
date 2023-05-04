package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipo extends SolicitudDeCredito{
	private PropiedadInmobiliaria inmu;
	private double porcValorFiscalRequerido = ;

	
	public SolicitudDeCreditoHipo(Cliente solicitante, double monto, double plazo,
			PropiedadInmobiliaria inmu, double porcValorFiscalRequerido) {
		super(solicitante, monto, plazo, porcentajeRequerido);
		this.inmu = inmu;
		this.porcValorFiscalRequerido = porcValorFiscalRequerido;
	}

	public boolean esAceptable() {
		return this.noSuperaEdadRequeridaAntesDePagar() & this.montoTotalNoSuperaValorFiscalRequerido() & this.cuotaNoSuperaPorcentajeRequerido();
	}
	
	public boolean noSuperaEdadRequeridaAntesDePagar() {
		return (plazo / 12) + solicitante.getEdad() <= 65;
	}
	
	public boolean montoTotalNoSuperaValorFiscalRequerido() {
		return monto < (inmu.getValorFiscal() * porcValorFiscalRequerido);
	}
}
