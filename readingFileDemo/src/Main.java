
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class Main {
    public static void main(String[] args)  {
        BufferedReader reader = null;
        int total = 0;
        try { // bu okumayı try catch içinde yapmalıyız.
                      
            reader = new BufferedReader(new FileReader("/root/Masaüstü/Java-ders/readingFileDemo/src/sayilar.txt")); // BufferedReader class dosya okumamızı sağlar.İçine ne türde okuma yapacağımızı parametre olarak veririz. Ona da dosya adını parametre olarak veririz.
                                                          // dosya output olduğu için dosa yolunu vermeliyiz.

            String line = null; // dosyaları satır satır okur.
            while ((line=reader.readLine())!= null) {                
                total+= Integer.valueOf(line); // herhangi bir değeri integer'a çeviriyoruz.
            }
            System.out.println("Toplam = " + total);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        
    }

}
