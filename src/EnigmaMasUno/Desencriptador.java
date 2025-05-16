package EnigmaMasUno;

public class Desencriptador extends EnigmaState{

//	@Override
//	protected char cambiarVocal(char vocal) {
//		return EnigmaMasUno.vocalesList.get(this.vocalNeg(vocal)-1);
//	}


	private int vocalNeg(char vocal) {
		int vocalPos = EnigmaMasUno.vocalesList.indexOf(vocal);
		return (vocalPos != 0 ? vocalPos: 5) ;
	}

	@Override
	protected char cambiar(char vocal) {
		return (char) (this.vocalNeg(vocal)-1);
	}
}
