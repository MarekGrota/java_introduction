package programowanie_I.arrays;

import java.util.Scanner;

public class RestOfMoney {
    public static void main(String[] args) {
        System.out.println("**********  Program do obliczania ilości nominałów przy wydawaniu reszty  **********");
        System.out.println("\nIle wynosi reszta z transakcji do zwrotu?");
        Scanner scanner = new Scanner(System.in);
        int rst = scanner.nextInt();
        System.out.println("Zwrócone zostaną nominały w poniższych ilościach:");
        System.out.println();
        rest(rst);

    }


    private static void rest(int restt) {

        int[] nominals = {100, 50, 20, 10, 5, 2, 1};

        for (int nominal : nominals) {

            if (nominal <= restt) {
                int multiple = 0;

                do {
                    restt = restt - nominal;
                    multiple++;
                } while (restt >= nominal);

                System.out.println(multiple + " x " + nominal + " zł");

            }
        }

    }
}
