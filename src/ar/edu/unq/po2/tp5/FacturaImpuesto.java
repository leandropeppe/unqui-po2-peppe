package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {
	
	private String tipoImpuesto;

	private double tasa;
	
	public FacturaImpuesto(double montoAPagar, String tipoFactura , String tipoImpuesto, double tasa) {
		super(montoAPagar, tipoFactura);
		this.tipoImpuesto = tipoImpuesto;
		this.tasa = tasa;
	}
	
	@Override 
	public double getMontoAPagar() {
		return this.tasa ;
	}

	public String getTipoImpuesto() {
		return tipoImpuesto;
	}

	
}
