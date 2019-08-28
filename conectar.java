
package clases;
import java.sql.*;

public class conectar {
    
    private static Connection conn;
    private static final String driver= "com.mysql.jdbc.Driver";
    private static final String user= "root";
    private static final String password ="tuputisimamadre";
    private static final String url= "jdbc:mysql://localhost:3306/ing";

    public Connection conectar() {
        
        conn= null;
        try{
            
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
            if (conn !=null){
           
            }
        }catch (Exception e){
            System.out.println("error al conectar ");
        }
        return conn;
    }
    
    
    
    
    
    
    public Connection getConnection(){
        return conn;
    }
    
    
    
    
    
    public void desconectar (){
         conn= null;
         if(conn== null){
             System.out.println("conexion terminada");
         }
    }

    
   
    
}
