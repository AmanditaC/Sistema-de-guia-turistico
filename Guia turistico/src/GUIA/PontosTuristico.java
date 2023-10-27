package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

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

        ler.close();
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

    public void EditarCadastro(ArrayList<PontosTuristicos> ListasDePontosTuristicos){

        Scanner ler = new Scanner(System.in);
    
        System.out.println("Edição de Estabelecimento");
        System.out.print("Informe o nome do Ponto turistico que deseja editar: ");
        String nomeDoPonto = ler.nextLine();
    
        // Procurar o estabelecimento na lista com base no nome
        PontosTuristicos pontosParaEditar = null;
        int indiceDoPonto = -1; // Para armazenar o índice do estabelecimento na lista
        for (int i = 0; i < ListasDePontosTuristicos.size(); i++) {
            PontosTuristicos pontos = ListasDePontosTuristicos.get(i);
            if (pontos != null && pontos.getNome_do_Local() != null && pontos.getNome_do_Local().equals(nomeDoPonto)) {

                pontosParaEditar = pontos;
                indiceDoPonto = i;
                break;
            }
        }

        if (pontosParaEditar != null){
            System.out.println("Ponto turistico encontrado ! \n Você pode editar as informações a seguir:");
            System.out.println("Informe o nome do novo cadastrante :");
            pontosParaEditar.setNome_do_Cadastrante(ler.nextLine());
            System.out.println("Informe o novo nome do local : ");
            pontosParaEditar.setNome_do_Local(ler.nextLine());
            System.out.println("Agora informe onde fica o novo local: ");
            pontosParaEditar.setLocalizacao(ler.nextLine());

            ListasDePontosTuristicos.set(indiceDoPonto,pontosParaEditar);

            System.out.println("Cadastro do Ponto turistico atualizado com sucesso!\"");
            
        }else{
            System.out.println("Ponto turistico não encontrado. Verifique o nome do local e tente novamente.");
        }

        ler.close();
    }


    public void RemoverCadastro(ArrayList<PontosTuristicos> ListasDePontosTuristicos){

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do local do Ponto turistico que deseja remover : ");
        String RemoverPonto = ler.nextLine();
        boolean encontrado = false;

        ArrayList<PontosTuristicos> copiaDaLista = new ArrayList<>(ListasDePontosTuristicos);
    
        for (PontosTuristicos Lojas : copiaDaLista) {
            if (Lojas.getNome_do_Local().equals(RemoverPonto)) {
                ListasDePontosTuristicos.remove(Lojas);
                System.out.println("O Ponto turistico foi removido!!");
                encontrado = true;
                break; // Saia do loop depois de remover o ponto turistico
            }
        }
    
        if (!encontrado) {
            System.out.println("Não foi possível encontrar o ponto turistico mencionado!");
        }

        ler.close();
    }
}
