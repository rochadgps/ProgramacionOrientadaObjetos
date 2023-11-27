package punto2;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Principal2 {
	static int i=0;
	public static Scanner sc = new Scanner(System.in);
	public static final int CANTIDAD_PACIENTES = 4;

	public static void main(String[] args) {
		SortedSet<Paciente> pacientes = new TreeSet<Paciente>();
		
		while(i < CANTIDAD_PACIENTES) {
			Paciente paciente = crearPaciente();
			pacientes.add(paciente);
			i++;
		}

		pacientes.stream().forEach(System.out::println);

		filtrarPorNroHistoriaClinica(pacientes);

	}

	public static Paciente crearPaciente() {
		System.out.println("---CARGA DE PACIENTE--");
		Paciente paciente = new Paciente();

		System.out.println("Ingresa el nombre:");
		
		paciente.setNombre(sc.nextLine());
		
		System.out.println("Ingresa el apellido:");
		
		paciente.setApellido(sc.nextLine());
		
		System.out.println("Ingresa obra social:");
		
		paciente.setObraSocial(sc.nextLine());
		
		System.out.println("Ingresa el dni:");
		
		paciente.setDni(sc.nextLong());
		
		System.out.println("Ingresa el numero de historia clinica:");
		
		paciente.setNroHistoriaClinica(sc.nextInt());
		

		sc.nextLine();

		return paciente;
	}

	public static void filtrarPorNroHistoriaClinica(SortedSet<Paciente> pacientes) {
		System.out.println("Ingresa un nro de historia clinica para filtrar:");
		int nroHistoriaClinica = sc.nextInt();

		pacientes.stream().filter(paciente -> paciente.getNroHistoriaClinica() > nroHistoriaClinica)
				.forEach(System.out::println);
	}
}
