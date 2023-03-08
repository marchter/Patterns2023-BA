package Factory;

public abstract class Pizzeria {
		
		public Zubereiten zubereiten(String gewünschtePizza) {
			Zubereiten pizza = createPizza(gewünschtePizza);
			
			pizza.backen();
			pizza.schneiden();
			pizza.einpacken();
			
			return pizza;
		}
		
	    protected abstract Zubereiten createPizza(String gewünschtePizza);

}
