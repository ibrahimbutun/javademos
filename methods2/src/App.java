//variable arguments

public class App {
    public static void main(String[] args) throws Exception {
        //String mesaj = "bgn havack güzel";
        // substring bir değer döndürüyor..
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(2, 3);
        System.out.println(sayi);
        int toplam = topla2(1, 2, 3, 4, 5);
        System.out.println(toplam);
    }

    // void emir kipi .... void operasyon
    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // int... arkaplanda diziye çeviriyor
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam; 
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
