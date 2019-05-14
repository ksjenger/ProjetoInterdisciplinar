package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Convenios;
import model.entities.Perfumaria;


public class EstoqueDao {
    
    public static ArrayList<Perfumaria> selectEstoque() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Perfumaria> lista = new ArrayList<>();

        try {
            conn = ConectaBD.getConnection();
            String sql = "select produtos.nome, produtos.tipo, perfumaria.Categoria, "
                    + "produtos.status ,perfumaria.Quantidade from produtos inner join "
                    + "perfumaria on produtos.idProduto = perfumaria.idProduto "
                    + "order by produtos.nome";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Perfumaria pf = new Perfumaria();
                String nome = rs.getString(1);
                String tipo = rs.getString(2);
                Boolean status = rs.getBoolean(3);
                int quantidade = rs.getInt(nome);
                lista.add(pf);
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
}
