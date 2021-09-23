package dad.CodeSignal;

public class TheJourneyBegins {

	public int add(int param1, int param2) {
		int resultado;
		resultado = param1 + param2;
		return resultado;

	}

	public int centuryFromYear(int year) {
		int resultado;
		if (year % 100 == 0) {
			resultado = (year / 100);
		} else {
			resultado = (year / 100) + 1;
		}
		return resultado;
	}

	public boolean checkPalindrome(String inputString) {
		String cadena = inputString;
		int posInicio = 0;
		int posFinal = cadena.length() - 1;
		boolean esPalindrome = true;

		while (posInicio < posFinal && esPalindrome) {
			if (cadena.charAt(posInicio) == cadena.charAt(posFinal)) {
				posInicio++;
				posFinal--;
			} else {
				esPalindrome = false;
			}
		}
		return esPalindrome;
	}
	
}

	
