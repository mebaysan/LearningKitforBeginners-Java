public class BaseKrediManager {
    
    public double hesapla(double tutar){ // javada aksini iddia etmediğimiz sürece classlar overridable'dır. Yani inherit edilen sınıf ezilebilir.
        // eğer bunu override etmek istemezsek yani bunu inherit eden class'lar ezmesin dersek public final double yazmalıydık. 'final' anahtar kelimesi override edilmemesini sağlar.
        return tutar* 1.18;
    }
}
