package com.tllr.visao;

import com.tllr.codigoFuncionario.CODIGO;
import com.tllr.controle.ILoginControle;
import com.tllr.controle.LoginControle;
import com.tllr.modelos.Login;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class TelaDeLogin extends javax.swing.JFrame {
    Telas telaPrincipal;
    private Point point = new Point();
    ILoginControle loginControle = new LoginControle();
    boolean click;
    boolean mostrar = true;
    String texto;
    int id;
    Login objetoLogin;
    File arquivo = new File("./src/com/tllr/arquivosdedados/LoginTemporario.txt");

    /**
     * Creates new form TesteDeLogin
     */
    public TelaDeLogin() {
        initComponents();
        setLocationRelativeTo(null);
      
        tf.setBounds(0,0,0,0);
        try {
            if (arquivo.exists() == true) {
                jCheckBox2.setSelected(true);
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                String linha = "";
                while ((linha = br.readLine()) != null) {
                    Login objeto = new Login();
                    String vetorString[] = linha.split(";");
                    id = Integer.parseInt(vetorString[0]);
                    
                }
                jTextField1.setText(loginControle.buscar(id).getNome());
                texto = loginControle.buscar(id).getSenha();
                jPasswordField1.setText(texto);
                click = false;
                br.close();
            }
            if (arquivo.exists() == false) {
                jCheckBox2.setSelected(false);
                click = true;
            }
        } catch (Exception e) {
            
        }
        setBounds(0, 0, 1032, 618);
        setLocationRelativeTo(null);
        ImageIcon logar = new ImageIcon("./src/Imagens/Images/LOGAR2.png");
        jLabelLogar.setIcon(logar);
        ImageIcon cadastrar = new ImageIcon("./src/Imagens/Images/cadastro.png");
        jLabelCadastrar.setIcon(cadastrar);
        
        try {
            loginControle.seNaoExistirId();
        } catch (Exception ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLogar = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        faleConosco = new javax.swing.JLabel();
        privacidadeDePolitica = new javax.swing.JLabel();
        redesSociais = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 104, 47, 25);

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(40, 145, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/loginesenha.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 130, 210, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(24, 187, 52, 25);

        jLabelLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/LOGAR2.png"))); // NOI18N
        jLabelLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelLogarMouseMoved(evt);
            }
        });
        jLabelLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLogarMouseExited(evt);
            }
        });
        jPanel1.add(jLabelLogar);
        jLabelLogar.setBounds(40, 390, 205, 46);

        jLabelCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/cadastro.png"))); // NOI18N
        jLabelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseMoved(evt);
            }
        });
        jLabelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseExited(evt);
            }
        });
        jPanel1.add(jLabelCadastrar);
        jLabelCadastrar.setBounds(40, 450, 205, 50);

        jPasswordField1.setBackground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(40, 225, 170, 30);

        tf.setBackground(new java.awt.Color(153, 153, 153));
        tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf.setBorder(null);
        jPanel1.add(tf);
        tf.setBounds(0, 0, 0, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo(a)!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(6, 42, 161, 32);

        jLabel7.setText("Esqueci a senha");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 320, 100, 16);

        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelEstadoMouseMoved(evt);
            }
        });
        jPanel1.add(jLabelEstado);
        jLabelEstado.setBounds(50, 350, 181, 26);

        jCheckBox2.setText("Mantenha conectado");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(40, 280, 136, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/loginesenha.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 220, 210, 40);

        jButton1.setBackground(new java.awt.Color(36, 61, 128));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/olho (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 230, 30, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(750, 0, 280, 620);

        faleConosco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faleConosco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faleConoscoMouseClicked(evt);
            }
        });
        getContentPane().add(faleConosco);
        faleConosco.setBounds(150, 590, 130, 20);

        privacidadeDePolitica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        privacidadeDePolitica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                privacidadeDePoliticaMouseClicked(evt);
            }
        });
        getContentPane().add(privacidadeDePolitica);
        privacidadeDePolitica.setBounds(300, 590, 190, 20);

        redesSociais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redesSociais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redesSociaisMouseClicked(evt);
            }
        });
        getContentPane().add(redesSociais);
        redesSociais.setBounds(27, 590, 100, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/Tela de login beta (1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -40, 750, 680);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/Tela de login beta (1).png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -30, 750, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void jLabelLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogarMouseClicked
        ImageIcon logar = new ImageIcon("./src/Imagens/ImageAnimacoes/LOGARSuavizado.png");
        jLabelLogar.setIcon(logar);
        Point p = this.getLocation();
        TelaDeLogin testeDeLogin2 = this;
        try {
            if(mostrar == true){
            objetoLogin = new Login(0, jTextField1.getText(), jPasswordField1.getText(), "");
            }
            else{
            objetoLogin = new Login(0, jTextField1.getText(), tf.getText(), "");
            }
                
            if (loginControle.achar(objetoLogin) == true) {
                this.dispose();
                telaPrincipal = new Telas();
                telaPrincipal.receber(jTextField1.getText());
                JOptionPane.showMessageDialog(this, loginControle.liberar(objetoLogin));
                jLabelEstado.setText("");
                telaPrincipal.setVisible(true);
                
            } else {
                
                ImageIcon LoginESenhaErrado = new ImageIcon("./src/Imagens/Images/campodeloginesenhaerrado.png");
                jLabel4.setIcon(LoginESenhaErrado);
                jLabel6.setIcon(LoginESenhaErrado);
                jLabelEstado.setText("Login/Senha errado!");
                jLabelEstado.setForeground(Color.red);
                new Thread() {
                    
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < 6; i++) {
                                testeDeLogin2.setLocation(p.x - 10, p.y);
                                sleep(20);
                                testeDeLogin2.setLocation(p.x + 10, p.y);
                                sleep(20);
                            }
                            testeDeLogin2.setLocation(p.x, p.y);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                }.start();
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jLabelLogarMouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(new Color(255, 255, 255));
        

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setText("Esqueci a senha");

    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            TelaEsqueceuSenha chamar = new TelaEsqueceuSenha();
            CODIGO senha = new CODIGO();
            senha.incluir();
            this.dispose();
            chamar.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jLabel7MouseClicked

    private void redesSociaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redesSociaisMouseClicked
        try {
            
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
            
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_redesSociaisMouseClicked

    private void faleConoscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faleConoscoMouseClicked
        try {
            
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
            
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_faleConoscoMouseClicked

    private void privacidadeDePoliticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_privacidadeDePoliticaMouseClicked
        try {
            
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
            
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_privacidadeDePoliticaMouseClicked

    private void jLabelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseClicked
        ImageIcon botaoCadastrar = new ImageIcon("./src/Imagens/ImageAnimacoes/cadastroLuminoso.png");
        jLabelCadastrar.setIcon(botaoCadastrar);
        CODIGO senha = new CODIGO();
        try {
            senha.incluir();
            this.dispose();
            InformarEmail chamar = new InformarEmail();
            chamar.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabelCadastrarMouseClicked

    private void jLabelLogarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogarMouseMoved
        ImageIcon botaoLogar = new ImageIcon("./src/Imagens/ImageAnimacoes/LOGARLuminoso.png");
        jLabelLogar.setIcon(botaoLogar);
    }//GEN-LAST:event_jLabelLogarMouseMoved

    private void jLabelLogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogarMouseExited
        
        ImageIcon botaoLogar = new ImageIcon("./src/Imagens/Images/LOGAR2.png");
        jLabelLogar.setIcon(botaoLogar);

    }//GEN-LAST:event_jLabelLogarMouseExited

    private void jLabelCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseExited
        ImageIcon botaoCadastrar = new ImageIcon("./src/Imagens/Images/cadastro.png");
        jLabelCadastrar.setIcon(botaoCadastrar);
    }//GEN-LAST:event_jLabelCadastrarMouseExited

    private void jLabelCadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseMoved
        ImageIcon botaoCadastrar = new ImageIcon("./src/Imagens/ImageAnimacoes/cadastroLuminoso.png");
        jLabelCadastrar.setIcon(botaoCadastrar);

    }//GEN-LAST:event_jLabelCadastrarMouseMoved

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        try {
            jLabelEstado.setForeground(Color.black);
            if(mostrar == true){
            objetoLogin = new Login(0, jTextField1.getText(), jPasswordField1.getText(), "");
            }
            else{
            objetoLogin = new Login(0, jTextField1.getText(), tf.getText(), "");
            }
            
            if (loginControle.achar(objetoLogin) == false) {
                JOptionPane.showMessageDialog(this, "Usuário não encontrado ou senha alterada");
                jCheckBox2.setSelected(false);
                jLabelEstado.setText("Usuário não cadastrado");
                click = true;
            } else {
                if (click == true) {
                    click = false;
                    loginControle.manterConectado(jTextField1.getText());
                    jLabelEstado.setForeground(Color.green);
                    jLabelEstado.setText("Salvo!");
                    
                } else {
                    jLabelEstado.setForeground(Color.red);
                    jLabelEstado.setText("Não está salvo");
                    JOptionPane pane = new JOptionPane("Usuario desconectado", JOptionPane.QUESTION_MESSAGE, JOptionPane.DEFAULT_OPTION);
                    JDialog dialog = pane.createDialog("Confirmação");
                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.setVisible(true);
                    arquivo.delete();
                    click = true;
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        ImageIcon loginESenhaCorreto = new ImageIcon("./src/Imagens/Images/loginesenha.png");
        jLabel4.setIcon(loginESenhaCorreto);
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        ImageIcon loginESenhaCorreto = new ImageIcon("./src/Imagens/Images/loginesenha.png");
        jLabel6.setIcon(loginESenhaCorreto);
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabelEstadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstadoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEstadoMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(mostrar == true){
        texto = jPasswordField1.getText();
        jPasswordField1.setBounds(0,0,0,0);
        tf.setText(texto);
        tf.setBounds(43,225,170,28);
        mostrar = false;
        }
        else{
        texto = tf.getText();
        tf.setBounds(0,0,0,0);
        jPasswordField1.setText(texto); 
        jPasswordField1.setBounds(43,225,170,28);
        mostrar = true;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faleConosco;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLogar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel privacidadeDePolitica;
    private javax.swing.JLabel redesSociais;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
