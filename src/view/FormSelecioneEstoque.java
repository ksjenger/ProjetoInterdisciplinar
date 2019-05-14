package view;

import javax.swing.JOptionPane;

public class FormSelecioneEstoque extends javax.swing.JFrame {

    public FormSelecioneEstoque() {
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jComboBoxCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Medicamentos", "Perfumaria" }));
        jComboBoxCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCadastro);
        jComboBoxCadastro.setBounds(60, 160, 280, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Estoque");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbnTituloCadastro)
                .addContainerGap(82, Short.MAX_VALUE))
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

        jLabel1.setText("Escolha o que deseja suprir para o estoque");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 120, 240, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 300);

        setSize(new java.awt.Dimension(406, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastroActionPerformed
        if (jComboBoxCadastro.getSelectedIndex() == 1) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja suprir um novo Medicamento?", "Cadastrar Estoque", 1);

            if (decisao == 0) {
                
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }
        if (jComboBoxCadastro.getSelectedIndex() == 2) {
            int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cadastrar um novo Produto?", "Cadastrar Estoque", 1);

            if (decisao == 0) {
                
            } else {
                jComboBoxCadastro.setSelectedIndex(0);
            }
        }        
    }//GEN-LAST:event_jComboBoxCadastroActionPerformed
     
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSelecioneEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBoxCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbnTituloCadastro;
    // End of variables declaration//GEN-END:variables
}
