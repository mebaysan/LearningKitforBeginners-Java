public class Main {
    public static void main(String[] args) {
        
        ÖğretmenKrediManager öğretmenKrediManager = new ÖğretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(öğretmenKrediManager); // krediuı class'ın içine BaseKrediManager veya ondan inherit edilmiş herhangi bir class'tan türemiş nesne parametre olarak yollanabilir.
        
        
        
    }
    
}
