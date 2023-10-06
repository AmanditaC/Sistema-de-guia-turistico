package GUIA;
import java.util.ArrayList;
import java.util.Scanner;

import ENTIDADES.Pontosturisticos;

public class PontosTuristico {
    
    public void cadastrarPonto(ArrayList<Pontosturisticos> ListasDePontosTuristicos){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quem está cadastrando o local: ");
        String Nome_do_Cadastrante = ler.nextLine();

        System.out.println("Agora informe o nome do local: ");
        String Nome_do_Local = ler.nextLine();

        System.out.println("Em que lugar fica localizado: ");
        String Localizacao = ler.nextLine();

        Pontosturisticos cadastraPontosTuristicos = new Pontosturisticos(Nome_do_Cadastrante, Nome_do_Local, Localizacao);

        ListasDePontosTuristicos.add(cadastraPontosTuristicos);

        ler.close();
    }

    public void VisualizarCadastro(Pontosturisticos pontoTuristicoRecente){

        if(pontoTuristicoRecente != null){
            System.out.println("Detalhe do recente cadastramento:");
            System.out.println(pontoTuristicoRecente.toString());
        } else {
            System.out.println("Não foi cadastrado nada recentemente");
        }
    }

    public void EditarCadastro(ArrayList<Pontosturisticos> ListasDePontosTuristicos, String NomeEditar){

        for(Pontosturisticos Lugar : ListasDePontosTuristicos){

            if(Lugar.getNome_do_Local().equals(NomeEditar)){
                Lugar.getLocalizacao();
                System.out.println("Ponto editado com sucesso!!");
            }
        }

        System.out.println("Não foi possível localizar o Lugar!!");
    }

    public void RemoverCadastro(ArrayList<Pontosturisticos> ListasDePontosTuristicos, String NomeRemover){

        for(Pontosturisticos Lugar : ListasDePontosTuristicos){
            
            if(Lugar.getNome_do_Local().equals(NomeRemover)){
                ListasDePontosTuristicos.remove(Lugar);
                System.out.println("O lugar foi removido com sucesso !!!!");
                return; // Para sair do loop após a remoção bem-sucedida
            }
        }
        System.out.println("O lugar não foi encontrado!");
    }
}
