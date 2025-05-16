package Encriptador;


import EnigmaMasUno.EnigmaMasUno;

public class EncriptadorNaive {
	private IEncriptador encriptador = new EnigmaMasUno();
	
	public void setEncriptador(IEncriptador encriptador) {
		
		this.encriptador = encriptador;
	}
	
	public String encriptar(String texto) {
		return encriptador.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return encriptador.desencriptar(texto);
	}
}
