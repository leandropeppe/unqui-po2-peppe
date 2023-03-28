package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaTemporal extends Empleado {
	private float fechaFinDesignacion;
	private int cantHorasExtras;
	
	
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
	
	
	public EmpleadoPlantaTemporal(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			float sueldoBasico, float fechaFinDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	} 
	
	
	
}
