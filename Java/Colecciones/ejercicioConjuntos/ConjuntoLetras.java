package ejercicioConjuntos;

import java.util.TreeSet;

public class ConjuntoLetras {
	
	TreeSet<Character> conjuntoLetras;
	
	public ConjuntoLetras(){
		this.conjuntoLetras = new TreeSet<Character>();
	}
	
	public void insertarLetra(String frase){
		for(int i = 0; i < frase.length(); i++){
			Character letra = frase.charAt(i);
			conjuntoLetras.add(letra);
		}
	}
	
	public void vaciarConjunto(){
		conjuntoLetras.clear();
	}
	
	public void imprimirConjunto(){
		while(!conjuntoLetras.isEmpty()){
			System.out.print(conjuntoLetras.pollFirst());
		}
	}
}
