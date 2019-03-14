
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;



public class Main {
    
    private static ArrayList<Integer> icerik = new ArrayList<Integer>(); // içeriği bu array list içine alacağız.
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        long baslangıc = System.currentTimeMillis(); // sistemin işleme başladığı zamanı alır
        dosyaOku();
        kopyala("müzik2.mp3");
        kopyala("müzik3.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println("Dosyanın kopyalanması = " + ((bitis-baslangıc)/1000) + " saniye sürdü."); // milisaniye cinsinden aldığı için 1000'e böldük.
        
    }
    public static void kopyala(String dosyaismi) throws FileNotFoundException, IOException{ // yazılacak dosya ismini parametre yoladık
        FileOutputStream out = new FileOutputStream(dosyaismi); // yazılacak dosya ismini parametre olarak istedik.
        
        for(int deger:icerik){ // icerik icindeki her değer için (byte olduğu için sayısal) bunu out nesnesinin write özelliği ile yazdırdık.
            out.write(deger);
        }
    }
    public static void dosyaOku() throws FileNotFoundException, IOException{
        FileInputStream in = new FileInputStream("müzik.mp3"); // hata döndürmeyi ekledik. okunacak dosyayı parametre olarak verdik.
        
        int oku ; // sayısal bir oku değeri oluşturduk.
        while((oku = in.read())!=-1){ // okuma işlemi -1'den farklı olduğu sürecek dedik.
            icerik.add(oku); // icerik adlı değişkene ekledik.(12. satır)
            
        }
    }
}
