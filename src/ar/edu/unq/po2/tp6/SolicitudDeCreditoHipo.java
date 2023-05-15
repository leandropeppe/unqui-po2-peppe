package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipo extends SolicitudDeCredito{
	private PropiedadInmobiliaria inmu;
	private double porcValorFiscalRequerido  ;

	
	public SolicitudDeCreditoHipo(Cliente solicitante, double monto, double plazo,
			PropiedadInmobiliaria inmu, double porcValorFiscalRequerido) {
		super(solicitante, monto, plazo);
		this.inmu = inmu;
		this.porcValorFiscalRequerido = porcValorFiscalRequerido;
	}

	public boolean esAceptable() {
		return this.noSuperaEdadRequeridaAntesDePagar() & this.montoTotalNoSuperaValorFiscalRequerido() & this.cuotaNoSuperaPorcentajeRequerido();
	}
	
	private boolean cuotaNoSuperaPorcentajeRequerido() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean noSuperaEdadRequeridaAntesDePagar() {
		return (this.getPlazo() / 12) + this.getSolicitante().getEdad() <= 65;
	}
	
	public boolean montoTotalNoSuperaValorFiscalRequerido() {
		return this.getMonto() < (inmu.getValorFiscal() * porcValorFiscalRequerido);
	}
}
