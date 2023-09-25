import java.util.ArrayList;
import java.util.Scanner;

public class Estabelecimentos{

    private static String Nome_do_estabelecimento;
    private static String Localizacao;
    private static String Tipo;
    private static boolean Fazer_reseva;
    private static int Numero_de_contato;
    
    public Estabelecimentos(String nome_do_estabelecimento, String localizacao, String tipo, boolean fazer_reseva,
        int numero_de_contato) {
        
            Nome_do_estabelecimento = nome_do_estabelecimento;
        Localizacao = localizacao;
        Tipo = tipo;
        Fazer_reseva = fazer_reseva;
        Numero_de_contato = numero_de_contato;
    }

    public String getNome_do_estabelecimento() {
        return Nome_do_estabelecimento;
    }

    public void setNome_do_estabelecimento(String nome_do_estabelecimento) {
        Nome_do_estabelecimento = nome_do_estabelecimento;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public boolean getFazer_reseva() {
        return Fazer_reseva;
    }

    public void setFazer_reseva(boolean fazer_reseva) {
        Fazer_reseva = fazer_reseva;
    }

    public int getNumero_de_contato() {
        return Numero_de_contato;
    }

    public void setNumero_de_contato(int numero_de_contato) {
        Numero_de_contato = numero_de_contato;
    }

    public static void cadastrar(ArrayList <Estabelecimentos> ListaDeEstabelecimentos ){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do estabelecimento:");
        Nome_do_estabelecimento = ler.nextLine();

        System.out.println("Digite a localização:");
        Localizacao = ler.nextLine();

        System.out.println("Digite o tipo de estabelecimento:");
        Tipo = ler.nextLine();

        System.out.println("É possível fazer reserva? (Sim/Não):");
        Fazer_reseva = ler.nextLine().equalsIgnoreCase("Sim");

        System.out.println("Digite o número de contato:");
        Numero_de_contato = ler.nextInt();

        Estabelecimentos cadastrarEstabeleccimento = new Estabelecimentos(null,
        null, null, false, 0);

        ListaDeEstabelecimentos.add(cadastrarEstabeleccimento);

        System.out.println("Estabelecimento cadastrado com Sucesso!!!\n");

        ler.close();

    }

    public String toString(){

        return "Nome: " + Nome_do_estabelecimento +
               "\nLocalizacao: " + Localizacao +
               "\nTipo de estabelecimento: " + Tipo +
               "\nResevavel: " + (Fazer_reseva ? "Sim" : "Nao") +
               "\nNumero de contato (Whatsapp): " + Numero_de_contato;
    }

    
}