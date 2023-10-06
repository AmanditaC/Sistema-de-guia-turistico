package ENTIDADES;

public class Estabelecimento {
    
    private String Nome_do_estabelecimento;
    private String Localizacao;
    private String Tipo;
    private boolean Fazer_reseva;
    private int Numero_de_contato;
    
    public Estabelecimento(String Nome_do_estabelecimento, String localizacao, String tipo, boolean fazer_reseva,
        int numero_de_contato) {
        
        this.Nome_do_estabelecimento = Nome_do_estabelecimento;
        this.Localizacao = localizacao;
        this.Tipo = tipo;
        this.Fazer_reseva = fazer_reseva;
        this.Numero_de_contato = numero_de_contato;
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
    
    public String toString(){

        return "Nome: " + Nome_do_estabelecimento +
               "\nLocalizacao: " + Localizacao +
               "\nTipo de estabelecimento: " + Tipo +
               "\nResevavel: " + (Fazer_reseva ? "Sim" : "Nao") +
               "\nNumero de contato (Whatsapp): " + Numero_de_contato;
    }
}

