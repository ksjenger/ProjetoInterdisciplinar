package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Funcionarios;

public class FuncionariosDao {

    private static Connection conn = null;

    public static void CreateFuncionario(Funcionarios funcionario) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("insert into funcionarios (firstName, "
                    + "lastName, logradouro, numero, bairro, "
                    + "complemento, CEP, uf, telefone, email, dataContratacao , cargo, cidade, cpf, login, senha) values"
                    + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?)");
            st.setString(1, funcionario.getFirstName());
            st.setString(2, funcionario.getLastName());
            st.setString(3, funcionario.getLogradouro());
            st.setInt(4, funcionario.getNumero());
            st.setString(5, funcionario.getBairro());
            st.setString(6, funcionario.getComplemento());
            st.setString(7, funcionario.getCEP());
            st.setString(8, funcionario.getUf());
            st.setString(9, funcionario.getTelefone());
            st.setString(10, funcionario.getEmail());
            st.setDate(11, funcionario.getDataContrato());
            st.setString(12, funcionario.getCargo());
            st.setString(13, funcionario.getCidade());
            st.setString(14, funcionario.getCpf());
            st.setString(15, funcionario.getLogin());
            st.setString(16, funcionario.getPassword());
            st.execute();
            st.close();
            ConectaBD.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Funcionarios getPassaword(String login) {
        Funcionarios f = null;
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "select * from funcionarios where funcionarios.login = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, login);
            rs = st.executeQuery();

            if (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastname = rs.getString(3);
                String logradouro = rs.getString(4);
                Integer numero = rs.getInt(5);
                String bairro = rs.getString(6);
                String complemento = rs.getString(7);
                String cep = rs.getString(8);
                String uf = rs.getString(9);
                String telefone = rs.getString(10);
                String email = rs.getString(11);
                Date date = rs.getDate(12);
                String cargo = rs.getString(13);
                String CPF = rs.getString(14);
                String cidade = rs.getString(15);
                String loginbd = rs.getString(16);
                String senha = rs.getString(17);
                f = new Funcionarios(idFuncionario, firstName, lastname,
                        logradouro, numero, bairro, complemento, cep, uf,
                        telefone, email, date, cargo, cidade, CPF, loginbd, senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    public static Funcionarios selectFuncionarioById(Integer id) {
        Funcionarios f = null;
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "select * from funcionarios where funcionarios.idFuncionario = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastname = rs.getString(3);
                String logradouro = rs.getString(4);
                Integer numero = rs.getInt(5);
                String bairro = rs.getString(6);
                String complemento = rs.getString(7);
                String cep = rs.getString(8);
                String uf = rs.getString(9);
                String telefone = rs.getString(10);
                String email = rs.getString(11);
                Date date = rs.getDate(12);
                String cargo = rs.getString(13);
                String CPF = rs.getString(14);
                String cidade = rs.getString(15);
                String loginbd = rs.getString(16);
                String senha = rs.getString(17);
                f = new Funcionarios(idFuncionario, firstName, lastname,
                        logradouro, numero, bairro, complemento, cep, uf,
                        telefone, email, date, cargo, cidade, CPF, loginbd, senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return f;
    }
    
    
    public static ArrayList<Funcionarios> selectFuncionario() {
        ArrayList<Funcionarios> listaf = new ArrayList<>();
        
        conn = ConectaBD.getConnection();
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from funcionarios";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastname = rs.getString(3);
                String logradouro = rs.getString(4);
                Integer numero = rs.getInt(5);
                String bairro = rs.getString(6);
                String complemento = rs.getString(7);
                String cep = rs.getString(8);
                String uf = rs.getString(9);
                String telefone = rs.getString(10);
                String email = rs.getString(11);
                Date date = rs.getDate(12);
                String cargo = rs.getString(13);
                String CPF = rs.getString(14);
                String cidade = rs.getString(15);
                String loginbd = rs.getString(16);
                String senha = rs.getString(17);
                Funcionarios f = new Funcionarios(idFuncionario, firstName, lastname,
                        logradouro, numero, bairro, complemento, cep, uf,
                        telefone, email, date, cargo, cidade, CPF, loginbd, senha);
                listaf.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaf;
    }
    
    
        public static ArrayList<Funcionarios> findFuncionario(String nome) {
        ArrayList<Funcionarios> listaf = new ArrayList<>();
        
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "select * from funcionarios where Firstname like ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, nome + '%');
            rs = st.executeQuery(); 
            
            while (rs.next()) {
                int idFuncionario = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastname = rs.getString(3);
                String logradouro = rs.getString(4);
                Integer numero = rs.getInt(5);
                String bairro = rs.getString(6);
                String complemento = rs.getString(7);
                String cep = rs.getString(8);
                String uf = rs.getString(9);
                String telefone = rs.getString(10);
                String email = rs.getString(11);
                Date date = rs.getDate(12);
                String cargo = rs.getString(13);
                String CPF = rs.getString(14);
                String cidade = rs.getString(15);
                String loginbd = rs.getString(16);
                String senha = rs.getString(17);
                Funcionarios f = new Funcionarios(idFuncionario, firstName, lastname,
                        logradouro, numero, bairro, complemento, cep, uf,
                        telefone, email, date, cargo, cidade, CPF, loginbd, senha);
                listaf.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaf;
    }
    
}
