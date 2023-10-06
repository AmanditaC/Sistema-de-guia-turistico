/*import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
import ENTIDADES.Pontosturisticos;
import ENTIDADES.Usuarios;
import GUIA.Estabelecimentos;
import GUIA.PontosTuristico;
import GUIA.Usuario;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;

        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ArrayList<Estabelecimento> listaEstabelecimentos = new ArrayList<>();
        ArrayList<Pontosturisticos> listaPontosTuristicos = new ArrayList<>();

        while (!sair) {
            System.out.println("--------------------------\n");
            System.out.println("      Menu Principal\n");
            System.out.println("---------------------------\n");
            System.out.println("--Seja bem-vindo à Serra de Martins--\n");
            System.out.println("1. Login");
            System.out.println("2. Listar Estabelecimentos e Pontos Turísticos");
            System.out.println("3. Sair");

            System.out.println("\nInforme sua opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    Usuario usuario = new Usuario();
                    usuario.cadastrarLogin(listaUsuarios);
                    // Pequena verificação aqui, se desejar
                    System.out.println("Usuário logado com sucesso!\n");

                    boolean continuar = true;

                    while (continuar) {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1. Cadastrar Estabelecimento");
                        System.out.println("2. Cadastrar Ponto Turístico");
                        System.out.println("3. Voltar ao Menu Principal");

                        String escolhaStr = entrada.nextLine();

                        try {
                            int escolha = Integer.parseInt(escolhaStr);

                            switch (escolha) {
                                case 1:
                                    Estabelecimentos estabelecimentos = new Estabelecimentos();
                                    estabelecimentos.cadastrarEstabelecimento(listaEstabelecimentos);
                                    break;
                                case 2:
                                    PontosTuristico pontosTuristicos = new PontosTuristico();
                                    pontosTuristicos.cadastrarPonto(listaPontosTuristicos);
                                    break;
                                case 3:
                                    continuar = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, insira um número válido.");
                    }
                }
                break;


                case 2:
                    // Listar Estabelecimentos e Pontos Turísticos
                    System.out.println("Lista de Estabelecimentos:");
                    for (Estabelecimento estabelecimento : listaEstabelecimentos) {
                        System.out.println(estabelecimento.toString());
                    }

                    System.out.println("\nLista de Pontos Turísticos:");
                    for (Pontosturisticos pontoTuristico : listaPontosTuristicos) {
                        System.out.println(pontoTuristico.toString());
                    }
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}*/
/*import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
import ENTIDADES.Pontosturisticos;
import ENTIDADES.Usuarios;
import GUIA.Estabelecimentos;
import GUIA.PontosTuristico;
import GUIA.Usuario;

public class Menu {

    private static void limparBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;

        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ArrayList<Estabelecimento> listaEstabelecimentos = new ArrayList<>();
        ArrayList<Pontosturisticos> listaPontosTuristicos = new ArrayList<>();

        while (!sair) {
            System.out.println("--------------------------\n");
            System.out.println("      Menu Principal\n");
            System.out.println("---------------------------\n");
            System.out.println("--Seja bem-vindo à Serra de Martins--\n");
            System.out.println("1. Login");
            System.out.println("2. Listar Estabelecimentos e Pontos Turísticos");
            System.out.println("3. Sair");

            System.out.println("\nInforme sua opção: ");

            int opcao = -1;

            try {
                opcao = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                limparBuffer(entrada);
                continue;
            }

            limparBuffer(entrada);

            switch (opcao) {
                case 1:
                    Usuario usuario = new Usuario();
                    usuario.cadastrarLogin(listaUsuarios);
                    // Pequena verificação aqui, se desejar
                    System.out.println("Usuário logado com sucesso!\n");

                    boolean continuar = true;

                    while (continuar) {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1. Cadastrar Estabelecimento");
                        System.out.println("2. Cadastrar Ponto Turístico");
                        System.out.println("3. Voltar ao Menu Principal");

                        int escolha = -1;

                        try {
                            escolha = entrada.nextInt();
                        } catch (Exception e) {
                            System.out.println("Por favor, insira um número válido.");
                            limparBuffer(entrada);
                            continue;
                        }

                        limparBuffer(entrada);

                        switch (escolha) {
                            case 1:
                                Estabelecimentos estabelecimentos = new Estabelecimentos();
                                estabelecimentos.cadastrarEstabelecimento(listaEstabelecimentos);
                                break;
                            case 2:
                                PontosTuristico pontosTuristicos = new PontosTuristico();
                                pontosTuristicos.cadastrarPonto(listaPontosTuristicos);
                                break;
                            case 3:
                                continuar = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;
                case 2:
                    // Listar Estabelecimentos e Pontos Turísticos
                    System.out.println("Lista de Estabelecimentos:");
                    for (Estabelecimento estabelecimento : listaEstabelecimentos) {
                        System.out.println(estabelecimento.toString());
                    }

                    System.out.println("\nLista de Pontos Turísticos:");
                    for (Pontosturisticos pontoTuristico : listaPontosTuristicos) {
                        System.out.println(pontoTuristico.toString());
                    }
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}*/

