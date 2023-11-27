package ar.edu.unju.escmi.poo.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Alumno;

public class TablaAlumno {

	public static List<Alumno> ALUMNOS = new ArrayList<Alumno>();

	public static void cargarAlumnos() {
		ALUMNOS.add(new Alumno("Nicole", "Gimenez", 44645789, "primero", LocalDate.of(2001, 10, 6), TablaNota.NOTAS));

		ALUMNOS.stream().forEach(System.out::println);
	}

}
