package ENTIDADES;

public class Usuarios {
    private String email;
    private String senha;
    
    public Usuarios(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

     // Métodos getters e setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Método toString
    public String toString(){
        
        return "Email: " + email +
            "\nsenha: " + senha;
    }
}