
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
            KARŞILAŞTIRMA OPERATÖRLERİ
== eşitse
!= eşit değilse
> büyükse
< küçükse
>= Büyük eşitse
<= Küçük eşitse
            MANTIKSAL OPERATÖRLER
&& -> and (ve)
|| -> or (veya)
!  -> not



*/
public class KoşulluDurumlar {
    public static void main(String[] args){
       
        Scanner eğitimScanner = new Scanner(System.in);
        System.out.print("Yaşınızı girin : "); // print aynı satırda devam eder, println alt satıra geçer
       int yaş = eğitimScanner.nextInt();
       // if else else if YAPISI
        if (yaş < 18) {
            System.out.println("Büyü de gel!");
        }
        else if (yaş == 18) {
            System.out.println("Büyüdün de adam mı oldun!");
        }
        else if (yaş > 25){
            System.out.println("Çok büyüksün");
        }
        else{
            System.out.println("Girebilirsin!");
        }
        
        // switch case YAPISI
        Scanner eğitim2Scanner = new Scanner(System.in);
        System.out.print("İşlem girin : ");
        int işlem = eğitim2Scanner.nextInt();
        switch(işlem){ // kontrol etmek istediğimiz değişkeni girdik
            case 1: // işlem'in 1 olması durumunda yapılacak kodu yazdık
                System.out.println("İşlem 1 seçildi...");
                break; // kod çalışır ve sonlandır diyoruz.
            case 2:
                System.out.println("İşlem 2 seçildi...");
                break;
            case 3:
                System.out.println("İşlem 3 seçildi...");
                break;
            case 4:
                System.out.println("İşlem 4 seçildi...");
                break;
            default: // belirlediğimiz işlemler harici bir şey olursa bu bloğu çalıştır dedik.(else gibi)
                System.out.println("Geçersiz işlem....");
                break;
        }
        
        Scanner eğitim3Scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin : ");
        int a = eğitim3Scanner.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int b = eğitim3Scanner.nextInt();
        System.out.print("Üçüncü sayıyı girin : ");
        int c = eğitim3Scanner.nextInt();
        int max = 0;
        
        if (a>b && a>c) {
            max = a;
        }
        else if (b>a && b>c) {
            max = b;
        }
        else if (c>a && c>b) {
            max = c;
        }
        System.out.println("Maximum sayı = " + max);
    }
    
}
