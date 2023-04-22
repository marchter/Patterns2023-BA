package Matura_ObserverWetter;

public class Client 
{
	public static void main(String[] args) {
		Wetterstation ws = new Wetterstation();
		SensorA sa = new SensorA();
		
		ws.register(sa);
		
		ws.setGestartet(true);
		
		
	}
	
}
