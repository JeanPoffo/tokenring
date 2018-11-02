package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Classse View principal do Sistema
 * @author Jean Poffo
 * @since 02/11/2018
 */
public class ViewSystem extends JFrame implements Observer {

    private javax.swing.JButton botaoConexaoAdjacenteAjuda;
    private javax.swing.JButton botaoConexaoAdjacenteConfigurar;
    private javax.swing.JButton botaoConexaoSubjacenteAjuda;
    private javax.swing.JButton botaoEnviarToken;
    private javax.swing.JButton botaoResetar;
    private javax.swing.JMenuItem itemMenuAjuda;
    private javax.swing.JMenuItem itemMenuResetar;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConexaoAdjacenteIp;
    private javax.swing.JLabel labelConexaoAdjacentePorta;
    private javax.swing.JLabel labelConexaoAdjacenteStatus;
    private javax.swing.JLabel labelConexaoSubjacenteIp;
    private javax.swing.JLabel labelConexaoSubjacentePorta;
    private javax.swing.JLabel labelConexaoSubjacenteStatus;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JPanel panelConexaoAdjacente;
    private javax.swing.JPanel panelConexaoAdjacenteInfo;
    private javax.swing.JPanel panelConexaoSubjacente;
    private javax.swing.JPanel panelConexaoSubjacenteInfo;
    private javax.swing.JPanel panelLog;
    private javax.swing.JTextArea textAreaLog;

    public ViewSystem() {
        super("Token Ring");

        
        this.initComponents();
    }
    
    @Override
    public void update() {
        
    }
    
