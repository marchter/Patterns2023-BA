package Matura_Observer;

public class FamilieMeier implements Abonnent 
{

	@Override
	public void erhalteZeitung(Zeitung z) 
	{
		System.out.println("Fam Meier hat die Zeitung erhalten mit dem Titel: " + z.getTitle());
	}
}
