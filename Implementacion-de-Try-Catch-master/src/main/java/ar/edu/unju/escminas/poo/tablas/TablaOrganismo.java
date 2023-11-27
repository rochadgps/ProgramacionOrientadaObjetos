package ar.edu.unju.escminas.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escminas.poo.dominio.OrganismoProvincial;

public class TablaOrganismo {
	public static List<OrganismoProvincial> ORGANISMOS =new ArrayList<OrganismoProvincial>(); 
	
	public static void cargarOrganismos() {
		ORGANISMOS.add(new OrganismoProvincial("Secretaria Espacio Verde Jujuy","Belgrano 1150","Jose Estrada",TablaProvincia.PROVINCIAS.get(0)));
		ORGANISMOS.add(new OrganismoProvincial("Departamento de Turismo Salta","Senador Perez 233","Mario Serapio",TablaProvincia.PROVINCIAS.get(1)));
		ORGANISMOS.add(new OrganismoProvincial("Administracion de Parques Nacionales BS.AS.","Humahuaca 150","Daniel Rioja",TablaProvincia.PROVINCIAS.get(2)));
		ORGANISMOS.add(new OrganismoProvincial("Secretaria de cuidados de Formosa","Sargento Cabral 567","Ezequiel Zalazar",TablaProvincia.PROVINCIAS.get(3)));
		ORGANISMOS.add(new OrganismoProvincial("Organismo Autonomo de Cordoba","Sarmiento 1296","Martin Almeda",TablaProvincia.PROVINCIAS.get(4)));
		
		
	}
	
	
	
}
