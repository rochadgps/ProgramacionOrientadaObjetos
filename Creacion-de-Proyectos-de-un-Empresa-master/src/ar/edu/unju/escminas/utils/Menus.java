package ar.edu.unju.escminas.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.escminas.dominio.Desarrollador;
import ar.edu.unju.escminas.dominio.DesarrolladorContratado;
import ar.edu.unju.escminas.dominio.DesarrolladorPasante;
import ar.edu.unju.escminas.dominio.Empleado;
import ar.edu.unju.escminas.dominio.Presidente;
import ar.edu.unju.escminas.dominio.Proyecto;
import ar.edu.unju.escminas.dominio.ResponsableRecursosHumanos;
import ar.edu.unju.escminas.dominio.Tarea;
import ar.edu.unju.escminas.tablas.TablaEmpleado;
import ar.edu.unju.escminas.tablas.TablaProyecto;
import ar.edu.unju.escminas.tablas.TablaTarea;
import java.time.LocalDate;

public class Menus {
	static List<Proyecto> proyectos = TablaProyecto.PROYECTOS;

	static List<Empleado> empleados = TablaEmpleado.EMPLEADOS;

	public static void menuPresidente(Scanner sc, Presidente presidente) {
		boolean band = false;
		do {
			System.out.println("1 – Lista de los proyectos");
			System.out.println("2 - Lista de los proyectos ordenados por estado");
			System.out.println("3 - Salir del programa");
			int opc = sc.nextInt();

			switch (opc) {
			case 1:
				presidente.listarProyectosPorPorcentajeAvance(proyectos);
				break;
			case 2:
				presidente.listarProyectosOrdenadosPorEstado();
				break;
			case 3:
				System.out.println("Saliendo del programa");
				band = true;
				break;
			default:
				System.out.println("INGRESO INCORRECTO");
				;
			}

		} while (band != true);
	}

