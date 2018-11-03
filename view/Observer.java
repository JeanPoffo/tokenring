package view;

/**
 * Interface Observer
 * @author Jean Poffo
 * @since 02/11/2018
 */
public interface Observer {
    
    public void update(String string);
    
    public void updateDadosConexaoAdjacente(String ip, int porta);
    
    public void updateDadosConexaoSubjacente(String ip, int porta);
    
    public void updateStatusConexaoAdjacente(boolean conectado);
    
    public void updateStatusConexaoSubjacente(boolean conectado);
}