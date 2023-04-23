package Matura_StrategyShopping;

import java.util.ArrayList;
import java.util.List;

public abstract class Context 
{
	private Zahlungsart z = new PayPal();
	private List<Artikel> artikel = new ArrayList<Artikel>();
	
	public void addArtikel(Artikel a)
	{
		artikel.add(a);
	}
	
	private int calculateTotal() 
	{
		int total = 0;
		for (Artikel artikel2 : artikel)
		{
			total += artikel2.getPreis();
		}
		return total;
	}
	
	
	public Zahlungsart getZ() {
		return z;
	}


	public void setZ(Zahlungsart z) {
		this.z = z;
	}


	public void zahlen()
	{
		z.zahlen(calculateTotal());
	}
}
