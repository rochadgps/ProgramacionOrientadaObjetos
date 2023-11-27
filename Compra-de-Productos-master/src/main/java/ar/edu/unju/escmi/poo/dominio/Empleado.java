package ar.edu.unju.escmi.poo.dominio;

import java.util.List;

import ar.edu.unju.escmi.poo.tablas.TablaPersona;
import ar.edu.unju.escmi.poo.tablas.TablaPlan;

public class Empleado extends Persona{
	
	private String nombre;
	private String apellido;
	
	public Empleado() {
	}

	public Empleado(String usuario, String contrasenia, String nombre, String apellido,long dni) {
		super(usuario, contrasenia,dni);
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	
	public void listarCuotasImpagas(long dni) {
		for(int i=0;i<TablaPersona.personas.size();i++) {
			if(TablaPersona.personas.get(i).getDni()==dni) {
				if(TablaPersona.personas.get(i) instanceof Empleado) {
					System.out.println("El dni ingresado no pertenece a un cliente");
				}else {
					boolean tienePlan=false;
					String usuario = TablaPersona.personas.get(i).getUsuario();
					for(int j=0;j<TablaPlan.planes.size();j++) {
						if(TablaPlan.planes.get(j).getTitular()==usuario) {
							System.out.println("El usuario "+usuario+" debe " +
									TablaPlan.planes.get(j).getCantCuotas() + " cuotas.");
							tienePlan=true;
							break;
						}
					}
					if(!tienePlan)
						System.out.println("El cliente "+usuario+" no tiene un plan asignado.");
				}
				break;
			}
		}
	}
	
	public double sumarMontoDePlanes(List<Plan> planes) {
		double monto=0;
		if(!planes.isEmpty()) {
			for(int i=0;i<planes.size();i++) {
				if(planes.get(i).getCantCuotas()>0) {
					monto = monto + planes.get(i).getMontoPorCuota() * planes.get(i).getCantCuotas() ;
				}
			}
		}
		return monto;
	}
	
	public Plan devolverClienteMenosEndeudado() {
		Plan plan=new Plan();
		double acumulador,acumuladoraux=0;
		plan.setTitular("No hay ningun cliente cargado");
		for(int i=0;i<TablaPlan.planes.size();i++) {
			acumulador=TablaPlan.planes.get(i).getMontoPorCuota()*TablaPlan.planes.get(i).getCantCuotas();
			if(acumulador>acumuladoraux) {
				acumuladoraux=acumulador;
				
			}
		}
		for(int i=0;i<TablaPlan.planes.size();i++) {
			acumulador=TablaPlan.planes.get(i).getMontoPorCuota()*TablaPlan.planes.get(i).getCantCuotas();
			if(acumulador<acumuladoraux) {
				acumuladoraux=acumulador;
				System.out.println(plan+" = "+TablaPlan.planes.get(i));
				plan=TablaPlan.planes.get(i);
			}
		}
		return plan;
	}
	
}
