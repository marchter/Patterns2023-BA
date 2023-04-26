package Matura_Command;

public class FarbDruckBefehl implements DruckBefehl
{
	
	private Farbdrucker fd = new Farbdrucker();
	
	@Override
	public void ausführen(String dokument) 
	{
		fd.drucken(dokument);
	}

}
