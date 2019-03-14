
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
/* TAM SAYI VERİ TİPLERİ
int -> 32 bit 4byte yer kaplar --> -2^31 ile 2^31 -1 kadar değere sahip olabilir.
byte -> 8 bit 1byte yer kaplar
short -> 16 bit 2 byte yer kaplar
long -> en fazla değer tutabildiğimiz veri
        byte -> short -> int -> long
        
        ONDALIKLI SAYI VERİ TİPLERİ
double -> 64 bit 8byte yer kaplar(daha fazla hane gösterebiliriz)
float -> 32bit 4byte yer kaplar
        int -> float -> double
        
        CHAR VE BOOLEAN
boolean -> true ya da false değeri alır.
   char -> karakter atar. ' ' tek tırnak içinde yazılır.

        STRING 
String -> kelime/harf/metinsel değer.
        
        Bir kaç trick
\t -> bir tab boşluk
\n -> bir alt satır
        
        Temel Matematik Operatörleri
toplama + 
çıkarma -
bölme   /
çarpma  *
kalan   %  ->  10%4 bize 10'un 4'e bölümünden kalanı verir.
        Atama ve Artırma Operatörü
++ -> 1 artır
-- -> 1 azalt
+= a -> a ile topla
-= a -> a kadar azalt
*= a -> a ile çarp ve kendisine eşitle
        
        Scanner Sınıfı
input almamızı sağlar. Scanner Class'tan bir nesne oluşturuyoruz. Bu classı kullanmak için paketi dahil etmemiz (import) gerekir. NetBeans'de kısayol ctrl+shift+ı.
     kodu -> import Java.util.Scanner;
        
        
*/
public class değişkenler {
    public static void main (String[] args)
    {
        int a = 12; // int bildiğimiz tam sayı değeri
        

        
        System.out.println("int Veri tipinin tutabileceği max değer = "+Integer.MAX_VALUE); // int veri tipinin tutabileceği max değer
        System.out.println("Byte veri tipinin tutabileceği max değer = " + Byte.MAX_VALUE);
        System.out.println("short veri tipinin tutabileceği max değer = "+ Short.MAX_VALUE);
        System.out.println("long veri tipinin tutabileceği max değer = " + Long.MAX_VALUE);
        double b =5.25d; // double cinsinden yazdık
        double b1=4.0d;
        System.out.println(b + "\n" + b1);
        float c = 5f ;  //5.0 float cinsinden tanımlandı
        float c1 = 5.2f ; // 5.2 float cinsinden tanımladık
        
        char d = 'h';
        char d1 = 1000;
        System.out.println("1000 sayısına denk gelen char değeri = " + d1);
        char d2 = '\u0468'; // Unicode verip değişik karakterler atayabiliriz. İnternette unicode tablosundan bulunabilir.
        System.out.println("char d2 Unicode ile atanmış değeri = " + d2);
        boolean f = true;
        boolean f1 = false;
        System.out.println("boolean f değeri = " + f);
        String s = "harf";
        System.out.println(s);
        Scanner denemeScanner = new Scanner(System.in); // Scanner class tan bir nesne oluşturduk.
        System.out.println("Yaşınızı girin"); // kullanıcıdan konsoldan bir değer istedik
        int yas = denemeScanner.nextInt(); // gelen değeri yas değişkenine atadık
        System.out.println("Adın ne? ");
        String isim = denemeScanner.next(); // nextLine() yaparsak isim değerinin yerine 'enter' ile gelen \n gelir. Ya da bu sorunu şöyle çözebiliriz nextline alacaksak önce nextline alırız sonra int değer alırsak bu sorun ortadan kalkar
        System.out.println("Merhaba " + isim +" " + yas + " yaşındasın ...");
        
        
        
        
        
    }
    
   
}
