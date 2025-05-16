package EnigmaNumeral;

import java.util.ArrayList;
import java.util.List;

import Encriptador.IEncriptador;

public class EncriptadorNumerico implements IEncriptador{
	private char[] abecedario = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
	protected static List<Character> abecedarioList = new ArrayList<Character>();

	//Constructor
	public EncriptadorNumerico() {
		this.abecedarioAList();
	}
	
	@Override
	public String encriptar(String texto) {
		List<String> encriptado = new ArrayList<String>();
		texto = texto.toLowerCase();
		for(char c : texto.toCharArray()) {
			if(abecedarioList.contains(c)) {
				encriptado.add( String.valueOf( abecedarioList.indexOf(c)+1));
			}else {
				encriptado.add( String.valueOf(0));
			}
		}
		return this.transcribir(encriptado);
	}

	private String transcribir(List<String> listaEncriptado) {
		String transcricion = "";
		for(int x =0; x < listaEncriptado.size()-1 ; x++) {
			transcricion = transcricion + String.valueOf(listaEncriptado.get(x)) + ",";
		}
		
		return transcricion + listaEncriptado.getLast();
	}

	@Override
	public String desencriptar(String texto) {
		List<String> desencriptado = new ArrayList<String>();
		desencriptado= this.letraNumALista(texto);
		String textoDesifrado = "";
		for(String c :  desencriptado) {
			if(!c.equalsIgnoreCase("0")) {
				textoDesifrado = textoDesifrado + abecedarioList.get(Integer.valueOf(c)-1);
			}else {
				textoDesifrado = textoDesifrado + " ";
			}
		}
		
		
		return textoDesifrado;
	}
	
	
	private List<String> letraNumALista(String texto) {
		List<String> letrasNum = new ArrayList<String>();
		String[] x = texto.split(",");
		for(String c : x) {
			letrasNum.add(c);
		}

		return letrasNum;
	}

	private void  abecedarioAList() {
		for(char c : abecedario) {
			abecedarioList.add(c);
		}
	}
	

}
