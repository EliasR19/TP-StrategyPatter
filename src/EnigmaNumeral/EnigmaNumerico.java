package EnigmaNumeral;

import java.util.ArrayList;
import java.util.List;

import Encriptador.IEncriptador;

public class EnigmaNumerico implements IEncriptador{
	private char[] abecedario = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
	protected static List<Character> abecedarioList = new ArrayList<Character>();

	//Constructor
	public EnigmaNumerico() {
		this.abecedarioAList();
	}
	
	
	public String enigma(String texto) {
		String encriptadoTexto = "";
		texto = texto.toLowerCase();
		for(int x = 0; x < texto.length()-1; x++) {
			if(abecedarioList.contains(this.getLetra(texto, x))) {
				encriptadoTexto = encriptadoTexto +  String.valueOf( abecedarioList.indexOf(this.getLetra(texto, x))+1) + ",";
			}else {
				encriptadoTexto = encriptadoTexto + "0" + ",";
			}
		}
		encriptadoTexto = encriptadoTexto +  String.valueOf( abecedarioList.indexOf(this.getLetra(texto, texto.length()-1))+1);
		return encriptadoTexto;
	}

	private Object getLetra(String texto, int x) {
		char[] textoC = texto.toCharArray();
		return textoC[x];
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

	
	public String enigma2(String texto) {
		String encriptadoTexto = "";
		texto = texto.toLowerCase();
		String[] letrasC = texto.split(",");
		for(int x = 0; x < letrasC.length-1; x++) {
			if(!letrasC[x].equals("0")) {
				encriptadoTexto = encriptadoTexto +  String.valueOf(abecedarioList.get(Integer.valueOf(letrasC[x])-1));
			}else {
				encriptadoTexto = encriptadoTexto + " ";
			}
		}
		encriptadoTexto = encriptadoTexto + abecedarioList.get(Integer.valueOf(letrasC[letrasC.length-1])-1);;// String.valueOf( abecedarioList.indexOf(this.getLetra(texto, texto.length()-1))-1);
		return encriptadoTexto;
	}
	
	@Override
	public String desencriptar(String texto) {
		List<String> desencriptado = this.letraNumALista(texto);
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
		
		//Pasa el los números del string a una lista de numeros. Sin comas.
		
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
