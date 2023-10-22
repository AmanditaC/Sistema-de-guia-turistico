package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Usuarios;

public class Usuario{

public void cadastrarLogin(ArrayList <Usuarios> cadastrarLogin ) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu Email: ");
        String email = ler.nextLine();
        System.out.print("Crie uma Senha: ");
        String senha = ler.nextLine();

        Usuarios cadastraLogin = new Usuarios(email, senha);
        cadastrarLogin.add(cadastraLogin);
        
        System.out.println("Cadastro realizado com sucesso!\n");

    }

    public void VisualizarCadastroDeUsuario(ArrayList<Usuarios> cadastrarLogin){

        if (!cadastrarLogin.isEmpty()) {
            System.out.println("Detalhes do cadastro recente: \n");
            Usuarios cadastrarLoginR = cadastrarLogin.get(cadastrarLogin.size() - 1);
            System.out.println(cadastrarLoginR.toString());
        } else {
            System.out.println("Nenhum usuario cadastrado.\n");
        }
    }

    public void EditarCadastroUsuario(ArrayList <Usuarios> UsuarioNovo) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastro de Usuário");
        System.out.print("Informe seu Email: ");
        String novoEmail = ler.nextLine();

        System.out.print("Crie uma Senha: ");
        String novaSenha = ler.nextLine();

        Usuarios novoUsuario = new Usuarios(novoEmail, novaSenha);
        UsuarioNovo.add(novoUsuario);

        System.out.println("Cadastro realizado com sucesso!\n");

    
        System.out.println("Editando Cadastro de Usuário...");
        EditarCadastroUsuario(UsuarioNovo);

        System.out.println("Cadastro de Usuário atualizado com sucesso!");

    
    }

    public void ExcluiCadastro(ArrayList <Usuarios> cadastraLogin){
    Scanner ler = new Scanner(System.in);
    System.out.print("Informe o Email: ");
    String email = ler.nextLine();
    System.out.print("Informe a Senha: ");
    String senha = ler.nextLine();

    // Verificar se o login e a senha correspondem a um usuário na lista
    Usuarios usuarioParaExcluir = null;

    for (Usuarios usuario : cadastraLogin) {
        if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
            usuarioParaExcluir = usuario;
            break; // Encontrou o usuário, podemos sair do loop
        }
    }

    if (usuarioParaExcluir != null) {
        // Remover o usuário da lista
        cadastraLogin.remove(usuarioParaExcluir);
        System.out.println("Cadastro de Usuário excluído com sucesso!");
    } else {
        System.out.println("Credenciais incorretas. Não foi possível excluir o cadastro.");
    }

    ler.close();
    }
}