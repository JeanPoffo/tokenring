package control;

import java.util.Observer;

/**
 * Interface Observed
 * @author Jean Poffo
 * @since 02/11/2018
 */
public interface Observed {
    
    public void addObserver(Observer observer);
    
    public void removeObserver(Observer observer);
    
    public void notifyObserver();
}