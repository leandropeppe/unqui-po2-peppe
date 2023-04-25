package ar.edu.unq.po2.tp5;



public abstract class Factura implements Cobrable {
	
	 
	private String tipoFactura;
	
	
	public Factura(String tipoFactura) {
		super();
		this.tipoFactura = tipoFactura;
	}


	public abstract double getMontoAPagar();


	public String getTipo() {
		return tipoFactura;
	}


	@Override
	public void informarPago(Caja caja) {
		caja.registrarPago(this);
	}
	
	
}
