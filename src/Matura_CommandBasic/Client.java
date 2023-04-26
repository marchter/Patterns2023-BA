package Matura_CommandBasic;

public class Client 
{
	public static void main(String[] args) {
		Aufrufer1 a = new Aufrufer1();
		Aufrufer2 a2 = new Aufrufer2();

		a.setBf(new Befehl1());
		a.ausführen();
		
		a.setBf(new Befehl2());
		a.ausführen();
		
		a2.setBf(new Befehl2());
		a2.ausführen();
		
		a2.setBf(new Befehl1());
		a2.ausführen();
	}
}
