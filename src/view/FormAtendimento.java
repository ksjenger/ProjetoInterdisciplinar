package view;

import dao.AtendimentoDao;
import dao.ClienteDao;
import dao.ProdutosDao;
import dao.ReceitaDao;
import dao.RemediosDao;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entities.Cliente;
import model.entities.Produtos;
import model.entities.Receita;

public class FormAtendimento extends javax.swing.JFrame {

    Receita r;
    //ArrayList<Produtos> listaProd = new ArrayList<>();
    ArrayList<Produtos> prodList = new ArrayList<>();
    Boolean editar = true;
    DefaultListModel modelo;
    int enter = 0;

    public FormAtendimento() {
        initComponents();
        jListCliente.setVisible(false);
        modelo = new DefaultListModel();
        jListCliente.setModel(modelo);
        numeroAtendimento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jListCliente = new javax.swing.JList<String>();
        lbnProduto = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        Quantidade = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        btnFinalizarCompra = new javax.swing.JButton();
        lbnValorfinal = new javax.swing.JLabel();
        lbnValor = new javax.swing.JLabel();
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
        lbnAtendimento = new javax.swing.JLabel();
        lbnDataAtendimento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Atendimento");
        jPanel1.add(lbnTituloCadastro);
        lbnTituloCadastro.setBounds(260, 10, 250, 44);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(null);

        jListCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClienteMouseClicked(evt);
            }
        });
        jPanel3.add(jListCliente);
        jListCliente.setBounds(120, 40, 390, 60);

        lbnProduto.setText("Produtos a incluir:");
        jPanel3.add(lbnProduto);
        lbnProduto.setBounds(10, 10, 110, 30);

        txtPesquisa.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtPesquisaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        jPanel3.add(txtPesquisa);
        txtPesquisa.setBounds(120, 10, 620, 30);

        txtIdProduto.setEditable(false);
        jPanel3.add(txtIdProduto);
        txtIdProduto.setBounds(20, 50, 50, 30);

        txtNomeProduto.setEditable(false);
        txtNomeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeProdutoMouseClicked(evt);
            }
        });
        jPanel3.add(txtNomeProduto);
        txtNomeProduto.setBounds(90, 50, 390, 30);
        jPanel3.add(txtQuantidadeProduto);
        txtQuantidadeProduto.setBounds(520, 50, 50, 30);

        Quantidade.setText("Qtd:");
        jPanel3.add(Quantidade);
        Quantidade.setBounds(490, 50, 40, 30);

        btnIncluir.setBackground(new java.awt.Color(204, 0, 0));
        btnIncluir.setText("Cancelar");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanel3.add(btnIncluir);
        btnIncluir.setBounds(660, 50, 80, 30);

        btnIncluirProduto.setBackground(new java.awt.Color(0, 204, 0));
        btnIncluirProduto.setText("Incluir");
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(btnIncluirProduto);
        btnIncluirProduto.setBounds(580, 50, 80, 30);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Categoria", "Preco", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 740, 190);

        btnFinalizarCompra.setText("Finalizar atendimento");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel3.add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(580, 320, 160, 23);

        lbnValorfinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(lbnValorfinal);
        lbnValorfinal.setBounds(430, 320, 140, 30);

        lbnValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbnValor.setText("Valor total: R$");
        jPanel3.add(lbnValor);
        lbnValor.setBounds(300, 320, 140, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 240, 760, 360);

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

        jLabel3.setText("Numero de Controle:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(460, 20, 120, 30);
        jPanel4.add(txtControle);
        txtControle.setBounds(580, 20, 60, 30);

        lbnQuantidadePrescrita.setText("Quantidade prescrita:");
        jPanel4.add(lbnQuantidadePrescrita);
        lbnQuantidadePrescrita.setBounds(200, 20, 140, 30);
        jPanel4.add(txtQuantidadePrescrita);
        txtQuantidadePrescrita.setBounds(350, 20, 60, 30);

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

        lbnAtendimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lbnAtendimento);
        lbnAtendimento.setBounds(50, 20, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 780, 600);

        lbnDataAtendimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbnDataAtendimento);
        lbnDataAtendimento.setBounds(40, 620, 190, 30);

        setSize(new java.awt.Dimension(825, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numeroAtendimento() {
        Integer atendimento = AtendimentoDao.findNextId();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        String data = sdf.format(new Date());

        lbnDataAtendimento.setText("Atendimento: " + atendimento);
        lbnDataAtendimento.setVisible(true);
        lbnDataAtendimento.setText(data);
        lbnDataAtendimento.setVisible(true);

    }

    public void ListaDePesquisa() {
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos = ProdutosDao.findProdutosbyName(txtPesquisa.getText());
        int size = listaProdutos.size();
        modelo.removeAllElements();

        for (Produtos prod : listaProdutos) {
            int idProduto = prod.getIdProduto();
            String nome = prod.getNome();
            modelo.addElement(idProduto + " - " + nome);
            jListCliente.setVisible(true);
        }

    }


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
        if (c.getFirstName() == null) {
            lbnCliente.setText("Cliente nao cadastrado");
            lbnCliente.setForeground(Color.red);
        } else {
            String nome = c.getFirstName() + " " + c.getLastName();
            lbnCliente.setForeground(Color.red);
            lbnCliente.setText(nome);
            lbnSetConvenio.setText(c.getConvenio().getNomeConvenio());
            lbnSetConvenio.setForeground(Color.red);
            txtCpf.setEditable(false);
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnIncluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirReceitaActionPerformed
        if (txtData.getText() == null) {
            JOptionPane.showMessageDialog(this, "Data da Receita Obrigatoria");
            txtData.setFocusable(true);
        } else {
            if (editar == true) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String dataReceita = txtData.getText();
                Integer qtd = null;
                if (txtQuantidadeProduto.getText() == null) {
                    qtd = 1;
                } else {
                    qtd = Integer.parseInt(txtQuantidadePrescrita.getText());
                }

                String controle = txtControle.getText();

                try {
                    r = new Receita(null, controle, sdf.parse(dataReceita), qtd);
                } catch (ParseException ex) {
                    Logger.getLogger(FormAtendimento.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtQuantidadePrescrita.setEditable(false);
                txtControle.setEditable(false);
                txtData.setEditable(false);
                editar = false;
                btnIncluirReceita.setBackground(Color.gray);
            } else {
                txtQuantidadePrescrita.setEditable(true);
                txtControle.setEditable(true);
                txtData.setEditable(true);
                editar = true;
                btnIncluirReceita.setBackground(Color.GREEN);
            }
        }

    }//GEN-LAST:event_btnIncluirReceitaActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed

    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void txtPesquisaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPesquisaCaretPositionChanged


    }//GEN-LAST:event_txtPesquisaCaretPositionChanged

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        String nome = txtNomeProduto.getText();
        int idProduto = Integer.parseInt(txtIdProduto.getText());
        String qtd = txtQuantidadeProduto.getText();
        if (qtd.equals("")) {
            qtd = "1";
        }
        prodList.add(ProdutosDao.findProdutosbyId(idProduto));
        DefaultTableModel tab = (DefaultTableModel) jTableProdutos.getModel();
        tab.setNumRows(0);
        double valorAtendimento = 0;
        for (Produtos p : prodList) {
            tab.addRow(new String[]{p.getNome(), p.getTipo(), p.getCategoria(), "R$" + p.getValor(), qtd});
        }

        for (int i = 0; i < prodList.size(); i++) {
            valorAtendimento = valorAtendimento + prodList.get(i).getValor();
        }

        lbnValorfinal.setText("" + valorAtendimento);

        txtNomeProduto.setText("");
        txtPesquisa.setText("");
        txtIdProduto.setText("");
    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void txtNomeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeProdutoMouseClicked

    }//GEN-LAST:event_txtNomeProdutoMouseClicked

    private void jListClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClienteMouseClicked
        String produtos = jListCliente.getSelectedValue();
        String idnome[] = produtos.split(" - ");

        txtNomeProduto.setText(idnome[1]);
        txtIdProduto.setText(idnome[0]);
        jListCliente.setVisible(false);
        txtPesquisa.setText(produtos);

    }//GEN-LAST:event_jListClienteMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        jListCliente.setVisible(false);
        enter = 1;
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (enter == 0) {
            ListaDePesquisa();
        } else {
            enter = 0;
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        txtNomeProduto.setText("");
        txtPesquisa.setText("");
        txtIdProduto.setText("");
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        Boolean prescricaoMedica = false;
        for (Produtos p : prodList) {
            if (RemediosDao.prescricaoMedica(p.getIdProduto())) {
                r.setRemedios(p);
                if (r == null) {
                    prescricaoMedica = true;
                }
            }
        }
        if (prescricaoMedica) {
            JOptionPane.showMessageDialog(this, "Existem medicamentos que possuem prescricao medica obrigatoria"
                    + ". Favor solicitar a receita ao cliente. ");
        } else {
            try {
                ReceitaDao.insertReceita(r);
                
            } catch (ParseException ex) {
                Logger.getLogger(FormAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

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
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnIncluirReceita;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lbnAtendimento;
    private javax.swing.JLabel lbnCliente;
    private javax.swing.JLabel lbnConvenio;
    private javax.swing.JLabel lbnCpf;
    private javax.swing.JLabel lbnData;
    private javax.swing.JLabel lbnDataAtendimento;
    private javax.swing.JLabel lbnNomeCliente;
    private javax.swing.JLabel lbnProduto;
    private javax.swing.JLabel lbnQuantidadePrescrita;
    private javax.swing.JLabel lbnSetConvenio;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JLabel lbnValor;
    private javax.swing.JLabel lbnValorfinal;
    private javax.swing.JTextField txtControle;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQuantidadePrescrita;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
