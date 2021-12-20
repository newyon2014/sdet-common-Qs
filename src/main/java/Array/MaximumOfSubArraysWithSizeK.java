package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumOfSubArraysWithSizeK {
    /*
     *     Given an array of integers arr, return the maximum of the sliding window element.
     *     Sliding Window -
     *        - Will have size k
     *        - moving from left to right
     *        - K no of elment are visible at a time.
     * */

    public List<Integer> maxSliding(int[] arr, int k) {
        int[] nextGreaterIndex = nextGreaterElement(arr);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - k; i++) {
            int j = i;
            while (nextGreaterIndex[j] < i + k) {
                j = nextGreaterIndex[j];
            }
            result.add(arr[j]);
        }
        return result;
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty())
                result[i] = arr.length;
            else
                result[i] = stack.peek();
            stack.push(i);
        }
        return result;
    }


}
