package dad.CodeSignal;

public class EdgeOfTheOcean {
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
	    
	    //Ordenamos la tabla (tambi�n se puede usar el m�todo Array.sort)
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
