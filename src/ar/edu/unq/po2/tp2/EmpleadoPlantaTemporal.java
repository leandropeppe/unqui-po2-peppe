package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaTemporal extends Empleado {
	private float fechaFinDesignacion;
	private int cantHorasExtras;
	
	public EmpleadoPlantaTemporal(String nombre, String direccion, String estadoCivil, int fechaDeNacimiento,
			double sueldoBasico, float fechaFinDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
	
	public float getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	public void setFechaFinDesignacion(float fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
	@Override
	protected double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.extrasMensuales() ;
	}
	private double extrasMensuales() {
		return 40 * this.getCantHorasExtras();
	}
	
	@Override
	protected double calcularRetenciones() {
		return this.retencionesOS() + this.retencionPorEdadAvanzada() + this.aportesJub() + this.retencionesSobreExtras();
	} 
	
	private double retencionesSobreExtras() {
		return 5 * this.getCantHorasExtras();
	}
	private double retencionPorEdadAvanzada() {
		if(this.edad() >= 50) {
			return 25;
		}
		else {
			return 0 ;
		}
	}
	
	@Override
	protected double aportesJub() {
		return 0.1 * this.calcularSueldoBruto();
	}
	
	
	
	
	
	
}
