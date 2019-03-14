
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        try {// hata alınabilecek, denenmesi gereken kodlar. Burda oluşan kodlar catch bloğuna parametre olarak verilir.
            System.out.println(sayilar.get(5)); // 5. indexi istedik
        } catch (Exception e) { // hata alınırsa yapılacak kodlar.
            System.out.println(e); // parametreyi yazdırırsak bize hatanın adını verir.
            System.out.println("Belirlenen index yok!");
        }catch(ExceptionInInitializerError ex){ // birden fazla catch bloğu olabilir.
            System.out.println("Başka hata!");
        }
        finally{ // ya try çalışır ya da catch ancak finally her türlü çalışır.
            System.out.println("Yeni bir index girin!");
        }
        
        
    }
}
