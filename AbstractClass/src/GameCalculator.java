public abstract class GameCalculator { // sınıfın(method/operasyon) abstract olması için abstract imzasını alması gerek.
    public abstract void hesapla(); // kim inherit ediyorsa hesapla methodunu içermek zorunda ve bunu override etmek zorunda.
    // yani kısaca dedik ki -> bir operasyonumuz var ve bunu base'de belirlemek istemiyorum ama bunu kim inherit etmek istiyorsa onu override ile belirlemek zorunda.
    // abstract sınıflar new'lenemez. newlemek için methodlarını ezmemiz gerekir.
    public final void gameOver(){ // abstract olduğu için gamecalculator'u kim kullanıyorsa gameOver methodunu olduğu gibi kullanmak zorunda
        System.out.println("Oyun bitti!");
    }
}
