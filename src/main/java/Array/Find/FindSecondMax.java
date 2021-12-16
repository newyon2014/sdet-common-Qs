package Array.Find;

public class FindSecondMax {

    public int findSecondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i]!=max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
