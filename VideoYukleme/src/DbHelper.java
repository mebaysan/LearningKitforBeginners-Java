import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbHelper {
    private String userName = "root";
    private String password = "2976";
    private String dbUrl = "jdbc:mysql://localhost:3306/videoyukle?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException{
        Connection connection;
        return connection = DriverManager.getConnection(dbUrl,userName,password); // DriverManager -> conenctorlara ulaşmamızı sağlar. getCOnnection methodu ile bağlantıyı sağlıyoruz.parametre olarak userName,password ve db yolunu veriyoruz.
        
        
    }
    
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
    
    

}
