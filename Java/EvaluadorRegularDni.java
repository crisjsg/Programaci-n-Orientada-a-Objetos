package utilidades;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EvaluadorRegularDni {

	public static void main(String[] args) {
	
		//Evaluadores regulares
			/*Numeros permitidos, solo del 0 a 9. Y que sean exactamente 8 numeros y 
			 * letras no permitidas: I, Ñ, O, U y de la "a" a la "z" (minusculas). Y que haya solo una letra.
			 * Añadido expresiones para NIE: Que comience con X, Y o Z, que hayan 7 numeros entre 0 y 9 y
			 * que acabe con una letra de las permitidas.
			 */
		String dniNieValido = "[0-9]{8}[^a-zIÑOU]{1}|[XYZ]{1}[0-9]{7}[^a-zIÑOU]{1}";
		//String numerosDniValido = "[0-9]{8}";
		//String letrasDniValida = "[^a-zIÑOU]{1}";
		
		//Casos test
		
		String pruebaDni = "43181554C";
		Pattern patronDniNie = Pattern.compile(dniNieValido);
		Matcher checkPatronDniNie  = patronDniNie.matcher(pruebaDni);
		
		if (checkPatronDniNie.find()){
			String dniOrNie = checkPatronDniNie.group();
			System.out.println("El DNI o NIE: " + dniOrNie + " es correcto.");
		}
		else{
			String dniOrNie = checkPatronDniNie.group();
			System.out.println("El DNI o NIE: " + dniOrNie + " es incorrecto.");
		}
	
		
		
		/*String[] casosTest = {
				"80117501Z","34168723S","76857238R","66714505S","66499420A"
		};*/
		
	}

}
