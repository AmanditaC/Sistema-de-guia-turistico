package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Estabelecimento;
import ENTIDADES.PontosTuristicos;

public class PontosTuristico {
    
    public void cadastrarPonto(ArrayList<PontosTuristicos> ListasDePontosTuristicos){

        Scanner ler = new Scanner(System.in);
        PontosTuristicos NovoCadastro = new PontosTuristicos(null, null,
        null);

        System.out.println("Informe quem esta cadastrando ");
        NovoCadastro.setNome_do_Cadastrante(ler.nextLine());
        System.out.println("Informe o nome do local ");
        NovoCadastro.setNome_do_Local(ler.nextLine());
        System.out.println("Agora informe onde fica esse local");
        NovoCadastro.setLocalizacao(ler.nextLine());

        ListasDePontosTuristicos.add(NovoCadastro);

        System.out.println("Cadastro realizado com sucesso!!");


    }

    public void VisualizarCadastro(ArrayList<PontosTuristicos> ListasDePontosTuristicos){

        if (!ListasDePontosTuristicos.isEmpty()) {
            System.out.println("Detalhes do cadastro recente: \n");
            PontosTuristicos ListasDePontosTuristicosR = ListasDePontosTuristicos.get(ListasDePontosTuristicos.size() - 1);
            System.out.println(ListasDePontosTuristicosR.toString());
        } else {
            System.out.println("Nenhum Ponto turistico cadastrado.\n");
        }
    }

    public void EditarCadastro(ArrayList<PontosTuristicos> ListasDePontosTuristicos, String NomeEditar){

        Scanner ler = new Scanner(System.in);
    
        System.out.println("Edição de Estabelecimento");
        System.out.print("Informe o nome do estabelecimento que deseja editar: ");
        String nomeDoPonto = ler.nextLine();
    
        // Procurar o estabelecimento na lista com base no nome
        PontosTuristico pontosParaEditar = null;
        int indiceDoPonto = -1; // Para armazenar o índice do estabelecimento na lista
        for (int i = 0; i < ListasDePontosTuristicos.size(); i++) {
            PontosTuristicos pontos = ListasDePontosTuristicos.get(i);
            if (pontos != null && pontos.getNome_do_Local() != null && pontos.getNome_do_Local().equals(nomeDoPonto)) {

                pontosParaEditar = pontos;
                indiceDoPonto = i;
                break;
            }
        }

        System.out.println("Não foi possível localizar o Lugar!!");
    }

    public void RemoverCadastro(ArrayList<PontosTuristicos> ListasDePontosTuristicos, String NomeRemover){

        for(PontosTuristicos Lugar : ListasDePontosTuristicos){
            
            if(Lugar.getNome_do_Local().equals(NomeRemover)){
                ListasDePontosTuristicos.remove(Lugar);
                System.out.println("O lugar foi removido com sucesso !!!!");
                return; // Para sair do loop após a remoção bem-sucedida
            }
        }
        System.out.println("O lugar não foi encontrado!");
    }
}
