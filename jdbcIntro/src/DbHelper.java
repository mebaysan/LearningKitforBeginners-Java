

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbHelper {
    private String userName = "root";
    private String password = "2976"; 
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException{
        Connection connection;
        return connection = DriverManager.getConnection(dbUrl,userName,password); // DriverManager -> conenctorlara ulaşmamızı sağlar. getCOnnection methodu ile bağlantıyı sağlıyoruz.parametre olarak userName,password ve db yolunu veriyoruz.
        
        
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
    
}
