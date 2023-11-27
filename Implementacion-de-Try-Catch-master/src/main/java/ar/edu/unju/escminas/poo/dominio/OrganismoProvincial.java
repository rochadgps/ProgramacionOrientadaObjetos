package ar.edu.unju.escminas.poo.dominio;


public class OrganismoProvincial {
	
	private String nombre;
	private String direccion;
    private String director;
	private Provincia provincia;
	
	//CONSTRUCTORES
	public OrganismoProvincial(String nombre, String direccion, String director, Provincia provincia) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.director = director;
		this.provincia = provincia;
	}


	public OrganismoProvincial() {
		super();
	}

    // GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	


	
	@Override
	public String toString() {
		return "OrganismoProvincial [nombre=" + nombre + ", direccion=" + direccion + ", director=" + director
				+ ", provincia=" + provincia + "]";
	}
	
	

	

}
