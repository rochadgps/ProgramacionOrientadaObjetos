package ar.edu.unju.escminas.poo.principal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.escminas.poo.dominio.OrganismoProvincial;
import ar.edu.unju.escminas.poo.dominio.Parque;
import ar.edu.unju.escminas.poo.dominio.Provincia;
import ar.edu.unju.escminas.poo.dominio.Usuario;
import ar.edu.unju.escminas.poo.dominio.Vegetal;
import ar.edu.unju.escminas.poo.tablas.TablaOrganismo;
import ar.edu.unju.escminas.poo.tablas.TablaParque;
import ar.edu.unju.escminas.poo.tablas.TablaProvincia;
import ar.edu.unju.escminas.poo.tablas.TablaUsuario;
import ar.edu.unju.escminas.poo.util.DoubleUtil;
import ar.edu.unju.escminas.poo.util.EspecieUtil;
import ar.edu.unju.escminas.poo.util.FechaUtil;
import ar.edu.unju.escminas.poo.util.IntUtil;
import ar.edu.unju.escminas.poo.dominio.Animal;
import ar.edu.unju.escminas.poo.dominio.Especie;
import ar.edu.unju.escminas.poo.dominio.Mineral;
import ar.edu.unju.escminas.poo.dominio.Administrativo;

public class Principal {

	public static void main(String[] args) throws Exception {

		Scanner lector = new Scanner(System.in);
		// usuarios en un arraylist donde guardo objetos Usuario//

		// CARGAMOS UNOS CUANTOS USUARIOS//
		TablaUsuario.cargarUsuarios();

		// CARGAMOS UNAS CUANTAS PROVINCIAS
		TablaProvincia.cargarProvincias();

		// ORGANISMOS
		TablaOrganismo.cargarOrganismos();

		// PARQUES
		TablaParque.cargarParques();

		// esta logica ver si la dejamos o aplicamos otra
		TablaProvincia.PROVINCIAS.get(0).setParques(TablaParque.PARQUES);
		TablaProvincia.PROVINCIAS.get(1).setParques(TablaParque.PARQUES);
		TablaProvincia.PROVINCIAS.get(2).setParques(TablaParque.PARQUES);
		TablaProvincia.PROVINCIAS.get(3).setParques(TablaParque.PARQUES);
		TablaProvincia.PROVINCIAS.get(4).setParques(TablaParque.PARQUES);

		// LOGGEO
		int cantidadUsuarios = TablaUsuario.USUARIOS.size();
		boolean loggeado = false;
		int posicionEncontrado;

		do {
			System.out.print("Usuario: ");
			String u = lector.next();
			System.out.print("Contraseña: ");
			String c = lector.next();

			for (posicionEncontrado = 0; posicionEncontrado < cantidadUsuarios
					&& loggeado == false; posicionEncontrado++) {
				if (u.equals(TablaUsuario.USUARIOS.get(posicionEncontrado).getUsuario())
						&& (c.equals(TablaUsuario.USUARIOS.get(posicionEncontrado).getContrasenia()))) {
					loggeado = true;
				}

			}
			posicionEncontrado--;
			if (loggeado == true) {
				System.out.println("USUARIO LOGGEADO!" + "\n");
				if (TablaUsuario.USUARIOS.get(posicionEncontrado) instanceof Administrativo) {
					System.out.println(
							"ADMINISTRATIVO: " + TablaUsuario.USUARIOS.get(posicionEncontrado).getUsuario() + "\n");
					System.out.println(LocalDate.now());
					menuAdministrativo(TablaParque.PARQUES, TablaProvincia.PROVINCIAS, TablaOrganismo.ORGANISMOS);
					loggeado = false;
				} else {

					System.out.println(
							"SECRETARIO: " + TablaUsuario.USUARIOS.get(posicionEncontrado).getUsuario() + "\n");
					System.out.println(LocalDate.now());
					menuSecretario(TablaParque.PARQUES, TablaProvincia.PROVINCIAS, TablaOrganismo.ORGANISMOS);
					loggeado = false;
				}
			} else
				System.out.println("Usuario o contraseña incorrecta. Vuelva a intentar" + "\n");
		} while (loggeado == false);

	}

