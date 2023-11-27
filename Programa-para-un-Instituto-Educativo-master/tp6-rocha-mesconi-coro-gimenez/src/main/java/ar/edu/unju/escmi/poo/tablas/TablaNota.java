package ar.edu.unju.escmi.poo.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Nota;

public class TablaNota {

	public static List<Nota> NOTAS = new ArrayList<Nota>();

	public static void cargarNotas() {

		Nota nota1 = new Nota(1, 5, LocalDate.of(2021, 10, 6), TablaMateria.MATERIAS.get(0));
		NOTAS.add(nota1);
		Nota nota2 = new Nota(2, 10, LocalDate.of(2021, 10, 6), TablaMateria.MATERIAS.get(1));
		NOTAS.add(nota2);
		NOTAS.stream().forEach(System.out::println);

	}
}
