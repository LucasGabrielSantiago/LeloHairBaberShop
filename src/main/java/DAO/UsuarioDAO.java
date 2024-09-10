package DAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    // Método para autenticação do usuário
    public ResultSet autenticacaoUsuario(UserDTO objusuariodto) throws SQLException {
        conn = Conexao.conectaDB();  // Supondo que Conexao é sua classe de conexão
        
        try {
            String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