	public static void menuRH(Scanner sc, ResponsableRecursosHumanos empleadoAutenticado) {
		boolean band = false;
		do {
			System.out.println("1 – Datos de los pasantes");
			System.out.println("2 - Personal sin ninguna tarea");
			System.out.println("3 - Dar de alta un desarrollador");
			System.out.println("4 - Salir del programa");
			int opc = sc.nextInt(), opc1;
			switch (opc) {
			case 1:
				ResponsableRecursosHumanos.listarPasantes();
				break;
			case 2:
				ResponsableRecursosHumanos.listarDesarrolladoresSinTarea();
				break;
			case 3:

				System.out.println("ingrese tipo de desarrollador a dar de alta: ");
				System.out.println("1 - Contratado ");
				System.out.println("2 - Pasante");
				opc1 = sc.nextInt();
				if (opc1 == 1) {//agregar un desarrollador contratado
					DesarrolladorContratado nuevoDesarrollador = new DesarrolladorContratado();
					
					boolean seRepite = false;
					int dni;
					do {//evitara que se añadan codigos ya existentes
						seRepite = false;
						System.out.println("ingrese DNI: ");
						dni =sc.nextInt();
						for (int i=0;i<TablaEmpleado.EMPLEADOS.size();i++) {
							if(TablaEmpleado.EMPLEADOS.get(i).getDni() == dni) {
								seRepite = true;
							}
						}
					}while(seRepite==true);
					nuevoDesarrollador.setDni(dni);
					System.out.println("ingrese legajo: ");
					nuevoDesarrollador.setLegajo(sc.nextInt());
					sc.nextLine();
					System.out.println("ingrese nombre: ");
					nuevoDesarrollador.setNombre(sc.next());
					sc.nextLine();
					
					seRepite = false;
					String nombreU;
					do {//evitara que se añadan existentes
						seRepite = false;
						System.out.println("ingrese nombre de usuario: ");
						nombreU =sc.next();
						for (int i=0;i<TablaEmpleado.EMPLEADOS.size();i++) {
							if(TablaEmpleado.EMPLEADOS.get(i).getNombreUsuario() == nombreU) {
								seRepite = true;
							}
						}
					}while(seRepite==true);
					nuevoDesarrollador.setNombreUsuario(nombreU);
					
					sc.nextLine();
					System.out.println("ingrese contrasena: ");
					nuevoDesarrollador.setContrasena(sc.next());
					sc.nextLine();
					boolean rol = false;
					int opc3;
					do {
						System.out.println("elija un rol");
						System.out.println("1 - Programador");
						System.out.println("2 - Analista");
						System.out.println("3 - Diseniador Grafico");
						System.out.println("4 - Arquitecto de Software");
						System.out.println("5 - Jefe de Proyecto");
						opc3 = sc.nextInt();
						switch (opc3) {
						case 1:
							nuevoDesarrollador.setRol("programador");
							rol = true;
							break;
						case 2:
							nuevoDesarrollador.setRol("analista");
							rol = true;
							break;
						case 3:
							nuevoDesarrollador.setRol("diseniador grafico");
							rol = true;
							break;
						case 4:
							nuevoDesarrollador.setRol("arquitecto de software");
							rol = true;
							break;
						case 5:
							nuevoDesarrollador.setRol("jefe de proyecto");
							rol = true;
							break;
						default:
							System.out.println("opcion invalida");
							break;
						}
					} while (rol != true);

					System.out.println("ingrese fecha de Nacimiento: ");
					System.out.println("ingrese anio");
					int anio = sc.nextInt();
					System.out.println("ingrese mes");
					int mes = sc.nextInt();
					System.out.println("ingrese dia");
					int dia = sc.nextInt();
					nuevoDesarrollador.setFechaNac(LocalDate.of(anio, mes, dia));
					System.out.println("ingrese nro contrato: ");
					nuevoDesarrollador.setNroContrato(sc.nextInt());
					sc.nextLine();
					System.out.println("ingrese titulo de profesion: ");
					nuevoDesarrollador.setTituloProf(sc.nextLine());
					nuevoDesarrollador.setFechaIngreso(LocalDate.now());
					//se crea el arraylist dou de tecnologias, y se preguntará si desea ingresar datos
					List<String> dou = new ArrayList<String>();
					int xd = 0;
					boolean seguir = false;
					do {

						System.out.println("Desea ingresar una tecnologia?");
						System.out.println("1 - si");
						System.out.println("2 - no");
						xd = sc.nextInt();
						switch (xd) {
						case 1:
							sc.nextLine();
							System.out.println("ingrese alguna tecnologia que maneje el desarrollador");
							dou.add(sc.next());
							break;
						case 2:
							System.out.println("finalizado");
							seguir = true;
							break;
						default:
							System.out.println("ingreso incorrecto");
							break;
						}

					} while (seguir != true);
					nuevoDesarrollador.setTecnologias(dou);
					//se añade el arraylist t1 de tareas, pero vacío. Se cargarán en otro método
					List<Tarea> t1=new ArrayList<Tarea>();
                    nuevoDesarrollador.setTareas(t1);
                    //se añade el desarrollador
					ResponsableRecursosHumanos.darDeAlta(nuevoDesarrollador);
				} else if (opc1 == 2) {//agregar un desarrollador pasante
					DesarrolladorPasante nuevoDesarrollador = new DesarrolladorPasante();
					System.out.println("ingrese DNI: ");
					nuevoDesarrollador.setDni(sc.nextInt());
					sc.nextLine();
					System.out.println("ingrese legajo: ");
					nuevoDesarrollador.setLegajo(sc.nextInt());
					sc.nextLine();
					System.out.println("ingrese nombre: ");
					nuevoDesarrollador.setNombre(sc.next());
					sc.nextLine();
					System.out.println("ingrese nombre de usuario: ");
					nuevoDesarrollador.setNombreUsuario(sc.next());
					;
					sc.nextLine();
					System.out.println("ingrese contrasena: ");
					nuevoDesarrollador.setContrasena(sc.nextLine());
					sc.nextLine();
					boolean rol1 = false;
					int opc4;
					do {
						System.out.println("elija un rol");
						System.out.println("1 - Programador");
						System.out.println("2 - Analista");
						System.out.println("3 - Diseniador Grafico");
						System.out.println("4 - Arquitecto de Software");
						System.out.println("5 - Jefe de Proyecto");
						opc4 = sc.nextInt();
						switch (opc4) {
						case 1:
							nuevoDesarrollador.setRol("programador");
							rol1 = true;
							break;
						case 2:
							nuevoDesarrollador.setRol("analista");
							rol1 = true;
							break;
						case 3:
							nuevoDesarrollador.setRol("diseniador grafico");
							rol1 = true;
							break;
						case 4:
							nuevoDesarrollador.setRol("arquitecto de software");
							rol1 = true;
							break;
						case 5:
							nuevoDesarrollador.setRol("jefe de proyecto");
							rol1 = true;
							break;
						default:
							System.out.println("opcion invalida");
							break;
						}
					} while (rol1 != true);
					System.out.println("ingrese fecha de Nacimiento: ");
					System.out.println("ingrese anio");
					int anio = sc.nextInt();
					System.out.println("ingrese mes");
					int mes = sc.nextInt();
					System.out.println("ingrese dia");
					int dia = sc.nextInt();
					nuevoDesarrollador.setFechaNac(LocalDate.of(anio, mes, dia));
					sc.nextLine();
					System.out.println("ingrese universidad: ");
					nuevoDesarrollador.setUniversidad(sc.nextLine());

					nuevoDesarrollador.setFechaInicioPasantia(LocalDate.now());
					System.out.println("ingrese fecha de fin de la pasantia: ");
					System.out.println("ingrese anio");
					int anio2 = sc.nextInt();
					System.out.println("ingrese mes");
					int mes2 = sc.nextInt();
					System.out.println("ingrese dia");
					int dia2 = sc.nextInt();
					nuevoDesarrollador.setFechaFinPasantia(LocalDate.of(anio2, mes2, dia2));
					List<String> dou = new ArrayList<String>();
					int xd = 0;
					boolean seguir1 = false;
					do {

						System.out.println("Desea ingresar una tecnologia?");
						System.out.println("1 - si");
						System.out.println("2 - no");
						xd = sc.nextInt();
						switch (xd) {
						case 1:
							sc.nextLine();
							System.out.println("ingrese alguna tecnologia que maneje el desarrollador");
							dou.add(sc.next());
							break;
						case 2:
							System.out.println("finalizado");
							seguir1 = true;
							break;
						default:
							System.out.println("ingreso incorrecto");
							break;
						}

					} while (seguir1 != true);
					nuevoDesarrollador.setTecnologias(dou);
                    List<Tarea> t1=new ArrayList<Tarea>();
                    nuevoDesarrollador.setTareas(t1);
					ResponsableRecursosHumanos.darDeAlta(nuevoDesarrollador);
					System.out.println(nuevoDesarrollador.toString());
					
				} else {
					System.out.println("la opcion no es correcta");
				}
				System.out.println("Se agrego el desarrollador");
				//Comprobar si aniadió el desarrollador
				System.out.println("\nLista de empleados(verificar si se anadió): ");
				TablaEmpleado.EMPLEADOS.stream().forEach(System.out::println);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("Saliendo del programa");
				band = true;
				break;
			default:
				System.out.println("INGRESO INCORRECTO");
				;
			}

		} while (band != true);
	}

