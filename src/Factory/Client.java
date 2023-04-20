package Factory;

public class Client 
{

	public static void main(String[] args) {
		Pizzeria pizzeriaBerlin = new PizzeriaBerlin();
		Pizza salamiBerlin = pizzeriaBerlin.createPizza("Salami");
		salamiBerlin.zubereiten();
		
		
		Pizzeria pizzeriaHamburg = new PizzeriaHamburg();
		Pizza salamiHamburg = pizzeriaHamburg.createPizza("Salami");
		salamiHamburg.zubereiten();
	}
	
}
