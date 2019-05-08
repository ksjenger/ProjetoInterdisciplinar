package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.entities.Cliente;


public class ClienteDao {
	
	private static Connection conn = null;
	
	public void CreateCliente(Cliente cliente) {
		conn = ConectaBD.getConnection();
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("insert into cliente (firstName, "
                                + "lastName, logradouro, numero, bairro, "
                                + "complemento, CEP, uf, telefone, idconvenio) values"
                                + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, cliente.getFirstName());
			st.setString(2, cliente.getLastName());
			st.setString(3, cliente.getLogradouro());
                        st.setInt(4, cliente.getNumero());
                        st.setString(5, cliente.getBairro());
                        st.setString(6, cliente.getComplemento());
                        st.setString(7, cliente.getCEP());
                        st.setString(8, cliente.getUf());
                        st.setString(9, cliente.getTelefone());
                        st.setInt(10, cliente.getConvenio().getIdConvenio());
			st.execute();
			st.close();
			ConectaBD.closeConnection();
		}catch(SQLException e) {
			e.printStackTrace();
                }	
	}
}
