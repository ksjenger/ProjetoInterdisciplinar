package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.entities.Cliente;
import model.entities.Funcionarios;
import model.entities.Receita;

public class AtendimentoDao {

    private static Connection conn = null;
    
    public static void insertAtendimento(Funcionarios idF, Cliente idC, Receita idR){
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "";
        
        try{
            st = conn.prepareStatement(sql);
            
            
        }
        
        }
    
}
