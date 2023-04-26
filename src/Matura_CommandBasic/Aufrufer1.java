package Matura_CommandBasic;

public class Aufrufer1 
{
	private Befehl bf;
	
	public void setBf(Befehl bf)
	{
		this.bf = bf;
	}
	
	public void ausführen()
	{
		bf.ausführen();
	}

}
