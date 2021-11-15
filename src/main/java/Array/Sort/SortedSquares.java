package Array.Sort;

public class SortedSquares {
    public static int[] sortedSquares(int[] arr){
        // Two pointer technique
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int[] result = new int[n];

        // {-4, -1, 0, 3} -> {0, 1, 9, 16}

        for(int k = n - 1; k >= 0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }
}
