/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tllr.visao;

import com.tllr.controle.AcessorioControle;
import com.tllr.controle.IAcessorioControle;
import com.tllr.modelos.Acessorio;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patricia
 */
public class CadastroAcessorios extends javax.swing.JFrame {
    
    IAcessorioControle acessorioControle = new AcessorioControle();
    /**
     * Creates new form CadastroCategorias
     */
    public CadastroAcessorios() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            imprimirDadosNaGrid(acessorioControle.listagem());
        } catch (Exception ex) {
            Logger.getLogger(CadastroAcessorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void imprimirDadosNaGrid(ArrayList<Acessorio> listaDeAcessorios)throws Exception{
            DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Acessorio> lista = listaDeAcessorios.iterator();               

            while (lista.hasNext()) {
                String[] saida = new String[3];
                Acessorio aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorLocacao() + "";
                
                //Incluir nova linha na Tabela
                model.addRow(saida);
                
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelfundo = new javax.swing.JPanel();
        jLabelIdentificador = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelBotaoIncluir = new javax.swing.JLabel();
        jLabelUrl = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanelTopo = new javax.swing.JPanel();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelBotaoAlterar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelfundo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelfundo.setLayout(null);

        jLabelIdentificador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIdentificador.setText("Identificador");
        jPanelfundo.add(jLabelIdentificador);
        jLabelIdentificador.setBounds(20, 142, 86, 20);

        jTextFieldIdentificador.setEditable(false);
        jTextFieldIdentificador.setBackground(new java.awt.Color(255, 255, 255));
        jPanelfundo.add(jTextFieldIdentificador);
        jTextFieldIdentificador.setBounds(20, 168, 107, 22);

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });
        jPanelfundo.add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(139, 168, 373, 22);
        jPanelfundo.add(jLabel2);
        jLabel2.setBounds(1622, 228, 123, 0);

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição");
        jPanelfundo.add(jLabelDescricao);
        jLabelDescricao.setBounds(139, 142, 65, 20);

        jLabelBotaoIncluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBotaoIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/botao incluir normal.png"))); // NOI18N
        jLabelBotaoIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBotaoIncluir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluirMouseMoved(evt);
            }
        });
        jLabelBotaoIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluirMouseExited(evt);
            }
        });
        jPanelfundo.add(jLabelBotaoIncluir);
        jLabelBotaoIncluir.setBounds(20, 295, 90, 40);

        jLabelUrl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUrl.setText("Valor da locação");
        jPanelfundo.add(jLabelUrl);
        jLabelUrl.setBounds(20, 228, 130, 20);

        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        jPanelfundo.add(jTextFieldValor);
        jTextFieldValor.setBounds(20, 254, 120, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("BOTÃO ALTERAR");
        jPanelfundo.add(jLabel9);
        jLabel9.setBounds(1400, 637, 95, 16);

        jPanelTopo.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Cadastro de Acessorios");

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelTitulo)
                .addGap(219, 219, 219)
                .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(846, Short.MAX_VALUE))
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelfundo.add(jPanelTopo);
        jPanelTopo.setBounds(0, 0, 1739, 130);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("BOTÃO ATUALIZAR");
        jPanelfundo.add(jLabel10);
        jLabel10.setBounds(1252, 637, 109, 16);

        jLabelBotaoAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBotaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/botaoalterar.png"))); // NOI18N
        jLabelBotaoAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBotaoAlterar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterarMouseMoved(evt);
            }
        });
        jLabelBotaoAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterarMouseExited(evt);
            }
        });
        jPanelfundo.add(jLabelBotaoAlterar);
        jLabelBotaoAlterar.setBounds(128, 295, 90, 40);

        jButton2.setBackground(new java.awt.Color(21, 21, 88));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImageAnimacoes/curva-de-seta-apontando-para-a-esquerda.png"))); // NOI18N
        jButton2.setText("Marcas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelfundo.add(jButton2);
        jButton2.setBounds(770, 140, 90, 30);

        jButton3.setBackground(new java.awt.Color(21, 21, 88));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImageAnimacoes/casa (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelfundo.add(jButton3);
        jButton3.setBounds(870, 140, 30, 30);

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCategorias.setRowHeight(40);
        jTableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCategorias);

        jPanelfundo.add(jScrollPane2);
        jScrollPane2.setBounds(0, 400, 910, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased

    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
        char e = evt.getKeyChar();

        if (Character.isLowerCase(e)) {
            evt.setKeyChar(Character.toUpperCase(e));
        }
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void jLabelBotaoIncluirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluirMouseMoved
        jLabelBotaoIncluir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon iconeIncluirMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluirencima.png");
        jLabelBotaoIncluir.setIcon(iconeIncluirMouse);
    }//GEN-LAST:event_jLabelBotaoIncluirMouseMoved

    private void jLabelBotaoIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluirMouseClicked
        if(jTextFieldValor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campos faltando");
        }else{
        ImageIcon iconlogo = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluirclicado.png");
        jLabelBotaoIncluir.setIcon(iconlogo);
        try {
            
            Acessorio objeto = new Acessorio(0,jTextFieldDescricao.getText(), Float.parseFloat(jTextFieldValor.getText()));
            
            acessorioControle.nada(objeto);
            acessorioControle.precoVazio(objeto);
            acessorioControle.incluir(objeto);
            jTextFieldDescricao.setText("");
            jTextFieldValor.setText("");
            jTextFieldIdentificador.setText("");
            imprimirDadosNaGrid(acessorioControle.listagem());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        }
    }//GEN-LAST:event_jLabelBotaoIncluirMouseClicked

    private void jLabelBotaoIncluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluirMouseExited
        ImageIcon iconeIncluirMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluir.png");
        jLabelBotaoIncluir.setIcon(iconeIncluirMouse);
    }//GEN-LAST:event_jLabelBotaoIncluirMouseExited

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed

    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jLabelBotaoAlterarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterarMouseMoved
        jLabelBotaoAlterar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterarencima.png");
        jLabelBotaoAlterar.setIcon(iconeAlterarMouse);
    }//GEN-LAST:event_jLabelBotaoAlterarMouseMoved

    private void jLabelBotaoAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterarMouseClicked
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterarclicado.png");
        jLabelBotaoAlterar.setIcon(iconeAlterarMouse);

        if(jTableCategorias.getSelectedRow() != -1){
            try {
                Acessorio objetoAlterar = new Acessorio(Integer.parseInt(jTextFieldIdentificador.getText()), jTextFieldDescricao.getText(), Float.parseFloat(jTextFieldValor.getText()));

                acessorioControle.alterar(objetoAlterar);
                imprimirDadosNaGrid(acessorioControle.listagem());
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Só é possível alterar uma marca válida");
        }

    }//GEN-LAST:event_jLabelBotaoAlterarMouseClicked

    private void jLabelBotaoAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterarMouseExited
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterar.png");
        jLabelBotaoAlterar.setIcon(iconeAlterarMouse);
    }//GEN-LAST:event_jLabelBotaoAlterarMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroMarcas chamar = new CadastroMarcas();
        this.dispose();
        chamar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriasMouseClicked
         jTextFieldIdentificador.setText(jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0).toString());
        jTextFieldDescricao.setText(jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 1).toString());
        jTextFieldValor.setText(jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTableCategoriasMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAcessorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBotaoAlterar;
    private javax.swing.JLabel jLabelBotaoIncluir;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JPanel jPanelfundo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

}
