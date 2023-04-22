package Matura_BasicObserver;

public class ConcreteObserverA implements Observer
{
	private Message m;
	
	@Override
	public void update(Message m)
	{
		this.m = m;
	}

}
