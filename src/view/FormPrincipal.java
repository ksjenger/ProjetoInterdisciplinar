package view;

public class FormPrincipal extends javax.swing.JFrame {
    
    Sobre sobre = new Sobre();
    FormPesquisar pesquisar = new FormPesquisar();
    FormCadastroCliente cadastro = new FormCadastroCliente();
    FormSelecioneCadastro selecioneCadastro = new FormSelecioneCadastro();
        
    public FormPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEstoque = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAtendimento = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnTemp2 = new javax.swing.JButton();
        lbnTituloDrogaria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSobre = new javax.swing.JMenu();
        jmenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drogaria Cruzeiro do Sul");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstoque);
        btnEstoque.setBounds(10, 290, 120, 60);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisar);
        btnPesquisar.setBounds(10, 10, 120, 60);

        btnAtendimento.setText("Atendimento");
        btnAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtendimentoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtendimento);
        btnAtendimento.setBounds(10, 80, 120, 60);

        btnCadastro.setText("Cadastros");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastro);
        btnCadastro.setBounds(10, 150, 120, 60);

        btnTemp2.setText("Relatorios");
        btnTemp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemp2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTemp2);
        btnTemp2.setBounds(10, 220, 120, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 90, 140, 370);

        lbnTituloDrogaria.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloDrogaria.setText("Drogaria Cruzeiro do Sul");
        jPanel1.add(lbnTituloDrogaria);
        lbnTituloDrogaria.setBounds(160, 20, 490, 40);

        jPanel3.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/projeto-do-fundo-da-farmacia_1212-351.jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 0, 520, 380);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(160, 80, 520, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 480);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setName("MenuBar"); // NOI18N

        jMenuSobre.setText("Sobre");

        jmenuSobre.setText("Versao");
        jmenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSobreActionPerformed(evt);
            }
        });
        jMenuSobre.add(jmenuSobre);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(721, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        FormSelecioneEstoque fs = new FormSelecioneEstoque();
        fs.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtendimentoActionPerformed
        FormAtendimento at = new FormAtendimento();
        at.setVisible(true);
    }//GEN-LAST:event_btnAtendimentoActionPerformed

    private void btnTemp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemp2ActionPerformed
        FormSelecioneRelatorio fr = new FormSelecioneRelatorio();
        fr.setVisible(true);
    }//GEN-LAST:event_btnTemp2ActionPerformed

    private void jmenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSobreActionPerformed
        sobre.setVisible(true);
    }//GEN-LAST:event_jmenuSobreActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        selecioneCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtendimento;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTemp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem jmenuSobre;
    private javax.swing.JLabel lbnTituloDrogaria;
    // End of variables declaration//GEN-END:variables
}
