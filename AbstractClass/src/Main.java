public class Main {
    public static void main(String[] args){
        
        KidsGameCalculate kgc = new KidsGameCalculate();
        kgc.hesapla();
        GameCalculator gameCalculator = new WomanGameCalculate(); //birbirlerinin referanslarını tutabilir.
        
        
    }
}
