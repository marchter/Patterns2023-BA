package Matura_Observer;

public class FamilieFischer implements Abonnent 
{

	@Override
	public void erhalteZeitung(Zeitung z) 
	{
		System.out.println("Fam Fischer hat die Zeitung erhalten mit dem Titel: " + z.getTitle());
	}
}
