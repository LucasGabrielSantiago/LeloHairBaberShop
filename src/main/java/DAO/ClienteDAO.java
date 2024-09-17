/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KAIZEN_
 */
public class ClienteDAO {
    
    
    Connection conn;
    PreparedStatement pstm;
    
    
    
    public void cadastrarClientes(ClienteDTO objClientedto) throws SQLException{
        String sql = "INSERT INTO clientes (nome, sexo, data_nascimento, telefone, email, rg, endereco, cep) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientedto.getNome_cliente());
            pstm.setString(2, objClientedto.getSexo_cliente());
            pstm.setString(3, objClientedto.getData_nas_cliente());
            pstm.setString(4, objClientedto.getTelefone_cliente());
            pstm.setString(5, objClientedto.getEmail_cliente());
            pstm.setString(6, objClientedto.getRg());
            pstm.setString(7, objClientedto.getEndereco_cliente());
            pstm.setString(8, objClientedto.getCep_cliente());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            
            pstm.close();
            
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        
        } 
               
        
    }
    
    
    
}

