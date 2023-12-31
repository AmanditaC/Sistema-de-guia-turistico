package ENTIDADES;

public class PontosTuristicos{

    private String Nome_do_Cadastrante;
    private String Nome_do_Local;
    private String Localizacao;

    public PontosTuristicos(String Nome_do_Cadastrante, String Nome_do_Local, String Localizacao){

        this.Nome_do_Cadastrante = Nome_do_Cadastrante;
        this.Nome_do_Local = Nome_do_Local;
        this.Localizacao = Localizacao;
    }
    
    public String getNome_do_Cadastrante() {
        return Nome_do_Cadastrante;
    }
    public void setNome_do_Cadastrante(String nome_do_Cadastrante) {
        Nome_do_Cadastrante = nome_do_Cadastrante;
    }
    public String getNome_do_Local() {
        return Nome_do_Local;
    }
    public void setNome_do_Local(String nome_do_Local) {
        Nome_do_Local = nome_do_Local;
    }
    public String getLocalizacao() {
        return Localizacao;
    }
    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }

    public String toString(){
        
        return "Cadastrado por: " + Nome_do_Cadastrante +
             "\nNome do Local: " + Nome_do_Local +
             "\nLocalizacao: " + Localizacao;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public PontosTuristicos get(int i) {
        return null;
    }
}