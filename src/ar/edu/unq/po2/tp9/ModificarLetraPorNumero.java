package ar.edu.unq.po2.tp9;
import java.util.*;

public class ModificarLetraPorNumero implements IEncriptador {

	
	@Override
	public String doEncriptar(String texto) {
		
		String result = "" ;
		
		for (char c : texto.toCharArray()) {	
			if(result.length() != 0) {
				result += ",";
			}
			
			if (c == ' ') {
			    result+="0";
			} else if (c >= 'a' && c <= 'z') {
			    result+=((c - 'a' + 1));
			} 	
		}
		
		return result;
	}
	
	

	@Override
	public String doDesencriptar(String texto) {   // "1,2,0,3,4"
		String[] textoSeparado = texto.split(",");  // ["1","2","0","3","4",]
		String result = "" ;
		
		for (String palabra : textoSeparado) {	
			int num = Integer.parseInt(palabra); 
			
			if (num == 0 ) {
			    result+=" ";
			} else if (num >= 1 && num <= 26) {
			    result+=((char)('a' + num - 1));
			} 	
		}
		
		return result;
	}

}
