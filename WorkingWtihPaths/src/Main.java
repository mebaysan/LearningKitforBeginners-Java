
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        
        readFile();
        System.out.println("-----");
        writeFile();
        readFile();
        
        
    }
    
    
    public static void createFile(){
        File file = new File("/root/Masaüstü/Java-ders/WorkingWtihPaths/src/Files/students.txt"); // dosya yolu yazılır. File class'tan file değişkeni oluşturduk.
        try {
            if (file.createNewFile()) { // yeni bir dosya oluşturmayı deneyecek.
                System.out.println("Dosya Oluşturuldu!");
            }else{
                System.out.println("Dosya Zaten Var!");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Kırmızı hata mesajını yazdırır.
            
        }
    }
    
    public static void getFileInfo(){
      
        File file = new File("/root/Masaüstü/Java-ders/WorkingWtihPaths/src/Files/students.txt"); // dosya yolu yazılır. File class'tan file değişkeni oluşturduk.
        if (file.exists()) { // file.exists() eğer böyle bir dosya varsa dedik
            System.out.println("Dosya Adı : " + file.getName()); // getName() -> dosya adını verir.
            System.out.println("Dosya Yolu : " + file.getAbsolutePath()); // getABsolutePath() -> dosya yolunu verir.
            System.out.println("Dosya Yazılabilir mi : " + file.canWrite()); // canWrite dosyaya yazılabilir mi onu verir
            System.out.println("Dosya Okunabilir mi : " + file.canWrite()); // canWrite dosya okunabilir mi mi onu verir
            System.out.println("Dosya boyutu (byte) : " + file.length());  // length dosya boyutunu verir.
        }
    }
    
    public static void readFile(){
         File file = new File("/root/Masaüstü/Java-ders/WorkingWtihPaths/src/Files/students.txt"); // dosya yolu yazılır. File class'tan file değişkeni oluşturduk.
         try {
            Scanner reader = new Scanner(file); // okuma yapmak için scanner sınıfından faydalanırız. mutlaka try catch içerisinde yazmalıyız.
            while(reader.hasNextLine()){ // reader.hasNextLine() -> okuyabildiği sürece dedik.
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close(); // işimiz bittikten sonra dosyayı kapatmalıyız.
         
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        }       
    }
    
    public static void writeFile(){
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("/root/Masaüstü/Java-ders/WorkingWtihPaths/src/Files/students.txt",true)) ; // dosya yolu yazılır. FileWriter class'tan file değişkeni oluşturduk. Dosya yazarken FileWriter kullanılır.
            // BufferedWriter class dosyalara yazmamızı sağlar.                                                                             true burda append özelliği sağlar. true olmazsa üstüne yazar ancak true olduğu için yazılanı satırın sonuna ekliyor.
            writer.newLine(); // yazılan stringi yeni satıra yaz dedik.
            writer.write("Denemewriter yazdık!");
            System.out.println("Dosyaya yazıldı!");
            writer.close();
        } catch (Exception e) {
        }
        
        
        
    }

}
