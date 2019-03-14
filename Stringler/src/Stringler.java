public class Stringler {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı = " + mesaj.length()); // Bize kaç karakterden oluştuğunu verir
        System.out.println("5. elemanı = " + mesaj.charAt(4));   // içine verdiğimiz değere karşılık gelen indexteki elemanı verir.
        System.out.println(mesaj.concat(" Yaşasın!")); // concat içine verilen değeri string ifadeye ekler.
        System.out.println(mesaj +"--> A  harfi ile başlıyor mu : " + mesaj.startsWith("A")); // içine verdiğimiz değer ile başlıyor mu dedik. boolean döndürür.
        System.out.println(mesaj + "--> . ile bitiyor mu : " + mesaj.endsWith(".")); // içine verdiğimiz değer ile bitiyor mu dedik. boolean döndürür.
        System.out.println(mesaj.indexOf('a')); // yazdığımız karakter('') veya stringin("") baştan başlayıp nerede olduğunu söyler. İlk bulduğunu verir ve yoksa -1 der.
        System.out.println(mesaj.lastIndexOf("a")); // aramaya sondan başlar.
        System.out.println(mesaj.replace(" ", "/")); // içine verdiğimiz ilk değer string içinde olan değer, ikinci ise değiştirmek istediğimiz karakter.
        System.out.println(mesaj.substring(6)); // verdiğimiz değerden itibaren string içinden ifadeyi alır.
        System.out.println(mesaj.substring(0, 5)); // ilk değerden itibaren ikinci verdiğimiz indekse kadar alır. ikinci indeks dahil değil.0'dan başla 5'e kadar dedik ancak 5 dahil değil.
        for(String kelime: mesaj.split(" ")){ // bütün kelimeleri split içinde verdiğimiz değere göre ayırır.
            System.out.println(kelime);
        };
        System.out.println(mesaj.toLowerCase()); // mesajı küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); // bütün harfleri büyük harfe çevirir.
        System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları attık.
        
    
    
    
    
    
    
    
    }
    
}
