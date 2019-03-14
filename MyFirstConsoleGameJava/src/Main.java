
import java.util.Random;
import java.util.Scanner;

/*
İskeleti kurmak için adım adım izlemen gereken yollar:
-> Base class oluştur. Player ve Monster nesnelerini bu class'tan türet.
-> Player ve Monster nesnelerinin attribute ve field'larını belirle.
->Oyuncudan aldığın işleme göre aksiyon belirle.

*/
public class Main {
    public static void main(String[] args) {
        
        BaseClass player = new BaseClass();
        BaseClass monster = new BaseClass();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        player.health=100;
        player.damage = 13;
        monster.health=130;
        monster.name="KodxMons";
        Random randomDamage = new Random();
        int monsterDamage = randomDamage.nextInt(25);
        monsterDamage+=14;
        monster.damage = monsterDamage;
        int monsterRevive = randomDamage.nextInt(10);
        monsterRevive+=5;        
        int operation;
        Random randomOperation = new Random();
        
        System.out.print("Oyuncu adınızı girin : ");
        String playerName = scanner.nextLine();
        player.name=playerName;
        System.out.println("KodxMons'un dünyasına hoş geldin " + playerName+"!");
        System.out.println("Hasar vermek için(18dmg) -> 1\nCan yenilemek için(8hp) -> 2");

        boolean oyun = true;
        while (oyun) {            
            System.out.print("Senden hareket bekliyorum : ");
            operation = scanner.nextInt();
            if (operation == 1) {
                monster.health-=18;
                System.out.println("KodxMons bizim tarafımızdan hasar aldı! Kalan canı = " + monster.health + "\nKodxMons bizim için bir hareket belirleyecek... ");
                if (monster.health<=0) {
                    System.out.println("Tebrikler " + playerName + " Savaşı Kazandın!");
                    break;
                }
                System.out.println("---------------");
                int monsterOperation = randomOperation.nextInt(3);
                monsterOperation+=1;
                if (monsterOperation==1) {
                    player.health -= monster.damage;
                    System.out.println("Olamaz KodxMons bize hasar verdi!\nKalan canımız : " + player.health);
                    if (player.health<=0) {
                         System.out.println("Üzgünüm Savaşı Kaybettin " + playerName + " KodxMons Savaşı Kazandı!");
                         break;
                    }
                }
                else {
                        monster.health+= monsterRevive;
                        System.out.println("Olamaz KodxMons canını yeniledi!\nYeni canı : " + monster.health);
                        System.out.println("-----------");
                } 
            }
            else if(operation==2){
                player.health+=8;
                System.out.println("Can yeniledik. Yeni canımız : " + player.health + "\nKodxMons bizim için bir hareket belirleyecek...");
                System.out.println("------------------");
                int monsterOperation = randomOperation.nextInt(3);
                monsterOperation+=1;
                if (monsterOperation==1) {
                    player.health -= monster.damage;
                    System.out.println("Olamaz KodxMons bize hasar verdi!\nKalan canımız : " + player.health);
                    
                    if (player.health<=0) {
                         System.out.println("Üzgünüm Savaşı Kaybettin " + playerName + " KodxMons Savaşı Kazandı!");
                         break;
                    }
                    System.out.println("-------------------");
                }
                else {
                        monster.health+= monsterRevive;
                        System.out.println("Olamaz KodxMons canını yeniledi!\nYeni canı : " + monster.health);
                        System.out.println("---------------");
                }
                
            }
            else{
                System.out.println("Geçersiz işlem!");
            }         
        }
       
    }
    
    
}
