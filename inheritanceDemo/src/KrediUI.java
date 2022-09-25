public class KrediUI {
    /*
    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
        //diğer managerleri burada çağırıyoruz. UI ile
        ogretmenKrediManager.Hesapla();
    }    
    */

    public void KrediHesapla(BaseKrediManager baseKrediManager) {
        baseKrediManager.Hesapla();
    }
}
