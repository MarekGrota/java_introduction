package programowanie_I.arrays;

import java.util.Arrays;
import java.util.Random;

// Wyszukiwanie binarne z losowo wybraną liczbą szukaną z zakresu <1, 20>

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("*****  Wyszukiwanie binarne z losowo wybraną liczbą szukaną z zakresu <1, 20> w zdefiniowanej tablicy   *****");
        Random random = new Random();
        int notFoundNumber = random.nextInt(20);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("\nSzukam " + notFoundNumber);
        System.out.println();

        int index = search(array, notFoundNumber);
        if (index == -1) {
            System.out.println("Nie znaleziono elementu " + notFoundNumber + " w tablicy " + Arrays.toString(array));
        } else {
            System.out.println("Znalazłem element " + notFoundNumber + " w tablicy na indeksie " + index);
        }
    }

    /**
     * @param tab
     * @param searchNumber
     * @return indeks szukanego elementu lub -1 gdy nie znaleziono
     */


    private static int search(int[] array, int searchNumber) {

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int center = (left + right) / 2;

            if (array[center] == searchNumber) {
                return center;
            }
            if (array[center] > searchNumber) {
                right = center - 1;
            } else {
                left = center + 1;
            }
        }
        return -1;
    }
}
