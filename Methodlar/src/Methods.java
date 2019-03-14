public class Methods {
    public static void main(String[] args){
        
        selamla("Baysan");
        ekle();
        sil();
        int yeni_sayi= topla(3,4,5); // bir methodun sonucunu bir değişkene atayabiliriz. !* atadığımız değerlerin tipleri birbirine eşit olmalıdır.
        System.out.println(yeni_sayi);
        int yeni_sayi_plus = topla_plus(1,2,3,4,5,6,6,7,8,9,10);
        System.out.println("Daha fazla parametre ile çalışmak her zaman daha iyidir ;) " + yeni_sayi_plus);
        System.out.println("Girilen sayıların toplam değeri = " + topla_plus(1,2,3,4,5));
        topla(15, 5, 10);
        
    }
    public static void selamla(String isim){ // method oluşturduk. parametre olarak içine String tipinde bir değer gelecek dedik.
        System.out.println("Merhaba"+ isim); // method çalışınca gelen ismin başına merhaba yazdır dedik.
    }
    public static void ekle(){ // void -> bir işlem yapan tiptir.
        System.out.println("Eklendi!");
        
    }
    
    public static void sil(){
        System.out.println("Silindi!");
        
    }
    public static int topla(int sayi1,int sayi2, int sayi3){ // integer bir değer döndüreceği için static int yaptık
        int toplam = sayi1+sayi2+sayi3;
        System.out.println("Girilen sayıların değeri = " + toplam); // return her zaman son değerdir.
        return toplam;
       
    }
    // ÇOKLU PARAMETRELER İLE ÇALIŞMAK
    public static int topla_plus(int... numbers){ // parametreleri sınırlandırmamak için ... kullanılır
        int toplam = 0; // birtane toplam değişkeni belirledik.
        for(int sayi:numbers){ // numbers dizisi içindeki(... numbers yapınca otomatik bir dizi oluşturur) her sayi elemanı için
            toplam+=sayi; // toplam girilen sayilarla toplansın.
        }
        return toplam; // toplam değerini döndürdük.
    }
}
