package ar.edu.unq.po2.tp9;

public class ModificarVocal implements IEncriptador {
	
	public String doEncriptar( String texto) {
		//Transforma la palabra en una cadena de char
		//Agarra cada letra y si es vocal devuelve la siguiente , sino devuelve la misma.
		//Retorna la palabra encriptada
		char[] palabra = texto.toCharArray();
		
		for(int i = 0; i < palabra.length ; i ++) {
			if (this.letraEsVocal(palabra[i])) {
				palabra[i] = this.siguienteVocal(palabra[i]) ;
			}else {
				palabra[i] = (char) palabra[i];
			}
		}
		String palabraEncriptada = new String(palabra);
		return palabraEncriptada;
		
	}
	public String doDesencriptar( String texto) {
		char[] palabra = texto.toCharArray();
		
		for(int i = 0; i < palabra.length ; i ++) {
			if (this.letraEsVocal(palabra[i])) {
				palabra[i] = this.anteriorVocal(palabra[i]) ;
			}else {
				palabra[i] = (char) palabra[i];
			}
		}
		String palabraDesencriptada = new String(palabra);
		return palabraDesencriptada;
	}
	
	private char anteriorVocal(char letra) {
		switch(letra) {
			case 'a':
				return 'u';
			case 'e':
				return 'a';
			case 'i':
				return 'e';
			case 'o':
				return 'i';
			case 'u':
				return 'o';
			default:
				return '0' ;
	}
	}
	public boolean letraEsVocal(char letra) {
		return letra == 'a' | letra == 'e' | letra == 'i' | letra == 'o' | letra == 'u';
	}
	
	public char siguienteVocal(char letra) {
		switch(letra) {
			case 'a':
				return 'e';
			case 'e':
				return 'i';
			case 'i':
				return 'o';
			case 'o':
				return 'u';
			case 'u':
				return 'a';
			default:
				return '0' ;
		}
	}

}
