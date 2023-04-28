package Matura_TicTacToe2;

public class Client 
{
	public static void main(String[] args) 
	{
		Spielfeld spielfeld = Spielfeld.getSpielfeld();

		Control control = new Control(spielfeld, new View());
		CommandRecorder commandRecorder = new CommandRecorder();

		CommandInterface command = new Spielzug(new Field("X"), new Position(0,0), spielfeld);
		
		control.printSpielfeld();
		
		commandRecorder.ausführen(command);
		control.printSpielfeld();
		
		CommandInterface command2 = new Spielzug(new Field("O"), new Position(1, 1), spielfeld);
		commandRecorder.ausführen(command2);
		
		CommandInterface command3 = new Spielzug(new Field("X"), new Position(0, 1), spielfeld);
		commandRecorder.ausführen(command3);
		
		CommandInterface command4 = new Spielzug(new Field("X"), new Position(0, 2), spielfeld);
		commandRecorder.ausführen(command4);

		
		System.out.println("Undo:");
		commandRecorder.undo();
		control.printSpielfeld();
		
		System.out.println("Redo:");
		commandRecorder.redo();
		control.printSpielfeld();

		control.getWonVertical();
		control.getWonHorizontal();

		
		
	}
}
