package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.entities.Cliente;
import model.entities.Convenios;

public class ClienteDao {

    private static Connection conn = null;

    public static void CreateCliente(Cliente cliente) {
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
    
    public static Cliente findByCPF(String cpf){
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;
        String sql = "Select * from clientes where cpf = ?";
        ResultSet rs = null;
        Cliente c = new Cliente();
        Integer idConvenio = null;
        
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();
            
            if(rs.next()){
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String CPF = rs.getString("CPF");
                idConvenio = rs.getInt("idConvenio");
                c.setFirstName(firstName);
                c.setLastName(lastName);
                c.setCPF(CPF);             
                Convenios convenio = ConveniosDao.selectConvenio(idConvenio);
                c.setConvenio(convenio);
            }
                
            
        }catch(SQLException e){
            
        }
        
        return c;
    }
    
     public static ArrayList<Cliente> selectClientes(){
        ArrayList<Cliente> lista = new ArrayList<>();
        conn = ConectaBD.getConnection();
        Statement st = null;
        String sql = "Select * from clientes";
        ResultSet rs = null;
        Cliente c = new Cliente();
        Integer idConvenio = null;
        
        try{
            st = conn.createStatement();         
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String CPF = rs.getString("CPF");
                idConvenio = rs.getInt("idConvenio");
                c.setFirstName(firstName);
                c.setLastName(lastName);
                c.setCPF(CPF);             
                Convenios convenio = ConveniosDao.selectConvenio(idConvenio);
                c.setConvenio(convenio);
                String logradouro = rs.getString("logradouro");
                int numero = rs.getInt("numero");
                String bairro = rs.getString("bairro");
                String complemento = rs.getString("complemento");
                String cep = rs.getString("cep");
                String uf = rs.getString("uf");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                Cliente cliente = new Cliente(idConvenio, firstName, lastName, 
                        logradouro, numero, bairro, complemento, 
                        cep, uf, telefone, email, cpf, telefone, cpf, convenio);
                
                lista.add(cliente);
            }
                
            
        }catch(SQLException e){
            
        }
        
        return lista;
    }
    
    
}
