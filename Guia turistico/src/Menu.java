import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
import ENTIDADES.PontosTuristicos;
import ENTIDADES.Usuarios;
import GUIA.Estabelecimentos;
import GUIA.PontosTuristico;
import GUIA.Usuario;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ArrayList<PontosTuristicos> listaDePontosTuristicos = new ArrayList<>();
        ArrayList<Estabelecimento> listaEstabelecimentos = new ArrayList<>();

        while (true) {
            exibirMenu();
            int opcao = -1;

            try {
                if (entrada.hasNextInt()) { // Verifique se há um inteiro disponível
                    opcao = entrada.nextInt();
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    entrada.nextLine(); // Limpe o buffer
                    continue;
                }

                switch (opcao) {
                    case 1:
                        Usuario usuario = new Usuario(); // Crie uma instância de Usuario
                        usuario.cadastrarLogin(listaUsuarios); // Chame o método cadastrarLogin
                        System.out.println("Deseja cadastrar um Estabelecimento ou ponto turistico? [S/N]");
                        entrada.nextLine();
                        String resposta = entrada.nextLine().toUpperCase(); // Leitura da resposta em maiúsculas

                        switch (resposta) {
                            case "S":
                                int opcaoCadastro;
                                do {
                                    System.out.println("Menu de Cadastro:");
                                    System.out.println("1. Cadastrar Estabelecimento");
                                    System.out.println("2. Cadastrar Ponto Turístico");
                                    System.out.println("3. Voltar ao Menu Principal");
                                    System.out.print("Escolha uma opção: ");
                                    opcaoCadastro = entrada.nextInt();
                                    entrada.nextLine();

                                    switch (opcaoCadastro) {
                                        case 1:
                                            Estabelecimentos estabelecimento = new Estabelecimentos();
                                            estabelecimento.cadastrarEstabelecimento(listaEstabelecimentos);
                                            System.out.println("Deseja editar ou voltar ao menu principal ? ");
                                            System.out.println("1.Editar cadastro");
                                            System.out.println("2.Excluir Estabelecimento");
                                            System.out.println("3.Volta ao menu principal");
                                            entrada.nextLine();
                                            int resp = entrada.nextInt();

                                            switch (resp) {
                                                case 1:
                                                    estabelecimento.EditarCadastroEstabelecimento(listaEstabelecimentos);

                                                    estabelecimento.VisualizarCadastro(listaEstabelecimentos);
                                                    break;
                                                case 2:
                                                    estabelecimento.RemoverCadastro(listaEstabelecimentos);

                                                    estabelecimento.VisualizarCadastro(listaEstabelecimentos);
                                                    break;
                                                case 3:
                                                    // Voltar ao menu principal
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida. Tente novamente.");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            PontosTuristico pontosTuristico = new PontosTuristico();
                                            pontosTuristico.cadastrarPonto(listaDePontosTuristicos);
                                            System.out.println("Deseja editar ou voltar ao menu principal ? ");
                                            System.out.println("1.Editar cadastro");
                                            System.out.println("2.Volta ao menu principal");
                                            entrada.nextLine();
                                            int rap = entrada.nextInt();

                                            switch (rap) {
                                                case 1:
                                                    pontosTuristico.EditarCadastro(listaDePontosTuristicos);

                                                    pontosTuristico.VisualizarCadastro(listaDePontosTuristicos);
                                                    break;
                                                case 2:
                                                    // Voltar ao menu principal
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida. Tente novamente.");
                                                    break;
                                            }
                                           
                                            break;
                                        case 3:
                                            // Voltar ao menu principal
                                            break;
                                        default:
                                            System.out.println("Opção inválida. Tente novamente.");
                                            break;
                                    }
                                } while (opcaoCadastro != 3); // Continua exibindo o menu até que o usuário escolha a opção de voltar
                                break;
                            case "N":
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        case 2 :
                         Estabelecimentos estabelecimento = new Estabelecimentos();
                         estabelecimento.VisualizarCadastro(listaEstabelecimentos);
                         
                         PontosTuristico pontosTuristico = new PontosTuristico();
                         pontosTuristico.VisualizarCadastro(listaDePontosTuristicos);
                }
            
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler entrada. Certifique-se de inserir os dados corretamente.");
                entrada.nextLine(); // Limpe o buffer em caso de erro
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("Menu Interativo\n");
        System.out.println("1.Cadastrar Usuário ");
        System.out.println("2.Listar todos os pontos turisticos");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }
}