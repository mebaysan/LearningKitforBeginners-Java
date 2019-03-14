
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args){
        
        FileOutputStream fos = null; // FileOutPutStream class'tan bir fos nesneni oluşturduk değeri null oldu.
        try {
            // File file = new File("dosya.txt"); -> bu şekildede olur
            fos = new FileOutputStream("dosya.txt",true); // açmak istediğimiz dosyayı verdik. try-catch içinde olmalı. ve bu dosya yoksa oluşturur. true koyarsak olan dosyayı açar.
            byte[]array = {101,45,56,78};
            String s = "Enes Baysan";
            byte[] sArray = s.getBytes(); // stringi byte array'e çeviriyoruz.
            try {
                fos.write(145); // bu işlemler hep try-catch içinde yapılmalıdır. fos.write methodları ile yazabiliriz. int yazınca ASCII sayılarına karşılık gelen karakteri yazar.
                fos.write(array); // bir dizi de yazabiliriz.
                System.out.println("Dosya başarıyla yazıldı!");
                fos.write(sArray); // byte array'e çevrilmiş stringi yazdırdık.
            } catch (Exception e) {
                System.out.println("Yazılamadı!");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya açılamadı!");
            System.out.println(ex.getMessage());
        }finally{
            try {
                System.out.println("Dosya Başarıyla kapatıldı");
                fos.close();
            } catch (Exception e) {
                System.out.println("Dosya kapatılırken hata oluştu!");
            }
        }
        
        
        
        
    }

}
