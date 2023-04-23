package Matura_StrategyShopping;

public class Mastercard implements Zahlungsart 
{
	
	@Override
	public void zahlen(int betrag)
	{
		System.out.println("Betrag mit Mastercard bezahlt: " + betrag);
	};
}
