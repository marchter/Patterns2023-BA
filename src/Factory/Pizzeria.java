package Factory;

public abstract class Pizzeria {
		
		public Pizza zubereiten(String gewünschtePizza) {
			Pizza pizza = createPizza(gewünschtePizza);
			
			pizza.backen();
			pizza.schneiden();
			pizza.einpacken();
			
			return pizza;
		}
		
	    protected abstract Pizza createPizza(String gewünschtePizza);

}
