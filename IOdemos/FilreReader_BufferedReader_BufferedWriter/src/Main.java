
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        fileReadOku();
        System.out.println("\n");
        bufferedWriterYaz();
        System.out.println("\n");
        bufferedReaderOku();
        
    }
   

    private static void fileReadOku() {
        FileReader fr = null; // filereader class'tan fr nesnesi oluşturduk.
        Scanner scanner = null;
        int i = 1;
        try {
            fr = new FileReader("dosya.txt"); // fr nesnesini bir dosya ile bağladık.
            scanner = new Scanner(fr); // oluşturduğumuz scanner nesnesi içine parametre olarak okumak istediğimiz dosyayı yolladık.
            while (scanner.hasNextLine()) { // hasNextLine ile okuyabildiğimiz kadar satırı okutuyoruz.
                System.out.println(i + ". Satır : " + scanner.nextLine()); // bir sonraki satırı okur.
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı! : " + e.getMessage());
            
        }catch(IOException ex){
            System.out.println("Dosya açılırken bir hata oluştu : " + ex.getMessage());
        }    
    }
    private static void bufferedReaderOku() throws FileNotFoundException {
        BufferedReader fr = null; // filereader class'tan fr nesnesi oluşturduk.
        Scanner scanner = null;
        int i = 1;
        fr = new BufferedReader(new FileReader("dosya.txt")); // bufferedreader bize hız kazandırır.
        // kullanımındaki temel farklılık 40. satırdır. BufferedReader'dan nesne oluştururken içine parametre olarak FileReader'dan bir nesne yollarız.
        scanner = new Scanner(fr);
        while (scanner.hasNextLine()) { // hasNextLine ile okuyabildiğimiz kadar satırı okutuyoruz.
            System.out.println(i + ". Satır : " + scanner.nextLine()); // bir sonraki satırı okur.
            i++;
        }    
    }
    
    private static void bufferedWriterYaz(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("dosya.txt",true)); // BufferedWriter kullanılırken içine FileWriter yollanır. true yazınca devamına yazılır.
            bw.write("Ali Güven Kağıthane\n"); // write özelliği ile direk yazdırabiliriz.
            System.out.println("Dosyaya başarıyla yazıldı!");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu!");
        }
        
    }
    
    
}
