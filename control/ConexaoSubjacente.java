package control;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Classe de Conexao ServerSocket
 * @author Jean Poffo
 * @since 02/11/2018
 */
public class ConexaoSubjacente extends Conexao {

    private ServerSocket serverSocket;
    
    public ConexaoSubjacente(String ip, int porta, String token, ControllerSystemBase controller) {
        super(ip, porta, token, controller);
    }
    
    @Override
    public void run() {
        try {
            this.serverSocket = new ServerSocket(this.getPorta());
            this.socket       = this.serverSocket.accept();    
        
            this.initConfiguracaoConexao();
            
            while(this.socket.isConnected()) {
                if(this.bufferedReaderIn.readLine().equals(this.getToken())) {
                    this.getController().executaProcesso();
                }
            }
        }
        catch (IOException ex) {
            this.getController().notifyObserver(ex.getMessage());
        }
        finally {
            this.closeConfiguracaoConexao();
        }
    }

    @Override
    public synchronized void stopConexao() {
        super.stopConexao();
        
        if(this.serverSocket != null) {
            try {
                this.serverSocket.close();
            } 
            catch (IOException ex) {
                this.getController().notifyObserver("ERROR [ " + ex.getMessage() + " ]");
            }
        }
    }
    
    @Override
    protected void initConfiguracaoConexao() {
        super.initConfiguracaoConexao();
        
        this.getController().notifyDadosConexaoSubjacente(this.getIp(), this.getPorta());
        this.getController().notifyStatusConexaoSubjacente(true);
    }
    
    @Override
    protected void closeConfiguracaoConexao() {
        super.closeConfiguracaoConexao();
        
        this.getController().notifyDadosConexaoSubjacente("000.000.000.000", 00000);
        this.getController().notifyStatusConexaoSubjacente(false);
    }
}