package Factory;

class PizzeriaBerlin extends Pizzeria{
    @Override 
    protected Pizza createPizza(String gewünschtePizza) { 
    	Pizza pizza = null; 
        if (gewünschtePizza.equals("Salami")) { 
        	pizza = new SalamiBerlin(); 
        } 
        else if (gewünschtePizza.equals("Hawaii")) { 
        	pizza = new HawaiiBerlin(); 
        } 
        else if (gewünschtePizza.equals("Calzone")) { 
        	pizza = new CalzoneBerlin(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return pizza; 
    }
}

class PizzeriaHamburg extends Pizzeria{
    @Override 
    protected Pizza createPizza(String gewünschtePizza) { 
    	Pizza pizza = null; 
        if (gewünschtePizza.equals("Salami")) { 
        	pizza = new SalamiHamburg(); 
        } 
        else if (gewünschtePizza.equals("Hawaii")) { 
        	pizza = new HawaiiHamburg(); 
        } 
        else if (gewünschtePizza.equals("Calzone")) { 
        	pizza = new CalzoneHamburg(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return pizza; 
    }
}

class PizzeriaRostock extends Pizzeria{
    @Override 
    protected Pizza createPizza(String gewünschtePizza) { 
    	Pizza pizza = null; 
        if (gewünschtePizza.equals("Salami")) { 
        	pizza = new SalamiHamburg(); 
        } 
        else if (gewünschtePizza.equals("Hawaii")) { 
        	pizza = new HawaiiHamburg(); 
        } 
        else if (gewünschtePizza.equals("Calzone")) { 
        	pizza = new CalzoneHamburg(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return pizza; 
    }
}