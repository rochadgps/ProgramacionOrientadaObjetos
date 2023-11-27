package punto2;

public class Profesor extends Persona {
	private String legajo;
	private int antiguedad;
	private final int SUELDO_BASICO = 45000;

	public Profesor(String nombre, String apellido, long dni, String legajo, int antiguedad) {
		super(nombre, apellido, dni);
		this.legajo = legajo;
		this.antiguedad = antiguedad;
	}

	@Override
	public void saludar() {
		System.out.println("Hola soy " + super.getNombre() + " y soy un profesor");
	}

	public void corregirExamenes() {
		System.out.println("Estoy corrigiendo los examenes...");
	}

	public double calcularSueldo() {
		if (antiguedad >= 5) {
			return SUELDO_BASICO+(SUELDO_BASICO*1.25);
		}
		return SUELDO_BASICO+(SUELDO_BASICO*1.10);
	}

	@Override
	public String toString() {
		return super.toString() + " legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldoBasico=" + SUELDO_BASICO;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

}
