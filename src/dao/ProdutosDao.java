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
   
    public static ArrayList <Produtos> selectProdutos() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList listaP = new ArrayList<>();
         
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
