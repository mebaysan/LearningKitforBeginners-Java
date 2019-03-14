

package matematik;


public class Dortislem {

    public int topla(int ... sayilar){ // int tipinde birden fazla değer gelecek sayilar dizisine ekle dedik
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi; // her seferinde elemanı toplama ekle
        }
        System.out.println("Toplam = " + toplam);
        return  toplam;
    }
    
}
