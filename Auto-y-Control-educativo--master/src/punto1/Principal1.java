package punto1;

import java.util.Scanner;

public class Principal1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Objeto con constructor parametrizado
		Auto auto1 = new Auto("ABC-123", "Toyota", "rojo", "Corolla", 2010);
		System.out.println("---Constructor parametrizado---\n" + auto1.toString() + "\n");
		auto1.acelerar();
		auto1.frenar();
		auto1.limpiarCristales();
		auto1.avanzar();
		auto1.girar();

		// Objeto con constructor por defecto
		System.out.println("---Constructor por defecto---");
		Auto auto2 = new Auto();

		System.out.println("Ingrese patente: ");
		auto2.setPatente(sc.nextLine());
		System.out.println("Ingrese marca: ");
		auto2.setMarca(sc.nextLine());
		System.out.println("Ingrese modelo: ");
		auto2.setModelo(sc.nextLine());
		System.out.println("Ingrese color: ");
		auto2.setColor(sc.nextLine());
		System.out.println("Ingrese año de fabricación: ");
		auto2.setAnioFabricacion(sc.nextInt());

		System.out.println("---Constructor por defecto---\n" + auto2.toString() + "\n");
		
		// Objeto con atributos inicializados
		Auto auto3 = new Auto("ABC-123", "rojo", "506");
		auto3.setPatente("ABC-123");
		auto3.setColor("rojo");
		auto3.setModelo("506");
		System.out.println("---Constructor con atributos inicializados---\n" + auto3.toString() + "\n");
	}
}
