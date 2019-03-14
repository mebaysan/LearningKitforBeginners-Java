
import java.util.Date;
import java.util.Random;

// Inheritance -> miras
public class Main {
    public static void main(String[] args) {
        // BİR CLASS SADECE BİR CLASS'I INHERIT EDEBİLİR!*
        Customer customer = new Customer();
        Employee employee = new Employee();
        employee.salary=15.56; // inherit ettik ve employee nesnesinin özelliğini belirledik.
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        PersonManager personManager = new PersonManager();
        customerManager.Add(); // attribute ve fields'ların inherit edildiği gibi methodları da inherit edebiliriz.
        personManager.List();
        employeeManager.BestEmployee();
        
        
        
        
        
    }
}
