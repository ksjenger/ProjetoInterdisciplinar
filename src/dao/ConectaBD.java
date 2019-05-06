package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectaBD {

    private static Connection conn = null;

    public static Connection getConnection() {
            try {
                String serverName = "localhost";
                String mydatabase = "projetointerdisciplinar";

                String username = "root";
                String password = "root";

                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);

                String url = "jdbc:mysql://localhost:3306/projetointerdisciplinar?useSSL=false";
                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                System.out.println("Driver não encontrado " + e.toString());
            } catch (SQLException e) {
                System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
            }
        
        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
