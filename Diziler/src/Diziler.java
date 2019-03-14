public class Diziler {
    public static void main(String[] args) {
        
            String[] öğrenciler = new String[3];  // String dizisi oluşturduk.Kaç elemanlı olacağını söyledik.
            öğrenciler[0] = "Enes";  // öğrenciler dizisinin 0. elemanı 'Enes' dedik.
            öğrenciler[1] = "Yusuf";
            öğrenciler[2]="Baysan";      
            
            
            
            for (int i = 0; i < öğrenciler.length; i++) { // öğrenciler listesinin eleman sayısı kadar(öğrenciler.length) döngü olsun ve her seferinde 1 artsın
                System.out.println(öğrenciler[i]);      // her seferinde döngüye karşılık gelen indexi bas.
        }
            System.out.println("-----------------------------------------------");
            
            for (String öğrenci : öğrenciler) {   // öğrenciler listesi içindeki string olan öğrenci değeri için
                System.out.println(öğrenci); // Üstteki döngü ile bu döngü aynıdır.
        }
            System.out.println("Recap Demo : Diziler\n-------------------------------------------------");
            double[] myList = {1.2, 1.3, 4.3, 5.6};  // double sayı türünde bir liste tanımladık ve elemanları listeyi tanımlarken ekledik. Yukardaki ile bunun arasında bir fark yok.
            double total = 0;
            double maxSayi = myList[0]; // en büyük sayıyı bulacağız. Bunun için en büyük sayıyı dizinin birinci elemanı olarak tnaımladık.
            for(double sayi:myList){ // 'double tipinde myList içindeki her sayi elemanı'
                if (maxSayi<sayi) { // eğer maxSayi değişkeni dönen elemandan küçükse maxSayi değişkeni = sayi değişkeni olsun dedik. Bu sayede eğer maxSayi dönen sayıdan küçükse dönen sayı artık bizim maxSayi'miz olacak.
                    maxSayi = sayi;
                }
                total = total + sayi; // tanımladığımız total değişkenini her döngüde dönen sayı ile topladık
                System.out.println(sayi);
            }
            System.out.println("Toplam = " + total);
            System.out.println("En büyük sayı = " + maxSayi);
        
            // Çok Boyutlu Diziler İle Çalışmak
            String [] [] semtler = new String[2] [3]; // çok boyutlu bir dizi oluşturduk. 2 bölge ve 3 semtten oluşuyor diyebiliriz.
            {
                semtler[0][0]="Bağcılar"; // 0. satırın 0. sütunu(yani ilk elemanı)
                semtler[0][1]="Başakşehir";
                semtler[0][2]="Fatih";
                semtler[1][0]="Üsküdar"; // 1. satırın 0. elemanı
                semtler[1][1]="Ümraniye";
                semtler[1][2]="Beykoz";
            }
           for (int i = 0; i <= 2; i++) {
               System.out.println("-----------------------");
               for (int j = 0; j <= 2; j++) {
                   System.out.println(semtler[i][j]);
                           
               }
        }
    }
    
}
