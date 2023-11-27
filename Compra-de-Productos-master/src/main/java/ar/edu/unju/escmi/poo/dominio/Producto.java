package ar.edu.unju.escmi.poo.dominio;

public class Producto {
	private String tipo;
	private int stock;
	private String marca;
	private double precio;
	private String modelo;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String tipo, int stock, String marca, double precio, String modelo) {
		super();
		this.tipo = tipo;
		this.stock = stock;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Modelo [tipo= " + tipo + "stock=" + stock + ", marca= " + marca + ", precio=" + precio + ", modelo="
				+ modelo + "]";
	}

}
