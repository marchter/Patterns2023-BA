package Matura_TicTacToe2;

import java.util.ArrayList;
import java.util.List;

public class Observerable 
{
	private List <Observer> observerList = new ArrayList<Observer>();



	public void addObserver(Observer observer) 
	{
		observerList.add(observer);
	}
	
	public void notifyObserver(String s)
	{
		for(Observer observer : observerList)
		{
			observer.update(s);
		}
	}
	
		
}
