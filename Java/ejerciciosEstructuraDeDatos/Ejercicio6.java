package ejerciciosEstructuraDeDatos;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Se define el punto de silla de una matriz de orden 3x3 como el elemento de la matriz que es 
		 * el más pequeño de su fila y el más grande de su columna. Escribe un programa que proporcione
		 *  valores a una matriz en su declaración y que calcule si tiene o no punto de silla.
		 */
		
		Random aleatorio = new Random();
		int[][] matriz = new int [3][3];
		int numeroPequeñoFila = matriz[0][0];
		int numeroGrandeColumna = matriz[0][0];
		
		//Matriz con números aleatorios.
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = aleatorio.nextInt(9) + 1;
				System.out.print(matriz[i][j] + " | ");
				if(matriz[i][j] < numeroPequeñoFila){
					numeroPequeñoFila = matriz[i][j];
				}
			}
			System.out.println("");
		}
	}

}
