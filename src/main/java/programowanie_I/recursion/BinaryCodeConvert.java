package programowanie_I.recursion;

import java.util.Scanner;

public class BinaryCodeConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj całkowitą liczę dziesiętną do zamiany na liczbę binarną: ");
        int podstawa = scanner.nextInt();
        System.out.println();
        System.out.println("Liczba " + podstawa + " ma poniższy zapis binarny:");
        int modulo;
        String result = " ";

        do {

            modulo = podstawa % 2;
            podstawa /= 2;

            result = modulo + result;

        } while (podstawa > 0);

        result = convert(podstawa, result);

        System.out.println(result);


    }

    public static String convert(int podstawa, String result) {

        if (podstawa == 0) {
            return result;
        }
             int modulo = podstawa % 2;

        return convert(podstawa / 2, modulo + result);

        }

    }
