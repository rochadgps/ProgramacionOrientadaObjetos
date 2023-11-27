package ar.edu.unju.escminas.poo.dominio;



public class Animal extends Especie{
	
	private String tipoAlimentacion;
	private String periodoCelo;
	private boolean peligroExtincion;
	
	
	public Animal(int codigo, String denominacionCientifica, String denominacionVulgar, String tipoAlimentacion,
			String periodoCelo, boolean peligroExtincion) {
		super(codigo, denominacionCientifica, denominacionVulgar);
		this.tipoAlimentacion = tipoAlimentacion;
		this.periodoCelo = periodoCelo;
		this.peligroExtincion = peligroExtincion;
	}
	
	
    


	public Animal() {
		super();
	}


	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}


	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}


	public String getPeriodoCelo() {
		return periodoCelo;
	}


	public void setPeriodoCelo(String periodoCelo) {
		this.periodoCelo = periodoCelo;
	}


	public boolean isPeligroExtincion() {
		return peligroExtincion;
	}


	public void setPeligroExtincion(boolean peligroExtincion) {
		this.peligroExtincion = peligroExtincion;
	}


	@Override
	public String toString() {
		return super.toString() + "Animal [tipoAlimentacion=" + tipoAlimentacion + ", periodoCelo=" + periodoCelo + ", peligroExtincion="
				+ peligroExtincion + "]";
	}
	
	
	
	
	
	

}
