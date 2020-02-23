package programowanie_I.arrays;

import java.util.Arrays;

public class TabHelper {

    public static void swap (int[]array, int lIndex, int rIndex) {
        int buffor = array[lIndex];
        array[lIndex] = array[rIndex];
        array[rIndex] = buffor;
    }
}
