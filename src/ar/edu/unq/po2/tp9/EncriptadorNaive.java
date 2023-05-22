package ar.edu.unq.po2.tp9;

public class EncriptadorNaive {
	
	private IEncriptador estrategiaEncriptacion;

	public EncriptadorNaive(IEncriptador estrategiaEncriptacion) {
		super();
		this.estrategiaEncriptacion = estrategiaEncriptacion;
	}

	public String encriptar(String texto) {
		return estrategiaEncriptacion.doEncriptar(texto);
	}
	public String desencriptar(String texto) {
		return estrategiaEncriptacion.doDesencriptar(texto);
	}
	
	
}
