public class App {
    public static void main(String[] args) throws Exception {
        int number = -1;
        //int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("sayi asal değildir");
            return;
        }
        if(number<1){
            System.out.println("geçersiz sayı");
            return;
        }
        

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("sayi asaldır.");
        } else {
            System.out.println("sayi asal değildir.");
        }

    }
}
