package view;

import dao.PerfumariaDao;
import javax.swing.JOptionPane;
import model.entities.Perfumaria;

public class FormCadastroPerfumaria extends javax.swing.JFrame {

    public FormCadastroPerfumaria() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbnTituloCadastro = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        lbnTipo = new javax.swing.JLabel();
        lbnNome = new javax.swing.JLabel();
        lbnPreco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jComboBoxProduto = new javax.swing.JComboBox();
        txtPrecoFormatado = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Novo Produto");
        getContentPane().add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(130, 20, 260, 44);

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produtos"));
        jPanelCadastro.setToolTipText("");
        jPanelCadastro.setLayout(null);

        lbnTipo.setText("Tipo:");
        jPanelCadastro.add(lbnTipo);
        lbnTipo.setBounds(200, 30, 40, 14);

        lbnNome.setText("Nome:");
        jPanelCadastro.add(lbnNome);
        lbnNome.setBounds(10, 30, 50, 14);

        lbnPreco.setText("Preço R$:");
        jPanelCadastro.add(lbnPreco);
        lbnPreco.setBounds(10, 70, 60, 14);

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
        btnCancelar.setBounds(280, 110, 150, 30);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnIncluir);
        btnIncluir.setBounds(60, 110, 150, 30);

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Fralda descartavel", "Desodorante", "Protetor solar", "Tintura para cabelos", "Condicionador", "Shampoo", "Cremes para a pele", "Sabonetes", "Fralda descartavel para incontinencia", "Absorvete higienico", "Higene bucal", "Outros" }));
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jComboBoxProduto);
        jComboBoxProduto.setBounds(240, 20, 260, 30);

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
        txtPrecoFormatado.setBounds(70, 60, 90, 30);

        getContentPane().add(jPanelCadastro);
        jPanelCadastro.setBounds(10, 90, 510, 160);

        setSize(new java.awt.Dimension(541, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cancelar?", "Confirma", WIDTH);
        if (decisao != 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Cadastrar novo Produto?", "Cadastro", 2);
        if (resposta == 0) {
            String nome = txtNome.getText();
            String valor = txtPrecoFormatado.getText();
            Double preco = Double.parseDouble(valor.replace(",", "."));
            String tipo = (String) jComboBoxProduto.getSelectedItem();            
            Perfumaria perfumaria = new Perfumaria();
            perfumaria.setNome(nome);
            perfumaria.setValor(preco);
            perfumaria.setCategoria(tipo);
            PerfumariaDao perfumariadao = new PerfumariaDao();
            perfumariadao.InsertPerfumaria(perfumaria);
            
        }
        int novo = JOptionPane.showConfirmDialog(this, "Cadastro Concluido!! Deseja cadastrar um Produto?", "Cadastro de Clientes", 1);
        
        
        if (novo == 0) {
            txtNome.setText("");
            txtPrecoFormatado.setText("");
            jComboBoxProduto.setSelectedIndex(0);
        } else if (novo == 1) {
            dispose();
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void txtPrecoFormatadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFormatadoFocusLost

    }//GEN-LAST:event_txtPrecoFormatadoFocusLost

    private void txtPrecoFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoFormatadoActionPerformed

    }//GEN-LAST:event_txtPrecoFormatadoActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroPerfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPerfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPerfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroPerfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroPerfumaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox jComboBoxProduto;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnPreco;
    private javax.swing.JLabel lbnTipo;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPrecoFormatado;
    // End of variables declaration//GEN-END:variables
}
