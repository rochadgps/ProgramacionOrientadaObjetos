package punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal3 {
	static int i=0;
	public static Scanner sc = new Scanner(System.in);
	public static final int CANTIDAD_PRODUCTOS = 4;

	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<Producto>();
		
		while(i < CANTIDAD_PRODUCTOS) {
			Producto producto = crearProducto();
			productos.add(producto);
			i++;
			
		}
		System.out.println("\n ¡¡¡Productos!!!");
		
		productos.stream().forEach(System.out::println);
		
		System.out.println("\n ¡¡¡Cambio de precio de productos¡¡¡");
		
		productos.stream()
		
			.map(producto -> producto.getPrecio() + 20.50D)
			.forEach(System.out::println);
		
		System.out.println("\n ¡¡¡Productos ordenados por su codigo!!!");
		
		productos.sort((o1, o2) -> o1.compareTo(o2));
		productos.stream().forEach(System.out::println);
	}

	public static Producto crearProducto() {
		System.out.println("¡¡¡Productos!!!");
		
		System.out.println("Ingrese descripcion:");
		
		String descripcion = sc.nextLine();
		
		System.out.println("Ingrese marca:");
		
		String marca = sc.nextLine();
		
		System.out.println("Ingrese precio:");
		
		int precio = sc.nextInt();
		
		System.out.println("Ingrese codigo:");
		
		int codigo = sc.nextInt();

		sc.nextLine();

		return new Producto(codigo, descripcion, precio, marca);
	}
}
