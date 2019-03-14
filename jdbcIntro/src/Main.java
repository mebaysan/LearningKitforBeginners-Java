
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
select * from city where name = "Kars"
insert into city (Name,CountryCode,District,Population) values('Üsküdar','TUR','Usk',12354) / values(?,?,?,?) -> kullanıcıdan input alınca
                                                                                            -> Bu operasyonların tümüne CRUD denir.
update city set Population = 5000, district = 'Deneme' where name = 'Üsküdar'
delete from city where id = '4083'
mysql connector eklemek için proje üstüne sağ tıkla -> properities -> library -> add jar -> programfiles'tan kendi connectorj dosyanı bul.
*/


public class Main {

   
    public static void main(String[] args) throws SQLException {
        selectDemo();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void selectDemo() throws SQLException{
      
        // static String userName = "root"; // veritabanına bağlanmak için kullanacağımız username
        // static String password = "2976"; // veritabanına bağlanmak için kullanacağımız şifre
        // static String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; // servere bağlamak için bağlantı adresini oluşturduk. 3306 -> port adı  world -> database adı. database'den(world) sonrası eğer time zone hatası alınırsa yazılması gerekir. internetten bulduk :)
        Connection connection = null; // Connection class'tan bir connection objesi oluşturduk.
        DbHelper helper = new DbHelper();
        Statement statement = null; // ifade, cümle. sorgumuzu yazıyoruz.
        ResultSet resultSet; // sorgu sonucunda gelen data
        try { // bağlantılar try catch bloğu içerisinde olur.
           // connection = DriverManager.getConnection(dbUrl,userName,password); // DriverManager -> conenctorlara ulaşmamızı sağlar. getCOnnection methodu ile bağlantıyı sağlıyoruz.parametre olarak userName,password ve db yolunu veriyoruz.
            connection = helper.getConnection();
            // System.out.println("Bağlantı sağlandı!");
            statement = connection.createStatement(); // statement nesnesini oluşturduğumuz connection nesnesinin createStatement methodu ile bağlıyoruz.
            resultSet = statement.executeQuery("select Code,name,Continent,region from country"); // statement.executeQuery(" içeriye sorgu yazılır") diyerek resultSet (sorgu sonucuna) bağlıyoruz.
            ArrayList<Country> countries = new ArrayList<Country>(); // Country class türünde bir array list oluşturduk.
            while (resultSet.next()) {  // aynı dosyalarda okuma yaptığımız gibi gelen resultSet değerini .next methodu ile sürekli okuyoruz ve              
                //System.out.println(resultSet.getString("Name")); // okuma devam ettiği sürece .getString("kolonAdi") istenen değerin tipine göre kolon adını veriyoruz. o kolondaki data geliyor.
                countries.add(new Country ( // countries arraylist'e add methodu sayesinde eleman ekledik. bu elemanları arkada yazdığımız constructor sayesinde daha oluşturulurken verilen parametreler ile özellikleri belirlenmiş oluyordu.
                resultSet.getString("Code"),  // resultSet değerini okuma yaparken her kolonu okuttuk ve bunları countries arraylist'e ekledik
                resultSet.getString("Name"), 
                resultSet.getString("Continent"), 
                resultSet.getString("Region")));
            }
            System.out.println(countries.size()); // gerçekten işlemin başarıyla sonuçlanıp sonuçlanmadığını denemek için oluşturduğumuz countries arraylist'in size'ini bastırdık.
        } catch (SQLException exception) {
           // System.out.println(exception.getMessage());
            helper.showErrorMessage(exception);
            
        }
        finally{
            connection.close(); // ne olursa olsun bağlantıyı kapatacağız.
        }
    }
    
    public static void insertData() throws SQLException{
        Connection connection = null; 
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // insert ifadeler PreparedStatement ile yapılır.
        ResultSet resultSet; 
        try { 
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)"; // komutu yazıyoru.
            statement = connection.prepareStatement(sql); // içeri komutu veriyoruz
            statement.setString(1, "Ümraniye"); // 1 -> hangi kolona geleceği (Name) 2. parametre -> değer
            statement.setString(2, "TUR");
            statement.setString(3, "ÜMR");
            statement.setInt(4, 154562); // veri tipine göre set ediyoruz.
            
            int result = statement.executeUpdate(); // statement komutu çalıştırdık.
            System.out.println("Kayıt eklendi!");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            
        }
        finally{
            statement.close();
            connection.close(); 
        }
    }
    
    public void updateData() throws SQLException{
         Connection connection = null; 
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // insert ifadeler PreparedStatement ile yapılır.
        ResultSet resultSet; 
        try { 
            connection = helper.getConnection(); // bağlantıyı oluşturduk.
            String sql = "update city set Population = 152, district = 'deneme' where id = ? "; // komutu yazıyoruz.   
            statement = connection.prepareStatement(sql); // bağlantıya komutu gönderiyoruz.
            statement.setInt(1, 4083); // 1. soru işaretine 4083 gelecek dedik
            int result = statement.executeUpdate(); // statement komutu çalıştırdık.
            System.out.println("Kayıt güncellendi!");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            
        }
        finally{
            statement.close();
            connection.close(); 
        }
    }
    
    public void deleteData() throws SQLException{
        Connection connection = null; 
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // insert ifadeler PreparedStatement ile yapılır.
        ResultSet resultSet; 
        try { 
            connection = helper.getConnection(); // bağlantıyı oluşturduk.
            String sql = "delete from city where id = ?"; // komutu yazıyoruz.   
            statement = connection.prepareStatement(sql); // bağlantıya komutu gönderiyoruz.
            statement.setInt(1, 4083); // 1. soru işaretine 4083 gelecek dedik
            int result = statement.executeUpdate(); // statement komutu çalıştırdık.
            System.out.println("Kayıt silindi!");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            
        }
        finally{
            statement.close();
            connection.close(); 
        }
        
    }

    
}
