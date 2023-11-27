package punto2;

import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		String nombre, apellido, legajo;
		long dni;
		int antiguedad;

		Scanner sc = new Scanner(System.in);

		Alumno alumno = new Alumno("Fernando", "Gomez", 123456);
		alumno.saludar();
		System.out.println("Ingresa libreta universitaria:");
		alumno.setLibretaUniversitaria(sc.nextLine());
		System.out.println("Ingresa nota1:");
		alumno.setNota1(sc.nextDouble());
		System.out.println("Ingresa nota2:");
		alumno.setNota2(sc.nextDouble());
		System.out.println("Ingresa nota3:");
		alumno.setNota3(sc.nextDouble());
		alumno.estudiar();
		System.out.println("El promedio del alumno es: " + alumno.calcularPromedio());
		System.out.println("---DATOS DEL ALUMNO---\n" + alumno.toString());
		// Profesor
		System.out.println("\n---Ingrese datos del profesor---");

        sc.nextLine();

		System.out.println("Ingrese nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese apellido");
		apellido = sc.nextLine();
		System.out.println("Ingrese legajo");
		legajo = sc.nextLine();
		System.out.println("Ingrese dni");
		dni = sc.nextLong();
		System.out.println("Ingrese antiguedad");
		antiguedad = sc.nextInt();

		Profesor profesor = new Profesor(nombre, apellido, dni, legajo, antiguedad);
		profesor.saludar();
		profesor.corregirExamenes();
		System.out.println("---DATOS DEL PROFESOR---\n" + profesor.toString());
		System.out.println("Sueldo para un profesor con " + profesor.getAntiguedad() + " años de antiguedad es de: $"
				+ profesor.calcularSueldo());
	}
}
