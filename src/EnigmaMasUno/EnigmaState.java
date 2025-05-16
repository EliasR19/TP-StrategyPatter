package EnigmaMasUno;


public abstract class EnigmaState {

	
	//protected abstract Character cambiarVocal(char vocal);
	
	protected abstract char cambiar(char vocal);
	
	
	protected char cambiarVocal(char vocal) {
		return EnigmaMasUno.vocalesList.get(this.cambiar(vocal));
	}
}
