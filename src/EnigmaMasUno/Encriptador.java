package EnigmaMasUno;

public class Encriptador extends EnigmaState{

	
//	@Override
//	protected Character cambiarVocal(char vocal) {
//		return EnigmaMasUno.vocalesList.get(this.vocalPos(vocal)+ this.next);
//	}

	
	private int vocalPos(char vocal) {
		int vocalPos = EnigmaMasUno.vocalesList.indexOf(vocal);
		return (vocalPos != 4 ? vocalPos: -1) ;
	}

	@Override
	protected char cambiar(char vocal) {
		return (char) (this.vocalPos(vocal)+1);
	}


}
