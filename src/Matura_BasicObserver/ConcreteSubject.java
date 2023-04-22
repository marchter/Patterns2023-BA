package Matura_BasicObserver;

public class ConcreteSubject extends Observerable
{
	private Message m;

	public Message getM() {
		return m;
	}

	public void setM(Message m) {
		this.m = m;
		notifyObserver(m);
	}
		
}
