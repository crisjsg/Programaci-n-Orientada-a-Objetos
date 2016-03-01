package appalma;

public class Bicicleta {
	
	//Atributos
	private Integer id = 0;
	
	
	//Constructores
	public Bicicleta(){
		
	}
	
	public Bicicleta(Integer id){
		this.setId(id);
	}

	//Setters y Getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
