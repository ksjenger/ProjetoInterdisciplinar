package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import model.entities.Cliente;
import model.entities.Funcionarios;
import model.entities.Receita;

public class AtendimentoDao {

    private static Connection conn = null;

    public static void insertAtendimento(Funcionarios f, Cliente c, Receita r) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert into atendimento "
                + "(dataAtendimento, "
                + "idFuncionario, "
                + "idCliente, "
                + "idReceita) "
                + "values "
                + "(?, ?, ?, ?);";

        java.util.Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        try {
            st = conn.prepareStatement(sql);
            st.setDate(1, sqlDate);
            st.setInt(2, f.getIdFuncionario());
            st.setInt(3, c.getIdCliente());
            st.setInt(4, r.getIdReceita());
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

}
