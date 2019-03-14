
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        
        
        // RANDOM CLASS 
        Random random = new Random(); // Random class'tan random adında bir nesne oluşturduk.
        int randomSayi = random.nextInt(15); // int tipinde randomSayi değişkenini random nesnesinden oluşan değerin nextInt fonksiyonu ile yakaladık.
        System.out.println(randomSayi);      // (15) yazdık 1'den 15'e kadar random bir sayi tutacak fakat 15 dahil değil. içini boş bırakırsak -2milyar ile +2milyar (int sınırları) arasında bir değer tutar.
        int a = 0;
        while (a<10) {            
            int denemeSayi = random.nextInt(20);
            System.out.println("Şuanda oluşan rasgele sayı : " + denemeSayi);
            a++;
        }
    
    
    
    
    }
    
}
