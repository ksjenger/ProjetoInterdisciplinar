package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.entities.Receita;

public class ReceitaDao {
    
    private static Connection conn = ConectaBD.getConnection();
    
    public static void insertReceita(Receita receita){
        conn = null;
        PreparedStatement st = null;
        String sql = "insert into Receita (nrControle, dataReceita, "
                + "idRemedios, quantidade) "
                + "values (?, ?, ?, ?)";
        
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, receita.getNrControle());
            st.setDate(2, null);
            st.setInt(3, 1);
            st.setInt(4, receita.getQtd());
            
        }catch(SQLException e){
        }
        
    }
    
}
