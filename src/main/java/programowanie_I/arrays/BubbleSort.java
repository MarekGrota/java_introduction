package programowanie_I.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("*****  Sortowanie bąbelkowe tablicy  *****\n");
        int[] a = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        System.out.println("Początkowy układ tablicy: \n" + Arrays.toString(a));
        buble(a);
        System.out.println();
        System.out.println("Powyższa tablica po sortowaniu:");
        System.out.println(Arrays.toString(a));
    }


    public static void buble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1;j++ ) {
                if (array[j] > array[j + 1]) {
                    TabHelper.swap(array, j, j + 1);

                }

            }
        }
    }
}
