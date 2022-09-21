public class Main {
    public static void main(String[] args) {
        double[] myList = {10.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        //i olmadan döngü ile liste verileri yazdırma
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);
    }
}