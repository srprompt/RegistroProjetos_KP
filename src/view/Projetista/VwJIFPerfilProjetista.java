/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.Projetista;

import static controller.EfetuaConexao.conectaBanco;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ConexaoBD;
import model.Constante;
import model.Projeto;

/**
 *
 * @author Giovanni
 */
public class VwJIFPerfilProjetista extends javax.swing.JInternalFrame {

    private String cod_funcional;
    
    public VwJIFPerfilProjetista(String cod) {
        initComponents();
        this.cod_funcional = cod;
        mostraPerfil();
        desativaCampos();
    }
    
    public void mostraPerfil(){
        
        try{
            ConexaoBD bd = new ConexaoBD();
            
           
            conectaBanco(Constante.servidor, bd, Constante.login, Constante.login); 
            String sql="SELECT * FROM private.perfil_projetista WHERE cod_funcional=" + cod_funcional + ";";
            
            ResultSet rs = bd.stmt.executeQuery(sql);
            
            Projeto projeto;
            while(rs.next()){
                projeto=new Projeto(rs.getInt("cod_funcional"), rs.getString("nome"), rs.getDate("data_nasc"), rs.getInt("id"), rs.getInt("qtde_projetos"));
                txtCodFuncional.setText(String.valueOf(rs.getInt("cod_funcional")));
                txtNome.setText(rs.getString("nome"));
                
                Date dta_nasc = rs.getDate("data_nasc");
                txtDtaNasc.setText(String.valueOf(rs.getDate("data_nasc")));
                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); 
                txtDtaNasc.setText(formatoData.format(dta_nasc));
                
                txtIdProjetista.setText(String.valueOf(rs.getInt("id")));
                txtQtdProjetos.setText(String.valueOf(rs.getInt("qtde_projetos")));
            } 
            bd.Desconectar();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void desativaCampos(){
        txtCodFuncional.setEnabled(false);
        txtCodFuncional.setDisabledTextColor(Color.black);
        txtNome.setEnabled(false);
        txtNome.setDisabledTextColor(Color.black);
        txtDtaNasc.setEnabled(false);
        txtDtaNasc.setDisabledTextColor(Color.black);
        txtIdProjetista.setEnabled(false);
        txtIdProjetista.setDisabledTextColor(Color.black);
        txtQtdProjetos.setEnabled(false);
        txtQtdProjetos.setDisabledTextColor(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCodFuncional = new javax.swing.JLabel();
        txtCodFuncional = new javax.swing.JTextField();
        lblIdProjetista = new javax.swing.JLabel();
        txtIdProjetista = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDtaNasc = new javax.swing.JLabel();
        txtDtaNasc = new javax.swing.JTextField();
        lblQtdProjetos = new javax.swing.JLabel();
        txtQtdProjetos = new javax.swing.JTextField();

        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(46, 134, 222));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jLabel2.setText("Perfil do Projetista");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        lblCodFuncional.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodFuncional.setForeground(new java.awt.Color(255, 255, 255));
        lblCodFuncional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodFuncional.setText("Cód. funcional");

        txtCodFuncional.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodFuncional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodFuncionalActionPerformed(evt);
            }
        });

        lblIdProjetista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIdProjetista.setForeground(new java.awt.Color(255, 255, 255));
        lblIdProjetista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdProjetista.setText("ID");

        txtIdProjetista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdProjetista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProjetista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProjetistaActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblDtaNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDtaNasc.setForeground(new java.awt.Color(255, 255, 255));
        lblDtaNasc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDtaNasc.setText("Data de nasc.");

        txtDtaNasc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDtaNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtaNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtaNascActionPerformed(evt);
            }
        });

        lblQtdProjetos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQtdProjetos.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtdProjetos.setText("Qtd. Projetos");

        txtQtdProjetos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQtdProjetos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtdProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProjetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodFuncional)
                            .addComponent(txtCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIdProjetista, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProjetista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDtaNasc)
                            .addComponent(txtDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQtdProjetos)
                            .addComponent(txtQtdProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblIdProjetista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtIdProjetista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblQtdProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtQtdProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    private void txtCodFuncionalActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtIdProjetistaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtQtdProjetosActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtDtaNascActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCodFuncional;
    private javax.swing.JLabel lblDtaNasc;
    private javax.swing.JLabel lblIdProjetista;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdProjetos;
    private javax.swing.JTextField txtCodFuncional;
    private javax.swing.JTextField txtDtaNasc;
    private javax.swing.JTextField txtIdProjetista;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdProjetos;
    // End of variables declaration                   
}
