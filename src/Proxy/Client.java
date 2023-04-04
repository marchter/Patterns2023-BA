package Proxy;

public class Client 
{
    public static void main(String[] args)
	{
		Drucker d = new DruckerProxy("SW");
		d.drucken("hallo1");
		
		d.switchTo("C");
		d.drucken("hallo2");
	}

		
		
}
