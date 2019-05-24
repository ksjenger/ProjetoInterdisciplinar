/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AtendimentoDao;
import dao.ReceitaDao;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.entities.Atendimento;
import model.entities.Produtos;

public class FormPagamentos extends javax.swing.JFrame {

    private Atendimento atendimento;
    private ArrayList<Produtos> listaItens = new ArrayList<>();

    public FormPagamentos(Atendimento a, ArrayList<Produtos> produtos) {
        initComponents();
        txtDesconto.setEditable(false);
        txtValorPago.setFocusable(true);
        atendimento = a;
        this.listaItens = produtos;
    }

    private FormPagamentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTxtVenda(String txtVenda) {
        this.txtVenda.setText(txtVenda);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        txtVenda = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        txtValorPago = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        btnConfirmar = new javax.swing.JButton();
        btnRetorna = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Finalizando a venda");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Pagamento");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(50, 10, 250, 44);

        jLabel1.setText("Troco: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 300, 120, 40);

        jLabel2.setText("Total da Venda: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 150, 40);

        jLabel3.setText("Desconto (%) :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 130, 120, 40);

        jLabel4.setText("Forma de Pagamento:  ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 180, 150, 40);

        jLabel5.setText("Valor Pago: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 240, 150, 40);

        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTroco);
        txtTroco.setBounds(110, 300, 190, 30);
        jPanel1.add(txtVenda);
        txtVenda.setBounds(110, 90, 190, 30);
        jPanel1.add(txtDesconto);
        txtDesconto.setBounds(110, 140, 190, 30);

        txtValorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagoFocusLost(evt);
            }
        });
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorPago);
        txtValorPago.setBounds(110, 250, 190, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Credito", "Debito" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 180, 150, 40);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(170, 370, 130, 80);

        btnRetorna.setText("Retornar");
        btnRetorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetorna);
        btnRetorna.setBounds(10, 370, 130, 80);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("EFETUE O PAGAMENTO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 340, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 460);

        setSize(new java.awt.Dimension(327, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornaActionPerformed
        dispose();
    }//GEN-LAST:event_btnRetornaActionPerformed

    private void txtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagoActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void txtValorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagoFocusLost
        String valorpago = txtVenda.getText();
        String valor = valorpago.substring(3);
        Double calcTroco = Double.parseDouble(valor);
        Double valorAtendimento = Double.parseDouble(txtValorPago.getText());
        Double troco = valorAtendimento - calcTroco;
        txtValorPago.setText("R$: " + valorAtendimento);
        txtTroco.setText("R$: " + troco);
    }//GEN-LAST:event_txtValorPagoFocusLost

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (txtValorPago.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o valor recebido");
        } else {
            if (atendimento.getReceita() == null || atendimento.getCliente() == null) {
                AtendimentoDao.insertAtendimento(atendimento.getFuncionario());
            } else if (atendimento.getReceita() == null || atendimento.getCliente() != null) {
                AtendimentoDao.insertAtendimento(atendimento.getFuncionario(), atendimento.getCliente());
            } else {
                AtendimentoDao.insertAtendimento(atendimento.getFuncionario(), atendimento.getCliente(), atendimento.getReceita());
            }
            for (Produtos p : listaItens) {
                AtendimentoDao.insertItens(atendimento.getIdAtendimento(), p.getIdProduto());
            }
            JOptionPane.showMessageDialog(this, "Compra finalizada.");
            dispose();

            FormAtendimento fa = new FormAtendimento();
            fa.setVisible(true);
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRetorna;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValorPago;
    private javax.swing.JTextField txtVenda;
    // End of variables declaration//GEN-END:variables
}
