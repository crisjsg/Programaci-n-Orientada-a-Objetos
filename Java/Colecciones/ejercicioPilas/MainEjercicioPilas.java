package ejercicioPilas;
import java.util.Stack;
import java.util.Scanner;

public class MainEjercicioPilas {

	public static void main(String[] args) {
		Stack<Character> conjuntoLetras = new Stack<Character>();
		Scanner insertar = new Scanner(System.in);
		
		System.out.println("Introduce tu palabra: ");
		String palabra = insertar.next();
		
		for(int i = 0; i < palabra.length(); i++){
			Character letra = palabra.charAt(i);
			conjuntoLetras.add(letra);
		}
		
		while(!conjuntoLetras.isEmpty()){
			System.out.print(conjuntoLetras.pop());
		}
		
	}

}
