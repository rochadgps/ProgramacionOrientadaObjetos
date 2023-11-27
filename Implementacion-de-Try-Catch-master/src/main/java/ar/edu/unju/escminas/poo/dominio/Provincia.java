package ar.edu.unju.escminas.poo.dominio;

import java.util.List;

public class Provincia {
	
	//ATRIBUTOS
		private String isoProvincia;
		private String nombre;
		private List <Parque> parques;
		
		//CONSTRUCTORES
		public Provincia() {
			
		}

		

		public Provincia(String isoProvincia, String nombre, List<Parque> parques) {
			super();
			this.isoProvincia = isoProvincia;
			this.nombre = nombre;
			this.parques = parques;
		}



		public void setIsoProvincia(String isoProvincia) {
			this.isoProvincia = isoProvincia;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
		public List<Parque> getParques() {
			return parques;
		}



		public void setParques(List<Parque> parques) {
			this.parques = parques;
		}



		public String getIsoProvincia() {
			return isoProvincia;
		}



		
		@Override
		public String toString() {
			return "Provincia [isoProvincia=" + isoProvincia + ", nombre=" + nombre + ", parques=" + parques + "]";
		}



	
		

}
