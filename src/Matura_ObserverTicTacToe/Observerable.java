package Matura_ObserverTicTacToe;

import java.util.ArrayList;
import java.util.List;

public abstract class Observerable
{
	private List<Observer> list = new ArrayList<Observer>();
	
	public void register(Observer o)
	{
		list.add(o);
	}
	
	public void notifyObserver(Spielfeld s)
	{
		for (Observer observer : list) {
			observer.update(s);
		}
	}

}
