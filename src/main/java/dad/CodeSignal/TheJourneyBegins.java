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

	public int adjacentElementsProduct(int[] inputArray) {

		int prod = inputArray[0] * inputArray[1];
		int mayorProducto = prod;

		for (int x = 1; x < inputArray.length - 1; x++) {
			prod = inputArray[x] * inputArray[x + 1];
			if (prod > mayorProducto) {
				mayorProducto = prod;
			}
		}
		return mayorProducto;

	}

	public int shapeArea(int n) {
		int area = n + (n - 1);
		// area4 = (n+(n-1)) + 2*((n-1) + (n-2)) + 2*((n-2)+(n-3) + 2*(n-3); resultado = 25

		for (int x = 1, y = 2; x < n; x++, y++) {
			area = area + (2 * ((n - x) + (n - y)));
		}
		return area;
	}
	
	public int makeArrayConsecutive2(int[] statues) {
	    
	    //Ordenamos la tabla (también se puede usar el método Array.sort)
	    for (int x = 0; x < statues.length-1; x++) {
	        for (int i = 0; i < statues.length-x-1; i++) {
	            if(statues[i] < statues[i+1]){
	                int temporal = statues[i+1];
	                statues[i+1] = statues[i];
	                statues[i] = temporal;
	            }
	        }
	    }
	    int contador = 0;
	    for (int z = 0; z < statues.length-1; z++){
	        if (statues[z] - statues[z+1] != -1) {
	            contador+= (statues[z] - statues[z+1])-1;
	        }
	    }
	    return contador
	    ;
	    
	}
	
	
	
	
}
