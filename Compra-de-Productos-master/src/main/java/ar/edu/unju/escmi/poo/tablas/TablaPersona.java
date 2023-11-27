package ar.edu.unju.escmi.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Empresa;
import ar.edu.unju.escmi.poo.dominio.Particular;
import ar.edu.unju.escmi.poo.dominio.Persona;

public class TablaPersona {
	public static List<Persona> personas = new ArrayList<Persona>();

	public static void cargarPersonas() {
		personas.add(new Empleado("gustso", "123", "Gustavo", "Sosa",22222222));
		personas.add(new Empleado("jperez", "456", "Joaquin", "Perez",33333333));
		personas.add(new Particular("mdiaz", "789", "Marcelo" ,"Diaz",44123123));
		personas.add(new Particular("lmesconi","666","Lucas","Mesconi",44321321));
		personas.add(new Empresa("rochadgps","777","construccion",44777777));
		personas.add(new Empresa("obito","321","comercio",44888888));
		
	}
}
