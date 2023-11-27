package ar.edu.unju.escminas.poo.dominio;



public class Vegetal extends Especie{
	
	private boolean floracion;
	private String periodo;
	
	
	public Vegetal(int codigo, String denominacionCientifica, String denominacionVulgar, boolean floracion,
			String periodo) {
		super(codigo, denominacionCientifica, denominacionVulgar);
		this.floracion = floracion;
		this.periodo = periodo;
	}



	public Vegetal() {
		super();
	}




	public boolean isFloracion() {
		return floracion;
	}


	public void setFloracion(boolean floracion) {
		this.floracion = floracion;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	@Override
	public String toString() {
		return super.toString() + "Vegetal [floracion=" + floracion + ", periodo=" + periodo + "]";
	}
	
	

}
