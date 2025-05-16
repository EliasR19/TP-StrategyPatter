package EnigmaNumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Encriptador.EncriptadorNaive;
import Encriptador.IEncriptador;

public class EncriptadorNumericoTest {
	
	EncriptadorNaive mensajero = new EncriptadorNaive();
	IEncriptador encriptador = new EncriptadorNumerico();;
	
	@BeforeEach
	public void setUp() {
		
		mensajero = new EncriptadorNaive();
		
		mensajero.setEncriptador(encriptador);
		
	}
	
	@Test
	public void encriptarPalabraTest() {
		String texto = "Elias";
		assertEquals("5,12,9,1,20", mensajero.encriptar(texto));
	}
	

	public void desencriptarParala() {
		String texto = "5,12,9,1,20";
		assertEquals("Elias", mensajero.desencriptar(texto));
	}
}
