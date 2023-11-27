package punto1;

public class Empleado {
	private long dni;
	private String nombre;
	private String apellido;
	private double sueldo;
	private char categoria;

	public Empleado() {
		super();
	}

	public Empleado(long dni, String nombre, String apellido, double sueldo, char categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.categoria = categoria;
	}

	// Getters & Setters

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public String getClave() {
		return ""+ dni + categoria;
	}

	@Override
	public String toString() {
		return "Empleado (dni:" + dni + ", nombre:" + nombre + ", apellido:" + apellido + ", sueldo:" + sueldo
				+ ", categoria:" + categoria + ")";
	}
}
