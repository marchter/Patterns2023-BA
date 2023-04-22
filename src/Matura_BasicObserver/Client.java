package Matura_BasicObserver;

public class Client {
	
	public static void main(String[] args) 
	{
			ConcreteSubject cs = new ConcreteSubject();
			ConcreteObserverA coa1 = new ConcreteObserverA();
			ConcreteObserverA coa2 = new ConcreteObserverA();

			cs.register(coa1);
			cs.register(coa2);

			Message m1 = new Message();
			
			m1.setMessage("M1");
			
			cs.setM(m1);
									
	}

}
