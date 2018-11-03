package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Classe base de Conexões
 * @author Jean Poffo
 * @since 03/11/2018
 */
abstract public class Conexao extends Thread {
    
    private String ip;
    
    private int porta;
    
    private String token;
    
    protected Socket socket;
    
    protected BufferedReader bufferedReaderIn;
    
    protected PrintWriter printWriterOut;
    
    private ControllerSystemBase controller;
    
    public Conexao(String ip, int porta, String token, ControllerSystemBase controller) {
        this.ip         = ip;
        this.porta      = porta;
        this.token      = token;
        this.controller = controller;
    }

    public ControllerSystemBase getController() {
        return controller;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public void stopConexao() {
        if(this.socket != null) {
            try {
                this.socket.close();
            } 
            catch (IOException ex) {
                this.getController().notifyObserver("ERROR [ " + ex.getMessage() + " ]");
            }
            finally {
                this.closeConfiguracaoConexao();
            }
        }
    }
    
    protected void initConfiguracaoConexao() {
        try {
            this.bufferedReaderIn = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.printWriterOut   = new PrintWriter(this.socket.getOutputStream(), true);
        } 
        catch (IOException ex) {
            this.controller.notifyObserver("ERROR [ " + ex.getMessage() + " ]");
        }
    }
    
    protected void closeConfiguracaoConexao() {
        try {
            if(this.bufferedReaderIn != null) {
                this.bufferedReaderIn.close();
            }

            if(this.printWriterOut != null) {
                this.printWriterOut.close();
            }
        } 
        catch (IOException ex) {
            this.controller.notifyObserver("ERROR [ " + ex.getMessage() + " ]");
        }
    }
}