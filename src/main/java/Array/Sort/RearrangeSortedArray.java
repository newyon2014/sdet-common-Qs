package Array.Sort;

public class RearrangeSortedArray {
    // Given sorted array, rearrange array in such a way that the first position will have the largest number ,
    // the second will have the smallest, the third will have the second-largest and so on. sing o(1) extra space

    // Example:
    // Input: arr={1,2,3,4,5,6,7}
    //Output: arr{7,1,6,2,5,3,4}

    static void rearrange(int[] arr, int n) {
        // Auxiliary array to hold modified array
        int temp[] = arr.clone();

        // Indexes of smallest and largest elements
        // from remaining array.
        int small = 0, large = n - 1;

        // To indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
    }
}
