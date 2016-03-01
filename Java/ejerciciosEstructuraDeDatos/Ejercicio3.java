package ejerciciosEstructuraDeDatos;
import java.util.Random;
import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Asigna a un Array 30 números enteros comprendidos entre 1 y 20. 
		 * Muestra en consola el contenido del Array ordenado de menor a mayor. 
		 * Utilizar el método sort de la clase Arrays.*/
		
		Random aleatorio = new Random();
		
		int [] listaNumeros = new int [30];
		for(int i = 0; i < listaNumeros.length; i++){
			listaNumeros[i] = aleatorio.nextInt(20) + 1;
		}
		
		Arrays.sort(listaNumeros);
		for(int i = 0; i < listaNumeros.length; i++){
			System.out.println(listaNumeros[i]);
		}
		
	}

}
