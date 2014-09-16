package autopar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexaobd {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/teste", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
 
        
    }
}



       
        
    
    
    

    
