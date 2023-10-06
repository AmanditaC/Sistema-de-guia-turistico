package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import ENTIDADES.Usuarios;

public class usuario {
    private static final String URL = "jdbc:postgresql://localhost:5432/seubanco";
    private static final String USER = "seuusuario";
    private static final String PASSWORD = "suasenha";

    public void cadastrarLogin(ArrayList<usuario> cadastrarLogin) {
        Scanner ler = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.print("Informe seu Email: ");
            String email = ler.nextLine();
            System.out.print("Crie uma Senha: ");
            String senha = ler.nextLine();

            String sql = "INSERT INTO Usuarios (email, senha) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, senha);

                preparedStatement.executeUpdate();
            }

            System.out.println("Cadastro realizado com sucesso!\n");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao cadastrar usuário.");
        } finally {
            ler.close();
        }
    }
}


