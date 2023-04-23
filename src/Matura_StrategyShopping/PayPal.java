package Matura_StrategyShopping;

public class PayPal implements Zahlungsart
{
	
	@Override
	public void zahlen(int betrag) 
	{
		System.out.println("Betrag mit PayPal gezahlt: " + betrag);
	}
	
}
