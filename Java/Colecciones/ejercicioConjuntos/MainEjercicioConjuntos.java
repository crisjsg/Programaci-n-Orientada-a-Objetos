package ejercicioConjuntos;
import java.util.TreeSet;

public class MainEjercicioConjuntos {

	public static void main(String[] args) {
		
		String[] frasesTest = new String[] {
				"dabale arroz a la zorra el abad", "come helados el niño", "van a clase los chavales"
		};
		
		ConjuntoLetras conjuntoLetras = new ConjuntoLetras();
		
		for (int i = 0; i < frasesTest.length ; i++){
			conjuntoLetras.insertarLetra(frasesTest[i]);
			conjuntoLetras.imprimirConjunto();
			conjuntoLetras.vaciarConjunto();
		}
	}

}
