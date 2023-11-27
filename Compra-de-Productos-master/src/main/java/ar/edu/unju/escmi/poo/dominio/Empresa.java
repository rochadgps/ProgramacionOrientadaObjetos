package ar.edu.unju.escmi.poo.dominio;


public class Empresa extends Cliente {
	private String razonSocial;

	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public Empresa(String usuario, String contrasenia, String razonSocial,long dni) {
		super(usuario, contrasenia,dni);
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public String toString() {
		return "Empresa [razonSocial=" + razonSocial + ", getUsuario()=" + getUsuario() + ", getContrasenia()="
				+ getContrasenia() + ", getDni()=" + getDni() + "]";
	}

	

}
