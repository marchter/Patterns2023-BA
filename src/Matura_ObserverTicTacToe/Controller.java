package Matura_ObserverTicTacToe;

public class Controller extends Observerable 
{
	private Spielfeld s = new Spielfeld();

	public void makeMove(int[][] m)
	{
		s.setMatrix(m);
		notifyObserver(s);

	}
}
