package Array.Find;

import java.util.Arrays;

public class MinMaxMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < data.length; i++) {
            Arrays.sort(data[i]);

            if (data[i][0] < minimum)
                minimum = data[i][0];

            if (data[i][data[i].length - 1] > maximum)
                maximum = data[i][data[i].length - 1];
        }
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);

    }
}
