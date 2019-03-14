public class MySqlCustomerDal implements ICustomerDal{ // interface extends ile değil implements ile entegre olur.

    @Override
    public void add() {
        System.out.println("MySql eklendi!");
    }
    
}
