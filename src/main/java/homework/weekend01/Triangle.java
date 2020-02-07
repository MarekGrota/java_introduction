package homework.weekend01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println(" Podaj N: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; n--) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
