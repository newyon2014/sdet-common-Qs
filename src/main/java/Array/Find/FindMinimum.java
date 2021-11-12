package Array.Find;

public class FindMinimum {
    public int findMinimum(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0]; // min will hold the minimum of array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // Time Complexity: O(n)
    //******************************SECOND SOLUTION ***********************************************
    // min({4, 781, 8, 99, 103})  -> 4
    // min({1, 2, 3, 4, 5})       -> 1
    // min({3, 4})                -> 3
    // min({100})                 -> 100

    public int min(int[] arrNum) {
        // assume first element of array is the smallest number
        int min = arrNum[0];

        // loop over the array and test assumption
        for (int i = 0; i < arrNum.length; i++) {
            // if min was not smallest, update it
            if (min > arrNum[i]) {
                min = arrNum[i];
            }
        }
        return min;
    }
}
