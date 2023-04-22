package Matura_Observer;

public class FAZVerlag extends Verlag 
{
	private Zeitung aktuelleZeitung;
	
	public Zeitung getAktuelleZeitung() {
		return this.aktuelleZeitung;
	}
	
	public void setAktuelleZeitung(Zeitung z)
	{
		this.aktuelleZeitung = z;
	}
}
