package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Date;
import model.entities.Cliente;
import model.entities.Funcionarios;
import model.entities.Receita;

public class AtendimentoDao {

    private static Connection conn = null;

    public static void insertAtendimento(Funcionarios f, Cliente c, Receita r) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert into atendimento "
                + "(idFuncionario, "
                + "idCliente, "
                + "idReceita) "
                + "values "
                + "(?, ?, ?);";

        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, f.getIdFuncionario());
            st.setInt(2, c.getIdCliente());
            st.setInt(3, r.getIdReceita());
            st.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
        }
        try {
            st.close();;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void insertAtendimento(Funcionarios f) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert into atendimento "
                + "(idFuncionario) "
                + "values "
                + "(?);";

        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, f.getIdFuncionario());
            st.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
        }
        try {
            st.close();;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void insertAtendimento(Funcionarios f, Cliente c) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert into atendimento "
                + "(idFuncionario, "
                + "idCliente) "
                + "values "
                + "(?, ?);";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, f.getIdFuncionario());
            st.setInt(2, c.getIdCliente());
            st.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
        }
        try {
            st.close();;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Integer findNextId() {
        Integer nextId = null;

        conn = ConectaBD.getConnection();
        Statement st = null;
        ResultSet rs = null;

        String sql = "select max(idAtendimento + 1) from atendimento";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                nextId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaBD.closeConnection();
        }

        try {
            st.close();;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nextId;
    }
    
    public static void insertItens(Integer idAtendimento, Integer IdItem){
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert itens "
                + "(idItens, "
                + "idAtendimento) "
                + "values "
                + "(?, ?)";
        try{
             st = conn.prepareStatement(sql);
             st.setInt(1, IdItem);
             st.setInt(2, idAtendimento);
             st.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
