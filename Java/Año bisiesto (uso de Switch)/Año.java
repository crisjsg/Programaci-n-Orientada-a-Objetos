package añosBisiestos;

public class Año {
	
	private int año;
	private int mes;
	private int dia;
	private int numeroDias = 0;
	
	//Constructores
	
	public Año(){
		
	};
	
	public Año (int dia, int mes, int año){
		
		this.setDia(dia);
		this.setMes(mes);
		this.setAño(año);
		
	}
	
	
	//Setters y Getters
	
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}
	
	
	

}
