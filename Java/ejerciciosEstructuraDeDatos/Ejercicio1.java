package ejerciciosEstructuraDeDatos;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Escribe un programa que almacene en un Array de cinco elementos las ventas
		 * anuales de cada una de las cinco tiendas de una cadena de supermercados
		 * (asígnaselos al Array al declararlo). A continuación calcular cuál fue la tienda
		 * que menos vendió, cuál fue la que más vendió y el importe total de ventas
		 * de las cinco tiendas.
		 */

		int[] ventas = {1500, 200, 580, 2000, 680};
		int total = 0;
		int mayorNumero = ventas[0];
		int menorNumero = ventas[0];
		
		for( int i = 0; i < ventas.length; i++){
			if(ventas[i] > mayorNumero){
				mayorNumero = ventas[i];
			}else if(ventas[i] < menorNumero){
				menorNumero = ventas[i];
			}else{
				
			}
				
			total += ventas[i];	
		}
		
		//Primer apartado
		System.out.println("-----Mostrar tienda de menor ventas-----");
		System.out.println("La tienda con menor ventas hizo: " + menorNumero + "€");
		System.out.println("");
		
		
		//Segundo apartado
		
		System.out.println("-----Mostrar tienda de mayor ventas-----");
		System.out.println("La tienda con mayor ventas hizo: " + mayorNumero + "€");
		System.out.println("");
		
		//Tercer apartado
		System.out.println("-----Mostrar suma de las ventas-----");
		
		System.out.println(total + "€");
	}

}
