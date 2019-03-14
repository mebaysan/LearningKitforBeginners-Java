// public her yerden erişilebilir demektir.
    // java'da bu attributeler default olarak publictir.
    // private özel demektir. sadece tanımlandığı blokta geçerli olur.
    

public class Encapsulation {
    public static void main(String[] args){
        
        Product product=new Product(); // Product class'tan product bir ürün oluşturduk.
        product.setId(1); // product nesnesinin attribute'lerini belirledik.
        product.setName("Klavye");
        product.setPrice(19.90);
        product.setDescription("Deneme ürünü olduğu için fazla bilgi yoktur");
        product.setStockAmount(4);
        System.out.println("Ürün Adı : " + product.getName());
        
        ProductManager productManager = new ProductManager(); // nesne oluşturduk
        Product product2 = new Product();
        product2.setName("Mouse");
        productManager.Add(product2); // productManager class'ın Add methodunu kullandık.
        System.out.println(product.getKod()); // ürüne kodunu okumuş olduk.
        Product insan = new Product();
        insan.setName("Hitman");
        insan.setId(2);
        insan.setDescription("Katil bir birey olma yolunda gidiyor hıyarto :D ");
        System.out.println("Oluşturduğumuz Hitman nesnesinin kodu : " + insan.getKod());
        
    
    }

}
