package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona {

	private LocalDate fechaNac;
	private List<Nota> notas;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, long dni, String curso, LocalDate fechaNac, List<Nota> notas) {
		super(nombre, apellido, dni, curso);
		this.fechaNac = fechaNac;
		this.notas = notas;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public double calcularPromedio() {
		double promedio;
		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			suma = suma + notas.get(i).getNota();
		}
		promedio = suma / notas.size();
		return promedio;

	}

	public Nota buscarNotaMasAlta() {
		if (notas.isEmpty()) {
			return null;
		} else {
			int posicion = 0;
			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i).getNota() > notas.get(posicion).getNota()) {
					posicion = i;
				}
			}
			return notas.get(posicion);
		}
	}

	@Override
	public String toString() {
		return "Alumno [" + super.toString() + "fechaNac=" + fechaNac + ", notas=" + notas + "]";
	}

}
