package view;

import dao.RemediosDao;
import javax.swing.JOptionPane;
import java.sql.Date;
import model.entities.Remedios;

public class FormCadastroMedicamentos extends javax.swing.JFrame {

    public FormCadastroMedicamentos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupButtonReceita = new javax.swing.ButtonGroup();
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
        RadioBNao = new javax.swing.JRadioButton();
        RadioBSim = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Novo Medicamento");

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Medicamentos"));
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

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "OTC", "Eticos", "Psico", "Nutricosmeticos" }));
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

        GroupButtonReceita.add(RadioBNao);
        RadioBNao.setText("Nao");
        jPanelCadastro.add(RadioBNao);
        RadioBNao.setBounds(320, 90, 100, 23);

        GroupButtonReceita.add(RadioBSim);
        RadioBSim.setText("Sim");
        RadioBSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBSimActionPerformed(evt);
            }
        });
        jPanelCadastro.add(RadioBSim);
        RadioBSim.setBounds(260, 90, 60, 23);

        jLabel1.setText("Precisa de Receita Medica?");
        jPanelCadastro.add(jLabel1);
        jLabel1.setBounds(240, 64, 180, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbnTituloCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 290);

        setSize(new java.awt.Dimension(466, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Cadastrar novo Medicamento?", "Cadastro", 2);
        if (resposta == 0) {
            String nome = txtNome.getText();
            String valor = txtPrecoFormatado.getText();
            Double preco = Double.parseDouble(valor.replace(",", "."));
            String tipo = null;
            switch (jComboBoxTipo.getSelectedIndex()) {
                case 0:
                    JOptionPane.showMessageDialog(this, "Selecione a categoria do Medicamento!");
                    break;
                case 1:
                    tipo = "OTC";
                    break;
                case 2:
                    tipo = "Eticos";
                    break;
                case 3:
                    tipo = "Psico";
                    break;
                case 4:
                    tipo = "Nutricosmeticos";
                    break;
                default:
                    break;
            }

            boolean prescricao = true;

            if (RadioBSim.isSelected()) {
                prescricao = true;
            } else if (RadioBNao.isSelected()) {
                prescricao = false;
            } else {
                JOptionPane.showMessageDialog(this, "Selecione se o Remedio precisa de prescricao");
            }

            Remedios remedio = new Remedios(null, null, tipo, prescricao);
            remedio.setNome(nome);
            remedio.setValor(preco);
            remedio.setCategoria("Remedio");
            RemediosDao remediosDao = new RemediosDao();
            remediosDao.InsertRemedio(remedio);
        }

        int novo = JOptionPane.showConfirmDialog(this, "Cadastro Concluido!! Deseja cadastrar um novo Medicamento?", "Cadastro de Clientes", 1);
        if (novo == 0) {
            txtNome.setText("");
            txtPrecoFormatado.setText("");
            jComboBoxTipo.setSelectedIndex(0);
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

    private void RadioBSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBSimActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupButtonReceita;
    private javax.swing.JRadioButton RadioBNao;
    private javax.swing.JRadioButton RadioBSim;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
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
