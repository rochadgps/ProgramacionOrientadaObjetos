package ar.edu.unju.escminas.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.poo.dominio.Administrativo;
import ar.edu.unju.escminas.poo.dominio.Secretario;
import ar.edu.unju.escminas.poo.dominio.Usuario;


public class TablaUsuario {
	// creacion de la tabla usuarios 
	public static List<Usuario> USUARIOS = new ArrayList<Usuario>();
	// cargamos algunos usuarios para luego usarlos
	public static void cargarUsuarios() {
		
		USUARIOS.add(new Administrativo(1,"jperez","123","Juan","Perez",268956287));
		USUARIOS.add(new Administrativo(1,"pgonzalez","456","Patricia","Gomez",26972234));
		USUARIOS.add(new Secretario(1,"mdiaz","789","María","Diaz",28654447));
		
		
	}
	
	

}
