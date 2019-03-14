import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3};
        
        
        ArrayList numbers = new ArrayList(); // ArrayList oluşturduk. !* java.util.ArrayList dahil edilmeli.
        numbers.add(1);
        numbers.add(20);
        System.out.println("numbers ArrayList(collection) eleman sayısı = "+numbers.size()); // number.size() collection'ın eleman sayısını verir.
        numbers.add("Metinsel");
        System.out.println("numbers ArrayList(collection) eleman sayısı = "+numbers.size()); // number.size() collection'ın eleman sayısını verir.
        System.out.println(numbers.get(2)); // .get() -> içine verdiğimiz indexteki elemanı verir.
        System.out.println("Değişmeden önce 0. index : " + numbers.get(0) );
        numbers.set(0, 100); // .set() içine verdiğimiz ilk parametre değiştirmek istediğimiz index, 2. parametre ise değiştirilecek değer
        System.out.println("Değiştikten sonra 0. index : " + numbers.get(0));
        numbers.remove(0); // .remove() -> içine verilen indexteki elemanı siler.
        System.out.println(numbers.get(0));
        System.out.println("-------");
    //    numbers.clear(); // .clear() -> listedeki bütün elemanları siler.
        for(Object i : numbers){ // for each döngüsü ile ArrayList'lerde gezinmek için eleman tipini Object yapmalıyız!
            System.out.println(i);
        }
        System.out.println("----*-*-*----*-*-*-*-*-*");
        TypeSafeArrayList typeSafeArrayList = new TypeSafeArrayList();
        typeSafeArrayList.learn();
        System.out.println("--------------------------------------------");
        
        ArrayListWithClass arrayListWithClass = new ArrayListWithClass();
        arrayListWithClass.learn();
        System.out.println("----------------------");
        // HASHMAP ******** yapısal anlamda sözlük (dictionary) benzetebiliriz. 'key = value'
        HashMap<String,String> sözlük = new HashMap<String,String>(); // ilk parametre anahtar değeri ikinci parametre ona karşılık gelen değeri belirler. Integer,Integer/ Integer,String/String,Double vs...
        sözlük.put("Book", "Kitap");
        sözlük.put("Computer", "Bilgisayar");
        sözlük.put("Table", "Masa");
        System.out.println(sözlük.get("Table")); // bir değere ulaşmak için .get içinde key veririz.
        sözlük.remove("Table"); // remove içinde anahtar değeri veririz.
        System.out.println("Sözlükteki eleman sayısı = " + sözlük.size());
        for(String item:sözlük.keySet()){ // keySet anahtar değerleri verir.
            System.out.println(item);
        }
        System.out.println("------");
        for(String item:sözlük.values()){ // values ise değerleri verir.
            System.out.println(item);
        }
        for(String item:sözlük.keySet()){ // pratik bir yöntem
            System.out.println("Eleman = "+item+" Değer = "+sözlük.get(item));
        }
        
    }
}
