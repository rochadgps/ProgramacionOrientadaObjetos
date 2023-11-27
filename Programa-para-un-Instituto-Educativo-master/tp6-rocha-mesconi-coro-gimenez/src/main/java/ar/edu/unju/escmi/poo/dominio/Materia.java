package ar.edu.unju.escmi.poo.dominio;

public class Materia {

	private int codigo;
	private String nombre;
	private char tipo;// 'A' de Anual o 'C' de Cuatrimestral
	private String curso;

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(int codigo, String nombre, char tipo, String curso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.curso = curso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", curso=" + curso + "]";
	}

}
