package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.entities.Funcionarios;

public class FuncionariosDao {

    private static Connection conn = null;

    public void CreateFuncionario(Funcionarios funcionario) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("insert into funcionarios (firstName, "
                    + "lastName, logradouro, numero, bairro, "
                    + "complemento, CEP, uf, telefone, email, dataContratacao , cargo, cidade, cpf) values"
                    + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)");
            st.setString(1, funcionario.getFirstName());
            st.setString(2, funcionario.getLastName());
            st.setString(3, funcionario.getLogradouro());
            st.setInt(4, funcionario.getNumero());
            st.setString(5, funcionario.getBairro());
            st.setString(6, funcionario.getComplemento());
            st.setString(7, funcionario.getCEP());
            st.setString(8, funcionario.getUf());
            st.setString(9, funcionario.getTelefone());
            st.setString(10, funcionario.getEmail());
            st.setDate(11, funcionario.getDataContrato());
            st.setString(12, funcionario.getCargo());
            st.setString(13, funcionario.getCidade());
            st.setString(14, funcionario.getCpf());
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
