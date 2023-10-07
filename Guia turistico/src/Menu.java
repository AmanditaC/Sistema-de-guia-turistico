
import java.util.ArrayList;
import java.util.Scanner;

import GUIA.Usuario;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usuario usuario;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        boolean voltar = false;
        int opcao;
        while (!voltar) {
        
            opcao = MenuPrincipal(scanner);
            
            switch (opcao) {
                case 1:
                    menuLogin(scanner, listaUsuarios);
                    break;
                case 2:
                    break;
                case 3:

                    break;
                default:
            }
        }
    
    }
        public static int MenuPrincipal(Scanner entrada){
            System.out.println("Menu:");
            System.out.println("1. Login");
            System.out.println("2. Listar estabelecimentos e pontos turisticos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            return entrada.nextInt(); // trasformando uma string em int
        }
        public static void menuLogin(Scanner entrada, ArrayList<Usuario> listaUsuarios) {
            limparBuffer(entrada);

            System.out.println("Menu Login\n");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Sair");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = entrada.next();
                    System.out.println("E-mail: ");
                    String email = entrada.next();
                    System.out.println("Senha: ");
                    String senha = entrada.next();
            
                    Usuario novoUsuario = new Usuario();
                    listaUsuarios.add(novoUsuario);
    
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    return;
                default:
                    System.out.println("ERRO\nTente uma opção válida");
                    break;
            }
        
        }

        private static void limparBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
