package ar.edu.unju.escminas.poo.dominio;

public abstract class Usuario {
	
	private int codigo;
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	
	
	//constructores
	
	public Usuario(int codigo, String usuario, String contrasenia, String nombre, String apellido, int dni
			) {
		super();
		this.codigo = codigo;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Usuario() {
		super();
	}
	
	
	//setters and getters
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public void setContrasenia(String contraseña) {
		this.contrasenia = contraseña;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	
	
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", usuario=" + usuario + ", contraseña=" + contrasenia + ", nombre="
				+ nombre + ", apellido=" + apellido + ", dni=" + dni + ", tipoUsuario=" + "]";
	}
	
	
	
	
	
	

}
