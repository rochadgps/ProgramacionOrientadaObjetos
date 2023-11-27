package ar.edu.unju.escminas.poo.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Parque {
	
	private int codigo; //hay que ver si se borra o se queda
	private String nombre;
	private LocalDate fecha;
	private Double extension;
	private String ubicacionGeografica;
	private OrganismoProvincial organismo;
	private List<Especie> especies;
	
	//CONSTRUCTORES
	


	public Parque() {
		super ();
		especies = new ArrayList<Especie>();
	}
	
	public Parque(int codigo, String nombre, LocalDate fecha, Double extension, String ubicacionGeografica,
			OrganismoProvincial organismo, List<Especie> especies) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.extension = extension;
		this.ubicacionGeografica = ubicacionGeografica;
		this.organismo = organismo;
		this.especies = especies;
	}

	//GETTER AND SETTERS


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getExtension() {
		return extension;
	}

	public void setExtension(Double extension) {
		this.extension = extension;
	}

	public String getUbicacionGeografica() {
		return ubicacionGeografica;
	}

	public void setUbicacionGeografica(String ubicacionGeografica) {
		this.ubicacionGeografica = ubicacionGeografica;
	}

	
	

	public OrganismoProvincial getOrganismo() {
		return organismo;
	}



	public void setOrganismo(OrganismoProvincial organismo) {
		this.organismo = organismo;
	}
	
	



	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	@Override
	public String toString() {
		return "Parque [codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", extension=" + extension
				+ ", ubicacionGeografica=" + ubicacionGeografica + ", organismo=" + organismo + ", especies=" + especies
				+ "]";
	}



	

	
	

	



}
