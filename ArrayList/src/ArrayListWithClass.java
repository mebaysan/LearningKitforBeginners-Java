import java.util.ArrayList;


public class ArrayListWithClass {

    public void learn(){
        
        ArrayList<Customer> customers = new ArrayList<Customer>(); // Customer tipinde bir arraylist oluşturduk.
        customers.add(new Customer(1,"Enes","Baysan")); // arrayliste ekleyeceğimiz customer tipinin özelliklerini eklerken belirledik.
        customers.add(new Customer(2,"Yusuf","Hoca"));
        customers.add(new Customer(3,"Yavuz","Baysan"));
        customers.remove(new Customer(1,"Enes","Baysan")); // böyle yaparsak silmez. referans değerleri üzerinden çalışır.
        Customer deneme = new Customer(4,"Deneme","Denemehinyo"); // oluşturduğumuz nesneyi bir değere atarsak
        customers.remove(deneme); // atadığımız değeri arraylist'den silebiliriz.
        for(Customer customer:customers){
            System.out.println(customer.id + " " + customer.firstName + " " + customer.lastName);
        }
        
        
        
        
    }
    
}
