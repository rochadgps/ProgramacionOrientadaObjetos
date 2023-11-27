package ar.edu.unju.escmi.poo.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.dominio.Alumno;
import ar.edu.unju.escmi.poo.dominio.Materia;
import ar.edu.unju.escmi.poo.dominio.Nota;
import ar.edu.unju.escmi.poo.dominio.Preceptor;
import ar.edu.unju.escmi.poo.tablas.TablaAlumno;
import ar.edu.unju.escmi.poo.tablas.TablaMateria;
import ar.edu.unju.escmi.poo.tablas.TablaNota;
import ar.edu.unju.escmi.poo.tablas.TablaPreceptor;

public class Principal {
	public static int contadorNota = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TablaMateria.cargarMaterias();
		TablaNota.cargarNotas();
		TablaAlumno.cargarAlumnos();
		TablaPreceptor.cargarPreceptores();

		Scanner sc = new Scanner(System.in);
		Preceptor logeado;// solo el preceptor se logea
		boolean band = false;
		do {
			logeado = login(sc);
			if (logeado != null) {
				menu(logeado, sc);
			} else {
				System.out.println("No se accedio");
			}
		} while (band != true);
	}

	public static Preceptor login(Scanner sc) {
		sc.nextLine();
		System.out.println("ingrese nombre de usuario");
		String usuario = sc.next();
		sc.nextLine();
		System.out.println("ingrese contraseña");
		String contrasena = sc.nextLine();
		for (int i = 0; i < TablaPreceptor.PRECEPTORES.size(); i++) {
			if (TablaPreceptor.PRECEPTORES.get(i).getNombreUsuario().compareTo(usuario) == 0
					&& TablaPreceptor.PRECEPTORES.get(i).getContrasena().compareTo(contrasena) == 0) {
				Preceptor logeado = TablaPreceptor.PRECEPTORES.get(i);
				return logeado;
			}
		}
		return null;
	}

	public static void menu(Preceptor preceptor, Scanner sc) {
		boolean salir = false;
		do {
			System.out.println("1 - Dar de Alta un Alumno");
			System.out.println("2 - Buscar alumno (por dni) y asignarle notas");
			System.out.println("3 - Buscar un alumno ingresando su dni y, mostrar promedio y nota mas alta");
			System.out.println("4 - Listar de alumnos con sus notas");
			System.out.println("5 - Listar materias ingresando el curso");
			System.out.println("6 - Cerrar Sesion");
			int opc = sc.nextInt();

			switch (opc) {
			case 1:
				Alumno alumno = new Alumno();

				System.out.println("Nuevo ALUMNO");
				System.out.println("Ingrese nombre:");
				sc.nextLine();
				alumno.setNombre(sc.nextLine());
				sc.nextLine();
				System.out.println("Ingrese apellido:");
				alumno.setApellido(sc.nextLine());

				boolean seRepite = false;
				long dni;
				do {// evitara que se añadan dnis ya existentes
					seRepite = false;
					System.out.println("Ingrese dni:");
					dni = sc.nextLong();
					for (int i = 0; i < TablaAlumno.ALUMNOS.size(); i++) {
						if (TablaAlumno.ALUMNOS.get(i).getDni() == dni) {
							seRepite = true;
							System.out.println("DNI ya ingresado, ingrese uno distinto");
						}
					}
				} while (seRepite == true);
				alumno.setDni(dni);

				System.out.println("Ingrese curso:");
				boolean cur = true;
				int opc2;
				do {
					System.out.println("1 - Primero");
					System.out.println("2 - Segundo");
					System.out.println("3 - Tercero");
					System.out.println("4 - Cuarto");
					System.out.println("5 - Quinto");
					opc2 = sc.nextInt();
					switch (opc2) {
					case 1:
						alumno.setCurso("primero");
						cur = true;
						break;
					case 2:
						alumno.setCurso("segundo");
						cur = true;
						break;
					case 3:
						alumno.setCurso("tercero");
						cur = true;
						break;
					case 4:
						alumno.setCurso("cuarto");
						cur = true;
						break;
					case 5:
						alumno.setCurso("quinto");
						cur = true;
						break;
					default:
						System.out.println("opcion invalida");
						break;
					}
				} while (cur != true);

				System.out.println("ingrese fecha de Nacimiento: ");
				System.out.println("ingrese anio");
				int anio = sc.nextInt();
				System.out.println("ingrese mes");
				int mes = sc.nextInt();
				System.out.println("ingrese dia");
				int dia = sc.nextInt();
				alumno.setFechaNac(LocalDate.of(anio, mes, dia));
				List<Nota> nota = new ArrayList<Nota>();
				alumno.setNotas(nota);
				Preceptor.darDeAltaAlumno(alumno);

				break;
			case 2:
				boolean band = false;
				do {
					System.out.println("ingrese DNI del alumno: ");
					long dni1 = sc.nextLong();
					Alumno AlumnoEncontrado = Preceptor.buscarAlumnoPorDNI(dni1);
					for (int i = 0; i < TablaAlumno.ALUMNOS.size(); i++) {
						if (TablaAlumno.ALUMNOS.get(i).getDni() == dni1) {
							Nota nota1 = new Nota();
							contadorNota++;
							nota1.setOrden(contadorNota);
							boolean bandNota = false;
							do {
								System.out.println("ingrese nota (1-10): ");
								int notas = sc.nextInt();
								if (notas > 10 || notas < 0) {
									bandNota = false;
									System.out.println("La nota ingresada no se encuentra entre 1-10");
								} else {
									bandNota = true;
									nota1.setNota(notas);
								}

							} while (bandNota != true);

							nota1.setFechaNota(LocalDate.now());

							TablaMateria.MATERIAS.stream().forEach(System.out::println);
							boolean band1 = false;
							do {
								System.out.println("ingrese codigo de materia: ");
								int codMateria = sc.nextInt();
								Materia materiaEncontrada = Preceptor.buscarMateriaPorCodigo(codMateria);
								if (materiaEncontrada != null) {
									nota1.setMateria(materiaEncontrada);
									TablaAlumno.ALUMNOS.get(i).getNotas().add(nota1);
									band1 = true;
								} else {
									System.out.println("Materia inexistente, intente de nuevo");
									band1 = false;
								}
							} while (band1 != true);

							band = true;
						}

					}
					if (AlumnoEncontrado == null) {
						band = false;
						System.out.println("el dni no corresponde a ningun alumno");
					}
				} while (band != true);
				TablaAlumno.ALUMNOS.stream().forEach(System.out::println);

				break;
			case 3:
				System.out.println("Ingrese dni del alumno:");
				dni = sc.nextLong();
				Alumno alumno1 = Preceptor.buscarAlumnoPorDNI(dni);
				if (alumno1 == null) {
					System.out.println("El alumno no existe");
				} else {
					System.out.println(alumno1.toString());
					System.out.println("Promedio de Notas: " + alumno1.calcularPromedio());
					Nota masAlta = alumno1.buscarNotaMasAlta();
					System.out.println(
							"Nota Mas Alta: " + masAlta.getNota() + "(" + masAlta.getMateria().getNombre() + ")");
				}
				break;
			case 4:
				TablaAlumno.ALUMNOS.stream().forEach(System.out::println);
				break;
			case 5:
				System.out.println("Ingrese curso:");
				cur = true; // boolean
				String curso = "";
				do {
					System.out.println("1 - Primero");
					System.out.println("2 - Segundo");
					System.out.println("3 - Tercero");
					System.out.println("4 - Cuarto");
					System.out.println("5 - Quinto");
					opc2 = sc.nextInt();
					switch (opc2) {
					case 1:
						curso = "primero";
						cur = true;
						break;
					case 2:
						curso = "segundo";
						cur = true;
						break;
					case 3:
						curso = "tercero";
						cur = true;
						break;
					case 4:
						curso = "cuarto";
						cur = true;
						break;
					case 5:
						curso = "quinto";
						cur = true;
						break;
					default:
						System.out.println("opcion invalida");
						break;
					}
				} while (cur != true);
				List<Materia> materias = TablaMateria.mostrarMateriasPorCurso(curso);
				if (materias.isEmpty()) {
					System.out.println("No hay materias para " + curso);
				}
				materias.stream().forEach(System.out::println);
				break;
			case 6:
				salir = true;
				System.out.println("Saliendo de la sesion");
				break;
			default:
				System.out.println("INGRESO INCORRECTO");
				;
			}
		} while (salir != true);
	}
}
