package solid.I;

public class Interface_Segregation_Principal_Error {
/*
 * Uma Classe não deve ser forçada a utilizar
 * Interfaces e métodos que irá usar
 * 
 * Criar interfaces específicas melhor que interfaces genéricas
 * */
	
	interface Aves_i {
		public void setLocalizacao( String longitude, String latitude );
		public void setAltitude( String altitude );
		public void renderizar();
	}
	
	public class Papagaio_i implements Aves_i {
		@Override
		public void setLocalizacao(String longitude, String latitude) {
			/*Seta a longitude e a latitude*/
		}
		@Override
		public void setAltitude(String altitude) {
			/*Seta a Altitude*/
			
		}
		@Override
		public void renderizar() {
			/*Renderiza*/
		}
	}
	
	public class Pinguim_i implements Aves_i {
		@Override
		public void setLocalizacao(String longitude, String latitude) {
			/*Seta a longitude e a latitude*/
		}
		@Override
		public void setAltitude(String altitude) {
			/*NÃO faz NADA  Pinguins não voam!*/
			
		}
		@Override
		public void renderizar() {
			/*Renderiza*/
		}
	}
	
	
	
}
