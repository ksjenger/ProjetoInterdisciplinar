package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.entities.Convenios;

public class ConveniosDao{
    
    Connection conn = null;
    
    public Convenios getConvenios(Integer id){
        Convenios convenio = null;
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conn.prepareStatement("select * from convenios where IdConvenio = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            if(rs.next()){
                Integer idConvenio = rs.getInt("IdConvenio");
                String nomeConvenio = rs.getString("Empresa");
                convenio = new Convenios(nomeConvenio, idConvenio);
                
                
            }
            
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        return convenio;
        
    }
    
}
