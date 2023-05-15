package ar.edu.unq.po2.tp7bis;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana ;
	private int horaInicio ;
	private int duracion;
	private Deporte deporte;
	
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int horaInicio, int duracion, Deporte deporte) {
		super();
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	
	public String toString() {
		return "Deporte: " + this.getDeporte() + ". " + "Dia: " + this.getDiaDeLaSemana() + " A LAS " + this.getHoraInicio() 
						   + ". " + "Duracion: " + this.getDuracion() + "hora(s)."; 
	}
	
	public int costoActividad() {
		return diaDeLaSemana.costo() + (deporte.getComplejidad() * 200) ;
	}

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}


	public int getHoraInicio() {
		return horaInicio;
	}


	public int getDuracion() {
		return duracion;
	}


	public Deporte getDeporte() {
		return deporte;
	}
	
	
	// Sobreescribir el método equals para comparar personas por nombre y edad
	  @Override
	  public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (obj == this) return true;
	    if (!(obj instanceof ActividadSemanal)) return false;
	    ActividadSemanal otro = (ActividadSemanal) obj;
	    return this.deporte.equals(otro.deporte) ;//&& this.edad == otra.edad;
	  }

}
	
	

