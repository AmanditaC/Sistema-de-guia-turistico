import java.util.Scanner;


public class Menu {
    
    public static void menu(){
        System.out.println("   ------------------------ ");
        System.out.println("  | Bem vind@s a Martins   |");
        System.out.println("   ------------------------ ");
        System.out.println("\n");
        System.out.println(" Primeiramente voce e ?");
        System.out.println(" 1. Estabelecimento ?");
        System.out.println(" 2. Visitante ?");
        
    }

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:

            System.out.println("1 - Quero cadastrar o estabelecimento");

                    Scanner ID = new Scanner(System.in);
            

                    System.out.println("Cadastrar login\n");
                    System.out.println("login : ");
                    String login = ID.nextLine();
                
                    System.out.println("senha : ");
                    String senha = ID.nextLine();
                   
                    System.out.println( "Login criado com sucesso !\n\n");
                    
                    System.out.println("Informe o login : ");

                    System.out.println("login : ");
                    String login1 = ID.nextLine();
                   
                    System.out.println("senha : ");
                    String senha2 = ID.nextLine();

                    int contador = 1;

                    if(login.equals((login = login1)) && senha.equals(senha = senha2) && contador <= 2){
                        System.out.printf("Usuário %s logado com sucesso.", login);

                    
                    }else{
                        
                        System.out.println("Login ou senha inválidos!");

                    }
                 
                break;
                
            case 2:
            System.out.println("2 - Sou visitante ");
                
                break;
                
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        entrada.close();
    }
}