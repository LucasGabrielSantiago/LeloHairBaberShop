package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    public static Connection conectaDB() throws SQLException{
        
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/barbearia","hoot"," ");
        
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getException());
        }
        
        
    }
    
}


/*
public class Conexao {
    
    public Connection conectaDB (){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/barbearia?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Conexao" + erro.getMessage());
        }
        return conn;
        
    }
}

*/