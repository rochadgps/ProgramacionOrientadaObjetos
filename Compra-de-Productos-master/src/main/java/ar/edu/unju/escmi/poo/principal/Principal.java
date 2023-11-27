package ar.edu.unju.escmi.poo.principal;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.dominio.Carrito;
import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Empresa;
import ar.edu.unju.escmi.poo.dominio.Linea1;
import ar.edu.unju.escmi.poo.dominio.Linea2;
import ar.edu.unju.escmi.poo.dominio.Particular;
import ar.edu.unju.escmi.poo.dominio.Persona;
import ar.edu.unju.escmi.poo.dominio.Plan;
import ar.edu.unju.escmi.poo.dominio.TarjetaDeCredito;
import ar.edu.unju.escmi.poo.tablas.TablaPersona;
import ar.edu.unju.escmi.poo.tablas.TablaPlan;
import ar.edu.unju.escmi.poo.tablas.TablaProducto;
import ar.edu.unju.escmi.poo.util.FechaUtil;
import ar.edu.unju.escmi.poo.util.IntUtil;
import ar.edu.unju.escmi.poo.util.LongUtil;

public class Principal {

	public static void main(String[] args) {
		TablaProducto.CargartablaProducto();
		TablaPersona.cargarPersonas();
		TablaProducto.productos.stream().forEach(System.out::println);
		TablaPersona.personas.stream().forEach(System.out::println);
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		do {

			boolean hayError;
			do {
				hayError = false;
				System.out.println("1 - Ingresar al programa");
				System.out.println("2 - Registrarse");
				System.out.println("3 - Salir");
				try {
					opc = IntUtil.pedirInt();
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Porfavor ingrese un numero entero \n");
					hayError = true;
				}
			} while (hayError);

			System.out.println("Presione Enter");
			switch (opc) {
			case 1:
				// boolean loguearse = false;
				Persona logeado;
				// do {
				logeado = login(sc);
				if (logeado != null) {
					seleccionarMenuCorrespondiente(logeado, sc);
				} else {
					System.out.println("No se accedio");
				}
				// } while (loguearse != true);
				break;
			case 2:
				registrar(sc);
				break;
			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
		} while (opc != 3);
	}

	public static Persona login(Scanner sc) {
		sc.nextLine();
		System.out.println("ingrese un nombre de usuario");
		String usuario = sc.next();
		sc.nextLine();
		System.out.println("ingrese su contraseña");

		String contrasena = sc.nextLine();
		System.out.println("Presione Enter");
		sc.nextLine();
		for (int i = 0; i < TablaPersona.personas.size(); i++) {
			if (TablaPersona.personas.get(i).getUsuario().compareTo(usuario) == 0
					&& TablaPersona.personas.get(i).getContrasenia().compareTo(contrasena) == 0) {
				Persona personaAutenticada = TablaPersona.personas.get(i);
				return personaAutenticada;
			}

		}
		return null;
	}

	public static void registrar(Scanner sc) {
		boolean registro = false;
		do {
			
			int opc = 0;
			boolean hayError;
			do {
				hayError = false;
				System.out.println("¿Como desea registrarse?");
				System.out.println("1 - Empleado");
				System.out.println("2 - Cliente Particular");
				System.out.println("3 - Empresa");
				try {
					opc = IntUtil.pedirInt();
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("ingrese un numero entero \n");
					hayError = true;
				}
			} while (hayError);
			
			switch (opc) {
			case 1:
				Empleado e1 = new Empleado();
				System.out.println("Ingrese nombre de usuario: ");
				e1.setUsuario(sc.next());
				sc.nextLine();
				System.out.println("Ingrese contraseña: ");
				e1.setContrasenia(sc.nextLine());
				sc.nextLine();
				System.out.println("Ingrese nombre");
				e1.setNombre(sc.next());
				sc.nextLine();
				System.out.println("Ingrese apellido");
				e1.setApellido(sc.next());
				sc.nextLine();
				
				long dni = 0;
				do {
					hayError = false;
					System.out.println("Ingrese DNI");
					try {
						dni = LongUtil.pedirLong();
					} catch (Exception e) {
						System.out.println(e.toString());
						System.out.println("ingrese un numero entero \n");
						hayError = true;
					}
				} while (hayError);
				e1.setDni(dni);
				
				TablaPersona.personas.add(e1);
				System.out.println("se agrego correctamente");
				registro = true;
				break;
			case 2:
				Particular p1 = new Particular();
				System.out.println("Ingrese nombre de usuario: ");
				p1.setUsuario(sc.next());
				sc.nextLine();
				System.out.println("Ingrese contraseña: ");
				p1.setContrasenia(sc.nextLine());
				sc.nextLine();
				System.out.println("Ingrese nombre");
				p1.setNombre(sc.next());
				sc.nextLine();
				System.out.println("Ingrese apellido");
				p1.setApellido(sc.next());
				sc.nextLine();
				
				dni= 0;
				do {
					hayError = false;
					System.out.println("Ingrese DNI");
					try {
						dni = LongUtil.pedirLong();
					} catch (Exception e) {
						System.out.println(e.toString());
						System.out.println("ingrese un numero entero \n");
						hayError = true;
					}
				} while (hayError);
				p1.setDni(dni);
				
				TablaPersona.personas.add(p1);
				System.out.println("se agrego correctamente");
				registro = true;
				break;
			case 3:
				Empresa em1 = new Empresa();
				System.out.println("Ingrese nombre de usuario: ");
				em1.setUsuario(sc.next());
				sc.nextLine();
				System.out.println("Ingrese contraseña: ");
				em1.setContrasenia(sc.nextLine());
				sc.nextLine();
				System.out.println("Ingrese razon social");
				em1.setRazonSocial(sc.nextLine());
				
				dni= 0;
				do {
					hayError = false;
					System.out.println("Ingrese DNI");
					try {
						dni = LongUtil.pedirLong();
					} catch (Exception e) {
						System.out.println(e.toString());
						System.out.println("ingrese un numero entero \n");
						hayError = true;
					}
				} while (hayError);
				
				em1.setDni(dni);
				
				TablaPersona.personas.add(em1);
				
				System.out.println("se agrego correctamente");
				registro = true;
				break;
			default:
				System.out.println("ingreso incorrecto");
				break;
			}

		} while (registro != true);

	}

	public static void seleccionarMenuCorrespondiente(Persona logeado, Scanner sc) {
		if (logeado instanceof Particular || logeado instanceof Empresa) {
			System.out.println("Menu del Cliente");
			menuCliente(sc, logeado);
		} else {
			System.out.println("Menu del empleado");
			menuEmpleado(sc, (Empleado) logeado);
		}

	}

	public static void menuCliente(Scanner sc, Persona logeado) {
		int opc = 0;
		do {

			boolean hayError;
			do {
				hayError = false;
				System.out.println("1 - Seleccionar y comprar productos");
				System.out.println("2 - Informacion del cliente");
				System.out.println("3 - Pagar cuotas pendientes");
				System.out.println("4 - Salir");
				try {
					opc = IntUtil.pedirInt();
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Porfavor ingrese un numero entero \n");
					hayError = true;
				}
			} while (hayError);

			System.out.println("Presione Enter");
			switch (opc) {
			case 1:
				List<Carrito> carrito = new ArrayList<Carrito>();
				for (int i = 0; i < TablaProducto.productos.size(); i++) {
					System.out.println(i + " - " + TablaProducto.productos.get(i).getTipo() + " Marca: "
							+ TablaProducto.productos.get(i).getMarca() + " Modelo: "
							+ TablaProducto.productos.get(i).getModelo() + " Precio: "
							+ TablaProducto.productos.get(i).getPrecio());

				}
				boolean retenAgregar = false;

				if (logeado instanceof Particular) {
					System.out.println("Recuerde que solo tiene un credito de 200.000$");
				} else {
					System.out.println("Recuerde que solo tiene un credito de 500.000$");
				}
				do {
					double precioTotal = 0;
					Carrito aux = new Carrito();
					for (int i = 0; i < carrito.size(); i++) {
						precioTotal = precioTotal + (carrito.get(i).getPrecio() * carrito.get(i).getCantidad());
					}
					System.out.println("Total: " + precioTotal + "$");

					int opc1 = 0;
					do {
						hayError = false;
						System.out.println("¿Desea agregar un producto a su carrito?");
						System.out.println("1 - Si");
						System.out.println("2 - No");
						try {
							opc1 = IntUtil.pedirInt();
						} catch (Exception e) {
							System.out.println(e.toString());
							System.out.println("Porfavor ingrese un numero entero \n");
							hayError = true;
						}
					} while (hayError);

					Plan compra = new Plan();
					switch (opc1) {
					case 1:
						double precioTotalAux = precioTotal;

						int aux1 = 0;
						do {
							do {// primero se controla el ingreso de valores enteros
								hayError = false;
								System.out.println("ingrese el nro correspondiente al producto que desee comprar: ");
								try {
									aux1 = IntUtil.pedirInt();
								} catch (Exception e) {
									System.out.println(e.toString());
									System.out.println("Porfavor ingrese un numero entero \n");
									hayError = true;
								}
							} while (hayError);

							try {// luego no se permitirá acceder a una posicion del ArrayList que no exista
								aux.setModelo(TablaProducto.productos.get(aux1).getModelo());
							} catch (Exception e) {
								System.out.println(e.toString());
								System.out.println("Solo numeros permitidos\n");
								hayError = true;
							}
						} while (hayError);
						// funcinó correctamente

						int cantidad = 0;
						do {
							hayError = false;
							System.out.println("ingrese la cantidad que desee comprar: ");
							try {
								cantidad = IntUtil.pedirInt();
							} catch (Exception e) {
								System.out.println(e.toString());
								System.out.println("Porfavor ingrese un numero entero \n");
								hayError = true;
							}
						} while (hayError);
						aux.setCantidad(cantidad);

						aux.setPrecio(TablaProducto.productos.get(aux1).getPrecio());
						if (logeado instanceof Particular) {
							if (precioTotalAux + (aux.getPrecio() * aux.getCantidad()) > Linea1.LIMITE_CREDITO) {
								System.out.println(
										"No se pueden agregar lo solicitado ya que se supero el credito permitido");
							} else {
								carrito.add(aux);
							}
						} else {
							if (precioTotalAux + (aux.getPrecio() * aux.getCantidad()) > Linea2.LIMITE_CREDITO) {
								System.out.println(
										"No se pueden agregar lo solicitado ya que se supero el credito permitido");
							} else {
								carrito.add(aux);
							}
						}

						retenAgregar = false;
						break;
					case 2:
						if (carrito.isEmpty()) {
							
							System.out.println("No agrego productos a su carrito");
							return;
						} else {
							System.out.println("Su carrito fue realizado con exito");
							System.out.println("¿Desea comprar estos productos?");

							carrito.stream().forEach(c -> System.out
									.println("Modelo: " + c.getModelo() + " Cantidad: " + c.getCantidad()));

							int opc2 = 0;
							do {
								hayError = false;
								System.out.println("1 - Si");
								System.out.println("2 - No");
								try {
									opc2 = IntUtil.pedirInt();
								} catch (Exception e) {
									System.out.println(e.toString());
									System.out.println("Porfavor ingrese un numero entero \n");
									hayError = true;
								}
							} while (hayError);

							switch (opc2) {
							case 1:
								TarjetaDeCredito tarjeta = new TarjetaDeCredito();

								long numero = 0;
								do {
									hayError = false;
									System.out.println("Ingrese numero de su tarjeta: ");
									try {
										numero = LongUtil.pedirLong();
									} catch (Exception e) {
										System.out.println(e.toString());
										System.out.println("Porfavor ingrese un numero de 16 digitos \n");
										hayError = true;
									}
								} while (hayError);
								tarjeta.setNumTarjeta(numero);

								tarjeta.setNombreTitular(logeado.getUsuario());

								boolean retenBanco = false;
								do {
									int opcBanco = 0;
									do {
										hayError = false;
										System.out.println("Seleccione el Banco: ");
										System.out.println("1 - Macro");
										System.out.println("2 - MasterCard");
										System.out.println("3 - Galicia");
										try {
											opcBanco = IntUtil.pedirInt();
										} catch (Exception e) {
											System.out.println(e.toString());
											System.out.println("Porfavor ingrese un numero entero\n");
											hayError = true;
										}
									} while (hayError);

									switch (opcBanco) {
									case 1:
										tarjeta.setBanco("Macro");
										retenBanco = true;
										break;
									case 2:
										tarjeta.setBanco("MasterCard");
										retenBanco = true;
										break;
									case 3:
										tarjeta.setBanco("Galicia");
										retenBanco = true;
										break;
									default:
										System.out.println("Ingreso Incorrecto");
										retenBanco = false;
										break;
									}
								} while (retenBanco != true);

								do {
									hayError = true;
									System.out.println("Ingrese fecha de expiración [dd/MM/yyyy]");
									String fechaExp = sc.next();
									LocalDate fechaActual = LocalDate.now();
									try {
										LocalDate fechaNueva = FechaUtil.convertirStringLocalDate(fechaExp);
										if (fechaNueva.compareTo(fechaActual) <= 0) {
											System.out.println(
													"No se puede poner una fecha anterior a la del dia vigente");
											hayError = false;
										} else {
											tarjeta.setFechaExpiracion(fechaNueva);
										}
									} catch (Exception e) {
										System.out.println(e.getMessage());
										hayError = false;
									}
								} while (!hayError);

								boolean retenCodSeguridad = false;
								do {
									int codSeguridad = 0;
									do {
										hayError = false;
										System.out.println("Ingrese codigo de seguridad: ");
										try {
											codSeguridad = IntUtil.pedirInt();
										} catch (Exception e) {
											System.out.println(e.toString());
											System.out.println("Solo numero entero\n");
											hayError = true;
										}
									} while (hayError);
									
									if (codSeguridad > 1000 || codSeguridad < 99) {
										System.out.println(
												"El codigo ingresado no contiene tres digitos, intente nuevamente");
										retenCodSeguridad = false;
									} else {
										tarjeta.setCodSeguridad(codSeguridad);
										retenCodSeguridad = true;
									}
								} while (retenCodSeguridad != true);
								
								compra.setTarjeta(tarjeta);
								double cuota;
								if (logeado instanceof Particular) {
									System.out
											.println("Su unica opcion para efectuar la compra es un plan de 24 cuotas");
									cuota = precioTotal / Linea1.LIMITE_CUOTAS;
									compra.setMontoPorCuota(cuota);
									compra.setMontoTotal(precioTotal);
									compra.setCantCuotas(Linea1.LIMITE_CUOTAS);
								} else {
									System.out
											.println("Su unica opcion para efectuar la compra es un plan de 12 cuotas");
									cuota = precioTotal / Linea2.LIMITE_CUOTAS;
									compra.setMontoPorCuota(cuota + (cuota / 100 * 20));
									compra.setMontoTotal(precioTotal + (precioTotal / 100 * 20));
									compra.setCantCuotas(Linea2.LIMITE_CUOTAS);
								}
								compra.setCarritos(carrito);
								// dar formato de 2 digitos despues de la coma
								DecimalFormat formato1 = new DecimalFormat("#.00");
								System.out
										.println("Usted pagara cuotas de: " + formato1.format(compra.getMontoPorCuota())
												+ "$ por " + compra.getCantCuotas() + " meses");
								System.out.println(
										"El precio final es de " + formato1.format(compra.getMontoTotal()) + "$");
								compra.setTitular(logeado.getUsuario());
								
								
								int opc4 = 0;
								do {
									hayError = false;
									System.out.println("¿Desea finalizar su compra?");
									System.out.println("1 - Si");
									System.out.println("2 - No");
									try {
										opc4 = IntUtil.pedirInt();
									} catch (Exception e) {
										System.out.println(e.toString());
										System.out.println("Solo numero entero\n");
										hayError = true;
									}
								} while (hayError);
								
								switch (opc4) {
								case 1:
									// Controlo que el cliente no compre mas del stock de la empresa
									for (int i = 0; i < TablaProducto.productos.size(); i++) {
										for (int o = 0; o < carrito.size(); o++) {
											if (carrito.get(o).getModelo() == TablaProducto.productos.get(i).getModelo()
													&& carrito.get(o).getCantidad() > TablaProducto.productos.get(o)
															.getStock()) {
												System.out.println(
														"Un producto seleccionado supera la cantidad en stock");
												System.out.println("Su compra ha sido rechazada");
												o = carrito.size();
												i = TablaProducto.productos.size();
											} else {
												if (logeado instanceof Particular) {
													((Particular) logeado).crearPlan(compra);
												} else {
													((Empresa) logeado).crearPlan(compra);
												}
												o = carrito.size();
												i = TablaProducto.productos.size();
												System.out.println("Su compra ha sido finalizada");
											}
										}
									}
									break;
								case 2:
									System.out.println("La compra ha sido anulada");
									break;
								default:
									System.out.println("opcion incorrecta");
									break;
								}

								TablaPlan.planes.stream().forEach(System.out::println);
								break;
							case 2:
								System.out.println("Tenga un buen día");

								break;
							default:
								break;
							}
							retenAgregar = true;
						}
						break;
					default:
						System.out.println("opcion incorrecta");
						break;
					}
				} while (retenAgregar != true);

				break;
			case 2:
				if (logeado instanceof Particular) {

					((Particular) logeado).listarPlan(logeado);
				} else {
					((Empresa) logeado).listarPlan(logeado);
				}
				break;
			case 3:
				if (logeado instanceof Particular) {
					((Particular) logeado).pagarCuota(logeado);
				} else {
					((Empresa) logeado).pagarCuota(logeado);
				}
				break;
			default:
				System.out.println("ingreso incorrecto");
				break;
			}
		} while (opc != 4);
	}

	public static void menuEmpleado(Scanner sc, Empleado logeado) {
		int opc = 0;
		do {
			boolean hayError;
			
			do {
				hayError = false;
				System.out.println("1 - Cuotas Impagas");
				System.out.println("2 - Dinero Por Cobrar");
				System.out.println("3 - Cliente Que Menos Debe");
				System.out.println("4 - Salir");
				try {
					opc = IntUtil.pedirInt();
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Solo numero entero\n");
					hayError = true;
				}
			} while (hayError);
			
			switch (opc) {
			case 1:
				
				long dni = 0;
				do {
					hayError = false;
					System.out.println("Ingrese DNI del cliente");
					try {
						dni = LongUtil.pedirLong();
					} catch (Exception e) {
						System.out.println(e.toString());
						System.out.println("Solo numero entero\n");
						hayError = true;
					}
				} while (hayError);
				
				logeado.listarCuotasImpagas(dni);
				break;
			case 2:
				double monto = logeado.sumarMontoDePlanes(TablaPlan.planes);
				System.out.println("Monto por Ganar: " + monto);
				break;
			case 3:
				Plan plan = logeado.devolverClienteMenosEndeudado();
				System.out.println("Titular: " + plan.getTitular());
				System.out.println("Este cliente debe: " + plan.getMontoPorCuota() * plan.getCantCuotas());
				break;
			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
		} while (opc!=4);
	}
}