import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
import ENTIDADES.Pontosturisticos;
import ENTIDADES.Usuarios;
import GUIA.Estabelecimentos;
import GUIA.PontosTuristico;
import GUIA.Usuario;

public class Menu {

    private static void limparBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ArrayList<Estabelecimento> listaEstabelecimentos = new ArrayList<>();
        ArrayList<Pontosturisticos> listaPontosTuristicos = new ArrayList<>();

        boolean sair = false;

        while (!sair) {
            System.out.println("--------------------------\n");
            System.out.println("      Menu Principal\n");
            System.out.println("---------------------------\n");
            System.out.println("--Seja bem-vindo à Serra de Martins--\n");
            System.out.println("1. Login");
            System.out.println("2. Listar Estabelecimentos e Pontos Turísticos");
            System.out.println("3. Sair");

            System.out.println("\nInforme sua opção: ");

            int opcao = -1;

            try {
                opcao = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor, insira um número válido.");
                limparBuffer(entrada);
                continue;
            }

            limparBuffer(entrada);

            switch (opcao) {
                case 1:
                    Usuario usuario = new Usuario();
                    usuario.cadastrarLogin(listaUsuarios);
                    // Pequena verificação aqui, se desejar
                    System.out.println("Usuário logado com sucesso!\n");

                    while (true) {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1. Cadastrar Estabelecimento");
                        System.out.println("2. Cadastrar Ponto Turístico");
                        System.out.println("3. Voltar ao Menu Principal");

                        int escolha = -1;

                        try {
                            escolha = entrada.nextInt();
                        } catch (Exception e) {
                            System.out.println("Por favor, insira um número válido.");
                            limparBuffer(entrada);
                            continue;
                        }

                        limparBuffer(entrada);

                        switch (escolha) {
                            case 1:
                                Estabelecimentos estabelecimentos = new Estabelecimentos();
                                estabelecimentos.cadastrarEstabelecimento(listaEstabelecimentos);
                                break;
                            case 2:
                                PontosTuristico pontosTuristicos = new PontosTuristico();
                                pontosTuristicos.cadastrarPonto(listaPontosTuristicos);
                                break;
                            case 3:
                                sair = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }

                        if (escolha == 3) {
                            break;
                        }
                    }
                    break;
                case 2:
                    // Listar Estabelecimentos e Pontos Turísticos
                    System.out.println("Lista de Estabelecimentos:");
                    for (Estabelecimento estabelecimento : listaEstabelecimentos) {
                        System.out.println(estabelecimento.toString());
                    }

                    System.out.println("\nLista de Pontos Turísticos:");
                    for (Pontosturisticos pontoTuristico : listaPontosTuristicos) {
                        System.out.println(pontoTuristico.toString());
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}