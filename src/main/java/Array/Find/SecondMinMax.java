package Array.Find;

import java.util.Arrays;

public class SecondMinMax {
    // secMax({4, 781, 8, 99, 103})  -> 103
    // secMax({1, 2, 3, 4, 5})       -> 4
    // secMax({3, 4})                -> 3

    public int secMax(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return one before last. Array is soreted from smallest to biggest
        return numArr[numArr.length - 2];
    }


    // secMin({4, 781, 8, 99, 103})  -> 8
    // secMin({1, 3, 2, 4, 5})       -> 2
    // secMin({3, 4})                -> 4

    public int secMin(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return second element. Array is soreted from smallest to biggest
        return numArr[1];
    }

    // for both methods Time Complexity: O(n log n)
}
