/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tllr.visao;

import com.tllr.controle.IMarcaControle;
import com.tllr.controle.IModeloControle;
import com.tllr.controle.MarcaControle;
import com.tllr.controle.ModeloControle;
import com.tllr.imagensnatabela.JTableRenderer;
import com.tllr.modelos.Marca;
import com.tllr.modelos.Modelo;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patricia
 */
public class CadastroModelos extends javax.swing.JFrame {

    IMarcaControle objetoMarca = new MarcaControle();
    IModeloControle modeloControle = new ModeloControle();
    InclusaoModelos chamar = new InclusaoModelos(this, rootPaneCheckingEnabled);
    public CadastroModelos() {
        initComponents();
    
        try{
            modeloControle.seNaoExistirArquivo();
            modeloControle.seNaoExistirId();
        }catch(Exception e){
            
        }
        
        
        try {
            ArrayList<Marca> lista = objetoMarca.listagem();
            int tamanho = lista.size();
            String[] relacaoMarcas = new String[tamanho];
            for (int i = 0; i < lista.size(); i++) {
                relacaoMarcas[i] = lista.get(i).getDescricao();
                jComboBoxMarca2.addItem(relacaoMarcas[i]);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Marca não existe");
        }

        jTextFieldIdentificador.setEnabled(true);
        jTextFieldUrl.setEnabled(true);
        jTextFieldIdentificador.setEditable(false);
        jTextFieldUrl.setEditable(false);
        setLocationRelativeTo(null);
        try {

            imprimirDadosNaGrid(modeloControle.listagemModelo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }

    public void imprimirDadosNaGrid(ArrayList<Modelo> listaDeModelos) {
        DefaultTableModel model = (DefaultTableModel) jTableModelos.getModel();
        JTableRenderer JtableRenderer = new JTableRenderer();
        jTableModelos.getColumnModel().getColumn(3).setCellRenderer(JtableRenderer);
        jTableModelos.getColumnModel().getColumn(4).setCellRenderer(JtableRenderer);

        Collections.sort(listaDeModelos);
        model.setNumRows(0);
        Iterator<Modelo> lista = listaDeModelos.iterator();

        try {
            while (lista.hasNext()) {
                String[] saida = new String[4];
                Modelo aux = lista.next();
                saida[0] = "" + aux.getId();
                saida[1] = aux.getDescricao();
                saida[2] = aux.getUrl();
                saida[3] = objetoMarca.buscar(aux.getMarca().getId()).getUrl();
                //Incluir nova linha na Tabela
                model.addRow(saida);
            }

        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo2 = new javax.swing.JPanel();
        jLabelMarca2 = new javax.swing.JLabel();
        jComboBoxMarca2 = new javax.swing.JComboBox<>();
        jLabelBotaoBuscar2 = new javax.swing.JLabel();
        jLabelBotaoAlterar2 = new javax.swing.JLabel();
        jLabelBotaoIncluir2 = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabelModeloVeiculo4 = new javax.swing.JLabel();
        jPanelTopo2 = new javax.swing.JPanel();
        jLabelEmpresa2 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelBordaModelo = new javax.swing.JLabel();
        jLabelMarcaLogo = new javax.swing.JLabel();
        jLabelBorda1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabelIdentificador = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldUrl = new javax.swing.JTextField();
        jLabelUrl = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFundo2.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo2.setLayout(null);

        jLabelMarca2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMarca2.setText("Marca");
        jPanelFundo2.add(jLabelMarca2);
        jLabelMarca2.setBounds(20, 290, 42, 20);

        jComboBoxMarca2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxMarca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxMarca2MouseClicked(evt);
            }
        });
        jComboBoxMarca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarca2ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jComboBoxMarca2);
        jComboBoxMarca2.setBounds(20, 320, 160, 22);

        jLabelBotaoBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBotaoBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/botao buscar normal.png"))); // NOI18N
        jLabelBotaoBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBotaoBuscar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBotaoBuscar2MouseMoved(evt);
            }
        });
        jLabelBotaoBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoBuscar2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBotaoBuscar2MouseExited(evt);
            }
        });
        jPanelFundo2.add(jLabelBotaoBuscar2);
        jLabelBotaoBuscar2.setBounds(420, 360, 93, 43);

        jLabelBotaoAlterar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBotaoAlterar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/botaoalterar.png"))); // NOI18N
        jLabelBotaoAlterar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBotaoAlterar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterar2MouseMoved(evt);
            }
        });
        jLabelBotaoAlterar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterar2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBotaoAlterar2MouseExited(evt);
            }
        });
        jPanelFundo2.add(jLabelBotaoAlterar2);
        jLabelBotaoAlterar2.setBounds(120, 360, 90, 40);

        jLabelBotaoIncluir2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBotaoIncluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/botao incluir normal.png"))); // NOI18N
        jLabelBotaoIncluir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBotaoIncluir2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluir2MouseMoved(evt);
            }
        });
        jLabelBotaoIncluir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluir2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBotaoIncluir2MouseExited(evt);
            }
        });
        jPanelFundo2.add(jLabelBotaoIncluir2);
        jLabelBotaoIncluir2.setBounds(10, 360, 90, 40);

        jLabelLogo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogo2.setText("Logo");
        jPanelFundo2.add(jLabelLogo2);
        jLabelLogo2.setBounds(850, 150, 60, 32);

        jLabelModeloVeiculo4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelModeloVeiculo4.setText("Modelo Veículo");
        jPanelFundo2.add(jLabelModeloVeiculo4);
        jLabelModeloVeiculo4.setBounds(560, 150, 180, 32);

        jPanelTopo2.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setText("Cadastro de modelos");

        javax.swing.GroupLayout jPanelTopo2Layout = new javax.swing.GroupLayout(jPanelTopo2);
        jPanelTopo2.setLayout(jPanelTopo2Layout);
        jPanelTopo2Layout.setHorizontalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanelTopo2Layout.setVerticalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopo2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFundo2.add(jPanelTopo2);
        jPanelTopo2.setBounds(0, 0, 950, 130);
        jPanelFundo2.add(jLabelModelo);
        jLabelModelo.setBounds(590, 210, 140, 100);

        jLabelBordaModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBordaModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/bordamodelo.png"))); // NOI18N
        jPanelFundo2.add(jLabelBordaModelo);
        jLabelBordaModelo.setBounds(540, 200, 230, 120);

        jLabelMarcaLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFundo2.add(jLabelMarcaLogo);
        jLabelMarcaLogo.setBounds(840, 210, 70, 70);

        jLabelBorda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/borda.png"))); // NOI18N
        jPanelFundo2.add(jLabelBorda1);
        jLabelBorda1.setBounds(830, 200, 90, 90);

        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelos", "URL", "Foto", "Logo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableModelos.setRowHeight(55);
        jTableModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableModelos);
        if (jTableModelos.getColumnModel().getColumnCount() > 0) {
            jTableModelos.getColumnModel().getColumn(3).setCellRenderer(new JTableRenderer());
            jTableModelos.getColumnModel().getColumn(4).setCellRenderer(new JTableRenderer());
        }

        jPanelFundo2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 420, 930, 210);

        jTextFieldIdentificador.setEditable(false);
        jTextFieldIdentificador.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdentificador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelFundo2.add(jTextFieldIdentificador);
        jTextFieldIdentificador.setBounds(20, 210, 107, 22);

        jLabelIdentificador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIdentificador.setText("Identificador");
        jPanelFundo2.add(jLabelIdentificador);
        jLabelIdentificador.setBounds(20, 190, 86, 20);

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição");
        jPanelFundo2.add(jLabelDescricao);
        jLabelDescricao.setBounds(150, 190, 92, 20);

        jTextFieldUrl.setEditable(false);
        jTextFieldUrl.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUrlMouseClicked(evt);
            }
        });
        jTextFieldUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUrlActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jTextFieldUrl);
        jTextFieldUrl.setBounds(20, 260, 506, 22);

        jLabelUrl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUrl.setText("URL");
        jPanelFundo2.add(jLabelUrl);
        jLabelUrl.setBounds(20, 240, 26, 20);

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });
        jPanelFundo2.add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(150, 210, 380, 22);

        jButton2.setBackground(new java.awt.Color(21, 21, 88));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImageAnimacoes/curva-de-seta-apontando-para-a-esquerda.png"))); // NOI18N
        jButton2.setText("Marcas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jButton2);
        jButton2.setBounds(10, 140, 90, 30);

        jButton3.setBackground(new java.awt.Color(21, 21, 88));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImageAnimacoes/casa (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jButton3);
        jButton3.setBounds(110, 140, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMarca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMarca2MouseClicked

    }//GEN-LAST:event_jComboBoxMarca2MouseClicked

    private void jComboBoxMarca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarca2ActionPerformed
        try {

            ArrayList<Marca> lista = objetoMarca.listagem();

            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarca2.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    ImageIcon iconlogo = new ImageIcon(lista.get(i).getUrl());
                    iconlogo.setImage(iconlogo.getImage().getScaledInstance(jLabelMarcaLogo.getWidth(), jLabelMarcaLogo.getHeight(), 1));
                    jLabelMarcaLogo.setIcon(iconlogo);
                }

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Marca não existe");
        }

    }//GEN-LAST:event_jComboBoxMarca2ActionPerformed

    private void jLabelBotaoBuscar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoBuscar2MouseMoved
        jLabelBotaoBuscar2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon iconeBuscarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaobuscarencima.png");
        jLabelBotaoBuscar2.setIcon(iconeBuscarMouse);
    }//GEN-LAST:event_jLabelBotaoBuscar2MouseMoved

    private void jLabelBotaoBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoBuscar2MouseClicked
        ImageIcon iconeBuscarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaobuscarclicado.png");
        jLabelBotaoBuscar2.setIcon(iconeBuscarMouse);
        

        try {

            JFileChooser fc = new JFileChooser("./src/Imagens/imagesModelo");
            File workingDirectory = new File("./src/Imagens/imagesModelo");
            fc.setCurrentDirectory(workingDirectory);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivologo = fc.getSelectedFile();
            File arquivopasta = fc.getCurrentDirectory();
            String nomeDoArquivo = "./src/Imagens/imagesModelo/";
            String nomeFinal = nomeDoArquivo + arquivopasta.getName()+"/"+ arquivologo.getName();
            jTextFieldUrl.setText(nomeFinal);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo +arquivopasta.getName()+"/"+ arquivologo.getName());
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelModelo.getWidth(), jLabelModelo.getHeight(), 1));
            jLabelModelo.setIcon(iconLogo);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Nenhum arquivo selecionado");
        }
    }//GEN-LAST:event_jLabelBotaoBuscar2MouseClicked

    private void jLabelBotaoBuscar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoBuscar2MouseExited
        ImageIcon iconeBuscarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaobuscar.png");
        jLabelBotaoBuscar2.setIcon(iconeBuscarMouse);
    }//GEN-LAST:event_jLabelBotaoBuscar2MouseExited

    private void jLabelBotaoAlterar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterar2MouseMoved
        jLabelBotaoAlterar2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterarencima.png");
        jLabelBotaoAlterar2.setIcon(iconeAlterarMouse);
    }//GEN-LAST:event_jLabelBotaoAlterar2MouseMoved

    private void jLabelBotaoAlterar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterar2MouseClicked
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterarclicado.png");
        jLabelBotaoAlterar2.setIcon(iconeAlterarMouse);
        if(jTableModelos.getSelectedRow() != -1){
        try {

            int idMarca = 0;
            
            Modelo objetoAlterar = new Modelo(Integer.parseInt(jTextFieldIdentificador.getText()), jTextFieldDescricao.getText(),jTextFieldUrl.getText(),objetoMarca.buscar(idMarca));
             
            ArrayList<Marca> lista = objetoMarca.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarca2.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objetoAlterar.setMarca(lista.get(i));
                }
            }
           
            modeloControle.alterar(objetoAlterar);
            imprimirDadosNaGrid(modeloControle.listagemModelo());
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(this, "Só é possível alterar um modelo válido");
        }
    }//GEN-LAST:event_jLabelBotaoAlterar2MouseClicked
    
    private void jLabelBotaoAlterar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoAlterar2MouseExited
        ImageIcon iconeAlterarMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterar.png");
        jLabelBotaoAlterar2.setIcon(iconeAlterarMouse);
    }//GEN-LAST:event_jLabelBotaoAlterar2MouseExited

    private void jLabelBotaoIncluir2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluir2MouseMoved

        jLabelBotaoIncluir2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon iconeIncluirMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluirencima.png");
        jLabelBotaoIncluir2.setIcon(iconeIncluirMouse);
    }//GEN-LAST:event_jLabelBotaoIncluir2MouseMoved

    private void jLabelBotaoIncluir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluir2MouseClicked
        ImageIcon iconlogo = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluirclicado.png");
        jLabelBotaoIncluir2.setIcon(iconlogo);

        try {

            int idMarca = 0;
            File path = new File(jTextFieldUrl.getText());
            String string1 = jTextFieldUrl.getText();
            String[] result = string1.split("/");
          
            String logo = "./src/Imagens/imagesModelo/" + result[4]+"/"+  path.getName(); 
            Modelo objeto = new Modelo(0, jTextFieldDescricao.getText(), logo, objetoMarca.buscar(idMarca));
            ArrayList<Marca> lista = objetoMarca.listagem();
            for (int i = 0; i < lista.size(); i++) {
                if (jComboBoxMarca2.getSelectedItem().equals(lista.get(i).getDescricao())) {
                    objeto.setMarca(lista.get(i));
                }
            }

            modeloControle.nada(objeto);
            modeloControle.semFoto(objeto);
            modeloControle.mesmaFoto(objeto);
            modeloControle.incluir(objeto);
            timer.setRepeats(false);
            timer.start();
            chamar.setVisible(true);
            jTextFieldDescricao.setText("");
            jTextFieldUrl.setText("");
            jLabelModelo.setIcon(null);
            imprimirDadosNaGrid(modeloControle.listagemModelo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jLabelBotaoIncluir2MouseClicked

    private void jLabelBotaoIncluir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoIncluir2MouseExited
        ImageIcon iconeIncluirMouse = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoincluir.png");
        jLabelBotaoIncluir2.setIcon(iconeIncluirMouse);
    }//GEN-LAST:event_jLabelBotaoIncluir2MouseExited

    private void jTableModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelosMouseClicked
        try {
           
            jTextFieldIdentificador.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 0).toString());
            jTextFieldDescricao.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 1).toString());
            jTextFieldUrl.setText(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2).toString());
             int idModelo = Integer.parseInt(jTextFieldIdentificador.getText());
            jComboBoxMarca2.setSelectedItem(modeloControle.buscar(idModelo).getMarca().getDescricao());
            
            
            String nome = jTextFieldUrl.getText();
            ImageIcon logo = new ImageIcon(nome);
            logo.setImage(logo.getImage().getScaledInstance(jLabelModelo.getWidth(), jLabelModelo.getHeight(), 1));
            jLabelModelo.setIcon(logo);
            
        } catch (Exception ex) {
            Logger.getLogger(CadastroModelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableModelosMouseClicked

    private void jTextFieldUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUrlActionPerformed

                  
    }//GEN-LAST:event_jTextFieldUrlActionPerformed

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
        char e = evt.getKeyChar();

        if (Character.isLowerCase(e)) {
            evt.setKeyChar(Character.toUpperCase(e));
        }
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void jTextFieldUrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUrlMouseClicked
try {

            JFileChooser fc = new JFileChooser("./src/Imagens/imagesModelo");
            File workingDirectory = new File("./src/Imagens/imagesModelo");
            fc.setCurrentDirectory(workingDirectory);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivologo = fc.getSelectedFile();
            File arquivopasta = fc.getCurrentDirectory();
            String nomeDoArquivo = "./src/Imagens/imagesModelo/";
            String nomeFinal = nomeDoArquivo + arquivopasta.getName()+"/"+ arquivologo.getName();
            jTextFieldUrl.setText(nomeFinal);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo +arquivopasta.getName()+"/"+ arquivologo.getName());
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelModelo.getWidth(), jLabelModelo.getHeight(), 1));
            jLabelModelo.setIcon(iconLogo);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Nenhum arquivo selecionado");
        }

    }//GEN-LAST:event_jTextFieldUrlMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroMarcas chamar = new CadastroMarcas();
        this.dispose();
        chamar.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
        Timer timer = new Timer(2500, new ActionListener(){
    public void actionPerformed(ActionEvent evt) {
        chamar.dispose();
    }
});
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
            java.util.logging.Logger.getLogger(CadastroModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroModelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxMarca2;
    private javax.swing.JLabel jLabelBorda1;
    private javax.swing.JLabel jLabelBordaModelo;
    private javax.swing.JLabel jLabelBotaoAlterar2;
    private javax.swing.JLabel jLabelBotaoBuscar2;
    private javax.swing.JLabel jLabelBotaoIncluir2;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEmpresa2;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelMarca2;
    private javax.swing.JLabel jLabelMarcaLogo;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelModeloVeiculo4;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JPanel jPanelTopo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}
