package ar.edu.unju.escmi.poo.dominio;

public class Persona {

	private String nombre;
	private String apellido;
	private long dni;
	private String curso;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, long dni, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", curso=" + curso + " ";
	}

}
