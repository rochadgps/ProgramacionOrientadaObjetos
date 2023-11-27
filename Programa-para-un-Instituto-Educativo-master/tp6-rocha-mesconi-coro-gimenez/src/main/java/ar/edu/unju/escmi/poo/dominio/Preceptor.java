package ar.edu.unju.escmi.poo.dominio;


import ar.edu.unju.escmi.poo.tablas.TablaAlumno;
import ar.edu.unju.escmi.poo.tablas.TablaMateria;

public class Preceptor extends Persona {

	private String nombreUsuario;
	private String contrasena;

	public Preceptor() {
		// TODO Auto-generated constructor stub
	}

	public Preceptor(String nombre, String apellido, long dni, String curso, String nombreUsuario, String contrasena) {
		super(nombre, apellido, dni, curso);
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}




	@Override
	public String toString() {
		return "Preceptor [nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena +" "+ super.toString() + "]";
	}

	public static void darDeAltaAlumno(Alumno alumno) {
		TablaAlumno.ALUMNOS.add(alumno);
		System.out.println(alumno);
	}

	public static Alumno buscarAlumnoPorDNI(long dni) {
		for (int i = 0; i < TablaAlumno.ALUMNOS.size(); i++) {
			if (dni == TablaAlumno.ALUMNOS.get(i).getDni()) {

				return TablaAlumno.ALUMNOS.get(i);
			}

		}
		return null;

	}

	public static Materia buscarMateriaPorCodigo(int cod) {
		for (int i = 0; i < TablaMateria.MATERIAS.size(); i++) {
			if (cod == TablaMateria.MATERIAS.get(i).getCodigo()) {

				return TablaMateria.MATERIAS.get(i);
			}

		}
		return null;

	}

}
