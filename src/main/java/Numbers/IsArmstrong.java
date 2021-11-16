package Numbers;

public class IsArmstrong {

    private static int powerOf(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static boolean isArmstrongNumber(int num) {
        if (num <= 0)
            return false;

        if (num <= 9)
            return true;

        int power = powerOf(num);
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            int Sum = sum + (int) Math.pow(lastDigit, power);
            num /= 10;
        }
        if (sum == num)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));

    }
}
