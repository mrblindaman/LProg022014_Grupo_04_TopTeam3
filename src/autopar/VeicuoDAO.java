
package autopar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;




public class VeicuoDAO{
    
          
    public static void Cadastrar() throws SQLException {
        try{
            
        Connection conectar = new Conexaobd().getConnection();
        
        
    Scanner input = new Scanner(System.in);
    VeicuoDTO veicuo = new VeicuoDTO();
    String query = "insert into Veiculo(Placa,Modelo,Tipo)values( , , ,)";
    PreparedStatement stmt = conectar.prepareStatement(query);
    System.out.print("Digite a placa do veiculo: ");
    stmt.setString(1,input.nextLine()); 
    System.out.print("Digite o modelo do veiculo: ");
    stmt.setString(2,input.nextLine());
    System.out.print("Digite o tipo do veiculo: ");
    stmt.setString(3,input.nextLine());
    System.out.println();
    
    stmt.execute();  
         stmt.close();  
         System.out.println("Cadastrado!!");  
         conectar.close();  
      }catch(SQLException e){
           System.out.println("Erro ao cadastrar!!");
                          
}  
    
    }     

    

    
    
    
    

    
    
    
    
    
    
    
}
