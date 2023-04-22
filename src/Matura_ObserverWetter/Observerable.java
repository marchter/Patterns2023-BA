package Matura_ObserverWetter;

import java.util.ArrayList;
import java.util.List;

abstract class Observerable 
{
	private List<Observer> sensorList = new ArrayList<Observer>();
	
	public void register(Observer o)
	{
		sensorList.add(o);
	}
	
	public void notifyObserver(boolean state) {
		for (Observer sensor : sensorList) {
			sensor.update(state);
			
		}
	}
}
