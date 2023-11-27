package ar.edu.unju.escmi.poo.dominio;

public abstract class Persona {
	private String usuario;
	private String contrasenia;
	private long dni;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String usuario, String contrasenia,long dni) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.dni= dni;
	}



	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [usuario=" + usuario + ", contrasenia=" + contrasenia + ", dni=" + dni + "]";
	}

	
	
	
}
