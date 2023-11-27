package punto3;

public class Producto implements Comparable<Producto>{
	private int codigo;
	private String descripcion;
	private int precio;
	private String marca;

	public Producto(int codigo, String descripcion, int precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int compareTo(Producto i) {
		if (i.getCodigo() > this.codigo) {
			return -1;
		} else if (i.getCodigo() < this.codigo) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Producto (codigo:" + codigo + ", descripcion:" + descripcion + ", precio:" + precio + ", marca:" + marca
				+ ")";
	}
}
