
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author menes
 */
/*
for (başlama : koşul : artırma veya azaltma işlemleri){
    Döngü koşulu doğru olduğu sürece bu blok çalışacak
}
*/
public class Döngüler {
    public static void main(String[] args){
        
        // 1. gösterim tarzı. Burda i değerini döngü dışında tanımladık
        int i;
        for (i=0 ; i<10 ; i++){
            System.out.println("i = " + i);
        }
        // 2. gösterim tarzı. Burda j değerini döngü içinde tanımladık
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
        // 3. Gösterim tarzı. z dışarda tanımlandı ve döngü içinde değer verilmedi.
        int z = 0;
        for (; z < 10; z++) {
            System.out.println("Başka bir gösterim...");
        }
        // 4. en çok kullanılan gösterim
        String[] listeStrings = {
          "Enes",
            "ali",
            "baysan"
            
        };
        for(String item:listeStrings){ // listeStrings dizisi içindeki her item için
            System.out.println(item);
        }
        
        // Faktoriyel - Basit
        for (int c = 2; c < 100; c*=2) {
            System.out.println("c = " + c);
        }
        
        // İnput alıp Faktoriyel alma
        Scanner denemesScanner = new Scanner(System.in); // scanner classtan input almak için nesne oluşturduk.
        System.out.print("Faktoriyelini bulmak istediğiniz sayıyı girin : "); // kullanıcıdan sayı istedik.
        int faktorial = 1; // faktorial değişkeninin değerini sabitledik.
        int sayi = denemesScanner.nextInt(); // sayi değerini aldık.
        for (int d = 1; d <= sayi; d++) { // döngüdeki d elemanını 1'den başlatıyoruz. döngü sayısını faktoriyelini bulmak istediğimizz sayıya eşitliyoruz. ve her seferinde dönen döngü sayısını bir arttırıyoruz.
            faktorial *= d; // her döndüğünde faktorial değeri bir önceki ile çarpılacak.
            System.out.println("Faktöriyel = " + faktorial + " d = " + d);
        }
        System.out.println("Faktoriyel = " + faktorial);
        //WHILE DÖNGÜSÜ
        System.out.println("*************************************\nWhile Döngüsü\n");
        int w = 0;
        while (w<10) {            // w değeri 0'dan küçük olduğu sürece dedik.
            System.out.println("w = " + w);
            w++;
        }
        
        // WHILE İle Faktorial
        
        Scanner eğitimsScanner = new Scanner(System.in);
        System.out.print("While ile faktorial bulmak için sayı gir : ");
        int wsayi = eğitimsScanner.nextInt();
        int wfact = 1;
        while (wsayi > 0) {            // girilen sayı 0 dan büyük olduğu sürece bu döngü çalışır
            wfact *= wsayi;  // her seferinde wfact faktöriyel değerimizi aldığımız sayı ile çarpar
            wsayi--;  // döngünün sonlanması için aldığımız wsayi'yi azaltıyoruz.
        }
        System.out.println("While ile bulunan faktoriyel = " + wfact);
        
        
        // Do While DÖNGÜSÜ
        System.out.println("do while DÖNGÜSÜ****************************");
        /*
        do {
                // Koşul doğru olduğu sürece
                // While'dan farkı en az bir kere çalışmasının garanti olması.
        
        }while(koşul):
        */
        int dd = 0; // while döngüsü ilk önce koşulu kontrol ediyordu sonra işlemi yapıyordu. bu önce işlemi yapıyor daha sonra koşul kontrol ediliyor. Böylelikle işlem en az bir kere yapılmış oluyor.
        do {
            System.out.println("dd = " + dd);
            dd++;
        } while (dd<0); // normalde while olsaydı çalışmamalıydı yukardaki blok. Ancak burada koşul sağlanmasa bile en az bir kere işlem yapılıyor.
        
        
        // do while ile bir sayının rakamları toplamı
        Scanner denemeScanner = new Scanner(System.in);
        System.out.print("Do while ile rakamlarını toplamak istediğiniz sayıyı girin : ");
        int dwsayi = denemeScanner.nextInt();
        int dwtoplam = 0;
        do {
            dwtoplam += dwsayi %10;
            dwsayi /=10;
            System.out.println("Sayı = " + dwsayi);
        } while (dwsayi>0);
            
        System.out.println("Rakamları toplamı = " + dwtoplam);
    
    /*
        BREAK VE CONTINUE ANAHTAR KELİMELERİ
        break -> döngü durur(sadece içinde bulunduğu döngüyü sonlandırır
        continue -> döngü devam eder
        */
    
    }
    
}
