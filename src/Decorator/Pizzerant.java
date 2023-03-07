package Decorator;

public class Pizzerant 
{

	public static void main(String[] args) {
		Pizzeria pizzeriaBerlin = new PizzeriaBerlin();
		Zubereiten salamiBerlin = pizzeriaBerlin.createPizza("SalamiBerlin");
		salamiBerlin.zubereiten();
		
		
		Pizzeria pizzeriaHamburg = new PizzeriaHamburg();
		Zubereiten salamiHamburg = pizzeriaHamburg.createPizza("SalamiHamburg");
		salamiHamburg.zubereiten();
	}
	
}
