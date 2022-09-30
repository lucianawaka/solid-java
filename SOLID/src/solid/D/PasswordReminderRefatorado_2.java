package solid.D;

public class PasswordReminderRefatorado_2 {
	protected DBConnectionInterface connection;
	
	/*
	 * Acabamos de respeitar o S e o O
	 * */
	public PasswordReminderRefatorado_2(DBConnectionInterface connection){
		this.connection = connection;
	}
}
