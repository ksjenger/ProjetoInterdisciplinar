/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ConectaBD;
import dao.ConveniosDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entities.Convenios;
import model.entities.Produtos;

/**
 *
 * @author kauan
 */
public class FormEstoqueProdutos extends javax.swing.JFrame {

    private int it;

    public FormEstoqueProdutos() {
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
        txtNome = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        lbnQuantidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jtabEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade"
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
        lbnTituloCadastro.setText("Produtos");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(290, 20, 220, 44);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(460, 330, 60, 20);

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome1);
        txtNome1.setBounds(130, 330, 200, 20);

        lbnQuantidade.setText("Quantidade:");
        jPanel1.add(lbnQuantidade);
        lbnQuantidade.setBounds(380, 330, 80, 20);

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 330, 40, 20);

        btnCancelar.setText("Cancelar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(805, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void CarregaGrid() {

        DefaultTableModel tab = (DefaultTableModel)jtabEstoque.getModel() ;
        tab.setNumRows(0);
    
        ArrayList<Produtos> lista = new ArrayList<>();
        
    }
    
    private void jtabEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabEstoqueMouseClicked
        if (jtabEstoque.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Nada selecionado");
        } else {
            it = jtabEstoque.getSelectionModel().getMinSelectionIndex();
            txtNome.setText("" + jtabEstoque.getModel().getValueAt(it, 1));
        }
    }//GEN-LAST:event_jtabEstoqueMouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstoqueProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstoqueProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabEstoque;
    private javax.swing.JLabel lbnQuantidade;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
