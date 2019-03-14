public class Main {
    public static void main(String[] args) {
   
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Logged Email!");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Logged Database!");
        
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()}; // BaseLogger türünde bir dizi oluşturduk.
        for(BaseLogger logger:loggers){ // baselogger türündeki loggers dizisi içindeki her logger elemanı için
            logger.log("Log mesajı!");
            
        }
        
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
        
        
        
        
        
}

    
}
