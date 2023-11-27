package ar.edu.unju.escminas.principal;

import java.util.Scanner;

import ar.edu.unju.escminas.dominio.Desarrollador;
import ar.edu.unju.escminas.dominio.Empleado;
import ar.edu.unju.escminas.dominio.Presidente;
import ar.edu.unju.escminas.dominio.ResponsableRecursosHumanos;
import ar.edu.unju.escminas.tablas.TablaEmpleado;
import ar.edu.unju.escminas.tablas.TablaProyecto;
import ar.edu.unju.escminas.tablas.TablaTarea;
import ar.edu.unju.escminas.utils.Menus;

public class Principal {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleadoAutenticado = null;
		Scanner sc = new Scanner(System.in);
		boolean band=false;
		TablaEmpleado.cargarTablaEmpleado();
		TablaProyecto.cargarTablaProyecto();
		TablaTarea.cargarTablaTarea();
		TablaProyecto.PROYECTOS.get(0).setTareas(TablaTarea.TAREAS.subList(0, 5));
		TablaProyecto.PROYECTOS.get(1).setTareas(TablaTarea.TAREAS.subList(6, 14));
		System.out.println("ELEMENTOS CARGADOS");
		TablaEmpleado.EMPLEADOS.stream().forEach(System.out::println);
		TablaTarea.TAREAS.stream().forEach(System.out::println);
		TablaProyecto.PROYECTOS.stream().forEach(System.out::println);
		System.out.println("\n\n\n");
		System.out.println("Presione Enter");
		do {
			empleadoAutenticado = login(sc);
			if (empleadoAutenticado != null) {

				//se accedio
				menu(empleadoAutenticado, sc);

			} else {
				System.out.println("No se accedio");
			}
		} while (band!=true);
		

	}

	public static Empleado login(Scanner sc) {
		//System.out.println("¡¡¡RECUERDE QUE SOLO SE PUEDE REALIZAR UNA ACCION CADA VEZ QUE SE COMPILA!!!");
		sc.nextLine();
		System.out.println("ingrese un nombre de usuario");
		
		String usuario = sc.next();
		sc.nextLine();
		System.out.println("ingrese su contraseña");
		
		String contrasena = sc.nextLine();
		System.out.println("Presione Enter");
		sc.nextLine();
		for (int i = 0; i < TablaEmpleado.EMPLEADOS.size(); i++) {
			if (TablaEmpleado.EMPLEADOS.get(i).getNombreUsuario().compareTo(usuario) == 0
					&& TablaEmpleado.EMPLEADOS.get(i).getContrasena().compareTo(contrasena) == 0) {
				Empleado empleadoautenticado = TablaEmpleado.EMPLEADOS.get(i);
				return empleadoautenticado;
			}

		}
		return null;
	}

	public static void menu(Empleado empleadoAutenticado, Scanner sc) {
		if (empleadoAutenticado instanceof Desarrollador) {
			System.out.println("Menu Desarrollador");
			System.out.println("Rol: " + empleadoAutenticado.getRol());
			if (empleadoAutenticado.getRol().compareTo("jefe de proyecto") == 0) {
				
				Menus.menuDesarrolladores(sc, true, (Desarrollador)empleadoAutenticado);
			} else {
				Menus.menuDesarrolladores(sc, false, (Desarrollador)empleadoAutenticado);
			}

		} else if (empleadoAutenticado instanceof Presidente) {
			System.out.println("Menu Presidente");
			System.out.println("Rol: " + empleadoAutenticado.getRol());
			Menus.menuPresidente(sc, (Presidente)empleadoAutenticado );
			
			
		} else {
			System.out.println("Menu Responsable RH");
			System.out.println("Rol: " + empleadoAutenticado.getRol());
			Menus.menuRH(sc,(ResponsableRecursosHumanos)empleadoAutenticado);
		}

	}
}
