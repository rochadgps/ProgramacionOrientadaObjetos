package ar.edu.unju.escminas.poo.util;



import ar.edu.unju.escminas.poo.dominio.Animal;
import ar.edu.unju.escminas.poo.dominio.Especie;
import ar.edu.unju.escminas.poo.dominio.Mineral;
import ar.edu.unju.escminas.poo.dominio.Vegetal;

public class EspecieUtil {

	public static int elegirEspecie(Especie auxEspecie)throws Exception {
		
		int respuesta2 = 0;
		boolean band= true;
		 do {
			
				try {
					respuesta2 = IntUtil.pedirInt();
				}catch(Exception e) {
					System.out.println("\n");
					System.out.println(e.toString());
					System.out.println("Porfavor ingrese un numero de tipo double valido \n");
				}
			 
			
			
			
			if (respuesta2 == 1) {
				auxEspecie = new Animal();
				band=false;
			}
			else if (respuesta2 == 2) {
				auxEspecie = new Vegetal();
				band=false;
			}
			else if (respuesta2 == 3) {
				auxEspecie = new Mineral();
				band=false;
			} 
			else {
				System.out.println("Opcion incorrecta, coloque por favor una opcion de l al 3...");
				
			}
		 }
		 while(band==true);
		return respuesta2;

	
}
	}