    private void initComponents() {
        panelConexaoAdjacente = new javax.swing.JPanel();
        panelConexaoAdjacenteInfo = new javax.swing.JPanel();
        labelConexaoAdjacenteIp = new javax.swing.JLabel();
        labelConexaoAdjacentePorta = new javax.swing.JLabel();
        labelConexaoAdjacenteStatus = new javax.swing.JLabel();
        botaoConexaoAdjacenteConfigurar = new javax.swing.JButton();
        botaoConexaoAdjacenteAjuda = new javax.swing.JButton();
        panelConexaoSubjacente = new javax.swing.JPanel();
        panelConexaoSubjacenteInfo = new javax.swing.JPanel();
        labelConexaoSubjacenteIp = new javax.swing.JLabel();
        labelConexaoSubjacentePorta = new javax.swing.JLabel();
        labelConexaoSubjacenteStatus = new javax.swing.JLabel();
        botaoConexaoSubjacenteAjuda = new javax.swing.JButton();
        panelLog = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        botaoResetar = new javax.swing.JButton();
        botaoEnviarToken = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemMenuResetar = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuAjuda = new javax.swing.JMenuItem();
        itemMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConexaoAdjacente.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão Adjacente"));

        panelConexaoAdjacenteInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão"));

        labelConexaoAdjacenteIp.setText("IP: 192.168.80.30");

        labelConexaoAdjacentePorta.setText("Porta: 50006");

        labelConexaoAdjacenteStatus.setIcon(new ImageIcon(getClass().getResource("/view/icons/connected.png")));

        javax.swing.GroupLayout panelConexaoAdjacenteInfoLayout = new javax.swing.GroupLayout(panelConexaoAdjacenteInfo);
        panelConexaoAdjacenteInfo.setLayout(panelConexaoAdjacenteInfoLayout);
        panelConexaoAdjacenteInfoLayout.setHorizontalGroup(
            panelConexaoAdjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoAdjacenteInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConexaoAdjacenteIp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConexaoAdjacentePorta)
                .addGap(18, 18, 18)
                .addComponent(labelConexaoAdjacenteStatus)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelConexaoAdjacenteInfoLayout.setVerticalGroup(
            panelConexaoAdjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoAdjacenteInfoLayout.createSequentialGroup()
                .addGroup(panelConexaoAdjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConexaoAdjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelConexaoAdjacenteIp)
                        .addComponent(labelConexaoAdjacentePorta))
                    .addComponent(labelConexaoAdjacenteStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoConexaoAdjacenteConfigurar.setIcon(new ImageIcon(getClass().getResource("/view/icons/config.png")));

        botaoConexaoAdjacenteAjuda.setIcon(new ImageIcon(getClass().getResource("/view/icons/help.png")));

        javax.swing.GroupLayout panelConexaoAdjacenteLayout = new javax.swing.GroupLayout(panelConexaoAdjacente);
        panelConexaoAdjacente.setLayout(panelConexaoAdjacenteLayout);
        panelConexaoAdjacenteLayout.setHorizontalGroup(
            panelConexaoAdjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoAdjacenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConexaoAdjacenteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botaoConexaoAdjacenteConfigurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConexaoAdjacenteAjuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConexaoAdjacenteLayout.setVerticalGroup(
            panelConexaoAdjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConexaoAdjacenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConexaoAdjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelConexaoAdjacenteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConexaoAdjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoConexaoAdjacenteAjuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConexaoAdjacenteConfigurar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelConexaoSubjacente.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão Subjacente"));

        panelConexaoSubjacenteInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão"));

        labelConexaoSubjacenteIp.setText("IP: 192.168.80.30");

        labelConexaoSubjacentePorta.setText("Porta: 50006");

        labelConexaoSubjacenteStatus.setIcon(new ImageIcon(getClass().getResource("/view/icons/connected.png")));

        javax.swing.GroupLayout panelConexaoSubjacenteInfoLayout = new javax.swing.GroupLayout(panelConexaoSubjacenteInfo);
        panelConexaoSubjacenteInfo.setLayout(panelConexaoSubjacenteInfoLayout);
        panelConexaoSubjacenteInfoLayout.setHorizontalGroup(
            panelConexaoSubjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoSubjacenteInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConexaoSubjacenteIp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConexaoSubjacentePorta)
                .addGap(18, 18, 18)
                .addComponent(labelConexaoSubjacenteStatus)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelConexaoSubjacenteInfoLayout.setVerticalGroup(
            panelConexaoSubjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoSubjacenteInfoLayout.createSequentialGroup()
                .addGroup(panelConexaoSubjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConexaoSubjacenteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelConexaoSubjacenteIp)
                        .addComponent(labelConexaoSubjacentePorta))
                    .addComponent(labelConexaoSubjacenteStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoConexaoSubjacenteAjuda.setIcon(new ImageIcon(getClass().getResource("/view/icons/help.png")));

        javax.swing.GroupLayout panelConexaoSubjacenteLayout = new javax.swing.GroupLayout(panelConexaoSubjacente);
        panelConexaoSubjacente.setLayout(panelConexaoSubjacenteLayout);
        panelConexaoSubjacenteLayout.setHorizontalGroup(
            panelConexaoSubjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexaoSubjacenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConexaoSubjacenteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConexaoSubjacenteAjuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConexaoSubjacenteLayout.setVerticalGroup(
            panelConexaoSubjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConexaoSubjacenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConexaoSubjacenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelConexaoSubjacenteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConexaoSubjacenteAjuda))
                .addContainerGap())
        );

        panelLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));

        textAreaLog.setColumns(20);
        textAreaLog.setRows(5);
        textAreaLog.setText("Hello!");
        jScrollPane1.setViewportView(textAreaLog);

        javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
        panelLog.setLayout(panelLogLayout);
        panelLogLayout.setHorizontalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelLogLayout.setVerticalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoResetar.setIcon(new ImageIcon(getClass().getResource("/view/icons/reset.png")));
        botaoResetar.setText("Resetar");

        botaoEnviarToken.setIcon(new ImageIcon(getClass().getResource("/view/icons/token.png")));
        botaoEnviarToken.setText("Enviar Token");

        menuArquivo.setText("Arquivo");

        itemMenuResetar.setIcon(new ImageIcon(getClass().getResource("/view/icons/reset.png")));
        itemMenuResetar.setText("Resetar");
        menuArquivo.add(itemMenuResetar);

        itemMenuSair.setIcon(new ImageIcon(getClass().getResource("/view/icons/exit.png")));
        itemMenuSair.setText("Sair");
        menuArquivo.add(itemMenuSair);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setText("Ajuda");

        itemMenuAjuda.setIcon(new ImageIcon(getClass().getResource("/view/icons/help.png")));
        itemMenuAjuda.setText("Ajuda");
        menuAjuda.add(itemMenuAjuda);

        itemMenuSobre.setIcon(new ImageIcon(getClass().getResource("/view/icons/about.png")));
        itemMenuSobre.setText("Sobre");
        menuAjuda.add(itemMenuSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelConexaoAdjacente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(panelConexaoSubjacente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEnviarToken, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelConexaoSubjacente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConexaoAdjacente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResetar)
                    .addComponent(botaoEnviarToken))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
}