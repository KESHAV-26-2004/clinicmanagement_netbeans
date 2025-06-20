import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
public class myConnection {
    
    public static Connection getConnection() {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
            "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12785936",
                "sql12785936",
                "lzwVwE49zS");
        }catch (Exception ex){
            System.out.println("Connection failed: " + ex.getMessage());
        }
        
        return con;
        
    }
}
