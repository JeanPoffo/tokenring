package control;

/**
 * Interface com os métodos base do Controller
 * @author Jean Poffo
 * @since 02/11/2018
 */
public interface ControllerSystemBase extends Observed {
    
    public void initConexaoSubjacente(int porta);
    
    public void initConexaoAdjacente(String ip, int porta);
    
    public void resetConexoes();
    
    public void sendToken();
    
    public void executaProcesso();
}