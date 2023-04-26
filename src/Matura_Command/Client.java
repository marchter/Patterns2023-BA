package Matura_Command;

public class Client 
{
	public static void main(String[] args) 
	{
		Praktikant p = new Praktikant();
		p.setDB(new NadelDruckBefehl());
		p.druckAusführen("hallo");
		
		p.setDB(new FarbDruckBefehl());
		p.druckAusführen("hallo2");
		
		p.setDB(new DruckMitSicherheitskopieBefehl(new NadelDruckBefehl()));
		p.druckAusführen("hallo3");
		
	}
}
