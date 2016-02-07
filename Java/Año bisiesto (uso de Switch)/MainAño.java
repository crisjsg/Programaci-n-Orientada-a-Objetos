package añosBisiestos;
//import java.util.Scanner;


public class MainAño {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un dia: ");
		dia = input.next(); */
		
		
		Año nuestroAño = new Año(5, 2, 2016);
	
		//Switch
		
		switch (nuestroAño.getMes()){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			nuestroAño.setNumeroDias(31);
			break;
		
			//El fallo está aquí, hay que corregir la division.
		case 2:
			if(nuestroAño.getAño() % 400 == 0){
				nuestroAño.setNumeroDias(29);
				break;
			}
			else {
				nuestroAño.setNumeroDias(28);
				break;
			}
		
		case 4:
		case 6:
		case 9:
		case 11:
			nuestroAño.setNumeroDias(30);
			break;
			
		default:
			nuestroAño.setNumeroDias(1);
			break;
		}
		
		if( nuestroAño.getNumeroDias() == 29 ){
			
			System.out.println("Tu fecha: " + nuestroAño.getDia()+ "-" + nuestroAño.getMes()+ "-" + nuestroAño.getAño());
			System.out.println("Tu año escogido: "  + nuestroAño.getAño() + " es bisiesto");
			System.out.println(nuestroAño.getNumeroDias());
			
		}
		
		else{
			System.out.println("Tu fecha: " + nuestroAño.getDia()+ "-" + nuestroAño.getMes()+ "-" + nuestroAño.getAño());
			System.out.println("Tu año escogido: "  + nuestroAño.getAño() + " no es bisiesto");
			System.out.println(nuestroAño.getNumeroDias());
		}

	}

}
