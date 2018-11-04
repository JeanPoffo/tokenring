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
        } 
        catch (IOException ex) {
            this.getController().notifyObserver(ex.getMessage());
        }
        finally {
            this.closeConfiguracaoConexao();
        }
    }
    
    public void sendToken() {
        this.printWriterOut.println(this.getToken());
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
        
        this.getController().notifyDadosConexaoAdjacente("000.000.000.000", 00000);
        this.getController().notifyStatusConexaoAdjacente(false);
    }
}