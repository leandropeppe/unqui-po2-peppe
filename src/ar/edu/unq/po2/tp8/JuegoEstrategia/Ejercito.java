package ar.edu.unq.po2.tp8.JuegoEstrategia;

import java.util.*;

public class Ejercito extends CaracterPersonaje {
	
	private List<CaracterPersonaje> personajes = new ArrayList<>();
	
	
	@Override
	public void caminar(Casillero casilleroLlegada) {
		personajes.stream().forEach(p->p.caminar(casilleroLlegada));
	}
	
	public void añadir(CaracterPersonaje personaje) {
		personajes.add(personaje);
	}
	
	public void eliminar(CaracterPersonaje personaje) {
		personajes.remove(personaje);
	}

	
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
	}

	
}
