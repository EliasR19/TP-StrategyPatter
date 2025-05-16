package Encriptador;

import EnigmaNumeral.EncriptadorNumerico;

public class Main {
	public static void main(String[] args) {
	IEncriptador e = new EncriptadorNumerico();
	
	System.out.println(e.encriptar("Elias"));
	System.out.println(e.desencriptar("5,12,9,1,20"));
	
	System.out.println(e.encriptar("Manzanas de caramelo"));
	System.out.println(e.desencriptar("13,1,14,27,1,14,1,20,0,4,5,0,3,1,19,1,13,5,12,16"));
	
	}
}
