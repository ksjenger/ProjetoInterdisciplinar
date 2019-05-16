
package view;


public class FormAtendimento extends javax.swing.JFrame {


    public FormAtendimento() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbnProduto = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisarProduto = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        Quantidade = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnIncluir1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbnData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtCpf = new javax.swing.JFormattedTextField();
        lbnCpf = new javax.swing.JLabel();
        btnCadastrarNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbnConvenio = new javax.swing.JLabel();
        lbnSetConvenio = new javax.swing.JLabel();
        lbnCliente = new javax.swing.JLabel();
        btnPesquisarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Atendimento");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(250, 10, 250, 44);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 242, 740, 220);

        lbnProduto.setText("Produtos a incluir:");
        jPanel3.add(lbnProduto);
        lbnProduto.setBounds(10, 10, 110, 30);
        jPanel3.add(txtPesquisa);
        txtPesquisa.setBounds(120, 10, 580, 30);

        btnPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Search.png"))); // NOI18N
        jPanel3.add(btnPesquisarProduto);
        btnPesquisarProduto.setBounds(710, 10, 30, 30);

        txtProduto.setEditable(false);
        jPanel3.add(txtProduto);
        txtProduto.setBounds(20, 50, 50, 30);

        txtNomeProduto.setEditable(false);
        jPanel3.add(txtNomeProduto);
        txtNomeProduto.setBounds(90, 50, 390, 30);
        jPanel3.add(txtQuantidadeProduto);
        txtQuantidadeProduto.setBounds(520, 50, 50, 30);

        Quantidade.setText("Qtd:");
        jPanel3.add(Quantidade);
        Quantidade.setBounds(490, 50, 40, 30);

        btnIncluir.setBackground(new java.awt.Color(204, 0, 0));
        btnIncluir.setText("Cancelar");
        jPanel3.add(btnIncluir);
        btnIncluir.setBounds(660, 50, 80, 30);

        btnIncluir1.setBackground(new java.awt.Color(0, 204, 0));
        btnIncluir1.setText("Incluir");
        jPanel3.add(btnIncluir1);
        btnIncluir1.setBounds(580, 50, 80, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 250, 760, 500);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Receita"));
        jPanel4.setLayout(null);

        lbnData.setText("Data da Receita: ");
        jPanel4.add(lbnData);
        lbnData.setBounds(10, 20, 120, 30);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtData);
        txtData.setBounds(100, 20, 70, 30);

        jLabel3.setText("Quantidade prescrita:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(200, 20, 120, 30);
        jPanel4.add(txtQuantidade);
        txtQuantidade.setBounds(320, 20, 60, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 170, 760, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel2.setLayout(null);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf);
        txtCpf.setBounds(60, 20, 110, 30);

        lbnCpf.setText("CPF: ");
        jPanel2.add(lbnCpf);
        lbnCpf.setBounds(20, 20, 40, 30);

        btnCadastrarNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cliente.png"))); // NOI18N
        jPanel2.add(btnCadastrarNovo);
        btnCadastrarNovo.setBounds(200, 20, 30, 30);

        jLabel1.setText("Cliente:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 60, 50, 14);

        lbnConvenio.setText("Convenio:");
        jPanel2.add(lbnConvenio);
        lbnConvenio.setBounds(370, 20, 70, 20);
        jPanel2.add(lbnSetConvenio);
        lbnSetConvenio.setBounds(430, 20, 130, 20);
        jPanel2.add(lbnCliente);
        lbnCliente.setBounds(70, 50, 410, 30);

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Search.png"))); // NOI18N
        jPanel2.add(btnPesquisarCliente);
        btnPesquisarCliente.setBounds(170, 20, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 760, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 710);

        setSize(new java.awt.Dimension(797, 753));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quantidade;
    private javax.swing.JButton btnCadastrarNovo;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluir1;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbnCliente;
    private javax.swing.JLabel lbnConvenio;
    private javax.swing.JLabel lbnCpf;
    private javax.swing.JLabel lbnData;
    private javax.swing.JLabel lbnProduto;
    private javax.swing.JLabel lbnSetConvenio;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
