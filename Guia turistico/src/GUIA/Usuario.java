package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
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
                System.out.println("O usuario foi removido com sucesso!!");
                encontrado = true;
                break; // Saia do loop depois de remover o ponto turistico
            }
        }
    
        if (!encontrado) {
            System.out.println("Não foi possível encontrar o ponto turistico mencionado!");
        }
    }

    public void autenticarUsuario(ArrayList<Usuarios> cadastrarLogin) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu Email: ");
        String email = ler.nextLine();
        System.out.print("Informe sua Senha: ");
        String senha = ler.nextLine();

        boolean autenticado = false;

        for (Usuarios usuario : cadastrarLogin) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                autenticado = true;
                System.out.println("Login bem-sucedido!\n");

                // Agora que o usuário está autenticado, você pode chamar outros métodos aqui.
                // Por exemplo, você pode exibir um menu e permitir que o usuário escolha ações, como editar ou excluir o cadastro.
                while (autenticado) {
                    System.out.println("Escolha uma ação:");
                    System.out.println("1. Visualizar cadastro do usuario");
                    System.out.println("2. Cadastrar estabelecimento");
                    System.out.println("3. Cadastrar Ponto turistico ");
                    System.out.println("4. Editar cadastro do usuario");
                    System.out.println("5. Excluir cadastro do usuario");
                    System.out.println("6. Sair");

                    int escolha = ler.nextInt();
                    ler.nextLine(); // Limpar a quebra de linha após a leitura do número

                    switch (escolha) {
                        case 1:
                            VisualizarCadastroDeUsuario(cadastrarLogin);
                            break;
                        case 2:
                        ArrayList<Estabelecimento> listaEstabelecimentos = new ArrayList<>();
                        Estabelecimentos estabelecimento = new Estabelecimentos();
                        Scanner um = new Scanner(System.in);
                        estabelecimento.cadastrarEstabelecimento(listaEstabelecimentos);
                        System.out.println("Deseja editar ou voltar ao menu principal ? ");
                        System.out.println("1.Editar cadastro");
                        System.out.println("2.Excluir Estabelecimento");
                        System.out.println("3.Visualizar Estabelecimento");
                        System.out.println("4.Volta ao menu principal");
                        um.nextLine();
                        int resp = um.nextInt();

                        switch (resp) {
                            case 1:
                                estabelecimento.EditarCadastroEstabelecimento(listaEstabelecimentos);

                                break;
                            case 2:
                                estabelecimento.RemoverCadastro(listaEstabelecimentos);

                                break;
                            case 3:
                                estabelecimento.VisualizarCadastro(listaEstabelecimentos);

                            break;
                            case 4:
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        break;
                        case 3:
                        ArrayList<PontosTuristicos> listaDePontosTuristicos = new ArrayList<>();
                        PontosTuristico pontosTuristico = new PontosTuristico();
                        pontosTuristico.cadastrarPonto(listaDePontosTuristicos);
                        Scanner dois = new Scanner(System.in);
                        System.out.println("Deseja editar ou voltar ao menu principal ? ");
                        System.out.println("1.Editar cadastro");
                        System.out.println("2.Excluir Ponto turistico");
                        System.out.println("3. Visualizar Ponto turistico");
                        System.out.println("4.Volta ao menu principal");
                        dois.nextLine();
                        int rap = dois.nextInt();
                        
                        switch (rap) {
                            case 1:
                                pontosTuristico.EditarCadastro(listaDePontosTuristicos);

                                break;
                            case 2:
                                pontosTuristico.RemoverCadastro(listaDePontosTuristicos);

                            break;
                            case 3:
                            pontosTuristico.VisualizarCadastro(listaDePontosTuristicos);

                            break;
                            case 4:
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                        break;

                        case 4:
                            EditarCadastroUsuario(cadastrarLogin);
                            break;
                        case 5:
                            ExcluiCadastro(cadastrarLogin);
                            break;
                        case 6:
                            autenticado = false; // Sair do loop de ações
                            break;
                        default:
                            System.out.println("Escolha inválida. Tente novamente.");
                    }
                }
                break; // Sair do loop de autenticação
            }
        }

        if (!autenticado) {
            System.out.println("Autenticação falhou. Verifique seu email e senha.\n");
        }
    }
}