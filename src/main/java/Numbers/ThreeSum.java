package Numbers;

import java.util.Arrays;

public class ThreeSum {
    public void threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println("i " + arr[i] + "j " + arr[j] + "k " + arr[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
}
