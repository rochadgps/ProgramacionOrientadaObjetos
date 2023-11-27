package ar.edu.unju.escminas.poo.dominio;

public class Especie {
	
	private int codigo;
	private String denominacionCientifica;
	private String denominacionVulgar;
	
	public Especie(int codigo, String denominacionCientifica, String denominacionVulgar) {
		super();
		this.codigo = codigo;
		this.denominacionCientifica = denominacionCientifica;
		this.denominacionVulgar = denominacionVulgar;
	}

	public Especie() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDenominacionCientifica() {
		return denominacionCientifica;
	}

	public void setDenominacionCientifica(String denominacionCientifica) {
		this.denominacionCientifica = denominacionCientifica;
	}

	public String getDenominacionVulgar() {
		return denominacionVulgar;
	}

	public void setDenominacionVulgar(String denominacionVulgar) {
		this.denominacionVulgar = denominacionVulgar;
	}

	@Override
	public String toString() {
		return "Especie [codigo=" + codigo + ", denominacionCientifica=" + denominacionCientifica
				+ ", denominacionVulgar=" + denominacionVulgar + "]";
	}
	
	
	
	
	

}
