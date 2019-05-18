package view;

import dao.ProdutosDao;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.entities.Produtos;

public class FormPesquisar extends javax.swing.JFrame {

    ArrayList<Produtos> lista = new ArrayList<>();
    DefaultListModel modelo;

    public FormPesquisar() {
        initComponents();
        CarregaGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloPesquisa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lbnBusca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Produtos");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));

        lbnTituloPesquisa.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloPesquisa.setText("Consulta de Preco");

        jPanel2.setLayout(null);

        txtPesquisa.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtPesquisaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel2.add(txtPesquisa);
        txtPesquisa.setBounds(86, 11, 384, 28);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisar);
        btnPesquisar.setBounds(476, 14, 80, 23);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar);
        btnLimpar.setBounds(561, 14, 79, 23);

        lbnBusca.setText("Busca:");
        jPanel2.add(lbnBusca);
        lbnBusca.setBounds(10, 18, 72, 14);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo de Produto", "Preco", "Classificacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 650, 360);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbnTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbnTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 670, 510);

        setSize(new java.awt.Dimension(696, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtPesquisa.setText("");
        CarregaGrid();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String pesquisa = txtPesquisa.getText();
        DefaultTableModel tab = (DefaultTableModel) jTableProdutos.getModel();
        tab.setNumRows(0);
        ArrayList<Produtos> find = new ArrayList<>();
        find = ProdutosDao.findProdutosbyName(pesquisa);
        for (Produtos prod : find) {
            String nome = prod.getNome();
            String tipoProduto = prod.getTipo();
            Double valor = prod.getValor();
            String preco = "" + valor;
            String classificacao = prod.getCategoria();
            tab.addRow(new String[]{nome, tipoProduto, preco, classificacao});
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPesquisaCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaCaretPositionChanged
    private void CarregaGrid() {
        lista = ProdutosDao.selectProdutos();
        DefaultTableModel tab = (DefaultTableModel) jTableProdutos.getModel();
        tab.setNumRows(0);
        for (Produtos prod : lista) {
            String nome = prod.getNome();
            String tipoProduto = prod.getTipo();
            Double valor = prod.getValor();
            String preco = "" + valor;
            String classificacao = prod.getCategoria();
            tab.addRow(new String[]{nome, tipoProduto, preco, classificacao});
        }
    }

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
            java.util.logging.Logger.getLogger(FormPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lbnBusca;
    private javax.swing.JLabel lbnTituloPesquisa;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
