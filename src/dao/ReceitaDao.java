package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.entities.Receita;

public class ReceitaDao {

    private static Connection conn = ConectaBD.getConnection();

    public static void insertReceita(Receita receita) throws ParseException {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "insert into Receita (nrControle, dataReceita, "
                + "idRemedios, quantidade) "
                + "values (?, ?, ?, ?)";
        
        
        java.util.Date date = receita.getDate();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
       
        try {

            st = conn.prepareStatement(sql);
            st.setString(1, receita.getNrControle());
            st.setDate(2, sqlDate);
            st.setInt(3, receita.getRemedios().getIdProduto());
            st.setInt(4, receita.getQtd());
            st.execute();

        } catch (SQLException e) {
        }

    }

}
