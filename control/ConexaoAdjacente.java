package control;

import java.io.IOException;
import java.net.Socket;

/**
 * Classe de conexão Socket
 * @author Jean Poffo
 * @since 02/11/2018
 */
public class ConexaoAdjacente extends Conexao {

    public ConexaoAdjacente(String ip, int porta, String token, ControllerSystemBase controller) {
        super(ip, porta, token, controller);
    }

    @Override
    public void run() {
        try {
            this.socket = new Socket(this.getIp(), this.getPorta());
        
            this.initConfiguracaoConexao();
            
            while(this.socket.isConnected()) {
                Thread.sleep(1);
            }
        } 
        catch (IOException | InterruptedException ex) {
            this.getController().notifyObserver("ERROR [ " + ex.getMessage() + " ]");
        }
        finally {
            this.closeConfiguracaoConexao();
        }
    }
    
    public void sendToken() {
        this.printWriterOut.print(this.getToken());
    }
    
    @Override
    protected void initConfiguracaoConexao() {
        super.initConfiguracaoConexao();
        
        this.getController().notifyDadosConexaoAdjacente(this.getIp(), this.getPorta());
        this.getController().notifyStatusConexaoAdjacente(true);
    }
    
    @Override
    protected void closeConfiguracaoConexao() {
        super.closeConfiguracaoConexao();
        
        this.getController().notifyDadosConexaoAdjacente("", this.getPorta());
        this.getController().notifyStatusConexaoAdjacente(false);
    }
}