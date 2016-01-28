package utilidades;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EvaluadorRegularDni {

	public static void main(String[] args) {
	
		//Evaluadores regulares
			//Numeros permitidos, solo del 0 a 9. Y que sean exactamente 8 numeros.
		String numerosDniValido = "[0-9]{8}";
		
			//Letras no permitidas: I, Ñ, O, U y de la "a" a la "z" (minusculas). Y que haya solo una letra.
		String letrasDniValida = "[^a-zIÑOU]{1}";
		
		//Casos test
		
		String pruebaDni = "43181554C";
		Pattern patronDni = Pattern.compile(numerosDniValido + letrasDniValida);
		Matcher checkPatronDni  = patronDni.matcher(pruebaDni);
		
		if (checkPatronDni.find()){
			String dni = checkPatronDni.group();
			System.out.println("El DNI es: " + dni);
		}
	
		
		
		/*String[] casosTest = {
				"80117501Z","34168723S","76857238R","66714505S","66499420A"
		};*/
		
	}

}
