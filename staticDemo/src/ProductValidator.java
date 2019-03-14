public class ProductValidator {
    public static boolean isValid(Product product){ 
        if (product.price>0 && !product.name.isEmpty()) { // isEmpty -> değer girilmedi anlamına gelir.
            return true;       // ! değilse demek
        }
        else{
            return false;
        }
    }
    
    public void bise(){
        
        
    }
}
