package Observer;

public class ObservableSensor extends Observable
{
	private String state;
	
	public void setState(String state) {
		this.state = state;
		
		notifyObservers(state);
	}
	
    public String getState() { 
        return state; 
    } 
}
