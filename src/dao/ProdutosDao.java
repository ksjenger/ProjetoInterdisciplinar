package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Produtos;

public class ProdutosDao {

    Connection conn = null;

    /*public Convenios insertProdutos(Produtos produto) {
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

    */
    
    public ArrayList <Produtos> selectProdutos() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList listaP = new ArrayList<Produtos>();
        
        
        try {
            conn = ConectaBD.getConnection();
            String sql = "select produtos.nome as Nome, produtos.tipo as Classificacao,"
                    + "produtos.preco as Preco,remedios.tipoRemedio as Genero "
                    + "from produtos "
                    + "inner join remedios on remedios.idProduto = produtos.idProduto "
                    + "order by produtos.nome; ";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                String nome = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                Produtos p = new Produtos(null, nome, genero, preco, null, Boolean.TRUE);
                listaP.add(p);
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

        return listaP;
    }
}
