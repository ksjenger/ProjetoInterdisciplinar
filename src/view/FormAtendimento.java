package view;

import dao.ClienteDao;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entities.Cliente;
import model.entities.Receita;

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
        txtControle = new javax.swing.JTextField();
        lbnQuantidadePrescrita = new javax.swing.JLabel();
        txtQuantidadePrescrita = new javax.swing.JTextField();
        btnIncluirReceita = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCpf = new javax.swing.JFormattedTextField();
        lbnCpf = new javax.swing.JLabel();
        btnCadastrarNovo = new javax.swing.JButton();
        lbnNomeCliente = new javax.swing.JLabel();
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
        lbnData.setBounds(10, 20, 100, 30);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txtData);
        txtData.setBounds(100, 20, 70, 30);

        jLabel3.setText("Numero de Controle");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(460, 20, 120, 30);
        jPanel4.add(txtControle);
        txtControle.setBounds(580, 20, 60, 30);

        lbnQuantidadePrescrita.setText("Quantidade prescrita:");
        jPanel4.add(lbnQuantidadePrescrita);
        lbnQuantidadePrescrita.setBounds(200, 20, 120, 30);
        jPanel4.add(txtQuantidadePrescrita);
        txtQuantidadePrescrita.setBounds(320, 20, 60, 30);

        btnIncluirReceita.setBackground(new java.awt.Color(0, 204, 0));
        btnIncluirReceita.setText("Incluir");
        btnIncluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirReceitaActionPerformed(evt);
            }
        });
        jPanel4.add(btnIncluirReceita);
        btnIncluirReceita.setBounds(660, 20, 80, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 170, 760, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel2.setLayout(null);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        jPanel2.add(txtCpf);
        txtCpf.setBounds(60, 20, 110, 30);

        lbnCpf.setText("CPF: ");
        jPanel2.add(lbnCpf);
        lbnCpf.setBounds(20, 20, 40, 30);

        btnCadastrarNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cliente.png"))); // NOI18N
        btnCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrarNovo);
        btnCadastrarNovo.setBounds(200, 20, 30, 30);

        lbnNomeCliente.setText("Cliente:");
        jPanel2.add(lbnNomeCliente);
        lbnNomeCliente.setBounds(20, 60, 50, 14);

        lbnConvenio.setText("Convenio:");
        jPanel2.add(lbnConvenio);
        lbnConvenio.setBounds(370, 20, 70, 20);

        lbnSetConvenio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lbnSetConvenio);
        lbnSetConvenio.setBounds(430, 10, 130, 40);

        lbnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lbnCliente);
        lbnCliente.setBounds(70, 50, 410, 40);

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Search.png"))); // NOI18N
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisarCliente);
        btnPesquisarCliente.setBounds(170, 20, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 760, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 710);

        setSize(new java.awt.Dimension(797, 753));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost

    }//GEN-LAST:event_txtCpfFocusLost

    private void btnCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNovoActionPerformed
        FormCadastroCliente fc = new FormCadastroCliente();
        fc.setVisible(true);
    }//GEN-LAST:event_btnCadastrarNovoActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        String cpf = txtCpf.getText();
        Cliente c = new Cliente();
        c = ClienteDao.findByCPF(cpf);
        if(c.getFirstName() == null){
            lbnCliente.setText("Cliente nao cadastrado");
            lbnCliente.setForeground(Color.red);
        }else{
            String nome = c.getFirstName() + " " + c.getLastName();
            lbnCliente.setForeground(Color.red);
            lbnCliente.setText(nome);
            lbnSetConvenio.setText(c.getConvenio().getNomeConvenio());
            lbnSetConvenio.setForeground(Color.red);
            txtCpf.setEditable(false);
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnIncluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirReceitaActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataReceita = txtData.getText();
        
        String qtd = txtQuantidadePrescrita.getText();
        String controle = txtControle.getText();
        try {
            Receita r = new Receita(null, controle, sdf.parse(dataReceita), Integer.parseInt(qtd));
        } catch (ParseException ex) {
            Logger.getLogger(FormAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIncluirReceitaActionPerformed

    public static void main(String args[]) {
        
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
    private javax.swing.JButton btnIncluirReceita;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
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
    private javax.swing.JLabel lbnNomeCliente;
    private javax.swing.JLabel lbnProduto;
    private javax.swing.JLabel lbnQuantidadePrescrita;
    private javax.swing.JLabel lbnSetConvenio;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JTextField txtControle;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidadePrescrita;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
