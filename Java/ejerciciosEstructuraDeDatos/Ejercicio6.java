package ejerciciosEstructuraDeDatos;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Se define el punto de silla de una matriz de orden 3x3 como el elemento de la matriz que es 
		 * el m�s peque�o de su fila y el m�s grande de su columna. Escribe un programa que proporcione
		 *  valores a una matriz en su declaraci�n y que calcule si tiene o no punto de silla.
		 */
		
		Random aleatorio = new Random();
		int[][] matriz = new int [3][3];
		int numeroPeque�oFila = matriz[0][0];
		int numeroGrandeColumna = matriz[0][0];
		
		//Matriz con n�meros aleatorios.
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = aleatorio.nextInt(9) + 1;
				System.out.print(matriz[i][j] + " | ");
				if(matriz[i][j] < numeroPeque�oFila){
					numeroPeque�oFila = matriz[i][j];
				}
			}
			System.out.println("");
		}
	}

}
