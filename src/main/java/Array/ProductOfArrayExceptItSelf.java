package Array;

public class ProductOfArrayExceptItSelf {
    int[] result;

    public int[] findProduct(int[] arr) {
        int tempMovingfromLeft = 1;
        result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = tempMovingfromLeft;
            tempMovingfromLeft = tempMovingfromLeft * arr[i]; // Element product to the left of i
        }

        int tempMovingFromRight = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = tempMovingFromRight;
            tempMovingFromRight = tempMovingFromRight * arr[i]; // Element product to the right of i
        }
        return result;
    }
}
