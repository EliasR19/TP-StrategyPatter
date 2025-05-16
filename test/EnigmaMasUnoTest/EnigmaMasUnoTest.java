package EnigmaMasUnoTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Encriptador.EncriptadorNaive;
import Encriptador.IEncriptador;
import EnigmaMasUno.EnigmaMasUno;

public class EnigmaMasUnoTest {
	
	EncriptadorNaive mensajero;
	IEncriptador encriptador = new EnigmaMasUno();
	
	@BeforeEach
	public void setUp() {
		
		mensajero = new EncriptadorNaive();
		encriptador = new EnigmaMasUno();
		mensajero.setEncriptador(encriptador);
	}
	
	@Test
	public void encriptarPalabra() {
		String texto = "Elias";
		assertEquals("iloes", mensajero.encriptar(texto));
	}
	
	@Test
	public void desencriptarPalabra() {
		String texto = "Iloes";
		assertEquals("elias", mensajero.desencriptar(texto));
	}
	
	@Test
	public void encriptarOracion() {
		String texto = "UH! me duele!";
		assertEquals("ah! mi daili!", mensajero.encriptar(texto));
	}
	
	@Test
	public void encriptarVocales() {
		String texto = "aeiou";
		assertEquals("eioua", mensajero.encriptar(texto));
	}
	@Test
	public void desencriptarVocales() {
		String texto = "eioua";
		assertEquals("aeiou", mensajero.desencriptar(texto));
	}
}
