package org.furious4.oxo.logica;

public class OXO {
	int fila = 0;
	int columna = 0;
	
	public enum  Fichas{
		X,O;
	}
	
	//Logica
	
	public static boolean ponerFicha(int fila, int columna){
		if (checkFila(fila) && checkColumnas(columna)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean checkFila(int fila){
		if (fila < 1 || fila > 3){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean checkColumnas(int columna){
		if (columna < 1 || columna > 3){
			return false;
		}else{
			return true;
		}
	}
	
	public static void inicializarTablero(Fichas tablero [][]){
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero.length; j++){
				tablero[i][j] = null;
			}
		}
	}
}
