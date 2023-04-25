package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {

	private double costoXUnidad;
	private double cantUnidadConsumida;
	private int periodo;

	public FacturaServicio(String tipoFactura, double costoXUnidad , double cantUnidadConsumida , int periodo) {
		super(tipoFactura);
		this.costoXUnidad = costoXUnidad ;
		this.cantUnidadConsumida = cantUnidadConsumida;
		this.periodo = periodo ;
	}

	
	@Override 
	public double getMontoAPagar() {
		return costoXUnidad * cantUnidadConsumida ;
	}
	
	
	
}
