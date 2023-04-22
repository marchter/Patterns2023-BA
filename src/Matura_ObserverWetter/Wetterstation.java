package Matura_ObserverWetter;

public class Wetterstation extends Observerable
{
	private boolean gestartet;

	public boolean isGestartet() {
		return this.gestartet;
	}

	public void setGestartet(boolean starten) 
	{
		this.gestartet = starten;
		notifyObserver(gestartet);
	}
	
	
}
