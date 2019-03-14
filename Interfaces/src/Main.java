public class Main {
    public static void main(String[] args) {
        
     ICustomerDal customerDal = new OracleCustomerDal(); // interface tek başına new'lenemez. Ancak kendinisi implemente eden class'ın referansını tutabilir.
     // extends ile implements farkı => bir class sadece bir kere extend edebilir ancak istediği kadar implement edebilir.
     CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
     customerManager.add();
     
     
     
    }

}
