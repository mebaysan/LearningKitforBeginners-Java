public class CustomerManager {
    
    private BaseLogger logger; // field belirledik.
    
    public CustomerManager(BaseLogger logger){ // constructor bekledik.
        this.logger = logger; // yukardaki logger field'ı parametre olarak gelen logger'a eşitledik.
        
    }
    
    public void add(){
        System.out.println("Müşteri eklendi!");
        this.logger.log("Logged ! ");
    }
    
    
    
}
