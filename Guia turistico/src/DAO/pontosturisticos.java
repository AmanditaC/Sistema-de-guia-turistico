package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class pontosturisticos {

    private String Nome_do_Cadastrante;
    private String Nome_do_Local;
    private String Localizacao;

    public pontosturisticos(String Nome_do_Cadastrante, String Nome_do_Local, String Localizacao) {
        this.Nome_do_Cadastrante = Nome_do_Cadastrante;
        this.Nome_do_Local = Nome_do_Local;
        this.Localizacao = Localizacao;
    }

    // Métodos getters e setters ...

    public void cadastrarPonto() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha")) {
            String query = "INSERT INTO pontos_turisticos (nome_cadastrante, nome_local, localizacao) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, Nome_do_Cadastrante);
                preparedStatement.setString(2, Nome_do_Local);
                preparedStatement.setString(3, Localizacao);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<pontosturisticos> carregarPontosTuristicos() {
        ArrayList<pontosturisticos> lista = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha")) {
            String query = "SELECT * FROM pontos_turisticos";

            try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String cadastrante = resultSet.getString("nome_cadastrante");
                    String local = resultSet.getString("nome_local");
                    String localizacao = resultSet.getString("localizacao");

                    pontosturisticos ponto = new pontosturisticos(cadastrante, local, localizacao);
                    lista.add(ponto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}