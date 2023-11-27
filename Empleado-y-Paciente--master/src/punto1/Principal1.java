package punto1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Principal1 {
	static int i=0;
	public static Scanner sc = new Scanner(System.in);
	public static final int CANTIDAD_EMPLEADOS = 4;

	public static void main(String[] args) {
		Map<String, Empleado> hashMap = new HashMap<String, Empleado>();
		
	while(i < CANTIDAD_EMPLEADOS) {
		Empleado empleado = crearEmpleado();
		hashMap.put(empleado.getClave(), empleado);
		i++;
	}

		mostrarHashMap(hashMap);
		eliminarEmpleado(hashMap);
	}

	public static Empleado crearEmpleado() {
		
		System.out.println("¡¡¡Registro de empleados!!!");
		
		System.out.println("Ingrese nombre:");
		
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido:");
		
		String apellido = sc.nextLine();
		
		System.out.println("Ingrese dni:");
		
		long dni = sc.nextLong();
		
		System.out.println("Ingrese sueldo:");
		
		double sueldo = sc.nextDouble();
		
		System.out.println("Ingrese categoría:");
		
		char categoria = sc.next().charAt(0);

		sc.nextLine();

		return new Empleado(dni, nombre, apellido, sueldo, categoria);
	}

	public static void mostrarHashMap(Map<String, Empleado> hashMap) {
		
		System.out.println("¡¡¡Empleados!!!");
		
		Iterator<String> it = hashMap.keySet().iterator();
		
		while (it.hasNext()) {
			String clave = it.next();
			
			Empleado valor = hashMap.get(clave);
			
			System.out.println("Clave: " + clave + ", Valor: " + valor.toString());
		}
	}

	public static void eliminarEmpleado(Map<String, Empleado> hashMap) {
		
		System.out.println("¡¡¡Eliminar Empleado!!!");
		
		System.out.println("Ingresa una clave para remover un empleado:");
		
		String key = sc.nextLine();

		if (!hashMap.containsKey(key)) {
			System.out.println("¡¡¡Esta clave no se encuentra, intente con otra!!");
			return;
		}

		hashMap.remove(key);
		
		System.out.println("Su operacion fue realizada con exito");
		
		mostrarHashMap(hashMap);
		
	}
}
