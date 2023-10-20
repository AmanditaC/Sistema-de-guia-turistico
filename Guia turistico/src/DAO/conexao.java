package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/GuiaTuristico";
    private static final String USER = "seuusuario";
    private static final String PASSWORD = "suasenha";

    public static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver"); // Certifique-se de ter o driver JDBC do PostgreSQL no seu classpath
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco de dados.");
        }
    }

    public static void desconectar(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.");
        }
    }
}
