import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class PideKuyrugu {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        
        
        Queue<String> pideKuyrugu = new LinkedList<String>(); // pide kuyruğu oluşturduk.
        pideKuyrugu.offer("1.Kişi"); // pide kuyruğuna sıra ekledik
        pideKuyrugu.offer("2.Kişi");
        pideKuyrugu.offer("3.Kişi");
        pideKuyrugu.offer("4.Kişi");
        pideKuyrugu.offer("5.Kişi");
        pideKuyrugu.offer("6.Kişi");
        pideKuyrugu.offer("7.Kişi");
        pideKuyrugu.offer("8.Kişi");
        pideKuyrugu.offer("9.Kişi");
        pideKuyrugu.offer("10.Kişi");
        pideKuyrugu.offer("11.Kişi");
        System.out.println("Ramazan Pidesi Uygulaması!");
        int pideSayisi = 1 + random.nextInt(11); // 1 ile 0-11 arasını topladık ( index)
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : " + pideSayisi);
        Thread.sleep(3000);
        while (pideSayisi!=0) {       // pideSayisi 0 değilse      
            System.out.println(pideKuyrugu.poll()+ " pideyi aldı...");
            pideSayisi--; // pideSayisi'ni her seferinde 1 azalttık.
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...");
        
                                                        
                                
        
        
        
    }

}
