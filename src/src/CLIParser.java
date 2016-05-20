package src;

import java.sql.Connection;

import com.beust.jcommander.JCommander;

/**
 * In dieser Klasse werden die Daten abgefragt, den Werten f�r die Verbindung
 * mit der Datenbank zugewiesen und die Verbindung aufgebaut.
 * 
 * @author Eren Sefer, Yunus Sari
 * @version 2016-05-20
 */
public class CLIParser {
	private String host;
	private int port;
	private String database;
	private String user;
	private String password;
	private DBConnector con;

	public CLIParser(String input[]) {
		port = 0;
		Settings settings = new Settings();
		JCommander cmd = new JCommander(settings, input);
		host = settings.getHost();
		port = settings.getPort();
		if (port == 0) {
			port = 5432;
		}
		database = settings.getDatabase();
		user = settings.getUser();
		password = settings.getPassword();

		con = new DBConnector(host, port, database, user, password);
	}

	public Connection getConnection() {
		Connection connector = con.getConnection();
		return connector;
	}
	public void closeConnection(){
		con.closeConnection();
	}
}
