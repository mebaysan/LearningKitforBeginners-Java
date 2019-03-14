import java.util.Random;
import java.util.Scanner;

public class Main {
static int i = 3;
    public static void main(String[] args) {
        System.out.println("Sonucun 1 ile 9 arasında hangi iki sayının toplanıp bulunduğunu tahmin et");
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int sayi1 = rand.nextInt(9);
        sayi1 += 1;
        int sayi2 = rand.nextInt(9);
        sayi2 += 1;
        int sum = sayi1 + sayi2;
        System.out.println("Sonuç = " +sum);
        //System.out.println(sayi1);
        do{
            System.out.print("İlk Sayıyı Tahmin Et= ");
            int tahmin1 = inp.nextInt();
            System.out.print("İkinci Sayıyı Tahmin Et= ");
            int tahmin2 = inp.nextInt();
            i--;
            if(tahmin1 == sayi1 && tahmin2 == sayi2) {
                System.out.println("Tebrikler Doğru Bildin!!!");
                level2();
                break;
            }
            if (tahmin1 == sayi2 && tahmin2 == sayi1){
                System.out.println("Tebrikler Doğru Bildin!!!");
                level2();
                break;
            }else{
                System.out.println("Yanlış Tahmin Ettin!!!");
                System.out.println("Kalan Tahmin hakkı:" + i);
            }

        }while (i>0);



    }
    public static void level2(){
            i = 3;
            System.out.println("Seviye 2'ye Hoşgeldin şimdi işler biraz daha zor!!!!!");
            System.out.println("=========================================================");
            System.out.println("Sonucun 1 ile 15 arasında hangi iki sayının toplanıp bulunduğunu tahmin et");
            Scanner inp = new Scanner(System.in);
            Random rand = new Random();
            int sayi1 = rand.nextInt(15);
            sayi1 += 1;
            int sayi2 = rand.nextInt(15);
            sayi2 += 1;
            int sum = sayi1 + sayi2;
            System.out.println("Sonuç = " +sum);
            //System.out.println(sayi1);
            do{
                System.out.print("İlk Sayıyı Tahmin Et= ");
                int tahmin1 = inp.nextInt();
                System.out.print("İkinci Sayıyı Tahmin Et= ");
                int tahmin2 = inp.nextInt();
                i--;
                if(tahmin1 == sayi1 && tahmin2 == sayi2) {
                    System.out.println("Tebrikler Doğru Bildin!!!");
                    break;
                }
                if (tahmin1 == sayi2 && tahmin2 == sayi1){
                    System.out.println("Tebrikler Doğru Bildin!!!");
                    break;
                }else{
                    System.out.println("Yanlış Tahmin Ettin!!!");
                    System.out.println("Kalan Tahmin hakkı:" + i);
                }

            }while (i>0);


    }

}

