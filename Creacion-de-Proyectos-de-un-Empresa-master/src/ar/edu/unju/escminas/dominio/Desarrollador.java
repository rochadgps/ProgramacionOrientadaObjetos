package ar.edu.unju.escminas.dominio;

import java.time.LocalDate;
import java.util.List;

import ar.edu.unju.escminas.tablas.TablaProyecto;
import ar.edu.unju.escminas.tablas.TablaTarea;

public abstract class Desarrollador extends Empleado {

	private List<String> tecnologias;

	public Desarrollador() {
		// TODO Auto-generated constructor stub
	}

	public Desarrollador(int dni, int legajo, String nombre, String nombreUsuario, String contrasena, String rol,
			LocalDate fechaNac, List<String> tecnologias) {
		super(dni, legajo, nombre, nombreUsuario, contrasena, rol, fechaNac);
		this.tecnologias = tecnologias;
	}

	public List<String> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<String> tecnologias) {
		this.tecnologias = tecnologias;
	}


	
	/**
	 * metodos propios si no es jefe 
	 * @param tareas
	 */
	
	public void listarTareasAsignadas() {
		tareas.stream().forEach(System.out::println);
		;}
	
	
	public Proyecto buscarProyectoPorCodigo(int codigo) {
		return TablaProyecto.PROYECTOS.stream().filter(proyecto -> proyecto.getCodigo() == codigo).findFirst().orElse(null);
	}
	
	//retorna la posicion de la tarea. Si no se encuentra, envía el -1
	public int buscarTareaPorCodigo(int codigo) {
		for(int i=0;i<TablaTarea.TAREAS.size();i++) {
			if(TablaTarea.TAREAS.get(i).getCodigo()==codigo) {
				return i;
			}
		}
		return -1;
	}
	
	//modifica solamente observacion y estado
	public void modificarTarea(int posicion,  Tarea t1) {
		TablaTarea.TAREAS.get(posicion).setObservacion(t1.getObservacion());
		TablaTarea.TAREAS.get(posicion).setEstado(t1.getEstado());
	}
		
	/**
	 * metodos si son jefes de proyecto 
	 */
	public static void crearProyecto(Proyecto p1) {
		TablaProyecto.PROYECTOS.add(p1);
		TablaProyecto.PROYECTOS.stream().forEach(System.out::println);
		System.out.println("===========================================================================");
		System.out.println("proyecto cargado correctamente");
	}
	
	public static void crearTarea(Tarea t1) {
		TablaTarea.TAREAS.add(t1);
		TablaTarea.TAREAS.stream().forEach(System.out::println);
		System.out.println("===========================================================================");
		System.out.println("tarea cargada y asignada correctamente");
	}
	
	
}
