
import java.util.Scanner;
import matematik.Dortislem; // paketi importe ettik.
import matematik.Logaritma;
// import matematik.* -> matematik paketindeki her şeyi getir.



public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adın ne :");
        String isim = scanner.next();
        System.out.println("Merhaba "+ isim);
        
        Dortislem dörtİslem = new Dortislem(); // paketteki methodu kullanmak için paketten bir nesne oluşturuyoruz.
        dörtİslem.topla(1,2,3,4,5,6);
        
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
        
        
    }
}
