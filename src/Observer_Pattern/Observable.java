package Observer_Pattern;

import java.util.ArrayList;

public abstract class Observable 
{
    private final ArrayList<Observer> observerList = new ArrayList<Observer>(); 

    
    public void register(Observer newObserver){ 
        observerList.add(newObserver); 
    } 

    public void unregister(Observer newObserver){ 
        observerList.remove(newObserver); 
    } 

    protected void notifyObservers(String state){ 
        for (Observer observer : observerList) { 
            observer.update(state); 
        } 
    } 
    
    //getter für pull variante notwendig
}
