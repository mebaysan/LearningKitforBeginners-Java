
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null; // Dosya okumak için FileInputStream class'tan bir fıs nesnesi oluşturduk.
        try {
            fis = new FileInputStream("dosya.txt");
            System.out.println("Okunan karater = " + (char)fis.read()); // okunan karakteri char değere dönüştürdük.
            System.out.println("Okunan 2. karater = " + (char)fis.read());
            System.out.println("Okunan 3. karater = " + (char)fis.read());
            fis.skip(6);
            System.out.println("fis.skip(6)'dan sonra okunan karakter = " + (char)fis.read());
            fis.skip(0);
            int deger ; // bütün dosyayı okuma işlemi burda başlıyor.
            String a = "";
            while ((deger = fis.read())!= -1) {   // okunacak birşey kalmadığında -1 döndürür.             
                a += (char)deger;
            }
            System.out.println("Dosya içeriği = " + a);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fis.close();
                System.out.println("Dosya başarıyla kapatıldı!");
            } catch (Exception e) {
                System.out.println("Dosya kapatılamadı!");
            }
        }
        
        
    }
}
