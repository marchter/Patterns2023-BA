package Matura_Observer;

public class Client {

	public static void main(String[] args) 
	{
		FAZVerlag fazVerlag= new FAZVerlag();
		FamilieFischer famFischer = new FamilieFischer();
		FamilieMeier famMeier = new FamilieMeier();

		fazVerlag.aboHinzufügen(famFischer);
		fazVerlag.aboHinzufügen(famMeier);
		
		Zeitung z1 = new Zeitung("Erste Zeitung");
		
		fazVerlag.verteileZeitung(z1);

	}

}
