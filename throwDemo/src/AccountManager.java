


public class AccountManager {
    private double balance;
    
    
    
    public void deposit(double amount){
        balance+= amount;
        
    }
    public void withDraw(double amount) throws Exception{
        balance-=amount;
        if (balance>=amount) {
            balance = getBalance()-amount;
        }else{
            throw new Exception("Bakiye yetersiz!");
        }
    }

    
    public double getBalance() {
        return balance;
    }
    
    
}
