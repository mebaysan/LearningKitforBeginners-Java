public class Sınıflar {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); // CustomerManager class'tan bir nesne oluşturduk.
        customerManager.Add(); // customerManager nesnesine ait methodları çalıştırabiliriz.
        Öğrenci öğrenci = new Öğrenci();
        öğrenci.Gecti();
        int sayi1=10; // değer ve referans tiplerini anlamak için güzel bir örnek
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        DörtIslem dörtIslem = new DörtIslem();
        dörtIslem.Topla(1,2,3,4,5);
        dörtIslem.Bol(15, 3);
        dörtIslem.Cikar(56, 100);
        dörtIslem.Carp(15, 2);
        
    }        
}
class DörtIslem{
    public int Topla(int ... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        System.out.println("Girilen sayıların toplamı = " + toplam);
        return toplam;
    }
    public int Cikar(int a,int b){
        System.out.println(a+"-"+b+" = "+ (a-b));
        return a-b;
    }
    public int Carp(int a,int b){
        System.out.println("Verilen sayıların çarpımı = "+(a*b));
        return a*b;
    }
    public int Bol(int a,int b){
        System.out.println("Verilen sayıların bölümü = " + (a/b));
        return a/b;
    }
    
    
}