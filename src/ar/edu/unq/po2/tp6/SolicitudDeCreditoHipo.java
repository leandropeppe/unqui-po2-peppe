package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipo extends SolicitudDeCredito{
	private PropiedadInmobiliaria jauz;

	public SolicitudDeCreditoHipo(Cliente solicitante, double monto, double plazo, PropiedadInmobiliaria jauz) {
		super(solicitante, monto, plazo);
		this.jauz = jauz;
	}

	public boolean esAceptable() {
		// monto de la cuota no supere 50% los ingresos mensuales 
		// monto total solicitado no sea mayor a 70% del valor fiscal de la garantia 
		// la persona no supere los 65 años antes de terminar depagar el credito
		return this.cuotaNoSuperaPorcentajeRequerido() & 
			   this.montoTotalSolicitadoMenorAPorcetajeRequerido() & 
			   this.edadSolicitanteAlFinalizarCredito() <= 65; 
	}
	
	public double edadSolicitanteAlFinalizarCredito() {
		return this.getSolicitante().getEdad() + (this.getPlazo() / 12) ;
	}
	
	public boolean cuotaNoSuperaPorcentajeRequerido() {
		return this.valorDeCuota() <=  this.getSolicitante().getSueldoNetoMensual() * 0.5;
	}
	
	public boolean montoTotalSolicitadoMenorAPorcetajeRequerido() {
		return this.getMonto() <= this.jauz.getValorFiscal() * 0.7 ;
	}
}
