public class KrediUI { // kredi işlemlerini yapmak için bir class oluşturduk

    public void KrediHesapla(BaseKrediManager baseKrediManager){ // KrediHesapla methoduna parametre olarak BaseKrediManager sınıfından veya o sınıftan inherit edilmiş bir parametre istedik.
        baseKrediManager.Hesapla(); // aldığımız parametreye ait olan Hesapla methodunu çağırdık.
    }
    
}
