package Matura_ObserverWetter;

abstract class Sensor 
{
	public void update(boolean state)
	{
		System.out.println("auf"+ state + "upgedated");
	}
}
