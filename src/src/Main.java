package src;

/**
 * Hier wird das Programm zum Laufen gebracht.
 * Der CLI Parser wird aufgerufen, wodurch man sich mit dem DBConnecter zur
 * Datenbank verbindet.
 * Dannach werden die CRUD Befehle mithilfe von Prepared Statements ausgef�hrt.
 * 
 * @author Eren Sefer, Yunus Sari
 * @version 2016-05-20
 */
public class Main {

	public static void main(String[] args) {
		CLIParser cli = new CLIParser(args);
	}
}