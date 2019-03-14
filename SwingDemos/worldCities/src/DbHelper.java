
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbHelper {

    private String userName = "root" ;
    private String password = "2976" ;
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; ;
    
    public Connection getConnection() throws SQLException{
        Connection connection;
        return connection = DriverManager.getConnection(dbUrl,userName,password); // driver'lara kullanici adi, şifre, ve adresi tanımladık.
        
    }
    public void showErrorMessage(SQLException exception){
        System.out.println(exception.getMessage()); // hatayı yazdırıyoruz
        System.out.println(exception.getErrorCode()); // hatanın kodunu yazdırıyoruz
    }

}
