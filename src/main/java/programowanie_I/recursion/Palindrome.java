package programowanie_I.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String[] words = new String[20];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo do sprawdzenia: ");
        String a = scanner.nextLine();

        int index = 0;
        boolean comparison = true;

        comparison = comparison(a, 0);

        if (comparison) {
            System.out.println(a + " jest palindromem");
        } else {
            System.out.println(a + " nie jest palindromem");
        }

    }

    private static boolean comparison(String word, int index) {
        if (index > word.length() / 2) {
            return true;
        }
        if (word.charAt(index) != word.charAt(word.length() - 1 - index)) {
            return false;
        }
        return comparison(word, index + 1);
    }
}

