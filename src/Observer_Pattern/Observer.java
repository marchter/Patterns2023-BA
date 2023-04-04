package Observer_Pattern;

 interface Observer 
{
    public void update(String state); 

}


 class SensorA implements Observer
 {

	public void update(String state) 
	{
		System.out.println("SensorA gibt Temp und Luftf: " + state);
	}
	 
 }
 
 class SensorB implements Observer
 {

	public void update(String state) 
	{
		System.out.println("SensorB gibt Temp und Luftf: " + state);
	}
	 
 }