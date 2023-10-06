package ENTIDADES;

public class Usuario {
    private String username;
    private String email;
    private int senha;
    

    public Usuario(String username, String email, int senha) {
        this.username = username;
        this.email = email;
        this.senha = senha;
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String toString() {
        return  " Username : " + username +
                " Email : " + email +
                " Senha : " + senha ;
    }

}