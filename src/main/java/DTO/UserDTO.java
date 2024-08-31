
package DTO;


public class UserDTO {
    
    private int id_user;
    private String nome_usuario, senha_usuario;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha() {
        return senha_usuario;
    }

    public void setSenha(String senha) {
        this.senha_usuario = senha;
    }
}
