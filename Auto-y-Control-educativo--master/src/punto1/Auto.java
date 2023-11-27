package punto1;

public class Auto {
	private String patente;
	private String marca;
	private String color;
	private String modelo;
	private int anioFabricacion;

	public Auto() {
		super();
	}

	public Auto(String patente, String marca, String color, String modelo, int anioFabricacion) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}
	
	public Auto(String patente, String color, String modelo) {
		super();
		marca = "Peugeot";
		anioFabricacion = 2010;
		this.patente = patente;
		this.color = color;
		this.modelo = modelo;
	}

	public void avanzar() {
		System.out.println("Estoy avanzando...");
	}

	public void acelerar() {
		System.out.println("Estoy acelerando...");
	}

	public void frenar() {
		System.out.println("Estoy frenando...");
	}

	public void girar() {
		System.out.println("Estoy girando...");
	}

	public void limpiarCristales() {
		System.out.println("Estoy limpiando los cristales...");
	}

	// GETTERS & SETTERS
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo
				+ ", año de fabricación=" + anioFabricacion + "]";
	}
}
