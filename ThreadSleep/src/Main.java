


public class Main {

    public static void main(String[] args) throws InterruptedException {
       
               
        int a = 0;
        int a_deger=0;
        while (a<5) {            
            System.out.println("Merhaba!\ta'nın değeri : " + a_deger);
            Thread.sleep(1750); // içine verdiğimizi salise kadar bekler.
            a++;
            a_deger++;
        }
        System.out.println("Döngü bitti!");
        
        
        
    }
}
