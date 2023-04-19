package ar.edu.unq.po2.tp4;


public class IngresoPorHorasExtras extends Ingreso{

	
	private int cantHoras;
	
	public IngresoPorHorasExtras(double mesDePercepcion, double monto, String concepto, int cantHoras) {
		super(mesDePercepcion, monto, concepto);
		this.cantHoras = cantHoras;
	}

	
	
	
	@Override
	public double montoImponible() {
		return 0 ;
	}
	
	
	
}
