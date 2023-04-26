package Matura_Command;

public class Chef 
{
	private DruckBefehl db;


	public void druckAusführen(String dokument)
	{
		db.ausführen(dokument);
	}
	
	public void setDB(DruckBefehl db)
	{
		this.db = db;
	}

}
