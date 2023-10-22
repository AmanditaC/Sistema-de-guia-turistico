package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Usuarios;

public class Usuario{

public void cadastrarLogin(ArrayList <Usuarios> cadastrarLogin ) {
        Scanner ler = new Scanner(System.in);
        Usuarios novoUsuario = new Usuarios(null, null);

        System.out.print("Informe seu Email: ");
        novoUsuario.setEmail(ler.nextLine());
        System.out.print("Crie uma Senha: ");
        novoUsuario.setSenha(ler.nextLine());

        cadastrarLogin.add(novoUsuario);
        
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

    public void EditarCadastroUsuario(ArrayList <Usuarios> cadastrarLogin) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Edição de usuarios");
        System.out.print("Informe o nome do usuario que deseja editar: ");
        String nomeDoUsuario = ler.nextLine();
    
        // Procurar o usuario na lista com base no nome
        Usuarios usuarioParaEditar = null;
        int indiceDoUsuario = -1; // Para armazenar o índice do usuario na lista
        for (int i = 0; i < cadastrarLogin.size(); i++) {
            Usuarios user = cadastrarLogin.get(i);
            if (user != null && user.getEmail() != null && user.getEmail().equals(nomeDoUsuario)) {

                usuarioParaEditar = user;
                indiceDoUsuario = i;
                break;
            }
        }

        if (usuarioParaEditar != null){
            System.out.println("Usuario encontrado ! \n Você pode editar as informações a seguir:");
            System.out.println("Informe o novo email :");
            usuarioParaEditar.setEmail(ler.nextLine());
            System.out.println("Informe a nova senha : ");
            usuarioParaEditar.setSenha(ler.nextLine());
            
            Usuario.set(indiceDoUsuario, usuarioParaEditar);

            System.out.println("Cadastro do Usuario atualizado com sucesso!\"");
            
        }else{
            System.out.println("Usuario não encontrado. Verifique o nome do local e tente novamente.");
        }
    
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