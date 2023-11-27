package ar.edu.unju.escmi.poo.tablas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Producto;

public class TablaProducto {
	public static List<Producto> productos = new ArrayList<Producto>();

	public static void CargartablaProducto() {
		// heladeras
		productos.add(new Producto("heladera", 10, "whirlpool", 61500, "HGF387AF"));
		productos.add(new Producto("heladera", 22, "no frost", 24670, "HPK135"));
		productos.add(new Producto("heladera", 6, "Kohinoor", 160219, "HPK135M00B01"));
		// lavarropas
		productos.add(new Producto("lavarropa", 40, "SAMSUNG", 82800, "CVST810T"));
		productos.add(new Producto("lavarropa", 12, "DREAN NEXT", 59500, "WW90J5410G"));
		productos.add(new Producto("lavarropa", 9, "whirlpool", 91200, "GVFWFL4139"));
		// cocinas
		productos.add(new Producto("cocina", 36, "ELECTROLUX", 92799, "CCV060X"));
		productos.add(new Producto("cocina", 18, "Waykuna", 93748, "CCE3110"));
		productos.add(new Producto("cocina", 5, "whirlpool", 76900, "PHCH050"));
		// termotanque a gas
		productos.add(new Producto("termotanqueGas", 8, "Rheem", 69241, "TPGP120"));
		productos.add(new Producto("termotanqueGas", 6, "MARSHALL", 28610, "TSZ-85"));
		productos.add(new Producto("termotanqueGas", 2, "LONGVIE", 21300, "AP-80"));
		// termotanque electrico
		productos.add(new Producto("termotanqueElectrico", 2, "Señorial", 57900, "050CM15MC"));
		productos.add(new Producto("termotanqueElectrico", 3, "MARSHALL", 59899, "TESZ-65"));
		// lavavajillas
		productos.add(new Producto("lavavajilla", 15, "Drean Dish", 86000, "WSFO3T2"));
		// ventiladores
		productos.add(new Producto("ventiladores", 5, "ELECTRIC STE", 17900, "IV16"));
		productos.add(new Producto("ventiladores", 3, "PEABODY PE", 8000, "KJH-FH1209"));
		productos.add(new Producto("ventiladores", 50, "Czerweny", 43303, "VTC12"));

	}
}
