
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* FİFO mantığı ile çalışır. İlk giren ilk çıkar.
* Queue(Kuyruk) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out Mantığıyla Çalışır.) 
* add(Eleman) ----> Elemanı Kuyruğa Ekler. Ekleyemezse Hata Fırlatır.
** offer(Eleman) ----> Elemanı Kuyruğa Ekler. Eklerse True Döner, Ekleyemezse False Döner.
* remove() ----> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
** poll() ------> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
* element() ----> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa ,  hata fırlatır.
** peek() ------> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa , null referans döner.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        
        Queue<String> queue= new LinkedList<String>();
        
        queue.offer("Enes");
        queue.offer("Baysan");
        queue.offer("Sanane");
        for(String s:queue){
            System.out.println(s);
        }
        System.out.println("----");
        System.out.println("Eleman çıkarılıyor " + queue.poll());
        Thread.sleep(1250);
        for(String s:queue){
            System.out.println(s);
        }
        System.out.println("------------");
        
        
        while (!queue.isEmpty()) { // queue içi boş olmadığı sürece dedik.
            System.out.println("Eleman çıarılıyor : " + queue.poll());
            
        }
        
    }
    
    
}
