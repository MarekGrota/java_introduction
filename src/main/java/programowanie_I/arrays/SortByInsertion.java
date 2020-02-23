package programowanie_I.arrays;


import java.util.Arrays;

public class SortByInsertion {
    public static void main(String[] args) {
        System.out.println("*****  Sortowanie tablicy przez podstawianie *****\n");
        int[] a = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        System.out.println("Początkowy układ tablicy: \n" + Arrays.toString(a));
        sort(a);
        System.out.println();
        System.out.println("Powyższa tablica po sortowaniu:");
        System.out.println(Arrays.toString(a));

    }


    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int buffer = array[i];

            while (j > 0 && array[j-1] > buffer) {
                TabHelper.swap(array, j, j-1);
                j--;
            }
        }
    }

}