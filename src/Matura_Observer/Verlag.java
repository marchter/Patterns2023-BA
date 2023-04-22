package Matura_Observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Verlag 
{
	private List<Abonnent> AboList = new ArrayList<Abonnent>();
	
	public void aboHinzufügen(Abonnent a) 
	{
		AboList.add(a);
	};
	
	public void aboEntfernen(Abonnent a)
	{
		AboList.remove(a);
	}
	
	protected void verteileZeitung(Zeitung z)
	{
		for (Abonnent abonnent : AboList) {
			abonnent.erhalteZeitung(z);
		}
	}
}