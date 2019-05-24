package view;

import dao.ClienteDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.entities.Cliente;
import model.entities.Convenios;

public class FormRelatorioClientes extends javax.swing.JFrame {

    ArrayList<Cliente> lista = new ArrayList<>();
    DefaultListModel modelo;

    public FormRelatorioClientes() {
        initComponents();
        CarregaGrid();
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbnTituloPesquisa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Produtos");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));

        lbnTituloPesquisa.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbnTituloPesquisa.setText("Clientes Cadastrados");

        jPanel2.setLayout(null);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "CEP", "Telefone", "E-mail", "CPF", "Convenio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 650, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbnTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 670, 510);

        setSize(new java.awt.Dimension(696, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CarregaGrid() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        lista = ClienteDao.selectClientes();
        DefaultTableModel tab = (DefaultTableModel) jTableProdutos.getModel();
        tab.setNumRows(0);
        for (Cliente f : lista) {
            String nome = f.getFirstName() + " " + f.getLastName();
            String endereco = f.getLogradouro() + ", " + f.getNumero() + ", " + f.getComplemento() + " - " + f.getBairro();
            String telefone = f.getTelefone();
            String email = f.getEmail();
            String cep = f.getCEP();
            String cpf = f.getCPF();
            String convenio = f.getConvenio().getNomeConvenio();
            tab.addRow(new String[]{nome, endereco, cep, telefone, email, cpf, convenio});
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lbnTituloPesquisa;
    // End of variables declaration//GEN-END:variables
}
