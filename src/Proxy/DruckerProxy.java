package Proxy;

public class DruckerProxy implements Drucker
{
	private String name;
	private Drucker d;
	
	public DruckerProxy(String name) {
		this.name = name;
	}

	@Override
	public void drucken(String dokument) 
	{
		if(name == "SW" && d==null)
		{
			d = new SWDrucker("SW");
		}else if (name == "C" && d==null)
		{
			d = new CDrucker("C");
		}
		
		d.drucken(dokument);
	}
	
	
	public void switchTo(String name)
	{
		if(name == "SW")
		{
			d = new SWDrucker("SW");
		}
		else if(name == "C")
		{
			d = new SWDrucker("C");
		}
	}
		

}
