package ejerciciosEstructuraDeDatos;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
	/* Apartado 1:
	* Declara un Array de nombre lista que estará formado por 25 datos de tipo entero generados
	*  al azar comprendidos entre 25 y 50.
	Declara otro vector de nombre auxiliar formado por 4 datos de tipo real.
	
	Apartado 2:
	Almacenar en este Array lo siguiente: 
	Posición 0: número de números pares en lista. 
	Posición 1: número de números impares de lista. 
	Posición 2: media de los números impares de lista. 
	Posición 3: suma de los números enteros comprendidos entre 1 y el valor par más pequeño de lista. 
	Escribe a continuación el contenido de lista, así como los resultados obtenidos y almacenados 
	en auxiliar.
		 */
		
		//Apartado 1
		Random aleatorio = new Random();
		
		int lista [] = new int[25];
		double auxiliar [] = new double[4];
		
		
		for(int i = 0; i < lista.length; i++){
			lista[i] = aleatorio.nextInt(26) + 25;
		}
		
		//Apartado 2
		//Posición 1: número de números impares de lista.
		 
		for(int i = 0; i < lista.length; i++){
			if(lista[i] % 2 == 0){
				auxiliar[0] = auxiliar[0] + 1;
			}else{
				auxiliar[1] = auxiliar[1] + 1;
			}
			
		}
		//Posición 2: media de los números impares de lista.
		auxiliar[2] = auxiliar[1] / lista.length;
		
		/* Posición 3: suma de los números enteros comprendidos entre 1 y el valor par más pequeño de lista. 
		
			 */
		int numeroMenor = lista[0];
		for(int i = 0; i < lista.length; i++){
			if((lista[i] % 2 == 0) && (numeroMenor < auxiliar[3])){
				auxiliar[3] = numeroMenor;				
				}
			}
		for(int i = 0; i < auxiliar[3]; i++){
			if(auxiliar[3] > 1){
			auxiliar[3] = auxiliar[3] + lista[i] ;
			}
				
			}
		
		/*  
		Escribe a continuación el contenido de lista, así como los resultados obtenidos y almacenados 
		en auxiliar.*/
		for (int i = 0; i < lista.length; i++) {
            System.out.println("Posicion " + i + " de la lista = " + lista[i]);
        }
        System.out.println("------------------");
        System.out.println("Cantidad de numeros par: " + auxiliar[0]);
        System.out.println("Cantidad de numeros impar: " + auxiliar[1]);
        System.out.println("Media de cantidad de numeros impar: " + auxiliar[2]);
        System.out.println("Suma de los enteros comprendidos entre 1 y el valor par más pequeño: "
                        + auxiliar[3]);
	}
	

}


