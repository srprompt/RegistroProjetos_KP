/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.Cliente;

import static controller.EfetuaConexao.conectaBanco;
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import model.ConexaoBD;
import model.Constante;
import model.Projeto;
import model.Tabela;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 *
 * @author Giovanni
 */
public class VwJIFStatusProjetoCliente extends javax.swing.JInternalFrame {
    
    private String cpf;
    private Date d_inicio;
    private Date d_fim;
    private int diff;
    private int cod_proj;
    
    public VwJIFStatusProjetoCliente(String cpf) {
        
            try{
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            }catch(Exception e){
                //System.out.println("deu ruim");
            }
        initComponents();
        this.cpf = cpf;
        mostra_projeto();
        recebeDadosBarraProgresso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_StatusProjetoCliente = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblProgresso = new javax.swing.JLabel();
        jpb_BarraProgresso = new javax.swing.JProgressBar();
        txtBusca = new javax.swing.JTextField();
        lblBusca = new javax.swing.JLabel();

        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(46, 134, 222));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status do Projeto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jt_StatusProjetoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numero", "descricao", "status"
            }
        ));
        jt_StatusProjetoCliente.setAutoscrolls(false);
        jt_StatusProjetoCliente.setShowGrid(false);
        jt_StatusProjetoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_StatusProjetoClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_StatusProjetoCliente);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProgresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProgresso.setForeground(new java.awt.Color(255, 255, 255));
        lblProgresso.setText("PROGRESSO:");

        jpb_BarraProgresso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jpb_BarraProgresso.setToolTipText("");
        jpb_BarraProgresso.setStringPainted(true);

        txtBusca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
        });

        lblBusca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBusca.setForeground(new java.awt.Color(255, 255, 255));
        lblBusca.setText("Buscar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProgresso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpb_BarraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpb_BarraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<Projeto> projetoList(){
        ArrayList<Projeto> projetosList = new ArrayList<>();
        try{
            ConexaoBD bd = new ConexaoBD();
           
            conectaBanco(Constante.servidor, bd, Constante.login, Constante.login);
            String sql="SELECT * FROM private.status \n" +
                        "WHERE cpf='" + cpf + "';";

            ResultSet rs = bd.stmt.executeQuery(sql);
            Projeto projeto;
            while(rs.next()){
                projeto=new Projeto(rs.getInt("numero"), rs.getString("descricao"), rs.getString("status"));
                projetosList.add(projeto);
            }
            bd.Desconectar();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return projetosList;     
    }

    /**
     *
     */
    public void mostra_projeto(){
        ArrayList<Projeto> list = projetoList();
        DefaultTableModel model = (DefaultTableModel)jt_StatusProjetoCliente.getModel();
        Object[] row = new Object[3];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getNumero();
            row[1]=list.get(i).getDescricao();
            row[2]=list.get(i).getStatus();
            model.addRow(row);
        }
        Tabela.ordenaTabela(jt_StatusProjetoCliente);
    }
    
    
    public void recebeDadosBarraProgresso(){
      
        try{
            ConexaoBD bd = new ConexaoBD();
           
            conectaBanco(Constante.servidor, bd, Constante.login, Constante.login);
            String sql="SELECT data_inicio, data_termino, CURRENT_DATE AS data_hoje FROM private.projeto "
                    + "WHERE numero=" + cod_proj + ";";
            
            ResultSet rs = bd.stmt.executeQuery(sql);
            Projeto projeto;
            while(rs.next()){
                projeto=new Projeto(rs.getDate("data_inicio"), rs.getDate("data_termino"));
                d_inicio = (Date)rs.getDate("data_inicio");
                d_fim = (Date)rs.getDate("data_termino");
            }
            bd.Desconectar();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
      private void chamaBarraProgresso(){
       UIManager.put("nimbusOrange", new Color(241, 227, 0));
        new Thread(){
            public void run(){
                int i=0;
                if(diff<=0){
                    diff=1;
                }else if(diff>100){
                    diff=101;
                }
                for(i = 0; i<diff; i++){
                    try {
                        sleep(10);
                        jpb_BarraProgresso.setValue(i+1);
                        String s = String.valueOf(i+1+"%");
                         jpb_BarraProgresso.setString(s);
                        if(i==100){
                            jpb_BarraProgresso.setString(100+"%");
                            jpb_BarraProgresso.setForeground(Color.black);
                            UIManager.put("nimbusOrange", new Color(0,204,0));
                         }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(VwJIFStatusProjetoCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
   }
    
    private void jt_StatusProjetoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_StatusProjetoClienteMouseClicked
        int row = jt_StatusProjetoCliente.getSelectedRow();
        
        cod_proj = (int) jt_StatusProjetoCliente.getValueAt(row, 0);
        
        recebeDadosBarraProgresso();
       
        DateTime dtHoje = new DateTime(); 
        DateTime dtInicio = new DateTime(DateTime.parse(d_inicio.toString()));
        DateTime dtFim = new DateTime(DateTime.parse(d_fim.toString())); 
        Duration durHjInicio = new Duration(dtInicio, dtHoje);
        Duration durFimInicio = new Duration(dtInicio, dtFim);

        double dif = (double)durHjInicio.getStandardDays();
        double dif2 = (double)durFimInicio.getStandardDays();

        double dif3 = (dif/dif2)*100;

        diff = (int)dif3;

        chamaBarraProgresso();
    }//GEN-LAST:event_jt_StatusProjetoClienteMouseClicked

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        Tabela.buscaNaTabela(jt_StatusProjetoCliente, txtBusca);
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped

    }//GEN-LAST:event_txtBuscaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpb_BarraProgresso;
    private javax.swing.JTable jt_StatusProjetoCliente;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblProgresso;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
    
}
