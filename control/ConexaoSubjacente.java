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
                this.getController().notifyObserver(this.bufferedReaderIn.readLine());
                if(this.bufferedReaderIn.readLine().equals(this.getToken())) {
                    this.getController().executaProcesso();
                }
            }
        }
        catch (IOException ex) {
            this.getController().notifyObserver("ERROR [ " + ex.getMessage() + " ]");
        }
        finally {
            this.closeConfiguracaoConexao();
        }
    }

    @Override
    public void stopConexao() {
        if(this.serverSocket != null) {
            try {
                this.serverSocket.close();
            } 
            catch (IOException ex) {
                this.getController().notifyObserver("ERROR [ " + ex.getMessage() + " ]");
            }
        }
        
        super.stopConexao();
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
        
        this.getController().notifyDadosConexaoSubjacente("", this.getPorta());
        this.getController().notifyStatusConexaoSubjacente(false);
    }
}