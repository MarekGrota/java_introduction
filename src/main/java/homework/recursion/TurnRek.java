package homework.recursion;

import java.util.Arrays;

public class TurnRek {
    public static void main(String[] args) {
        System.out.println("*****  Program odwracający tablicę rekurencyjnie  *****\n");
        int array[] = { 1, 2, 3, 4, 5, 7, 6, 7, 8, 9 };

        System.out.println("Pierwotny układ tablicy:");
        System.out.println(Arrays.toString(array));

        System.out.println();

        turnRek(array, 0, array.length - 1);

        System.out.println("Tablica po odwróceniu:");
        System.out.println(Arrays.toString(array));
    }

    public static void turnRek(int array[], int left, int right) {

        int buffer;

        if (left < right) {
            buffer = array[left];
            array[left] = array[right];
            array[right] = buffer;

            turnRek(array, left + 1, right - 1);
        }
    }
}
