package EnigmaNumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Encriptador.EncriptadorNaive;
import Encriptador.IEncriptador;

public class EnigmaNumericoTest {
	
	EncriptadorNaive mensajero = new EncriptadorNaive();
	IEncriptador encriptador = new EnigmaNumerico();;
	
	@BeforeEach
	public void setUp() {
		
		mensajero = new EncriptadorNaive();
		
		mensajero.setEncriptador(encriptador);
		
	}
	@Test
	public void encriptador() {
		EnigmaNumerico encriptador = new EnigmaNumerico();;
		String texto = "Elias";
		assertEquals("5,12,9,1,20", encriptador.enigma(texto));
	}
	@Test
	public void desencriptador() {
		EnigmaNumerico encriptador = new EnigmaNumerico();;
		String texto = "5,12,9,1,20";
		assertEquals("elias", encriptador.enigma2(texto));
	}
	
	
	@Test
	public void encriptarPalabraTest() {
		String texto = "Elias";
		assertEquals("5,12,9,1,20", mensajero.encriptar(texto));
	}
	
	@Test
	public void desencriptarParala() {
		String texto = "5,12,9,1,20";
		assertEquals("elias", mensajero.desencriptar(texto));
	}
	
	@Test
	public void encriptarOracion() {
		String texto = "La manzana es dulce";
		assertEquals("12,1,0,13,1,14,27,1,14,1,0,5,20,0,4,22,12,3,5", mensajero.encriptar(texto));
	}
	
	@Test
	public void desencriptarOracion() {
		String texto = "12,1,0,13,1,14,27,1,14,1,0,5,20,0,4,22,12,3,5";
		assertEquals("la manzana es dulce", mensajero.desencriptar(texto));
	}
	
}
