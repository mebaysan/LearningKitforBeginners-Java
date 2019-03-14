


public class Customer {
    int id; // Class'ın field ve attribute'leri
    String firstName;
    String lastName;

    public Customer(){
    
    }// Constructor
    public Customer(int id, String firstName, String lastName){ // class oluştururken içine parametreleri veripte oluştursun dedik
        this.id=id; // bu oluşan nesnenin id'si parametre ile gelen id olsun dedik.
        this.firstName=firstName;
        this.lastName=lastName;
    }

}
