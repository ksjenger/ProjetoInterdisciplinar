package view;

import dao.FuncionariosDao;
import javax.swing.JOptionPane;
import model.entities.Funcionarios;
import java.sql.Date;
import java.util.Scanner;

public class FormCadastroFuncionario extends javax.swing.JFrame {

    public FormCadastroFuncionario() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloCadastro = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        txtSobronome = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        lbnSobrenome = new javax.swing.JLabel();
        lbnNumero = new javax.swing.JLabel();
        lbnNome = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbnComplemento = new javax.swing.JLabel();
        lbnLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbnTelefone = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lbnBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbnEmail = new javax.swing.JLabel();
        lbnUf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbnCep = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbnCargo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JFormattedTextField();
        lbnCPF = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbnCidade = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Novo Funcionario");

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionarios"));
        jPanelCadastro.setToolTipText("");
        jPanelCadastro.setLayout(null);

        txtSobronome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobronomeActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtSobronome);
        txtSobronome.setBounds(270, 20, 140, 30);

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtComplemento);
        txtComplemento.setBounds(280, 100, 130, 30);

        lbnSobrenome.setText("Sobrenome:");
        jPanelCadastro.add(lbnSobrenome);
        lbnSobrenome.setBounds(200, 30, 70, 14);

        lbnNumero.setText("Numero:");
        jPanelCadastro.add(lbnNumero);
        lbnNumero.setBounds(310, 70, 50, 14);

        lbnNome.setText("Nome:");
        jPanelCadastro.add(lbnNome);
        lbnNome.setBounds(10, 30, 50, 14);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtNumero);
        txtNumero.setBounds(360, 60, 50, 30);

        lbnComplemento.setText("Complemento:");
        jPanelCadastro.add(lbnComplemento);
        lbnComplemento.setBounds(190, 110, 90, 14);

        lbnLogradouro.setText("Logradouro:");
        jPanelCadastro.add(lbnLogradouro);
        lbnLogradouro.setBounds(10, 70, 70, 14);

        txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogradouroActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtLogradouro);
        txtLogradouro.setBounds(80, 60, 220, 30);

        lbnTelefone.setText("Celular:");
        jPanelCadastro.add(lbnTelefone);
        lbnTelefone.setBounds(240, 200, 60, 14);

        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtUf);
        txtUf.setBounds(210, 140, 40, 30);

        lbnBairro.setText("Bairro:");
        jPanelCadastro.add(lbnBairro);
        lbnBairro.setBounds(10, 110, 60, 14);

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtBairro);
        txtBairro.setBounds(50, 100, 130, 30);

        lbnEmail.setText("Email:");
        jPanelCadastro.add(lbnEmail);
        lbnEmail.setBounds(10, 200, 60, 14);

        lbnUf.setText("UF:");
        jPanelCadastro.add(lbnUf);
        lbnUf.setBounds(190, 150, 30, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtNome);
        txtNome.setBounds(50, 20, 140, 30);

        lbnCep.setText("CEP:");
        jPanelCadastro.add(lbnCep);
        lbnCep.setBounds(10, 150, 30, 14);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtEmail);
        txtEmail.setBounds(50, 190, 180, 30);

        lbnCargo.setText("Cargo:");
        jPanelCadastro.add(lbnCargo);
        lbnCargo.setBounds(10, 260, 70, 14);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnCancelar);
        btnCancelar.setBounds(250, 303, 150, 30);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnIncluir);
        btnIncluir.setBounds(70, 303, 150, 30);

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Gerente", "Caixa", "Balconista", "Farmaceutico", "Atendente" }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jComboBoxCargo);
        jComboBoxCargo.setBounds(70, 250, 140, 30);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCPF);
        txtCPF.setBounds(250, 250, 160, 30);

        lbnCPF.setText("CPF:");
        jPanelCadastro.add(lbnCPF);
        lbnCPF.setBounds(220, 260, 34, 14);

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCidade);
        txtCidade.setBounds(310, 140, 100, 30);

        lbnCidade.setText("Cidade:");
        jPanelCadastro.add(lbnCidade);
        lbnCidade.setBounds(260, 150, 50, 14);

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCEP);
        txtCEP.setBounds(50, 140, 120, 30);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelCadastro.add(txtTelefone);
        txtTelefone.setBounds(290, 190, 120, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lbnTituloCadastro)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 430);

        setSize(new java.awt.Dimension(466, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSobronomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobronomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobronomeActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Funcionarios funcionario;
        int resposta = JOptionPane.showConfirmDialog(this, "Cadastrar novo Funcionario?", "Cadastro", 1);
        if (resposta == 0) {
            String firstName = txtNome.getText();
            String lastName = txtSobronome.getText();
            String logradouro = txtLogradouro.getText();
            Integer numero = Integer.parseInt(txtNumero.getText());
            String complemento = txtComplemento.getText();
            String Cep = txtCEP.getText();
            String bairro = txtBairro.getText();
            String uf = txtUf.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
            String CPF = txtCPF.getText();
            String cidade = txtCidade.getText();
            int id = jComboBoxCargo.getSelectedIndex();
            String cargo = null;
            switch (id) {
                case 0:
                    JOptionPane.showMessageDialog(this, "Selecione um Cargo!!");
                    break;
                case 1:
                    cargo = "Gerente";
                    break;
                case 2:
                    cargo = "Caixa";
                    break;
                case 3:
                    cargo = "Balconista";
                    break;
                case 4:
                    cargo = "Farmaceutico";
                    break;
                case 5:
                    cargo = "Atendente";
                    break;
                default:
                    break;
            }

            Date date = new java.sql.Date(new java.util.Date().getTime());
            String login = JOptionPane.showInputDialog("Informe o novo Login");
            String senha = JOptionPane.showInputDialog("Confirme a senha");
            
            funcionario = new Funcionarios(null, firstName, 
                    lastName, logradouro, numero, bairro, complemento, 
                    Cep, uf, telefone, email, date, cargo, cidade, CPF, login, senha);
            
            
            FuncionariosDao.CreateFuncionario(funcionario);
           
        }
        
        int novo = JOptionPane.showConfirmDialog(this, "Cadastro Concluido!! Deseja cadastrar um novo Funcionario?", "Cadastro de Clientes", 1);
        if (novo == 0) {
            txtNome.setText("");
            txtSobronome.setText("");
            txtBairro.setText("");
            txtCEP.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtSobronome.setText("");
            txtTelefone.setText("");
            txtUf.setText("");
            txtCidade.setText("");
            txtCPF.setText("");
            jComboBoxCargo.setSelectedIndex(0);
        } else if (novo == 1) {
            dispose();
        }
        
       
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cancelar?", "Confirma", 1);

        if (decisao != 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCargoActionPerformed

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost

    }//GEN-LAST:event_txtCEPFocusLost

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed

    }//GEN-LAST:event_txtCEPActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel lbnBairro;
    private javax.swing.JLabel lbnCPF;
    private javax.swing.JLabel lbnCargo;
    private javax.swing.JLabel lbnCep;
    private javax.swing.JLabel lbnCidade;
    private javax.swing.JLabel lbnComplemento;
    private javax.swing.JLabel lbnEmail;
    private javax.swing.JLabel lbnLogradouro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnNumero;
    private javax.swing.JLabel lbnSobrenome;
    private javax.swing.JLabel lbnTelefone;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JLabel lbnUf;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSobronome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
