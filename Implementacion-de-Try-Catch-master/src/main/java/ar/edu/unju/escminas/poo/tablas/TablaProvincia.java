package ar.edu.unju.escminas.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.poo.dominio.Parque;
import ar.edu.unju.escminas.poo.dominio.Provincia;

public class TablaProvincia {
	
	public static List<Provincia> PROVINCIAS = new ArrayList<Provincia>();
	
	public static void cargarProvincias () {
		
		PROVINCIAS.add(new Provincia("JU","Jujuy", new ArrayList<Parque>()));
		PROVINCIAS.add(new Provincia("SA","Salta", new ArrayList<Parque>()));
		PROVINCIAS.add(new Provincia("BA","Buenos Aires", new ArrayList<Parque>()));
		PROVINCIAS.add(new Provincia("FO","Formosa", new ArrayList<Parque>()));
		PROVINCIAS.add(new Provincia("CO","Cordoba", new ArrayList<Parque>()));
		
		
	}
	

}
