
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.EstoqueDao;
import model.entities.Perfumaria;
import model.entities.Remedios;


public class FormEstoqueRemedios extends javax.swing.JFrame {

    ArrayList<Remedios> lista = new ArrayList<>();
    private int it;

    public FormEstoqueRemedios() {
        initComponents();
        CarregaGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabEstoque = new javax.swing.JTable();
        lbnTituloCadastro = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lbnQuantidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jComboBoxStatus = new javax.swing.JComboBox<>();

        setTitle("Suprimento de Medicamentos");
        getContentPane().setLayout(null);

        jPanel1.setToolTipText("");
        jPanel1.setName("Suprimento de Produtos"); // NOI18N
        jPanel1.setLayout(null);

        jtabEstoque.setAutoCreateRowSorter(true);
        jtabEstoque.setBorder(new javax.swing.border.MatteBorder(null));
        jtabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Categoria", "Status", "Preco", "Quantidade"
            }
        ));
        jtabEstoque.setToolTipText("Clique sobre a tabela para alterar");
        jtabEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabEstoque);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 740, 220);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Medicamentos");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(250, 20, 320, 44);

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        jPanel1.add(txtQtd);
        txtQtd.setBounds(460, 310, 50, 30);

        txtNome.setEditable(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(130, 310, 200, 30);

        lbnQuantidade.setText("Quantidade:");
        jPanel1.add(lbnQuantidade);
        lbnQuantidade.setBounds(380, 310, 80, 30);

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 310, 40, 30);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(580, 350, 120, 23);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar);
        btnAtualizar.setBounds(580, 320, 120, 23);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jPanel1.add(jComboBoxStatus);
        jComboBoxStatus.setBounds(390, 350, 110, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 4, 790, 400);
        jPanel1.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(805, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void CarregaGrid() {

        DefaultTableModel tab = (DefaultTableModel) jtabEstoque.getModel();
        tab.setNumRows(0);
        
        lista = EstoqueDao.selectRemedios();

        for (Remedios rd : lista) {
            String nome = rd.getNome();
            String tipo = rd.getTipo();
            String categoria = rd.getCategoria();
            Boolean status = rd.getStatus();
            String stStatus = null;
            if (status) {
                stStatus = "Ativo";
            } else {
                stStatus = "Inativo";
            }
            String quantidade = "" + rd.getQuantidade();
            String valor = "R$" + rd.getValor();

            tab.addRow(new String[]{nome, tipo, categoria, stStatus, valor, quantidade});

        }
    }

    private void jtabEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabEstoqueMouseClicked
        if (jtabEstoque.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Nada selecionado");
        } else {
            it = jtabEstoque.getSelectionModel().getMinSelectionIndex();
            txtNome.setText("" + jtabEstoque.getModel().getValueAt(it, 0));
            txtQtd.setText("" + jtabEstoque.getModel().getValueAt(it, 5));
        }
    }//GEN-LAST:event_jtabEstoqueMouseClicked

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione o Medicamento para suprir");
        } else {
            String quantidade = txtQtd.getText();
            Boolean status = true;
            if(jComboBoxStatus.getSelectedIndex() == 0){
                status = true;
            }else{
                status = false;
            }
            lista.get(it).setQuantidade(Integer.parseInt(quantidade));
            lista.get(it).setStatus(status);
            EstoqueDao.updateRemedio(lista.get(it));
            JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso!");
            CarregaGrid();
            txtNome.setText("");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        hide();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueRemedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueRemedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueRemedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueRemedios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstoqueRemedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabEstoque;
    private javax.swing.JLabel lbnQuantidade;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
