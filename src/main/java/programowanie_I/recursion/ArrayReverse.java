package programowanie_I.recursion;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Pierwotny układ tablicy:");
        System.out.println(Arrays.toString(array));

        reverse(array, 0);
        System.out.println("Tablica po odwróceniu:");
        System.out.println(Arrays.toString(array));

    }

    private static void reverse(int[] array, int index) {

        if (index > array.length / 2) {
            return;
        }

        int lastIndex = array.length - 1 - index;

        int firstTmp = array[index];
        array[index] = array[lastIndex];
        array[lastIndex] = firstTmp;

        reverse(array, index + 1);

    }

}
