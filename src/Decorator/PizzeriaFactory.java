package Decorator;

class PizzeriaBerlin extends Pizzeria{
    @Override 
    protected Zubereiten createPizza(String gewünschtePizza) { 
    	Zubereiten pizza = null; 
        if (gewünschtePizza.equals("SalamiBerlin")) { 
        	pizza = new SalamiBerlin(); 
        } 
        else if (gewünschtePizza.equals("HawaiiBerlin")) { 
        	pizza = new HawaiiBerlin(); 
        } 
        else if (gewünschtePizza.equals("CalzoneBerlin")) { 
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
    protected Zubereiten createPizza(String gewünschtePizza) { 
    	Zubereiten pizza = null; 
        if (gewünschtePizza.equals("SalamiHamburg")) { 
        	pizza = new SalamiHamburg(); 
        } 
        else if (gewünschtePizza.equals("HawaiiHamburg")) { 
        	pizza = new HawaiiHamburg(); 
        } 
        else if (gewünschtePizza.equals("CalzoneHamburg")) { 
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
    protected Zubereiten createPizza(String gewünschtePizza) { 
    	Zubereiten pizza = null; 
        if (gewünschtePizza.equals("SalamiHamburg")) { 
        	pizza = new SalamiHamburg(); 
        } 
        else if (gewünschtePizza.equals("HawaiiHamburg")) { 
        	pizza = new HawaiiHamburg(); 
        } 
        else if (gewünschtePizza.equals("CalzoneHamburg")) { 
        	pizza = new CalzoneHamburg(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return pizza; 
    }
}