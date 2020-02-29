package programowanie_I.recursion;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj podstawę silni: ");
        int base = scanner.nextInt();

       System.out.println(base + "! wynosi: " + silnia(base));
        System.out.println();

        System.out.println("****** rekurencja ******");
        System.out.println(base + "! rekurencyjnie wynosi: " + silniaRek(base));
    }

    private static int silnia(int base) {
        //4! = 1 * 2 * 3 *4

        int silnia = 1;
        int i = 0;

        while (i < base) {
            i++;
            silnia *= i;
        }
        return silnia;
    }


    private static int silniaRek(int number) {

        int result = 0;

        if (number == 0) {
            return 1;
        } else {
            result = number * silniaRek(number - 1);
        }
        return result;
    }
}