package ar.edu.unju.escmi.poo.dominio;


public class Particular extends Cliente{

	private String nombre;
	private String apellido;
	
	public Particular() {
		// TODO Auto-generated constructor stub
	}

	public Particular(String usuario, String contrasenia,  String nombre, String apellido,long dni) {
		super(usuario, contrasenia,dni);
		this.nombre = nombre;
		this.apellido = apellido;
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

	@Override
	public String toString() {
		return "Particular [nombre=" + nombre + ", apellido=" + apellido + ", getUsuario()=" + getUsuario()
				+ ", getContrasenia()=" + getContrasenia() + ", getDni()=" + getDni() + "]";
	}


}
