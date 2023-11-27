package ar.edu.unju.escminas.poo.dominio;

public class Mineral extends Especie {
	
	private String tipoMineral;


	
	public Mineral(int codigo, String denominacionCientifica, String denominacionVulgar, String tipoMineral) {
		super(codigo, denominacionCientifica, denominacionVulgar);
		this.tipoMineral = tipoMineral;
	}





	public Mineral() {
		super();
	}





	public String getTipoMineral() {
		return tipoMineral;
	}





	public void setTipoMineral(String tipoMineral) {
		this.tipoMineral = tipoMineral;
	}





	@Override
	public String toString() {
		return "Mineral [tipoMineral=" + tipoMineral + "]";
	}





	
	

}
