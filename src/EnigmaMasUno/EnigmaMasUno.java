package EnigmaMasUno;

import java.util.ArrayList;
import java.util.List;

import Encriptador.IEncriptador;

public class EnigmaMasUno implements IEncriptador{
	
	private char[] vocales = {'a', 'e', 'i', 'o', 'u'};
	protected static List<Character> vocalesList = new ArrayList<Character>();

	private EnigmaState state;
	
	//Constructor
	public EnigmaMasUno() {
		this.vocalesAList();
	}
		
	@Override
	public String encriptar(String texto) {
		state = new Encriptador();
		return this.enigma(texto);
	}
	
	@Override
	public String desencriptar(String texto) {
		state = new Desencriptador();
		return this.enigma(texto);
	}
	
	
	private String enigma(String texto) {
		String encriptado = "";
		texto = texto.toLowerCase();
		for(int x = 0; x < texto.length(); x++) {
			if(this.esVocal(texto.charAt(x))){
				encriptado = encriptado + state.cambiarVocal(texto.charAt(x));
			} else {
				encriptado = encriptado + texto.charAt(x);
			}
		}
		return encriptado;
	}


	
	private boolean esVocal(char letra) {
		return vocalesList.contains(letra);
	}

	private void  vocalesAList() {
		for(char c :vocales) {
			vocalesList.add(c);
		}
	}
	

//	private String cambiarVocales(String texto) {
//		String encriptado = "";
//		texto = texto.toLowerCase();
//		for(int x = 0; x < texto.length(); x++) {
//			if(this.esVocal(texto.charAt(x))){
//				encriptado = encriptado + cambiarVocal(texto.charAt(x));
//			} else {
//				encriptado = encriptado + texto.charAt(x);
//			}
//		}
//		return encriptado;
//	}


	
	//protected abstract Character cambiarVocal(char vocal);
	
//	private Character cambiarUnaVocal(char vocal) {
//		return vocalesList.get(this.vocalPos(vocal)+1);
//	}
//
//
//
//	private int vocalPos(char vocal) {
//		int vocalPos = vocalesList.indexOf(vocal);
//		return (vocalPos != 4 ? vocalPos: -1) ;
//	}




//	@Override
//	public String desencriptar(String texto) {
//		String encriptado = "";
//		texto = texto.toLowerCase();
//		for(int x = 0; x < texto.length(); x++) {
//			if(this.esVocal(texto.charAt(x))){
//				encriptado = encriptado + cambiarVocal(texto.charAt(x));
//			} else {
//				encriptado = encriptado + texto.charAt(x);
//			}
//		}
//		return encriptado;
//	};

	
//	private Character volverAnterior(char vocal) {
//		return vocalesList.get(this.vocalNeg(vocal)-1);
//	}
//	
//	
//	
//	private int vocalNeg(char vocal) {
//		int vocalPos = vocalesList.indexOf(vocal);
//		return (vocalPos != 0 ? vocalPos: 4) ;
//	}


}
