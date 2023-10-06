package ENTIDADES;

public class Pontosturisticos{

    private String Nome_do_Cadastrante;
    private String Nome_do_Local;
    private String Localizacao;

    public Pontosturisticos(String Nome_do_Cadastrante, String Nome_do_Local, String Localizacao){

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
               "Nome do Local: " + Nome_do_Local +
               "Localizacao: " + Localizacao;
    }
}