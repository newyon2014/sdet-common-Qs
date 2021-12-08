package Numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveEvenIntegers {
    public int[] removeEvenInteger(int [] arr){
        //Identify Odd numbers
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0)
                oddCount++;
        }
        int [] oddOnly = new int[oddCount];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                oddOnly[index] = arr[i];
                index++;
            }
        }
        return oddOnly;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,6,8,9};

        Arrays.stream(arr)
                .filter(num -> num%2!=0)
                .forEach(num -> System.out.println(num)); //System.out::println
    }
}
