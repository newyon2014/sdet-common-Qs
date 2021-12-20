package Array.Search;

public class SearchInsertPositionInSortedArray {
    /*
     *   sorted Array
     *   distinct members - no duplicate
     *   If target value not found , return the index where it would be if it were inserted in order
     *   complexity - O(log n)
     * */

    public int searchIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}

