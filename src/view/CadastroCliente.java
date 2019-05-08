package view;

import com.sun.java.swing.plaf.windows.resources.windows;
import dao.ClienteDao;
import dao.ConveniosDao;
import javax.swing.JOptionPane;
import model.entities.Cliente;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
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
        txtTelefone = new javax.swing.JTextField();
        lbnComplemento = new javax.swing.JLabel();
        lbnLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbnTelefone = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lbnBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbnEmail = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbnUf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbnCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lbnCodigo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbnConvenio = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jComboBoxConvenio = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lbnTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloCadastro.setText("Novo Cliente");

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Clientes"));
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

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtTelefone);
        txtTelefone.setBounds(320, 140, 90, 30);

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

        lbnTelefone.setText("Telefone:");
        jPanelCadastro.add(lbnTelefone);
        lbnTelefone.setBounds(260, 150, 60, 14);

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
        lbnEmail.setBounds(10, 190, 60, 14);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCodigo);
        txtCodigo.setBounds(140, 260, 150, 30);

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

        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCep);
        txtCep.setBounds(50, 140, 130, 30);

        lbnCodigo.setText("Numero do Convenio:");
        jPanelCadastro.add(lbnCodigo);
        lbnCodigo.setBounds(10, 270, 120, 14);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtEmail);
        txtEmail.setBounds(50, 180, 220, 30);

        lbnConvenio.setText("Convenio: ");
        jPanelCadastro.add(lbnConvenio);
        lbnConvenio.setBounds(10, 230, 70, 14);

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

        jComboBoxConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Notredame" }));
        jPanelCadastro.add(jComboBoxConvenio);
        jComboBoxConvenio.setBounds(70, 220, 140, 30);

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
                        .addGap(93, 93, 93)
                        .addComponent(lbnTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 430);

        setSize(new java.awt.Dimension(466, 472));
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

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja incluir novo cliente?", "Cadastro", WIDTH);
        if (resposta == 0) {
            String firstName = txtNome.getText();
            String lastName = txtSobronome.getText();
            String logradouro = txtLogradouro.getText();
            Integer numero = Integer.parseInt(txtNumero.getText());
            String complemento = txtComplemento.getText();
            String Cep = txtCep.getText();
            String bairro = txtBairro.getText();
            String uf = txtUf.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
            int id = jComboBoxConvenio.getSelectedIndex();
            ConveniosDao conveniosDao = new ConveniosDao();

            Cliente cliente = new Cliente(null, firstName, lastName, logradouro, numero,
                    bairro, complemento, Cep, uf, telefone, Cep, email);
            cliente.setConvenio(conveniosDao.getConvenios(id));

            ClienteDao clienteDao = new ClienteDao();
            clienteDao.CreateCliente(cliente);
            JOptionPane.showMessageDialog(this, "Cadastrado concluido!");
        }
        
        int novocliente = JOptionPane.showConfirmDialog(this, "Deseja Incluir um novo Cliente?", "Cadastro de Clientes", WIDTH);
        if(novocliente == 0){
            txtNome.setText("");
            txtSobronome.setText("");
            txtBairro.setText("");
            txtCep.setText("");
            txtCodigo.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtSobronome.setText("");
            txtTelefone.setText("");
            txtUf.setText("");
            jComboBoxConvenio.setSelectedIndex(0);
        }else if(novocliente == 1){
            dispose();
            
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int decisao = JOptionPane.showConfirmDialog(this, "Deseja Cancelar?", "Confirma", WIDTH);

        if (decisao != 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> jComboBoxConvenio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel lbnBairro;
    private javax.swing.JLabel lbnCep;
    private javax.swing.JLabel lbnCodigo;
    private javax.swing.JLabel lbnComplemento;
    private javax.swing.JLabel lbnConvenio;
    private javax.swing.JLabel lbnEmail;
    private javax.swing.JLabel lbnLogradouro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnNumero;
    private javax.swing.JLabel lbnSobrenome;
    private javax.swing.JLabel lbnTelefone;
    private javax.swing.JLabel lbnTituloCadastro;
    private javax.swing.JLabel lbnUf;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSobronome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
