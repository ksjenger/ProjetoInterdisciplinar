package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Convenios;

public class ConveniosDao {

    Connection conn = null;

    public Convenios insertConvenios(Convenios convenio) {
        conn = ConectaBD.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("insert into convenios (Empresa) values (?)");
            st.setString(1, convenio.getNomeConvenio());
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
        return convenio;
    }

    public void deleteConvenio(Integer id) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = ConectaBD.getConnection();
            String sql = "Delete from convenios where idConvenio = ? ";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            st.close();
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

    public void updateConvenio(Integer id, String novonome) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = ConectaBD.getConnection();
            String sql = "update convenios set empresa = ? where idConvenio = ?";
            st = conn.prepareStatement(sql);
            st.setString(1, novonome);
            st.setInt(2, id);
            st.execute();
            st.close();
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
    
    public static ArrayList<Convenios> getConvenios(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Convenios> lista = new ArrayList<Convenios>();

        Convenios c = new Convenios();
        try {
            conn = ConectaBD.getConnection();
            String sql = "Select * from Convenios";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                int idConvenio = rs.getInt("idConvenio");
                String empresa = rs.getString("Empresa");
                c.setNomeConvenio(empresa);
                c.setIdConvenio(idConvenio);
                lista.add(c);
            }

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

        return lista;
    
    }

    public Convenios selectConvenio(Integer id) {
        
        PreparedStatement st = null;
        ResultSet rs = null;

        Convenios c = new Convenios();

        try {
            conn = ConectaBD.getConnection();
            String sql = "Select * from Convenios where idConvenio = ?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                int idConvenio = rs.getInt("idConvenio");
                String empresa = rs.getString("Empresa");
                c.setNomeConvenio(empresa);
                c.setIdConvenio(idConvenio);
            }

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

        return c;
    }
}
