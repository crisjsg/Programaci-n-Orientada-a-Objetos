package ejerciciosEstructuraDeDatos;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que asigne números a una matriz de orden 4x5, comprendidos entre 1 y 10. 
		 * El programa ha de almacenar la suma de los elementos de cada fila en un Array de 4 posiciones 
		 * y la suma de los elementos pares de cada columna en un Array de 5 posiciones.
		 */
		Random aleatorio = new Random();
		int [][] matriz = new int [4][5];
		int [] sumaFilas = new int[4];
		int sumaTotalFila = 0;
		int [] sumaColumnas = new int[5];
		int sumaTotalColumna = 0;
		
		//Escribe un programa que asigne números a una matriz de orden 4x5, comprendidos entre 1 y 10.
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 5; j++){
				matriz[i][j] = aleatorio.nextInt(10) + 1;
				System.out.print(matriz[i][j] + "|");
			}
			System.out.println("");
		}
		//El programa ha de almacenar la suma de los elementos de cada fila en un Array de 4 posiciones
				
	}
}
		
		
		
		
		
		
		



