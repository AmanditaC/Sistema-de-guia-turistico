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
        
        Estabelecimento cadastrarEstabelecimento = new Estabelecimento(null, null, null, false, 0);

        ListaDeEstabelecimentos.add(cadastrarEstabelecimento);

        System.out.println("Estabelecimento cadastrado com Sucesso!!!\n");

        ler.close();

    }

    public void VisualizarCadastro(Estabelecimentos estabelecimentoRecente){

        if(estabelecimentoRecente != null){
            System.out.println("Detalhes do cadastro recente: \n");
            System.out.println(estabelecimentoRecente.toString());
        }else{
            System.out.println("Nao foi cadastrado nenhum estabelecimento\n");
        }
    }

    /*public static void EditarCadastro(ArrayList <Estabelecimentos> ListaDeEstabelecimentos, String NomeEditar){

        for(Estabelecimentos negocios : ListaDeEstabelecimentos){

            if(negocios.getNome_do_estabelecimento().equals(NomeEditar)){
                
                negocios.setLocalizacao(Localizacao);
                negocios.setTipo(Tipo);
                negocios.setFazer_reseva(Fazer_reseva);
                negocios.setNumero_de_contato(Numero_de_contato);

                System.out.println("Estabelecimento editado com sucesso!!\n");
            }
        }
        System.out.println("Nao foi possivel encontrar o estabelecimento mencionado!");
    }*/

    public static void EditarCadastro(ArrayList <Estabelecimento> ListaDeEstabelecimentos, String NomeEditar, String novaLocalizacao, String novoTipo, boolean novaFazer_reserva, int novoNumero_de_contato){

        for(Estabelecimento negocios : ListaDeEstabelecimentos){
    
            if(negocios.getNome_do_estabelecimento().equals(NomeEditar)){
                
                negocios.setLocalizacao(novaLocalizacao);
                negocios.setTipo(novoTipo);
                negocios.setFazer_reseva(novaFazer_reserva);
                negocios.setNumero_de_contato(novoNumero_de_contato);
    
                System.out.println("Estabelecimento editado com sucesso!!\n");
                return; // Encerrar o método após editar o estabelecimento
            }
        }
        System.out.println("Não foi possível encontrar o estabelecimento mencionado!");
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