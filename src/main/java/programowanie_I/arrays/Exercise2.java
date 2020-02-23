package programowanie_I.arrays;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println("*****  Program odwracający tablicę  *****\n");
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Pierwotny układ tablicy:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Suma wszystkich elementów tablicy to: " + sum(array));
    }

    private static int sum(int[] tab) {

        int suma = 0;

        for (int val : tab) {
            suma += val;
        }

        return suma;

    }
}