package Factory;

public class Pizzerant 
{

	public static void main(String[] args) {
		Pizzeria pizzeriaBerlin = new PizzeriaBerlin();
		Zubereiten salamiBerlin = pizzeriaBerlin.createPizza("Salami");
		salamiBerlin.zubereiten();
		
		
		Pizzeria pizzeriaHamburg = new PizzeriaHamburg();
		Zubereiten salamiHamburg = pizzeriaHamburg.createPizza("Salami");
		salamiHamburg.zubereiten();
	}
	
}
