
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = null; // FileWriter class'tan fw nesnesi oluşturduk. değerini null belrilememizin sebebi bunu try catch içinde açmak istememiz.
        fw =new FileWriter("dosya.txt",true); // nesnemizi dosya ile bağladık. true diyerek eğer o isimde dosya varsa devamına yazmasını söyledik.
        fw.write("Deneme yazısı yazıyorum!\n"); // fw nesnesinin write özelliği ile direk string yollayabiliriz.
        fw.write("Enes Baysan\n");
        fw.close();
        
    }
}
