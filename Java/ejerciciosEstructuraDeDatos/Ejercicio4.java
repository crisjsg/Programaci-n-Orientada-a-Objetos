package ejerciciosEstructuraDeDatos;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere y escriba una matriz unitaria de orden 10. 
		 * Una matriz unitaria de orden 10 es una matriz de 10x10 en la que todos los elementos valen 0, 
		 * excepto los de la diagonal principal que valen 1. La diagonal principal es la que va de
		 * la esquina superior izquierda a la inferior derecha.
		 */
		int [][] matriz = new int[10][10];
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length;j++){
				if(matriz[i] == matriz[j]){
					matriz[i][j] = 1;
				}else{
					matriz[i][j] = 0;
				}
				System.out.print(matriz[i][j] + "");	
			}
		System.out.println("");	
		}

	}

}
