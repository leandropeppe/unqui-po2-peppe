package ar.edu.unq.po2.tp8.JuegoEstrategia;

import java.util.*;

public class Ejercito extends CaracterPersonaje {
	
	private List<CaracterPersonaje> personajes = new ArrayList<>();
	
	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}
	
	public void añadir(CaracterPersonaje personaje) {
		personajes.add(personaje);
	}
	
	public void eliminar(CaracterPersonaje personaje) {
		personajes.remove(personaje);
	}

}
