public class App {
    public static void main(String[] args) throws Exception {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 10;

    boolean varMi = false;

    for (int sayi: sayilar) {
        if(sayi==aranacak){
            varMi = true;
            break;
        }
    }

    String mesaj = "";

    if (varMi){
        mesajVer(mesaj);
    }else{
        System.out.println("sayı mevcut değildir: "+aranacak);;
    }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}