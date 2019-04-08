import java.util.Scanner;

public class primeNumber{

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.print("kolla om nummer är primtal: ");

        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("är %d primtal? %s %s  %s %n", number, isPrime(number), isPrimeOrNot(number), isPrimeNumber(number));


        }
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int number) {

        if (number == 2 || number == 3) {
            return true;

        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String isPrimeOrNot(int num){
        if (num < 0){
            return "not valid";
        }
        if (num == 0 || num == 1){
            return "inte primtal";
        }
        if (num == 2 || num == 3){
            return "primtal";
        }
        if ((num * num - 1) % 24 == 0){
            return "primtal";

        } else {
            return "inte primtal";
        }

    }

}
