package a�osBisiestos;

public class A�o {
	
	private int a�o;
	private int mes;
	private int dia;
	private int numeroDias = 0;
	
	//Constructores
	
	public A�o(){
		
	};
	
	public A�o (int dia, int mes, int a�o){
		
		this.setDia(dia);
		this.setMes(mes);
		this.setA�o(a�o);
		
	}
	
	
	//Setters y Getters
	
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
