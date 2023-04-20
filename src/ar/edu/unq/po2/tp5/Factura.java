package ar.edu.unq.po2.tp5;



public class Factura implements Cobrable {
	
	private double montoAPagar ; 
	private String tipoFactura;
	
	
	public Factura(double montoAPagar, String tipoFactura) {
		super();
		this.montoAPagar = montoAPagar;
		this.tipoFactura = tipoFactura;
	}


	public double getMontoAPagar() {
		return montoAPagar;
	}


	public String getTipo() {
		return tipoFactura;
	}


	@Override
	public void informarPago(Caja caja) {
		caja.registrarPago(this);
	}
	
	
}