	public static void menuDesarrolladores(Scanner sc, boolean esJefe, Desarrollador desarrollador) {
		boolean band = false;
		do {
			System.out.println("-1 - Salir del programa");
			System.out.println("1 – Tareas Asignadas");
			System.out.println("2 - Buscar proyecto por codigo");
			System.out.println("3 - Buscar una tarea por su código y modificar la observación de la misma o el estado");
			if (esJefe) {
				System.out.println("4 – Crear Proyecto");
				System.out.println("5 - Crear y asignar tarea");
			}
			int opc = sc.nextInt();
			switch (opc) {
			case -1:
				System.out.println("Saliendo del programa");
				band = true;
				break;
			case 1:

				desarrollador.listarTareasAsignadas();
				break;
			case 2:
				Proyecto encontrado = new Proyecto();
				System.out.println("Codigo de proyecto: ");
				int codigo = sc.nextInt();
				encontrado = desarrollador.buscarProyectoPorCodigo(codigo);
				if (encontrado == null) {
					System.out.println("El Proyecto no existe");
				} else {
					System.out.println(encontrado.toString());
				}
				break;
			case 3:
				System.out.println("Ingrese Codigo de tarea: ");
				int codigo1 = sc.nextInt();
				int posicion = desarrollador.buscarTareaPorCodigo(codigo1);
				if(posicion != -1) {
					System.out.println("Se encontró la tarea");
					sc.nextLine();
					Tarea ta = new Tarea();
					System.out.println("ingrese nueva observacion :");
					ta.setObservacion(sc.nextLine());
					
					boolean estado = false;
					int opc5;
					do {
						System.out.println("seleccione nuevo estado");
						System.out.println("1 - activo");
						System.out.println("2 - inactivo");
						opc5 = sc.nextInt();
						switch (opc5) {
						case 1:
							ta.setEstado("activo");
							estado = true;
							break;
						case 2:
							ta.setEstado("inactivo");
							estado = true;
							break;
						default:
							System.out.println("ingreso incorrecto");
							break;
						}
					} while (estado != true);
					desarrollador.modificarTarea(posicion, ta);
					TablaTarea.TAREAS.stream().forEach(System.out::println);
					TablaProyecto.PROYECTOS.stream().forEach(System.out::println);
				}else
					System.out.println("No se encontro la tarea");
				break;
			case 4:
				if (!esJefe) {
					System.out.println("acceso denegado");
				} else {
					Proyecto pr = new Proyecto();

					//DesarrolladorContratado emp = new DesarrolladorContratado();

					boolean seRepite = false;
					int c;
					do {//evitara que se añadan codigos ya existentes
						seRepite = false;
						System.out.println("ingrese codigo del proyecto");
						c =sc.nextInt();
						for (int i=0;i<TablaProyecto.PROYECTOS.size();i++) {
							if(TablaProyecto.PROYECTOS.get(i).getCodigo() == c) {
								seRepite = true;
							}
						}
					}while(seRepite==true);
					pr.setCodigo(c);
					
					System.out.println("ingrese nombre del proyecto");
					pr.setNombreProyecto(sc.next());
					
					//se añade el jefe de proyecto logueado
					pr.setJefeP(desarrollador); 
					
					// agregar integrantes
					
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
					System.out.println(
							"ingrese el numero de orden del empleado que va a formar parte de su proyecto");
					System.out.println(
							"(el primer empleado tendra numero de orden 0, el segundo 1 y asi sucesivamente)");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
					TablaEmpleado.EMPLEADOS.stream().forEach(System.out::println);
					boolean dou = true;
					List<Empleado> inte = new ArrayList<Empleado>();
					do {
						
						inte.add(TablaEmpleado.EMPLEADOS.get(sc.nextInt()));
						System.out.println("Desea agregar otro integrante ?");
						System.out.println("1)_Si");
						System.out.println("2)_No");
						if (sc.nextInt() != 1) {
							dou = false;
						}

					} while (dou == true);
					pr.setIntegrantes(inte);

					pr.setTareas(null);
					boolean estado1 = false;
					int opc6;
					do {
						System.out.println("seleccione un estado");
						System.out.println("1 - activo");
						System.out.println("2 - inactivo");
						opc6 = sc.nextInt();
						switch (opc6) {
						case 1:
							pr.setEstado("activo");
							estado1 = true;
							break;
						case 2:
							pr.setEstado("inactivo");
							estado1 = true;
							break;
						default:
							System.out.println("ingreso incorrecto");
							break;
						}
					} while (estado1 != true);
					System.out.println("ingrese porcentaje de avance del proyecto (int)");
					pr.setPorcentajeAvance(sc.nextInt());
					System.out.println("ingrese fecha de entrega  del proyecto");
					System.out.println("anio");
					int a = sc.nextInt();
					System.out.println("mes");
					int m = sc.nextInt();
					System.out.println("dia");
					int d = sc.nextInt();
					pr.setFechaEntrega(LocalDate.of(a, m, d));

					Desarrollador.crearProyecto(pr);

				}

				break;
			case 5:
				if (!esJefe) {
					System.out.println("acceso denegado");
				} else {
					
					Tarea tare = new Tarea();
					tare.setProyecto(TablaProyecto.PROYECTOS.get(0));
					boolean seRepite = false;
					int c;
					do {//evitara que se añadan codigos ya existentes
						seRepite = false;
						System.out.println("ingrese codigo de la tarea");
						c =sc.nextInt();
						for (int i=0;i<TablaTarea.TAREAS.size();i++) {
							if(TablaTarea.TAREAS.get(i).getCodigo() == c) {
								seRepite = true;
							}
						}
					}while(seRepite==true);

					tare.setCodigo(c);
					System.out.println("ingrese titulo de la tarea");
					tare.setTitulo(sc.next());
					tare.setFechaInicio(LocalDate.now());
					System.out.println("ingrese fecha de finalizacion de la tarea");
					System.out.println("anio");
					int a = sc.nextInt();
					System.out.println("mes");
					int m = sc.nextInt();
					System.out.println("dia");
					int d = sc.nextInt();
					tare.setFechaFin(LocalDate.of(a, m, d));
					sc.nextLine();	
					System.out.println("ingrese alguna observacion de la tarea");
					tare.setObservacion(sc.nextLine());
					sc.nextLine();						
					System.out.println("ingrese descripcion de la tarea");
					tare.setDescripcion(sc.nextLine());
					sc.nextLine();
					boolean estado1 = false;
					int opc6;
					do {
						System.out.println("seleccione un estado");
						System.out.println("1 - en curso");
						System.out.println("2 - en pausa");
						System.out.println("3 - finalizada");
						opc6 = sc.nextInt();
						switch (opc6) {
						case 1:
							tare.setEstado("en curso");
							estado1 = true;
							break;
						case 2:
							tare.setEstado("en pausa");
							estado1 = true;
							break;
						case 3:
							tare.setEstado("finalizada");
							estado1 = true;
							break;
						default:
							System.out.println("ingreso incorrecto");
							break;
						}
					} while (estado1 != true);
					
					sc.nextLine();
					System.out.println("------------------------*----------------------------");
					TablaEmpleado.EMPLEADOS.stream().forEach(System.out::println);
					System.out.println("------------------------*----------------------------");
					System.out
							.println("ingrese el numero de orden del empleado que se va a encargar de esta tarea");
					System.out.println(
							"(el primer empleado tendra numero de orden 0, el segundo 1 y asi sucesivamente)");
					tare.setResponsable(TablaEmpleado.EMPLEADOS.get(sc.nextInt()));
					System.out.println("===========================================================================");
					TablaProyecto.PROYECTOS.stream().forEach(System.out::println);
					System.out.println("ingrese el numero de orden del proyecto al que pertenece esta tarea");
					System.out.println("(el primer proyecto tendra numero de orden 0, el segundo 1 y asi sucesivamente)");
					
					tare.setProyecto(TablaProyecto.PROYECTOS.get(sc.nextInt()));
					Desarrollador.crearTarea(tare);

				}

				break;
			default:
				System.out.println("ingreso incorrecto");
			}

		} while (band != true);

	}
}