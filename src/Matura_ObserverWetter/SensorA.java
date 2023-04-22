package Matura_ObserverWetter;

public class SensorA implements Observer
{

	@Override
	public void update(boolean state) 
	{
		System.out.println("SensorA liefert: die wetterstation wurde "+ state +" gesetzt");
	}

}
