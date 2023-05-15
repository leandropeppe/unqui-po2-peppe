package ar.edu.unq.po2.tp7bis;

import java.util.*;
import java.util.stream.Stream;

public class Municipio {
	
	List<ActividadSemanal> actividadesSemanales ;

	public Municipio() {
		super();
		this.actividadesSemanales = new ArrayList<ActividadSemanal>();
	}
	
	public void agregarActividadSemanal(ActividadSemanal actividad) {
		actividadesSemanales.add(actividad);
	}

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}
	
	public List<ActividadSemanal> soloFutbol(){
		return actividadesSemanales.stream().filter(a->a.getDeporte()==Deporte.Futbol).toList();
	}
	
	public List<ActividadSemanal> actividadesDeXComplejidad(int complejidad){
		return actividadesSemanales.stream().filter(a->a.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public int cantidadHorasTotales(){
		return actividadesSemanales.stream().mapToInt(a->a.getDuracion()).sum();
	}
	
	public Optional<ActividadSemanal> actividadDeMenorCosto(Deporte deporte) {
		Stream<ActividadSemanal> actividadesDelDeporte = actividadesSemanales.stream().filter(a->a.getDeporte()== deporte);
		Comparator<ActividadSemanal> menorCosto = Comparator.comparing(ActividadSemanal::costoActividad);
		return actividadesDelDeporte.min(menorCosto) ;
	}
	/*
	public Map<Actividad, ActividadSemanal> mapDeActividadesMasEconomicas(){
		return ;
	}
	*/
	public void imprimirActividadesDelMunicipio() {
		actividadesSemanales.stream().forEach(a->System.out.println(a.toString()));
	}
	
}
