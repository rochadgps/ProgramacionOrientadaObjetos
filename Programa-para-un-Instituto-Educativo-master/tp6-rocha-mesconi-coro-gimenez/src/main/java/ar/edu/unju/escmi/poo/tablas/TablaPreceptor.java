package ar.edu.unju.escmi.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Preceptor;

public class TablaPreceptor {

	public static List<Preceptor> PRECEPTORES = new ArrayList<Preceptor>();

	public static void cargarPreceptores() {

		PRECEPTORES.add(new Preceptor("Emilio", "Ramirez", 84845796, "primero", "Emi2", "123"));
		PRECEPTORES.add(new Preceptor("Gustavo", "Sosa", 84845796, "segundo", "Gustso", "123"));
		PRECEPTORES.stream().forEach(System.out::println);
	}
}
