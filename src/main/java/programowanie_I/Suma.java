package programowanie_I;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a;
        do {
            System.out.println("Podaj liczbę: ");
            a = scanner.nextInt();
            sum += a;
        } while (a!=0);
        System.out.println("Suma podanych liczb jest równa: " + sum);

    }
}
