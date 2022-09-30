package solid.D;

public class PasswordReminderRefatorado {
	protected MySQLConnection dbConnection;
	
	/*A criação do Objeto MySQLConnection deixa de ser uma responsabilidade da Classe
	 * A Classe de conexão com o banco de dados virou uma dependência
	 * Injetada via método construtor - Injeção de Dependência
	 * 
	 * 
	 * Ainda está ACOPLADO
	 * Princípio da Inversão de Dep. foi violado
	 * MySQLConnection é uma implementação e não uma abstração
	 * 
	 * 
	 * */
	public PasswordReminderRefatorado( MySQLConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
}
