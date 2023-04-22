package Matura_BasicObserver;

import java.util.ArrayList;
import java.util.List;

abstract class Observerable 
{
	private List<Observer> ObserverList = new ArrayList<Observer>();
	
	public void register(Observer o)
	{
		ObserverList.add(o);
	}
	
	public void notifyObserver(Message m) 
	{
		for (Observer observer : ObserverList) {
			observer.update(m);
		}
	}
}
