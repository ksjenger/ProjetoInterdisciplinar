package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.entities.Remedios;

public class RemediosDao {

    private static Connection conn = null;

    private Integer getLastId() {
        Integer idProduto = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery("Select max(idProduto) from produtos");

            if (rs.next()) {
                idProduto = rs.getInt(1);
                idProduto++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idProduto;
    }

    public void InsertRemedio(Remedios remedio) {
        PreparedStatement st = null;
        conn = ConectaBD.getConnection();
        int id = getLastId();

        try {
            st = conn.prepareStatement("insert into produtos (idProduto, nome, "
                    + "tipo, preco ) values (?, ?, ?,?)");
            st.setInt(1, id);
            st.setString(2, remedio.getNome());
            st.setString(3, "Remedios");
            st.setDouble(4, remedio.getValor());
            st.execute();

            st = conn.prepareStatement("insert into Remedios (idProduto, tipoRemedio, "
                    + "prescricao) values (?,?,?)");

            st.setInt(1, id);
            st.setString(2, remedio.getTipoRemedio());
            st.setBoolean(3, remedio.getPrescricao());
            st.execute();

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

}
