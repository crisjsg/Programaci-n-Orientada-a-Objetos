package listaAlumnos;

public class Alumnos {

	//Propiedades
	
	private String nombre = null;
	private String apellidos = null;
	
	//Constructores
	
	public Alumnos() {

	}
	
	public Alumnos(String nombre, String apellidos) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
	}

	//Setters y Getters

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}

