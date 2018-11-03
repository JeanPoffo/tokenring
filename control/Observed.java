package control;

import view.Observer;

/**
 * Interface Observed
 * @author Jean Poffo
 * @since 02/11/2018
 */
public interface Observed {
    
    public void addObserver(Observer observer);
    
    public void removeObserver(Observer observer);
    
    public void notifyObserver(String status);
    
    public void notifyDadosConexaoAdjacente(String ip, int porta);
    
    public void notifyDadosConexaoSubjacente(String ip, int porta);
    
    public void notifyStatusConexaoAdjacente(boolean conectado);
    
    public void notifyStatusConexaoSubjacente(boolean conectado);
}