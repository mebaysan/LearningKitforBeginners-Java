
import java.util.ArrayList;
import java.util.Collections;




public class TypeSafeArrayList {
    public void learn(){
        ArrayList<String> sehirler = new ArrayList<String>(); // type safe array list farkı < > içine hangi tipte verilerin geleceği yazılır. Yani collection'ın tipi belirlenir.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Kars");
        sehirler.add("Adıyaman");
        Collections.sort(sehirler); // sort -> alfabeye göre sıralamayı sağlar. Collections.sort(liste_adi) diyerek kullanmamiz daha rahat!
        for(String i:sehirler){ // object de verebiliriz. fakat hangi tipte çalışıyorsak o tipi vermemiz daha doğru olur.
            
            System.out.println(i);
        }
        
        
        
        
        
    }
    
}
