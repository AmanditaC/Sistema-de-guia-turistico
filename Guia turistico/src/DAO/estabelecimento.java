package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;

public class estabelecimento {

    private static final String URL = "jdbc:mysql://localhost:3306/EstabelecimentosDB";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public void cadastrarEstabelecimento(ArrayList<Estabelecimento> ListaDeEstabelecimentos) {
        Scanner ler = new Scanner(System.in);
        Estabelecimento acessar = new Estabelecimento(null, null, null, false, 0);

        System.out.println("Digite o nome do estabelecimento:");
        acessar.setNome_do_estabelecimento(ler.nextLine());
        System.out.println("Digite a localização:");
        acessar.setLocalizacao(ler.nextLine());
        System.out.println("Digite o tipo de estabelecimento:");
        acessar.setTipo(ler.nextLine());
        System.out.println("É possível fazer reserva? (Sim/Não):");
        acessar.setFazer_reseva(ler.nextLine().equalsIgnoreCase("Sim"));
        System.out.println("Digite o número de contato:");
        acessar.setNumero_de_contato(ler.nextInt());

        // Adiciona ao ArrayList
        ListaDeEstabelecimentos.add(acessar);

        // Adiciona ao banco de dados
        adicionarAoBanco(acessar);

        System.out.println("Estabelecimento cadastrado com Sucesso!!!\n");

        ler.close();
    }

    private void adicionarAoBanco(Estabelecimento estabelecimento) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO EstabelecimentoTable (nome, localizacao, tipo, fazer_reserva, numero_contato) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, estabelecimento.getNome_do_estabelecimento());
                preparedStatement.setString(2, estabelecimento.getLocalizacao());
                preparedStatement.setString(3, estabelecimento.getTipo());
                preparedStatement.setBoolean(4, estabelecimento.getFazer_reseva());
                preparedStatement.setInt(5, estabelecimento.getNumero_de_contato());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
