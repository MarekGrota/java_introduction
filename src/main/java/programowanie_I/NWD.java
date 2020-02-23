package programowanie_I;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {

        euklidesModulo(378, 214);

    }


    private static void euklidesModulo(int a, int b) {
        int baseA = a;
        int baseB = b;
        int c;

        int counter = 0;

        while (b > 0) {
            c = b;
            b = a % b;
            a = c;

            counter++;
        }
        System.out.println("NWD dla liczb " + baseA + " i " + baseB + " to " + a);
        System.out.println("Ilość przebiegów algorytmu: " + counter);
    }

}
