package view;

import javax.swing.JOptionPane;
import java.sql.Date;
import model.entities.Remedios;

public class CadastroProdutos extends javax.swing.JFrame {

    public CadastroProdutos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        lbnTipo = new javax.swing.JLabel();
        lbnNome = new javax.swing.JLabel();
        lbnPreco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox();
        txtPrecoFormatado = new javax.swing.JFormattedTextField();
        btnInativo = new javax.swing.JRadioButton();
        btnAtivo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Novo Produto");

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produtos"));
        jPanelCadastro.setToolTipText("");
        jPanelCadastro.setLayout(null);

        lbnTipo.setText("Tipo:");
        jPanelCadastro.add(lbnTipo);
        lbnTipo.setBounds(200, 30, 40, 14);

        lbnNome.setText("Nome:");
        jPanelCadastro.add(lbnNome);
        lbnNome.setBounds(10, 30, 50, 14);

        lbnPreco.setText("Preço:");
        jPanelCadastro.add(lbnPreco);
        lbnPreco.setBounds(10, 70, 50, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtNome);
        txtNome.setBounds(50, 20, 140, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnCancelar);
        btnCancelar.setBounds(240, 140, 150, 30);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnIncluir);
        btnIncluir.setBounds(60, 140, 150, 30);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Remedio", "Perfumaria", "Infantil" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(240, 20, 140, 30);

        txtPrecoFormatado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrecoFormatado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoFormatadoFocusLost(evt);
            }
        });
        txtPrecoFormatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoFormatadoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtPrecoFormatado);
        txtPrecoFormatado.setBounds(50, 60, 90, 30);

        buttonStatus.add(btnInativo);
        btnInativo.setText("Inativo");
        jPanelCadastro.add(btnInativo);
        btnInativo.setBounds(290, 70, 100, 23);

        buttonStatus.add(btnAtivo);
        btnAtivo.setText("Ativo");
        jPanelCadastro.add(btnAtivo);
        btnAtivo.setBounds(200, 70, 93, 23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lbnTituloCadastro)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 270);

        setSize(new java.awt.Dimension(466, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Cadastrar novo Produto?", "Cadastro", WIDTH);
        if (resposta == 0) {
           String nome = txtNome.getText();
           Double preco = Double.parseDouble(txtPrecoFormatado.getText());
           String tipo = null;
           if(jComboBoxTipo.getSelectedIndex() == 0){
               JOptionPane.showMessageDialog(this, "Selecione a categoria do Produto!");
           }else if(jComboBoxTipo.getSelectedIndex() == 1){
               tipo = " Remedio";
           }else if(jComboBoxTipo.getSelectedIndex() == 2){
               tipo = "Perfumaria";
           }else if(jComboBoxTipo.getSelectedIndex() == 3){
               tipo = "Infantil";
           }
           
           Boolean status = null;
           
           if(btnAtivo.isSelected()){
               status = true;
           }else{
               status = false;
           }
           
           if(tipo.equals("Remedio")){
               Remedios remedio = new Remedios(null, null, tipo, tipo);
               remedio.setNome(nome);
               remedio.set
           }
           
           
        }
        
        int novo = JOptionPane.showConfirmDialog(this, "Cadastro Concluido!! Deseja cadastrar um novo Funcionario?", "Cadastro de Clientes", WIDTH);
        if (novo == 0) {
            txtNome.setText("");

            txtBairro.setText("");
            txtCep.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");

            txtNumero.setText("");
    
            txtTelefone.setText("");
            txtUf.setText("");
            jComboBoxCargo.setSelectedIndex(0);
        } else if (novo == 1) {
            dispose();

        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cancelar?", "Confirma", WIDTH);

        if (decisao != 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPrecoFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoFormatadoActionPerformed
        
    }//GEN-LAST:event_txtPrecoFormatadoActionPerformed

    private void txtPrecoFormatadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFormatadoFocusLost

    }//GEN-LAST:event_txtPrecoFormatadoFocusLost

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAtivo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnInativo;
    private javax.swing.JButton btnIncluir;
    private javax.swing.ButtonGroup buttonStatus;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnPreco;
    private javax.swing.JLabel lbnTipo;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPrecoFormatado;
    // End of variables declaration//GEN-END:variables
}
