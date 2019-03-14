public class Product { // class oluşturduk.
    
// attribute or field

    int id; // Product class'ın özellikleri
    private String _name; // ÇOOK ÖNEMLİ ÖZELLİK!* 18. SATIRDA
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _kod; // örnek vermek gerekirse mesela ürüne kod veriyoruz. Ürün adının ilk harfi ve id'si
   
    

// GET VE SET METHODLARI
    // getter --- get olan methodlar yalnızca okuma yapar
    public int getId(){
        return id;
    }
    // setter --- set olan methodlar özelliği  belirler ---  Bunları böyle tek tek elle yazmaya gerek kalmadan attribute veya field değerlerini belirlediğin yerde sağ tık yap->refactor->encapsulate fields diyebilirsin
    public void setId(int id){
        this.id=id; // ÇOK ÖNEMLİ!* this-> içinde bulunduğu class'a ait demek. this.id -> product class'ına ait id demektir.

    }

    
    public String getName() { // product class'a özel getName methodu -> classtan oluşan nesnenin Name değerini döndürür
        return _name;
    }

    
    public void setName(String _name) { // product class'a özel setName methodu -> classtan oluşan nesnenin Name değerini belirler/değiştirir.
        this._name = _name; // class'a ait _name değerini parametre olarak aldığımız _name değerine set eder.
    }

    
    public String getDescription() {
        return _description;
    }

    
    public void setDescription(String _description) {
        this._description = _description;
    }

    
    public double getPrice() {
        return _price;
    }

    
    public void setPrice(double _price) {
        this._price = _price;
    }

    
    public int getStockAmount() {
        return _stockAmount;
    }

    
    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getKod(){ // ürüne kod belirliyoruz. ürünün adının ilk harfi ve id'si
        return this._name.substring(0,1) + id;
    }
    
    
}
