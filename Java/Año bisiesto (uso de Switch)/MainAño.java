package a�osBisiestos;
//import java.util.Scanner;


public class MainA�o {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un dia: ");
		dia = input.next(); */
		
		
		A�o nuestroA�o = new A�o(5, 2, 2016);
	
		//Switch
		
		switch (nuestroA�o.getMes()){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			nuestroA�o.setNumeroDias(31);
			break;
		
			//El fallo est� aqu�, hay que corregir la division.
		case 2:
			if(nuestroA�o.getA�o() % 400 == 0){
				nuestroA�o.setNumeroDias(29);
				break;
			}
			else {
				nuestroA�o.setNumeroDias(28);
				break;
			}
		
		case 4:
		case 6:
		case 9:
		case 11:
			nuestroA�o.setNumeroDias(30);
			break;
			
		default:
			nuestroA�o.setNumeroDias(1);
			break;
		}
		
		if( nuestroA�o.getNumeroDias() == 29 ){
			
			System.out.println("Tu fecha: " + nuestroA�o.getDia()+ "-" + nuestroA�o.getMes()+ "-" + nuestroA�o.getA�o());
			System.out.println("Tu a�o escogido: "  + nuestroA�o.getA�o() + " es bisiesto");
			System.out.println(nuestroA�o.getNumeroDias());
			
		}
		
		else{
			System.out.println("Tu fecha: " + nuestroA�o.getDia()+ "-" + nuestroA�o.getMes()+ "-" + nuestroA�o.getA�o());
			System.out.println("Tu a�o escogido: "  + nuestroA�o.getA�o() + " no es bisiesto");
			System.out.println(nuestroA�o.getNumeroDias());
		}

	}

}
