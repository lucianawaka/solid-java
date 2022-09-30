package solid.D;

public class DependencyInversionPrinciple_Error {

	/*
	 * Alto Nível de Acoplamento
	 * 
	 * Para reaproveitar a classe PasswordReminder 
	 * Teriamos que levar a classe MySQLConnection junto - ALTO Acoplamento
	 * */
	class PasswordReminder {
		protected MySQLConnection dbConnection;
		
		public PasswordReminder() {
			this.dbConnection = new MySQLConnection();
		}
		
		
	}
}
