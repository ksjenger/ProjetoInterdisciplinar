package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Convenios;
import model.entities.Perfumaria;
import model.entities.Remedios;

public class EstoqueDao {

    public static ArrayList<Perfumaria> selectPerfumaria() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Perfumaria> lista = new ArrayList<>();

        try {
            conn = ConectaBD.getConnection();
            String sql = "select produtos.nome, produtos.tipo, perfumaria.Categoria, "
                    + "produtos.status, produtos.preco, perfumaria.Quantidade, produtos.idProduto "
                    + "from produtos inner join "
                    + "perfumaria on produtos.idProduto = perfumaria.idProduto "
                    + "order by produtos.nome";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String nome = rs.getString(1);
                String tipo = rs.getString(2);
                String categoria = rs.getString(3);
                Boolean status = rs.getBoolean(4);
                double valor = rs.getDouble(5);
                int quantidade = rs.getInt(6);
                int id = rs.getInt(7);
                Perfumaria pf = new Perfumaria();
                pf.setIdProduto(id);
                pf.setNome(nome);
                pf.setTipo(tipo);
                pf.setQuantidade(quantidade);
                pf.setStatus(status);
                pf.setCategoria(categoria);
                pf.setValor(valor);
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

    public static void updatePerfumaria(Perfumaria other) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = ConectaBD.getConnection();
            String sql = "update produtos set status = ? where idproduto = ?";
            st = conn.prepareStatement(sql);
            st.setBoolean(1, other.getStatus());
            st.setInt(2, other.getIdProduto());
            st.execute();

            sql = "update perfumaria set quantidade = ? where idproduto = ? ";
            st = conn.prepareStatement(sql);
            st.setInt(1, other.getQuantidade());
            st.setInt(2, other.getIdProduto());
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
    }
    
    public static ArrayList<Remedios> selectRemedios() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Remedios> lista = new ArrayList<>();

        try {
            conn = ConectaBD.getConnection();
            String sql = "SELECT produtos.nome, produtos.tipo, remedios.tipoRemedio, "
                    + "produtos.status, produtos.preco, Remedios.Quantidade, produtos.idProduto "
                    + "FROM produtos INNER JOIN "
                    + "Remedios ON produtos.idProduto = remedios.idProduto "
                    + "ORDER BY produtos.nome";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String nome = rs.getString(1);
                String tipo = rs.getString(2);
                String tipoRemedio = rs.getString(3);
                Boolean status = rs.getBoolean(4);
                double valor = rs.getDouble(5);
                int quantidade = rs.getInt(6);
                int id = rs.getInt(7);
                Remedios rd = new Remedios();
                rd.setIdProduto(id);
                rd.setNome(nome);
                rd.setTipo(tipo);
                rd.setQuantidade(quantidade);
                rd.setStatus(status);
                rd.setCategoria(tipoRemedio);
                rd.setValor(valor);
                lista.add(rd);
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
    
    public static void updateRemedio(Remedios other) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = ConectaBD.getConnection();
            String sql = "update produtos set status = ? where idproduto = ?";
            st = conn.prepareStatement(sql);
            st.setBoolean(1, other.getStatus());
            st.setInt(2, other.getIdProduto());
            st.execute();

            sql = "update remedios set quantidade = ? where idproduto = ? ";
            st = conn.prepareStatement(sql);
            st.setInt(1, other.getQuantidade());
            st.setInt(2, other.getIdProduto());
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
    }
}
