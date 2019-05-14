package view;

import javax.swing.JOptionPane;

public class FormSelecioneCadastro extends javax.swing.JFrame {

    public FormSelecioneCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxCadastro = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jComboBoxCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Clientes", "Funcionarios", "Convenios", "Medicamentos", "Perfumaria" }));
        jComboBoxCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCadastro);
        jComboBoxCadastro.setBounds(50, 110, 280, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Cadastros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbnTituloCadastro)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbnTituloCadastro)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 10, 303, 70);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(100, 220, 170, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 300);

        setSize(new java.awt.Dimension(406, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastroActionPerformed
        if (jComboBoxCadastro.getSelectedIndex() == 1) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Cliente?", "Cadastrar Cliente", 1);

            if (decisao == 0) {
                FormCadastroCliente cadastro = new FormCadastroCliente();
                cadastro.setVisible(true);
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }
        if (jComboBoxCadastro.getSelectedIndex() == 2) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Funcionario?", "Cadastrar Funcionario", 1);

            if (decisao == 0) {
                FormCadastroFuncionario cadastroFuncionario = new FormCadastroFuncionario();
                cadastroFuncionario.setVisible(true);
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }
        if(jComboBoxCadastro.getSelectedIndex() == 3){
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Convenio?", "Cadastrar Convenio", 1);

            if (decisao == 0) {
                FormCadastroConvenio cc = new FormCadastroConvenio();
                cc.setVisible(true);
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
            
        }
        
        if (jComboBoxCadastro.getSelectedIndex() == 4) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Remedio?", "Cadastrar Remedio", 1);

            if (decisao == 0) {
                FormCadastroMedicamentos cm = new FormCadastroMedicamentos();
                cm.setVisible(true);
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }
        
        if (jComboBoxCadastro.getSelectedIndex() == 5) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Produto?", "Cadastrar Remedio", 1);

            if (decisao == 0) {
                FormCadastroPerfumaria cp = new FormCadastroPerfumaria();
                cp.setVisible(true);
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }
        
    }//GEN-LAST:event_jComboBoxCadastroActionPerformed
     
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormSelecioneCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSelecioneCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSelecioneCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSelecioneCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSelecioneCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBoxCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbnTituloCadastro;
    // End of variables declaration//GEN-END:variables
}
