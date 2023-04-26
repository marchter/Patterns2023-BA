package Matura_Command;

public class DruckMitSicherheitskopieBefehl implements DruckBefehl
{
	private DruckBefehl db;
	private String kopie;
	
	public DruckMitSicherheitskopieBefehl(DruckBefehl db) 
	{
		this.db = db;
	}
	
	
	@Override
	public void ausführen(String dokument) 
	{
		this.setKopie("kopie: "+dokument);
		db.ausführen(dokument);
	}



	public String getKopie() {
		return kopie;
	}



	public void setKopie(String kopie) {
		this.kopie = kopie;
	}
	
}
