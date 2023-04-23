package Matura_ObserverTicTacToe;

public class Gui implements Observer
{
	@Override
	public void update(Spielfeld s)
	{
		System.out.println("Die Gui hat sich auf diesen Zustand geändert: \n" + s.toString());
	}
}
