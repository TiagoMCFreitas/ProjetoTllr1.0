/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tllr.visao;

import com.tllr.controle.ILoginControle;
import com.tllr.controle.LoginControle;
import com.tllr.modelos.Login;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class TelaRecadastrarSenha extends javax.swing.JFrame {
    ILoginControle loginControle = new LoginControle();
    String texto;
    boolean mostrar = true;
    boolean mostrar2 = true;
    /**
     * Creates new form TelaCadastro
     */
    public TelaRecadastrarSenha() {
        initComponents();
        setBounds(0, 0, 715 , 555);
        setLocationRelativeTo(null);
        tf.setBounds(0,0,0,0);
        add(tf);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTopo2 = new javax.swing.JPanel();
        jLabelEmpresa2 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabelTitulo3 = new javax.swing.JLabel();
        jLabelTitulo6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTitulo5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTitulo7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTopo2.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setText("Cadastro de funcionários");

        javax.swing.GroupLayout jPanelTopo2Layout = new javax.swing.GroupLayout(jPanelTopo2);
        jPanelTopo2.setLayout(jPanelTopo2Layout);
        jPanelTopo2Layout.setHorizontalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanelTopo2Layout.setVerticalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopo2Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabelTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo3.setText("Senha");

        jLabelTitulo6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo6.setText("Insira sua nova senha");

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setEnabled(false);

        jLabelTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo5.setText("Email");

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setEnabled(false);

        jLabelTitulo7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo7.setText("Nome");

        jPasswordField1.setPreferredSize(new java.awt.Dimension(64, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/olho (2).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTitulo6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton1))
                    .addComponent(jLabelTitulo3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitulo5)
                        .addComponent(jTextFieldEmail)
                        .addComponent(jLabelTitulo7)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabelTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTopo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTopo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ILoginControle controle = new LoginControle();
            int id = 0;
            ArrayList<Login> lista = controle.verificar();
            for(int i = 0; i <lista.size();i++){
                if(lista.get(i).getNome().equals(jTextFieldNome.getText())){
                   id = lista.get(i).getId();
                }
            }
            Login objetoLogin = new Login(id, jTextFieldNome.getText(), texto, jTextFieldEmail.getText());
            ILoginControle objeto = new LoginControle();
            objeto.alterar(objetoLogin);
            TelaDeLogin chamar = new TelaDeLogin();
            this.dispose();
            chamar.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaRecadastrarSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(mostrar == true){
         texto = jPasswordField1.getText();
        jPasswordField1.setBounds(0,0,0,0);
        tf.setBounds(84,258,184,28);
        tf.setText(texto);
        mostrar = false;
        }
        else{
         texto = tf.getText();
        tf.setBounds(0,0,0,0);
        jPasswordField1.setBounds(84,258,184,28);
        jPasswordField1.setText(texto);   
        mostrar = true;
        }
        
            
    }//GEN-LAST:event_jButton2ActionPerformed
    public void enviar(String nome, String email){
    jTextFieldNome.setText(nome);
    jTextFieldEmail.setText(email);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRecadastrarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecadastrarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecadastrarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecadastrarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecadastrarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelEmpresa2;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JLabel jLabelTitulo5;
    private javax.swing.JLabel jLabelTitulo6;
    private javax.swing.JLabel jLabelTitulo7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTopo2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
