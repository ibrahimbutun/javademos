public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For tamamlandı");

        //While

        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //infinity loop eğer döngüyü durduracak tanımlama girmezsen
        System.out.println("While tamamlandı");

        /* DO - While */

        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While tamamlandı");

    }
}