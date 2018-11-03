package control;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import view.Observer;

/**
 * Controller principal do Sistema
 * @author Jean Poffo
 * @since 02/11/2018
 */
public class ControllerSystem implements ControllerSystemBase{
    
    private final String TOKEN_CONEXAO = "1S33D34DP30P13";

    private ConexaoAdjacente conexaoAdjacente;
    
    private ConexaoSubjacente conexaoSubjacente;
    
    private List<Observer> observers;

    private static ControllerSystem instance;
    
    private ControllerSystem() {
        this.observers = new ArrayList();
    }
    
    public static ControllerSystem getInstance() {
        if(instance == null) {
            instance = new ControllerSystem();
        }
        return instance;
    }
  
    /** Função que retorna os dados para conexão */
    public String getTokenConexao() {
        return TOKEN_CONEXAO;
    }

    public String getIpConexao() throws UnknownHostException{
        return InetAddress.getLocalHost().getHostAddress();
    }
    /** Fim das funções de dados para conexão */
    
    /**
     * Inicia a conexão subjacente do Anel 
     * @param porta
     */
    @Override
    public void initConexaoSubjacente(int porta) {
        try {
            this.conexaoSubjacente = new ConexaoSubjacente(this.getIpConexao(), porta, this.getTokenConexao(), this);
        
            new Thread(() -> {
                this.conexaoSubjacente.start();
            }).start();
        } 
        catch (UnknownHostException ex) {
            this.notifyObserver("ERROR [" + ex.getMessage() + "]");
        }
    }
    
    /**
     * Inicia a conexão adjacente do Anel
     * @param ip 
     * @param porta 
     */
    @Override
    public void initConexaoAdjacente(String ip, int porta) {
        try {
            this.conexaoAdjacente  = new ConexaoAdjacente(ip, porta, this.getTokenConexao(), this);

            new Thread(() -> {
                this.conexaoAdjacente.start();
            }).start();
        } 
        catch (Exception ex) {
            this.notifyObserver("ERROR [" + ex.getMessage() + "]");
        }        
    }

    @Override
    public void resetConexoes() {
        if(this.conexaoAdjacente != null) {
            this.conexaoAdjacente.stopConexao();
        }
        if(this.conexaoSubjacente != null) {
            this.conexaoSubjacente.stopConexao();
        }
    }
    
    /** @param observer */
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
        
        this.notifyObserver("Iniciado, seu IP é: " + this.conexaoSubjacente.getIp() + " e a Porta: " + this.conexaoSubjacente.getPorta());
    }

    /** @param observer */
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /** @param status */
    @Override
    public void notifyObserver(String status) {
        this.observers.forEach((observer) -> {
            observer.update(status);
        });
    }

    /**
     * Atualiza os dados da conexão
     * @param ip
     * @param porta 
     */
    @Override
    public void notifyDadosConexaoAdjacente(String ip, int porta) {
        this.observers.forEach((observer) -> {
            observer.updateDadosConexaoAdjacente(ip, porta);
        });
    }

    /**
     * Atualiza os dados da conexão
     * @param ip
     * @param porta 
     */
    @Override
    public void notifyDadosConexaoSubjacente(String ip, int porta) {
        this.observers.forEach((observer) -> {
            observer.updateDadosConexaoSubjacente(ip, porta);
        });
    }

    /**
     * Atualiza os dados da conexão
     * @param conectado 
     */
    @Override
    public void notifyStatusConexaoAdjacente(boolean conectado) {
        this.observers.forEach((observer) -> {
            observer.updateStatusConexaoAdjacente(conectado);
        });
    }

    /**
     * Atualiza os dados da conexão
     * @param conectado 
     */
    @Override
    public void notifyStatusConexaoSubjacente(boolean conectado) {
        this.observers.forEach((observer) -> {
            observer.updateStatusConexaoSubjacente(conectado);
        });
    }

    @Override
    public void sendToken() {
        this.conexaoAdjacente.sendToken();
    }
    
    /**
     * Aqui é chamada a função que executaria um processo em região crítica
     */
    @Override
    public void executaProcesso() {
        try {
            this.notifyObserver("Executando Tarefa 1");
            Thread.sleep(1000);
            this.notifyObserver("Executando Tarefa 2");
            Thread.sleep(1000);
            this.notifyObserver("Executando Tarefa 3");
            Thread.sleep(1000);
            this.notifyObserver("Executando Tarefa 4");
            Thread.sleep(1000);
            this.notifyObserver("Passando a bola do Token");
            this.sendToken();
        } 
        catch (InterruptedException ex) {
            this.notifyObserver("ERROR [" + ex.getMessage() + "]");
        }       
    }
}