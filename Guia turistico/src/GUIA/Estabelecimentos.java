package GUIA;

import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;

public class Estabelecimentos {

    public void cadastrarEstabelecimento(ArrayList <Estabelecimento> ListaDeEstabelecimentos ){

        Scanner ler = new Scanner(System.in);
        Estabelecimento acessar = new Estabelecimento(null, null, null,
        false, 0);

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
        
        ListaDeEstabelecimentos.add(acessar);

        System.out.println("Estabelecimento cadastrado com Sucesso!!!\n");

    }

    public void VisualizarCadastro(ArrayList<Estabelecimento> listaDeEstabelecimentos) {
        if (!listaDeEstabelecimentos.isEmpty()) {
            System.out.println("Detalhes do cadastro recente: \n");
            Estabelecimento estabelecimentoRecente = listaDeEstabelecimentos.get(listaDeEstabelecimentos.size() - 1);
            System.out.println(estabelecimentoRecente.toString());
        } else {
            System.out.println("Nenhum estabelecimento cadastrado.\n");
        }
    }

    public static void EditarCadastroEstabelecimento(ArrayList<Estabelecimento> listaDeEstabelecimentos) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Edição de Estabelecimento");
        System.out.print("Informe o nome do estabelecimento que deseja editar: ");
        String nomeEstabelecimento = ler.nextLine();
    
        // Procurar o estabelecimento na lista com base no nome
        Estabelecimento estabelecimentoParaEditar = null;
        int indiceDoEstabelecimento = -1; // Para armazenar o índice do estabelecimento na lista
        for (int i = 0; i < listaDeEstabelecimentos.size(); i++) {
            Estabelecimento estabelecimento = listaDeEstabelecimentos.get(i);
            if (estabelecimento != null && estabelecimento.getNome_do_estabelecimento() != null && estabelecimento.getNome_do_estabelecimento().equals(nomeEstabelecimento)) {

                estabelecimentoParaEditar = estabelecimento;
                indiceDoEstabelecimento = i;
                break;
            }
        }
    
        if (estabelecimentoParaEditar != null) {
            System.out.println("Estabelecimento encontrado. Você pode editar as informações a seguir:");
            System.out.print("Digite a nova localização: ");
            estabelecimentoParaEditar.setLocalizacao(ler.nextLine());
            System.out.print("Digite o novo tipo de estabelecimento: ");
            estabelecimentoParaEditar.setTipo(ler.nextLine());
            System.out.print("É possível fazer reserva? (Sim/Não): ");
            estabelecimentoParaEditar.setFazer_reseva(ler.nextLine().equalsIgnoreCase("Sim"));
            System.out.print("Digite o novo número de contato: ");
            estabelecimentoParaEditar.setNumero_de_contato(ler.nextInt());
    
            // Atualizar o estabelecimento na lista
            listaDeEstabelecimentos.set(indiceDoEstabelecimento, estabelecimentoParaEditar);
    
            System.out.println("Cadastro de estabelecimento atualizado com sucesso!");
        } else {
            System.out.println("Estabelecimento não encontrado. Verifique o nome e tente novamente.");
        }
    }
    
    

    public static void RemoverCadastro(ArrayList <Estabelecimento> ListaDeEstabelecimentos, String NomeRemover){

        ArrayList <Estabelecimento> copiaDaLista = new ArrayList<>();

        for(Estabelecimento Lojas : copiaDaLista){

            if(Lojas.getNome_do_estabelecimento().equals(NomeRemover)){
                ListaDeEstabelecimentos.remove(Lojas);
                System.out.println("O estabelecimento foi removido!!");
            }
        }
        System.out.println("Nao foi possivel encontrar o estamelecimento mencionado!");
    }
}