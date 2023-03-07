package Decorator;

public abstract class Zubereiten 
{
		public void backen() {}
		public void schneiden() {}
		public void einpacken() {}
		public void zubereiten() {}

}


class SalamiBerlin extends Zubereiten
{
	public void zubereiten() {
		System.out.println("SalamiBerlin wurde zubereitet");
	}
}	

class HawaiiBerlin extends Zubereiten
{
	public void zubereiten() {
		System.out.println("HawaiiBerlin wurde zubereitet");
	}
}	

class CalzoneBerlin extends Zubereiten
{
	public void zubereiten() {
		System.out.println("CalzoneBerlin wurde zubereitet");
	}
}	

class SalamiHamburg extends Zubereiten
{
	public void zubereiten() {
		System.out.println("SalamiHamburg wurde zubereitet");
	}
}	

class HawaiiHamburg extends Zubereiten
{
	public void zubereiten() {
		System.out.println("HawaiiHamburg wurde zubereitet");
	}
}	

class CalzoneHamburg extends Zubereiten
{
	public void zubereiten() {
		System.out.println("CalzoneHamburg wurde zubereitet");
	}
}

class SalamiRostock extends Zubereiten
{
	public void zubereiten() {
		System.out.println("SalamiRostock wurde zubereitet");
	}
}	

class HawaiiRostock extends Zubereiten
{
	public void zubereiten() {
		System.out.println("HawaiiRostock wurde zubereitet");
	}
}	

class CalzoneRostock extends Zubereiten
{
	public void zubereiten() {
		System.out.println("CalzoneRostock wurde zubereitet");
	}
}