	// PROCEDIMIENTO menu secretario
	public static void menuSecretario(List<Parque> parques, List<Provincia> provincias,
			List<OrganismoProvincial> organismos) {

		Scanner lector = new Scanner(System.in);
		int opc1 = 0;
		do {
			System.out.println("1. Lista de parques por provincias");
			System.out.println("2.Listas de especies"); // mostrar sus atributos y cantidad por cada especie
			System.out.println("3.Listas de parques con mas de 10 años");
			System.out.println("4.Listas de organismos ordenados alfabeticamente");
			System.out.println("5.salir");

			try {
				opc1 = IntUtil.pedirInt();
				
			}catch(Exception e) {
				System.out.println("\n");
				System.out.println(e.toString());
				System.out.println("Porfavor ingrese un numero entero \n");
			}

			switch (opc1) {
			case 1:
				Scanner lector2 = new Scanner(System.in);

				System.out.println("Ingrese nombre de la provincia (La primera letra en mayusculas)");
				String nombreProvincia = lector2.nextLine();
				for (Provincia pro : provincias) {
					if (nombreProvincia.equals(pro.getNombre())) {
						pro.getParques().forEach(e -> {
							if (e.getUbicacionGeografica().equals(nombreProvincia)) {
								System.out.println("codigo: " + e.getCodigo());
								System.out.println("nombre: " + e.getNombre());
								System.out.println("extension: " + e.getExtension());
								System.out.println("fecha declaracion: " + e.getFecha().toString());

							}
						});

						break;
					}
				}

				break;

			case 2:
				Scanner lector3 = new Scanner(System.in);
				Integer nombreParque = 0;
				System.out.println("ingrese codigo del parque");
				
				boolean b=true;
				do {
				try {
					nombreParque = IntUtil.pedirInt();
					b=true;
				}catch(Exception e) {
					System.out.println("\n");
					System.out.println(e.toString());
					System.out.println("Porfavor ingrese un numero entero \n");
					b=false;
				}
				}while(b==false);
				

				int contA = 0, contM = 0, contV = 0;
				for (Parque aParque : parques) {
					if (aParque.getCodigo() == nombreParque) {
						for (Especie e : aParque.getEspecies()) {
							if (e instanceof Animal) {
								Animal animal = (Animal) e;
								System.out.println("animal n° " + e.getCodigo());
								System.out.println(animal.getDenominacionVulgar());
								contA += 1;

							}
							if (e instanceof Vegetal) {

								Vegetal vegetal = (Vegetal) e;
								System.out.println("vegetal n° " + e.getCodigo());
								System.out.println(vegetal.getDenominacionVulgar());
								contV += 1;
							}
							if (e instanceof Mineral) {

								Mineral mineral = (Mineral) e;
								System.out.println("mineral n° " + e.getCodigo());
								System.out.println(mineral.getDenominacionVulgar());
								contM += 1;
							}
						}

						System.out.println("cantidad de animales = " + contA);
						System.out.println("cantidad de vegetales = " + contV);
						System.out.println("cantidad de minerales = " + contM);
					}
				}
				break;
			case 3:
				for (Parque aParque : parques) {

					if (LocalDate.now().getYear() >= (aParque.getFecha().getYear() + 10)) {
						//System.out.println(aParque.getFecha().toString());
						System.out.println("nombre: "+aParque.getNombre().toString()+" fecha de ingreso: "+aParque.getFecha().toString());
					}
				}
				break;

			case 4:
				Collections.sort(organismos,
						(elemento1, elemento2) -> elemento1.getNombre().compareTo(elemento2.getNombre()));
				for (OrganismoProvincial org : organismos) {
					System.out.println(org.getNombre());
				}
				break;

			}
		} while (opc1 != 5);
	}

