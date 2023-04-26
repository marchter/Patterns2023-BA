package Matura_Command;

public class NadelDruckBefehl implements DruckBefehl
{

	private Nadeldrucker nd = new Nadeldrucker();
	
	@Override
	public void ausführen(String dokument) 
	{
		nd.drucken(dokument);
	}

}
