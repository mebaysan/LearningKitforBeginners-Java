


public class Main {
    public static void main(String[] args) {
        
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Para yatırıldı 100");
        
        
        try {
            manager.withDraw(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    
    }

}
