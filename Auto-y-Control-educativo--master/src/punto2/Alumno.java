package punto2;

public class Alumno extends Persona {
	private String libretaUniversitaria;
	private double nota1;
	private double nota2;
	private double nota3;

	public Alumno(String nombre, String apellido, long dni) {
		super(nombre, apellido, dni);
	}

	@Override
	public void saludar() {
		System.out.println("Hola soy " + super.getNombre() + " y soy un alumno");
	}

	public void estudiar() {
		System.out.println("Estoy estudiando...");
	}

	public double calcularPromedio() {
		return (nota1 + nota2 + nota3) / 3;
	}

	@Override
	public String toString() {
		return super.toString() + " libretaUniversitaria=" + libretaUniversitaria + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", nota3=" + nota3;
	}

	public String getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(String libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

}
