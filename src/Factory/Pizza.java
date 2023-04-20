package Factory;

public abstract class Pizza 
{
		public void backen() {}
		public void schneiden() {}
		public void einpacken() {}
		abstract void zubereiten();

}


class SalamiBerlin extends Pizza
{
	public void zubereiten() {
		System.out.println("SalamiBerlin wurde zubereitet");
	}
}	

class HawaiiBerlin extends Pizza
{
	public void zubereiten() {
		System.out.println("HawaiiBerlin wurde zubereitet");
	}
}	

class CalzoneBerlin extends Pizza
{
	public void zubereiten() {
		System.out.println("CalzoneBerlin wurde zubereitet");
	}
}	

class SalamiHamburg extends Pizza
{
	public void zubereiten() {
		System.out.println("SalamiHamburg wurde zubereitet");
	}
}	

class HawaiiHamburg extends Pizza
{
	public void zubereiten() {
		System.out.println("HawaiiHamburg wurde zubereitet");
	}
}	

class CalzoneHamburg extends Pizza
{
	public void zubereiten() {
		System.out.println("CalzoneHamburg wurde zubereitet");
	}
}

class SalamiRostock extends Pizza
{
	public void zubereiten() {
		System.out.println("SalamiRostock wurde zubereitet");
	}
}	

class HawaiiRostock extends Pizza
{
	public void zubereiten() {
		System.out.println("HawaiiRostock wurde zubereitet");
	}
}	

class CalzoneRostock extends Pizza
{
	public void zubereiten() {
		System.out.println("CalzoneRostock wurde zubereitet");
	}
}

