package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.PontosTuristicos;
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
            
            cadastrarLogin.set(indiceDoUsuario, usuarioParaEditar);

            System.out.println("Cadastro do Usuario atualizado com sucesso!\"");
            
        }else{
            System.out.println("Usuario não encontrado. Verifique o nome do local e tente novamente.");
        }
    
    }


    public void ExcluiCadastro(ArrayList <Usuarios> cadastraLogin){

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Email do usuario que deseja remover : "); 
        String Nv = ler.nextLine();
        boolean encontrado = false; 

        ArrayList<Usuarios> copiaDaLista = new ArrayList<>(cadastraLogin);
    
        for (Usuarios user : copiaDaLista) {
            if (user.getEmail().equals(Nv)){
                cadastraLogin.remove(user);
                System.out.println("O Ponto turistico foi removido!!");
                encontrado = true;
                break; // Saia do loop depois de remover o ponto turistico
            }
        }
    
        if (!encontrado) {
            System.out.println("Não foi possível encontrar o ponto turistico mencionado!");
        }
    }
}