package Observer_Pattern;

public class Client 

{

    public static void main(String[] args) 
    { 
    	ObservableSensor os = new ObservableSensor();
    	os.register(new SensorA());
    	os.register(new SensorB());
    	
    	os.setState("12 und 34");
    } 
}
