/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Cliente extends Pessoa {
    
    private String enreco;
    private String cep;

    public Cliente(String enreco, String cep, int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.enreco = enreco;
        this.cep = cep;
    }

    public Cliente(String enreco, String cep, int id, String nome) {
        super(id, nome);
        this.enreco = enreco;
        this.cep = cep;
    }
    
    

    public String getEnreco() {
        return enreco;
    }

    public void setEnreco(String enreco) {
        this.enreco = enreco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
}
