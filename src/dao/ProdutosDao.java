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
                p.setTipo(tipo);
                listaP.add(p);
            }
            
            sql = "select produtos.nome as Nome, produtos.tipo as Classificacao, "
                    + "produtos.preco as Preco, perfumaria.Categoria as Genero "
                    + "from produtos inner join perfumaria on "
                    + "perfumaria.idProduto = produtos.idProduto order by produtos.nome; ";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                String nome = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                Produtos p = new Produtos(null, nome, genero, preco, null, Boolean.TRUE);
                p.setTipo(tipo);
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
        
        return ordenaArray(listaP);
    }
    
    public static ArrayList <Produtos> findProdutosbyName(String nome) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList listaP = new ArrayList<>();
         
        try {
            conn = ConectaBD.getConnection();
            String sql = "select produtos.nome as Nome, produtos.tipo as Classificacao,"
                    + " produtos.preco as Preco,remedios.tipoRemedio as Genero, produtos.idProduto "
                    + "from produtos "
                    + "inner join remedios on remedios.idProduto = produtos.idProduto "
                    + "where produtos.nome like ? and produtos.status = 1;";
            
            st = conn.prepareStatement(sql);
            st.setString(1,nome + '%');
            rs = st.executeQuery();
            
            
            while(rs.next()){
                String nomeR = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                int id = rs.getInt(5);
                Produtos p = new Produtos(id, nomeR, genero, preco, null, Boolean.TRUE);
                p.setTipo(tipo);
                listaP.add(p);
            }
            
            sql = "SELECT "
                    + "produtos.nome, "
                    + "produtos.tipo, "
                    + "produtos.preco, "
                    + "perfumaria.Categoria, "
                    + "produtos.idProduto "
                    + "from  produtos "
                    + "inner join perfumaria on produtos.idProduto = perfumaria.idProduto"
                    + " where nome like ? and produtos.status = 1";
            
            st = conn.prepareStatement(sql);
            st.setString(1,nome + '%');
            rs = st.executeQuery();
            
            while(rs.next()){
                String nomeR = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                int id = rs.getInt(5);
                Produtos p = new Produtos(id, nomeR, genero, preco, null, Boolean.TRUE);
                p.setTipo(tipo);
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
    
    private static ArrayList<Produtos> ordenaArray(ArrayList<Produtos> produtos){
        ArrayList<Produtos> ap = new ArrayList<>();
        Integer cont = 0;
        for(Produtos prod : produtos){
            Produtos p = new Produtos();          
            p = produtos.get(cont);
            ap.add(p);
            cont++;
        }
        return ap;
    }
    

 public static Produtos findProdutosbyId(Integer id) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Produtos p = new Produtos();
         
        try {
            conn = ConectaBD.getConnection();
            String sql = "select produtos.nome as Nome, produtos.tipo as Classificacao,"
                    + " produtos.preco as Preco,remedios.tipoRemedio as Genero, produtos.idProduto "
                    + "from produtos "
                    + "inner join remedios on remedios.idProduto = produtos.idProduto "
                    + "where produtos.idProduto = ?";
            
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            
            
            while(rs.next()){
                String nomeR = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                int idr = rs.getInt(5);
                p.setNome(nomeR);
                p.setTipo(tipo);
                p.setValor(preco);
                p.setCategoria(genero);
                p.setIdProduto(idr);
            }
            
            sql = "select produtos.nome as Nome, produtos.tipo as Classificacao,"
                    + " produtos.preco as Preco, perfumaria.Categoria as Genero, produtos.idProduto "
                    + "from produtos "
                    + "inner join perfumaria on perfumaria.idProduto = produtos.idProduto"
                    + " where produtos.idproduto = ?";
            
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            
            while(rs.next()){       
                String nomeR = rs.getString(1);
                String tipo = rs.getString(2);
                Double preco = rs.getDouble(3);
                String genero = rs.getString(4);
                int idr = rs.getInt(5);
                p.setNome(nomeR);
                p.setTipo(tipo);
                p.setValor(preco);
                p.setCategoria(genero);
                p.setIdProduto(idr);
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
        
        return p;
    }    
}
