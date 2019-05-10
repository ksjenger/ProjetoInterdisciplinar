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
            st = conn.prepareStatement("insert into clientes (firstName, "
                    + "lastName, logradouro, numero, bairro, "
                    + "complemento, CEP, uf, telefone, email, CPF, cidade, idconvenio, carteirinha) values"
                    + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?, ?)");
            st.setString(1, cliente.getFirstName());
            st.setString(2, cliente.getLastName());
            st.setString(3, cliente.getLogradouro());
            st.setInt(4, cliente.getNumero());
            st.setString(5, cliente.getBairro());
            st.setString(6, cliente.getComplemento());
            st.setString(7, cliente.getCEP());
            st.setString(8, cliente.getUf());
            st.setString(9, cliente.getTelefone());
            st.setString(10, cliente.getEmail());
            st.setString(11, cliente.getCPF());
            st.setString(12, cliente.getCidade());
            st.setInt(13, cliente.getConvenio().getIdConvenio());
            st.setString(14, cliente.getCarterinha());
            st.execute();
            st.close();
            ConectaBD.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConectaBD.closeConnection();
            try{
                st.close();           
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
