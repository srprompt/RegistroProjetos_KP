/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Toolkit;
import view.Gerente.VwJIFRelatorioProjetoGerente;
import view.Projetista.VwJIFIdentificaProjetista;
import view.Cliente.VwJIFIdentificaCliente;
import model.Constante;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.GerenteDeJanelas;
import view.Gerente.VwJIFStatusProjetoGerente;
import view.Gerente.VwJIFGerenciaClienteGerente;
import view.Gerente.VwJIFGerenciaProjetistaGerente;
import view.Gerente.VwJIFGerenciaProjetoGerente;

/**
 *
 * @author aluno
 */
public class VwPrincipal extends javax.swing.JFrame {
    GerenteDeJanelas gerenteDeJanelas;
    
    
    /** Creates new form VwPrincipal */
    public VwPrincipal() {
        initComponents();
        setIcon();
        this.gerenteDeJanelas = new GerenteDeJanelas(jdpprincipal);
        setLocationRelativeTo( null );
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jdpprincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        mb_principal = new javax.swing.JMenuBar();
        btnProjetista = new javax.swing.JMenu();
        mi_InserirProjetoProjetista = new javax.swing.JMenuItem();
        m_RelatorioProjetista = new javax.swing.JMenu();
        mi_ProjetoProjetista = new javax.swing.JMenuItem();
        mi_StatusProjetoProjetista = new javax.swing.JMenuItem();
        mi_PerfilProjetista = new javax.swing.JMenuItem();
        btnCliente = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mi_ProjetoCliente = new javax.swing.JMenuItem();
        mi_StatusProjetoCliente = new javax.swing.JMenuItem();
        mi_PerfilCliente = new javax.swing.JMenuItem();
        btnGerente = new javax.swing.JMenu();
        mi_GerenciarProjeto = new javax.swing.JMenuItem();
        m_RelatoriosGerente = new javax.swing.JMenu();
        mi_ProjetosGerente = new javax.swing.JMenuItem();
        mi_StatusGerente = new javax.swing.JMenuItem();
        m_GerenciarUsuarioGerente = new javax.swing.JMenu();
        mi_InserirProjetistaGerente = new javax.swing.JMenuItem();
        mi_InserirClienteGerente = new javax.swing.JMenuItem();
        m_Espaco = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaPrincipal.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));

        jdpprincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpprincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpprincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        mb_principal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnProjetista.setText("Projetista");
        btnProjetista.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mi_InserirProjetoProjetista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_InserirProjetoProjetista.setText("Inserir projeto");
        mi_InserirProjetoProjetista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_InserirProjetoProjetistaMouseClicked(evt);
            }
        });
        mi_InserirProjetoProjetista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_InserirProjetoProjetistaActionPerformed(evt);
            }
        });
        btnProjetista.add(mi_InserirProjetoProjetista);

        m_RelatorioProjetista.setText("Relatórios");
        m_RelatorioProjetista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mi_ProjetoProjetista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_ProjetoProjetista.setText("Projeto-Projetista");
        mi_ProjetoProjetista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ProjetoProjetistaActionPerformed(evt);
            }
        });
        m_RelatorioProjetista.add(mi_ProjetoProjetista);

        mi_StatusProjetoProjetista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_StatusProjetoProjetista.setText("Status do Projeto");
        mi_StatusProjetoProjetista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_StatusProjetoProjetistaMouseClicked(evt);
            }
        });
        mi_StatusProjetoProjetista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_StatusProjetoProjetistaActionPerformed(evt);
            }
        });
        m_RelatorioProjetista.add(mi_StatusProjetoProjetista);

        btnProjetista.add(m_RelatorioProjetista);

        mi_PerfilProjetista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_PerfilProjetista.setText("Meu perfil");
        mi_PerfilProjetista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_PerfilProjetistaMouseClicked(evt);
            }
        });
        mi_PerfilProjetista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_PerfilProjetistaActionPerformed(evt);
            }
        });
        btnProjetista.add(mi_PerfilProjetista);

        mb_principal.add(btnProjetista);

        btnCliente.setText("Cliente");
        btnCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenu2.setText("Consultar");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mi_ProjetoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_ProjetoCliente.setText("Projeto");
        mi_ProjetoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_ProjetoClienteMouseClicked(evt);
            }
        });
        mi_ProjetoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ProjetoClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mi_ProjetoCliente);

        mi_StatusProjetoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_StatusProjetoCliente.setText("Status projeto");
        mi_StatusProjetoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_StatusProjetoClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mi_StatusProjetoCliente);

        btnCliente.add(jMenu2);

        mi_PerfilCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_PerfilCliente.setText("Meu perfil");
        mi_PerfilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_PerfilClienteActionPerformed(evt);
            }
        });
        btnCliente.add(mi_PerfilCliente);

        mb_principal.add(btnCliente);

        btnGerente.setText("Gerente");
        btnGerente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mi_GerenciarProjeto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_GerenciarProjeto.setText("Gerenciar projetos");
        mi_GerenciarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_GerenciarProjetoActionPerformed(evt);
            }
        });
        btnGerente.add(mi_GerenciarProjeto);

        m_RelatoriosGerente.setText("Relatórios");
        m_RelatoriosGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mi_ProjetosGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_ProjetosGerente.setText("Projetos");
        mi_ProjetosGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ProjetosGerenteActionPerformed(evt);
            }
        });
        m_RelatoriosGerente.add(mi_ProjetosGerente);

        mi_StatusGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_StatusGerente.setText("Status");
        mi_StatusGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_StatusGerenteActionPerformed(evt);
            }
        });
        m_RelatoriosGerente.add(mi_StatusGerente);

        btnGerente.add(m_RelatoriosGerente);

        m_GerenciarUsuarioGerente.setText("Gerenciar usuários");
        m_GerenciarUsuarioGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mi_InserirProjetistaGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_InserirProjetistaGerente.setText("Projetista");
        mi_InserirProjetistaGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_InserirProjetistaGerenteActionPerformed(evt);
            }
        });
        m_GerenciarUsuarioGerente.add(mi_InserirProjetistaGerente);

        mi_InserirClienteGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mi_InserirClienteGerente.setText("Cliente");
        mi_InserirClienteGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_InserirClienteGerenteActionPerformed(evt);
            }
        });
        m_GerenciarUsuarioGerente.add(mi_InserirClienteGerente);

        btnGerente.add(m_GerenciarUsuarioGerente);

        mb_principal.add(btnGerente);

        m_Espaco.setText("                                                                                                                                                                                                              ");
        m_Espaco.setEnabled(false);
        mb_principal.add(m_Espaco);

        btnSair.setForeground(new java.awt.Color(255, 0, 0));
        btnSair.setText("Sair");
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        mb_principal.add(btnSair);

        setJMenuBar(mb_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String login2 = Constante.login;
        if(login2.equals("gerente")){ 
            this.btnProjetista.setEnabled(false);
            this.btnCliente.setEnabled(false);
            this.btnGerente.setEnabled(true);
        }else if(login2.equals("projetista")){ 
            this.btnProjetista.setEnabled(true);
            this.btnCliente.setEnabled(false);
            this.btnGerente.setEnabled(false);
        }else if(login2.equals("cliente")){ 
            this.btnProjetista.setEnabled(false);
            this.btnCliente.setEnabled(true);
            this.btnGerente.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mi_InserirProjetoProjetistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_InserirProjetoProjetistaMouseClicked
       
    }//GEN-LAST:event_mi_InserirProjetoProjetistaMouseClicked
    
    private void mi_InserirProjetoProjetistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_InserirProjetoProjetistaActionPerformed
        /*VwJIFInserirProjeto ip = new VwJIFInserirProjeto();
        jdpprincipal.add(ip);
        ip.setVisible(true);*/
        gerenteDeJanelas.abrirJanelas(VwJIFInserirProjeto.getInstancia());
    }//GEN-LAST:event_mi_InserirProjetoProjetistaActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        Object[]opcoes = {"Sim","Não"};
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair da aplicação?", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, opcoes, opcoes[0]);
        if(opcao == 0){
            dispose();
            VwLogin login = new VwLogin();
            login.setVisible(true);
        }         
    }//GEN-LAST:event_btnSairMouseClicked

    private void mi_ProjetoProjetistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ProjetoProjetistaActionPerformed
        Constante.relatProjetista = "projetoprojetista";
        VwJIFIdentificaProjetista IdentProj = new VwJIFIdentificaProjetista();
        jdpprincipal.add(IdentProj);
        IdentProj.setVisible(true);
        //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaProjetista.getInstancia());
    }//GEN-LAST:event_mi_ProjetoProjetistaActionPerformed

    private void mi_StatusProjetoProjetistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_StatusProjetoProjetistaActionPerformed
        Constante.relatProjetista = "statusprojetista";
        VwJIFIdentificaProjetista IdentProj = new VwJIFIdentificaProjetista();
        jdpprincipal.add(IdentProj);
        IdentProj.setVisible(true);
        //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaProjetista.getInstancia());
        
    }//GEN-LAST:event_mi_StatusProjetoProjetistaActionPerformed

    private void mi_StatusProjetoProjetistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_StatusProjetoProjetistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_StatusProjetoProjetistaMouseClicked

    private void mi_PerfilProjetistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_PerfilProjetistaActionPerformed
        Constante.relatProjetista = "perfilprojetista";
        VwJIFIdentificaProjetista IdentProj = new VwJIFIdentificaProjetista();
        jdpprincipal.add(IdentProj);
        IdentProj.setVisible(true);
        //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaProjetista.getInstancia());
    }//GEN-LAST:event_mi_PerfilProjetistaActionPerformed

    private void mi_PerfilProjetistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_PerfilProjetistaMouseClicked

    }//GEN-LAST:event_mi_PerfilProjetistaMouseClicked

    private void mi_ProjetoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_ProjetoClienteMouseClicked
        
    }//GEN-LAST:event_mi_ProjetoClienteMouseClicked

    private void mi_ProjetoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ProjetoClienteActionPerformed
        Constante.relatCliente = "projetocliente";
        VwJIFIdentificaCliente IdentCliente = new VwJIFIdentificaCliente();
        jdpprincipal.add(IdentCliente);
        IdentCliente.setVisible(true);
        //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaCliente.getInstancia());
    }//GEN-LAST:event_mi_ProjetoClienteActionPerformed

    private void mi_StatusProjetoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_StatusProjetoClienteActionPerformed
        Constante.relatCliente = "statuscliente";     
        VwJIFIdentificaCliente IdentCliente = new VwJIFIdentificaCliente();
        jdpprincipal.add(IdentCliente);
        IdentCliente.setVisible(true);
        //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaCliente.getInstancia());
    }//GEN-LAST:event_mi_StatusProjetoClienteActionPerformed

    private void mi_PerfilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_PerfilClienteActionPerformed
       Constante.relatCliente = "perfilcliente";
       VwJIFIdentificaCliente IdentCliente = new VwJIFIdentificaCliente();
       jdpprincipal.add(IdentCliente);
       IdentCliente.setVisible(true);
       //gerenteDeJanelas.abrirJanelas(VwJIFIdentificaCliente.getInstancia());
    }//GEN-LAST:event_mi_PerfilClienteActionPerformed

    private void mi_GerenciarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_GerenciarProjetoActionPerformed
       gerenteDeJanelas.abrirJanelas(VwJIFGerenciaProjetoGerente.getInstancia());
    }//GEN-LAST:event_mi_GerenciarProjetoActionPerformed

    private void mi_ProjetosGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ProjetosGerenteActionPerformed
        gerenteDeJanelas.abrirJanelas(VwJIFRelatorioProjetoGerente.getInstancia());
    }//GEN-LAST:event_mi_ProjetosGerenteActionPerformed

    private void mi_StatusGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_StatusGerenteActionPerformed
        gerenteDeJanelas.abrirJanelas(VwJIFStatusProjetoGerente.getInstancia());
    }//GEN-LAST:event_mi_StatusGerenteActionPerformed

    private void mi_InserirProjetistaGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_InserirProjetistaGerenteActionPerformed
        gerenteDeJanelas.abrirJanelas(VwJIFGerenciaProjetistaGerente.getInstancia());
    }//GEN-LAST:event_mi_InserirProjetistaGerenteActionPerformed

    private void mi_InserirClienteGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_InserirClienteGerenteActionPerformed
        gerenteDeJanelas.abrirJanelas(VwJIFGerenciaClienteGerente.getInstancia());
    }//GEN-LAST:event_mi_InserirClienteGerenteActionPerformed
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icone.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCliente;
    private javax.swing.JMenu btnGerente;
    private javax.swing.JMenu btnProjetista;
    private javax.swing.JMenu btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenu m_Espaco;
    private javax.swing.JMenu m_GerenciarUsuarioGerente;
    private javax.swing.JMenu m_RelatorioProjetista;
    private javax.swing.JMenu m_RelatoriosGerente;
    private javax.swing.JMenuBar mb_principal;
    private javax.swing.JMenuItem mi_GerenciarProjeto;
    private javax.swing.JMenuItem mi_InserirClienteGerente;
    private javax.swing.JMenuItem mi_InserirProjetistaGerente;
    private javax.swing.JMenuItem mi_InserirProjetoProjetista;
    private javax.swing.JMenuItem mi_PerfilCliente;
    private javax.swing.JMenuItem mi_PerfilProjetista;
    private javax.swing.JMenuItem mi_ProjetoCliente;
    private javax.swing.JMenuItem mi_ProjetoProjetista;
    private javax.swing.JMenuItem mi_ProjetosGerente;
    private javax.swing.JMenuItem mi_StatusGerente;
    private javax.swing.JMenuItem mi_StatusProjetoCliente;
    private javax.swing.JMenuItem mi_StatusProjetoProjetista;
    // End of variables declaration//GEN-END:variables

}
