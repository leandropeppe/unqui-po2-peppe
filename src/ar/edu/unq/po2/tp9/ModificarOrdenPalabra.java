package ar.edu.unq.po2.tp9;

public class ModificarOrdenPalabra implements IEncriptador {
	
	// "Hola mi nombre es Leandro"
	public String[] separarPalabras(String texto) {
		String[] textoSeparado = texto.split(" ");
		for(String text : textoSeparado) {
			System.out.print(text);
		}
		
		return textoSeparado;
	}
	
	@Override
	public String doEncriptar(String texto) {
		return "puto";
		
	}
	
	@Override
	public String doDesencriptar( String texto) {
		return "puto";
	}
	

}
