package Array;

public class MaxDiffBetweenAdjElements {
    public static int maxDiff(int[] numbers) {
        int diff = Math.abs(numbers[1] - numbers[0]);
        for (int i = 1; i < numbers.length - 1; i++)
            if (Math.abs(numbers[i + 1] - numbers[i]) > diff)
                diff = Math.abs(numbers[i + 1] - numbers[i]);
        return diff;
    }
}