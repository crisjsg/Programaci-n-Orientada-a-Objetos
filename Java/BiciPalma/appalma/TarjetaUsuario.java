package appalma;

public class TarjetaUsuario {
	//Propiedades
	
	private String id = null;
	private Boolean activada = false; // falta inicialiarla por programación defensiva
	
	// no has escrito el constructor de la tarjeta de usuario ¿?
	//Constructores
	public TarjetaUsuario(){
		
	}
	
	public TarjetaUsuario(String id, Boolean activada){
		
		setId(id);
		setActivada(activada); 
	}
	
	//Getters y setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getActivada() {
		return activada;
	}
	public void setActivada(Boolean activada) {
		this.activada = activada;
	}
	

}
