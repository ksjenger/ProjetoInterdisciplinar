/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ConectaBD;
import dao.ConveniosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entities.Convenios;

/**
 *
 * @author kauan
 */
public class FormCadastroConvenio extends javax.swing.JFrame {

    private int it;

    public FormCadastroConvenio() {
        initComponents();
        CarregaGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbnNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JToggleButton();
        btnIncluir = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabCadastro = new javax.swing.JTable();
        lbnTituloCadastro = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(null);

        lbnNome.setText("Nome: ");
        jPanel2.add(lbnNome);
        lbnNome.setBounds(40, 60, 60, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome);
        txtNome.setBounds(40, 80, 290, 30);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);
        btnExcluir.setBounds(240, 170, 100, 23);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnIncluir);
        btnIncluir.setBounds(20, 170, 100, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterar);
        btnAlterar.setBounds(130, 170, 100, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 380, 270);

        jtabCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtabCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Convenio"
            }
        ));
        jtabCadastro.setToolTipText("Clique sobre a tabela para alterar");
        jtabCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabCadastro);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 80, 350, 260);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Convenios");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(290, 20, 220, 44);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(805, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void CarregaGrid() {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = ConectaBD.getConnection();
            String sql = "Select * from convenios order by idConvenio";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel) jtabCadastro.getModel();
            tab.setNumRows(0);
            while (rs.next()) {
                String idConvenio = rs.getString("idConvenio");
                String empresa = rs.getString("Empresa");
                tab.addRow(new String[]{idConvenio, empresa});
            }
            ConectaBD.closeConnection();
            st.close();
            rs.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione o convenio pra excluir");
        } else {

            String id = "" + jtabCadastro.getModel().getValueAt(it, 0);
            String nome = "" + jtabCadastro.getModel().getValueAt(it, 1);

            int des = JOptionPane.showConfirmDialog(this, "Deseja excluir o Convenio? " + nome, "Deseja Excluir?", JOptionPane.YES_OPTION);

            if (des == 0) {
                ConveniosDao cd = new ConveniosDao();
                cd.deleteConvenio(Integer.parseInt(id));
                JOptionPane.showMessageDialog(this, "Cadastro excluido com sucesso!");
                CarregaGrid();
                txtNome.setText("");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione o cadastro pra excluir");
        } else {
            String nomeConvenio = txtNome.getText();
            Convenios c = new Convenios(nomeConvenio);
            ConveniosDao cd = new ConveniosDao();
            cd.insertConvenios(c);
            CarregaGrid();
            txtNome.setText("");
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!!");
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione o cadastro pra Atualizar");
        } else {
            String id = "" + jtabCadastro.getModel().getValueAt(it, 0);
            ConveniosDao cd = new ConveniosDao();
            cd.updateConvenio(Integer.parseInt(id), txtNome.getText());
            JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso!");
            CarregaGrid();
            txtNome.setText("");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jtabCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabCadastroMouseClicked
        if (jtabCadastro.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Nada selecionado");
        } else {
            it = jtabCadastro.getSelectionModel().getMinSelectionIndex();
            txtNome.setText("" + jtabCadastro.getModel().getValueAt(it, 1));
        }
    }//GEN-LAST:event_jtabCadastroMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastroConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabCadastro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
