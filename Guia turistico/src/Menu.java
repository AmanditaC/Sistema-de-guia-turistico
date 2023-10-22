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
                        break;

                        case 2:
                        Usuario user = new Usuario();
                        user.autenticarUsuario(listaUsuarios);
                        break;

                        case 3 :
                            Estabelecimentos estabelecimento = new Estabelecimentos();
                            estabelecimento.VisualizarCadastro(listaEstabelecimentos);
                        
                            PontosTuristico pontosTuristico = new PontosTuristico();
                            pontosTuristico.VisualizarCadastro(listaDePontosTuristicos);
                            break;
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
        System.out.println("2.Entrar");
        System.out.println("3.Listar todos os pontos turisticos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }
}