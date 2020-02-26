package homework.recursion;

import java.util.Arrays;
import java.util.Random;

public class BinarySerchRek {

// Wyszukiwanie binarne z losowo wybraną liczbą szukaną z zakresu <1, 20>

    public static void main(String[] args) {
        System.out.println("*****  Wyszukiwanie binarne z losowo wybraną liczbą szukaną z zakresu <1, 20> w zdefiniowanej tablicy , rekurencyjnie  *****");
        Random random = new Random();
        int notFoundNumber = random.nextInt(20);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("\nSzukam " + notFoundNumber);
        System.out.println();

        int index = search(array, 0,array.length-1, notFoundNumber);
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


    private static int search(int[] array, int left, int right, int searchNumber) {

        int center = (left + right) / 2;
        if (left > right) {
            return -1;
        }

            if (array[center] == searchNumber) {
                return center;
            }
            if (array[center] > searchNumber) {
                return search(array, left, center - 1, searchNumber);// right = center - 1;
            } else {
                return search(array,  center + 1,right, searchNumber);
            }
        }

    }




