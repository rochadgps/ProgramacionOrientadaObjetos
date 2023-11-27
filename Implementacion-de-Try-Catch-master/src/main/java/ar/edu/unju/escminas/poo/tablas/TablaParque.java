package ar.edu.unju.escminas.poo.tablas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.poo.dominio.Animal;
import ar.edu.unju.escminas.poo.dominio.Especie;
import ar.edu.unju.escminas.poo.dominio.Mineral;
import ar.edu.unju.escminas.poo.dominio.Parque;
import ar.edu.unju.escminas.poo.dominio.Vegetal;
public class TablaParque {
	public static List<Parque> PARQUES = new ArrayList<Parque>();
	public static void cargarParques() {
		//ESPECIES parque cordoba
		List<Especie> especiesParqueCordoba = new ArrayList<Especie>();
		especiesParqueCordoba.add(new Vegetal (0,"Bryophyta Schimp","musgos",false, "no tiene"));
		especiesParqueCordoba.add(new Vegetal (1,"Polypodiophyta","algas",false, "no tiene"));
		especiesParqueCordoba.add(new Vegetal (2,"Leguminoceae-Fabaceae","helechos",true, "primavera"));
		especiesParqueCordoba.add(new Animal (0, "Phantera leo","leon","carnivoro","invierno",false));
		especiesParqueCordoba.add(new Animal (1, "Panthera tigris tigris","tigre de vengala","carnivoro","Otoño",true));
		especiesParqueCordoba.add(new Mineral (0, "Oro", "oro", "Metalico") );
		especiesParqueCordoba.add(new Mineral (1, "Carbon", "carbon", "No Metalico") );
		
		
		//ESPECIES PARQUE JUJUY
		List<Especie> especiesParqueJujuy = new ArrayList<Especie>();
		especiesParqueJujuy.add(new Vegetal (0,"Arecaceae","acacia",true, "invierno"));
		especiesParqueJujuy.add(new Vegetal (1,"Cyperus papyrus","palmeras",false, "primavera"));
		especiesParqueJujuy.add(new Animal (0, "Ramphastos toco","tucan","herbivoro","invierno",true));
		especiesParqueJujuy.add(new Mineral (0, "Plata", "plata", "Metalico") );
		especiesParqueJujuy.add(new Mineral (1, "Diamante", "diamante", "No Metalico") );
		
		//ESPECIES PARQUE SALTA
		List<Especie> especiesParqueSalta = new ArrayList<Especie>();
		especiesParqueSalta.add(new Vegetal (112,"Polypodiophyta","algas",false, "no tiene"));
		especiesParqueSalta.add(new Vegetal (113,"Leguminoceae-Fabaceae","helechos",true, "primavera"));
		especiesParqueSalta.add(new Animal (254, "Phantera leo","leon","carnivoro","invierno",false));
		especiesParqueSalta.add(new Animal (367, "Gorilla beringei beringei","gorila lomo plateado","herviboro","invierno",true));
		especiesParqueSalta.add(new Mineral (635, "Cobre", "cobre", "Metalico") );
		especiesParqueSalta.add(new Mineral (455, "Bismuto", "bismuto", "Semi Metal") );
		
		//ESPECIES PARQUE FORMOSA
		List<Especie> especiesParqueFormosa = new ArrayList<Especie>();
		especiesParqueFormosa.add(new Vegetal (0,"Orchidaceae","orquideas",false, "no tiene"));
		especiesParqueFormosa.add(new Vegetal (1,"zingiber officinale","jengibre",false, "no tiene"));
		especiesParqueFormosa.add(new Animal (0, "Gorilla beringei beringei","gorila lomo plateado","herviboro","invierno",true));
		especiesParqueFormosa.add(new Animal (0, "Pan troglodytes ","chimpance","herviboro","invierno",true));
		especiesParqueFormosa.add(new Mineral (0, "Platino", "platino", "Platino") );
		
		//ESPECIES PARQUE BUENOS AIRES
		List<Especie> especiesParqueBuenosAires = new ArrayList<Especie>();
		especiesParqueBuenosAires.add(new Vegetal (2,"Orchidaceae","orquideas",false, "no tiene"));
		especiesParqueBuenosAires.add(new Vegetal (1,"Leguminoceae-Fabaceae","helechos",true, "primavera"));
		especiesParqueBuenosAires.add(new Animal (0, "Ambytoma mexicanum","ajolote","carnivoro","verano",true));
		especiesParqueBuenosAires.add(new Mineral (0, "Hierro", "hierro", "Hierro") );
		
		//Parques
		PARQUES.add(new Parque(1008,"Parque Nacional Quebrada del Condorito",LocalDate.parse("2005-10-12"),89.706,"Cordoba",TablaOrganismo.ORGANISMOS.get(4),especiesParqueCordoba));
		PARQUES.add(new Parque(1470,"Monumento Natural Laguna de Pozuelos",LocalDate.parse("2018-05-14"),16.000,"Jujuy",TablaOrganismo.ORGANISMOS.get(0),especiesParqueJujuy));
		PARQUES.add(new Parque(1057,"Parque Nacional Baritu",LocalDate.parse("1995-12-23"),19.008,"Salta",TablaOrganismo.ORGANISMOS.get(1),especiesParqueSalta));
		PARQUES.add(new Parque(3112,"Parque Nacional Rio Pilcomayo",LocalDate.parse("2010-05-30"),80.636,"Formosa",TablaOrganismo.ORGANISMOS.get(3),especiesParqueFormosa));
		PARQUES.add(new Parque(5645,"Parque Nacional Ciervo de los Pantanos",LocalDate.parse("2020-06-02"),14.336,"Buenos Aires",TablaOrganismo.ORGANISMOS.get(2),especiesParqueBuenosAires));
		
		
		
		/**
		 * //PARQUES
				
				
				
				ESTA PARTE VER SI CAMBIAMOS O DEJAMOS COMO ESTA
				provincias.get(0).setParques(parques);
				provincias.get(1).setParques(parques);
				provincias.get(2).setParques(parques);
				provincias.get(3).setParques(parques);
				provincias.get(4).setParques(parques);
		 */
		
	}
	
	
	
}
