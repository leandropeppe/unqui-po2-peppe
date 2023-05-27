package ar.edu.unq.po2.tp9.VideoJuego;

public class EsperandoFichas extends EstadoMaquina {

	@Override
	public String estado() {
		
		int cantFichas = maquina.getRanura().cantidadFichas();
		String mensaje = "Inserte ficha/s para jugar";
		
		if(cantFichas == 1) {
			mensaje = "Inserte 1 ficha para multijugador o presione el boton de inicio para jugar";
		}
		//maquina.cambiarEstadoJuego();
		return mensaje;
	}
	
}
