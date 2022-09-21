public class App {
    public static void main(String[] args) throws Exception {
        // 220 ve 284 arkadaş sayıdır.kendileri hariç pozitif tam bölenleri
        // birbirine eşit olan sayılar

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("arkadaştır");
        }else{
            System.out.println("arkadaş değildir.");
        }

    }
}
