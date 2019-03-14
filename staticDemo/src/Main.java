


public class Main {
        public static void main(String[] args){ // static yapılar hiçbir şekilde new'lenerek ulaşılamaz. Main.main olarak ulaşabiliriz.
        // static'ler genellikle utilty yazarken kullanılır.
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="";
        productManager.add(product);
        
        
        
        
        
    }

}
