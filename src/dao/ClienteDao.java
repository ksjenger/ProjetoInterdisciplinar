package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClienteDao {
	
	private static Connection conn = null;
	
	public void CreateCliente(String nome, String telefone, Integer convenio) {
		conn = ConectaBD.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("insert into cliente (nome, telefone, convenio) values (?,?,?);");
			st.setString(1, nome);
			st.setString(2, telefone);
			st.setInt(3, convenio);			
			
			st.execute();
			st.close();
			
			ConectaBD.closeConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
