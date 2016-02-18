package forma;

import forma.Rectangulo;

import java.util.ArrayList;

public class MainForma {

	public static void main(String[] args) {
		ArrayList<Forma> listaArray = new ArrayList<>();
		
		Rectangulo primerRectangulo = new Rectangulo(100, 200);
		Circulo primerCirculo = new Circulo(50);
		Rectangulo primerCuadrado = new Rectangulo(400);
		Elipse primerElipse = new Elipse(10, 20);

		listaArray.add(primerRectangulo);
		listaArray.add(primerCirculo);
		listaArray.add(primerCuadrado);
		listaArray.add(primerElipse);

		for (Forma i : listaArray){
			System.out.print(i.getClass().getSimpleName() + ": " );
			System.out.println(i.calcularArea() + " u²");
		}

	}

}