	// procedimiento menu administrativo
	public static void menuAdministrativo(List<Parque> parques, List<Provincia> provincias, List<OrganismoProvincial> organismos) throws Exception {
		Scanner lector = new Scanner(System.in);

		int opc = 0;

		Parque auxParque = new Parque();
		Provincia auxProvincia = new Provincia();

		OrganismoProvincial auxOrganismo = new OrganismoProvincial();

		Especie auxEspecie = new Especie();

		do {
			System.out.println("1. Alta de parques");
			System.out.println("2. Alta de provincias");
			System.out.println("3. Alta de organismos");
			System.out.println("4. salir");
			try {
				opc = IntUtil.pedirInt();
			}catch(Exception e) {
				System.out.println("\n");
				System.out.println(e.toString());
				System.out.println("Porfavor ingrese un numero entero \n");
			}

			switch (opc) {
			case 1:
				Scanner lector2 = new Scanner(System.in);
				boolean seRepite;
				int cod;
				do {// evitara que se añadan parques ya existentes
					seRepite = false;
					boolean bandera;
					do {
						bandera = true;
						System.out.println("1. Ingrese codigo del parque");
						cod=0;
						try {
							cod = IntUtil.pedirInt();
						}catch(Exception e) {
							System.out.println(e.toString());
							System.out.println("Porfavor ingrese un numero entero \n");
							bandera = false;
						}
					} while (!bandera);
					
					for (int i = 0; i < TablaParque.PARQUES.size(); i++) {
						if (TablaParque.PARQUES.get(i).getCodigo() == cod) {
							seRepite = true;
							System.out.println("codigo ya existente, intente nuevamente");
						}
					}
				} while (seRepite == true);
				auxParque.setCodigo(cod);

				System.out.println("2. Ingrese nombre del parque");
				auxParque.setNombre(lector2.nextLine());

				boolean bandera;
				do {
					bandera = true;
					System.out.println("3. Ingrese fecha de inaguracion [dd/MM/yyyy]");
					String fecha = lector2.nextLine();
					// convertir a un objeto LocalDate

					try {
						LocalDate fechaNueva = FechaUtil.convertirStringLocalDate(fecha);
						auxParque.setFecha(fechaNueva);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						bandera = false;
						// sc.next();
					}
				} while (!bandera);
				System.out.println("La fecha fue ingresada correctamente, continuamos....");

				do {
					bandera = true;
					System.out.println("4. Ingrese extension del parque");
					try {
						double ext = DoubleUtil.pedirDouble();
						auxParque.setExtension((ext));
					}catch(Exception e) {
						System.out.println(e.toString());
						System.out.println("Porfavor ingrese un numero de tipo double valido \n");
						bandera = false;
					}
				} while (!bandera);

				//la ubicacion geografica se asigna mas abajo
				//System.out.println("5. Ingrese ubicacion geografica");
				//auxParque.setUbicacionGeografica(lector2.nextLine());

				//TODO falta una opcion de no
				System.out.println("Desea agregar especies? ");
				String respuesta = lector2.nextLine();
				while (respuesta.equalsIgnoreCase("si")) {
					//TODO falta una excepcion
					int respuesta2=0;
					boolean band;
					do {//se controla que respuesta2 sólo admita los valores enteros del 1 al 3
						band = true;
						do {//respuesta2 sólo podrá almacenar valores enteros
							bandera = true;
							System.out.println("1. Animal \n2. Vegetal \n3. Mineral");
							try {
								respuesta2 = IntUtil.pedirInt();
							}catch(Exception e) {
								System.out.println(e.toString());
								System.out.println("Porfavor ingrese un numero entero \n");
								bandera = false;
							}
						} while (!bandera);
						switch(respuesta2) {
						case 1:
							auxEspecie = new Animal();
							break;
						case 2:
							auxEspecie = new Vegetal();
							break;
						case 3:
							auxEspecie = new Mineral();
							break;
						default:
							System.out.println("Opcion invalida");
							band = false;
							break;
						}
					}while(!band);
					
					cod=0;
					do {
						seRepite = false;
						do {//cod sólo podrá almacenar valores enteros
							bandera = true;
							System.out.println("1. Ingrese codigo de la especie");
							try {
								cod = IntUtil.pedirInt();
							}catch(Exception e) {
								System.out.println(e.toString());
								System.out.println("Porfavor ingrese un numero entero \n");
								bandera = false;
							}
						} while (!bandera);
						if(auxParque.getEspecies().isEmpty())
							auxEspecie.setCodigo(cod);
						else {
							for(int i=0;i<auxParque.getEspecies().size();i++) {
								if (auxParque.getEspecies().get(i).getCodigo() == cod) {
									seRepite = true;
									System.out.println("codigo ya existente");
								}
							}
						}
					}while(seRepite == true);

					auxEspecie.setCodigo(cod);

					System.out.println("2. Ingrese denominacion cientifica de la especie");
					auxEspecie.setDenominacionCientifica(lector2.nextLine());
					
					System.out.println("3. Ingrese denominacion vulgar de la especie");
					auxEspecie.setDenominacionVulgar(lector2.nextLine());

					if (auxEspecie instanceof Animal) {
						System.out.println("4. Ingrese tipo de alimentacion del animal");
						((Animal) auxEspecie).setTipoAlimentacion(lector2.nextLine());
						System.out.println("5. Ingrese periodo de celo");
						((Animal) auxEspecie).setPeriodoCelo(lector2.nextLine());
						System.out.println("6. Esta en peligro de extincion ?");
						((Animal) auxEspecie).setPeligroExtincion(lector2.nextLine().equalsIgnoreCase("si"));
					}
					if (auxEspecie instanceof Vegetal) {
						System.out.println("4. tiene floracion? ");
						((Vegetal) auxEspecie).setFloracion(lector2.nextLine().equalsIgnoreCase("si"));
						System.out.println("5. Ingrese periodo de floracion ");
						((Vegetal) auxEspecie).setPeriodo(lector2.nextLine());
					}
					if (auxEspecie instanceof Mineral) {
						System.out.println("4. Ingrese tipo de mineral");
						((Mineral) auxEspecie).setTipoMineral(lector2.nextLine());
					}
					
					auxParque.getEspecies().add(auxEspecie);

					System.out.println("Desea seguir agregando especies ?");
					respuesta = lector2.nextLine();

				}
				auxParque.getEspecies().stream().forEach(System.out::println);
				//se añade parque a la tabla parques
				parques.add(auxParque);
				int pos=0;
				boolean hayError;
				do {
					do {
						hayError = false;
						System.out.println("Selecciona la posicion de la provincia(ubicacion geografica) a la que se va a añadir el parque");
						for(int i=0;i<provincias.size();i++) {
							System.out.println(i+")_"+provincias.get(i).getNombre());
						}
						try {
							pos = IntUtil.pedirInt();
						}catch(Exception e) {
							System.out.println(e.toString());
							System.out.println("Porfavor ingrese un numero entero \n");
							hayError=true;
						}
					}while(hayError);
				}while(!(pos>=0 && pos<provincias.size()));//controlo que pos esté dentro del rango de provincias creadas
				auxParque.setUbicacionGeografica(provincias.get(pos).getNombre());
				//provincias.get(pos).getParques().add(auxParque);
				//podriamos conectar el parque a un organismo provincial
				//o bien cortar la dependencia que existe entre parque y organismo
				
				break;
				

			case 2:
				System.out.println("1. Ingrese Iso de la provincia: ");
				auxProvincia.setIsoProvincia(lector.next());

				System.out.println("2. Ingrese nombre de la provincia: ");
				auxProvincia.setNombre(lector.next());
				//se añade la provincia a su tabla
				provincias.add(auxProvincia);
				break;
				
			case 3:
				Scanner lector3 = new Scanner(System.in);

				System.out.println("1. Ingrese nombre del organismo: ");
				auxOrganismo.setNombre(lector3.next());

				System.out.println("2. Ingrese direcion del organismo: ");
				auxOrganismo.setDireccion(lector3.next());

				System.out.println("3. Ingrese director del organismo: ");
				auxOrganismo.setDirector(lector3.next());

				System.out.println("4. Ingrese provincia a la cual pertenece: ");
				String auxNombreProvincia = lector3.next();
				Provincia auxP = new Provincia();

				int i = 1;
				for (Provincia pr : provincias) {
					if (auxNombreProvincia.equals(pr.getNombre())) {
						auxP = pr;
						break;
					}
				}
				//se añade el organismo a la tabla
				organismos.add(auxOrganismo);
				break;

			}
		} while (opc != 4);
	
	}
		
}
