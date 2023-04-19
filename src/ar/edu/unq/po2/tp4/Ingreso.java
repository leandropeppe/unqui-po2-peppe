package ar.edu.unq.po2.tp4;


public class Ingreso {
	
	
	private double mesDePercepcion ;
	private double monto;
	private String concepto;
	
	
	public Ingreso(double mesDePercepcion, double monto, String concepto) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.monto = monto;
		this.concepto = concepto;
	}
	
	
	
	public double montoImponible() {
		return monto ;
	}



	public double getMesDePercepcion() {
		return mesDePercepcion;
	}



	public double getMonto() {
		return monto;
	}



	public String getConcepto() {
		return concepto;
	}
	
	
}
