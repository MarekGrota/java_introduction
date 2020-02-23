package programowanie_I.arrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("*****  Program odwracający tablicę  *****\n");
        int[] array = {1, 2, 3, 4, 5};
        int[] turned = turn(array);
        System.out.println("Pierwotny układ tablicy:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Tablica po odwróceniu:");
        System.out.println(Arrays.toString(turned));
    }

    private static int[] turn(int[] array) {
        int[] theVals = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            theVals[i] = array[array.length - 1 - i];
        }

        return theVals;


    }
}


