package ar.edu.unju.escmi.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Materia;

public class TablaMateria {

	public static List<Materia> MATERIAS = new ArrayList<Materia>();

	public static void cargarMaterias() {
		MATERIAS.add(new Materia(1, "Quimica", 'A', "segundo"));
		MATERIAS.add(new Materia(2, "Matematica", 'C', "tercero"));

		MATERIAS.stream().forEach(System.out::println);
	}

	public static List<Materia> mostrarMateriasPorCurso(String curso) {
		ArrayList<Materia> materias = new ArrayList<Materia>();
		for (int i = 0; i < MATERIAS.size(); i++) {
			if (MATERIAS.get(i).getCurso().compareTo(curso) == 0) {
				materias.add(MATERIAS.get(i));
			}
		}
		return materias;
	}
}