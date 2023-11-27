package ar.edu.unju.escmi.poo.dominio;

public class Carrito {
	private String modelo;
	private int cantidad;
	private double precio;
	
	public Carrito() {
		// TODO Auto-generated constructor stub
	}

	public Carrito(String modelo, int cantidad, double precio) {
		super();
		this.modelo = modelo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [modelo=" + modelo + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
