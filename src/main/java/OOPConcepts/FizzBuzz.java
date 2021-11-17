package OOPConcepts;

public class FizzBuzz {
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            // first check if number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Time Complexity: O(1)
    // Note:
    // - Use % to check if number is divisible evenly by other number
    // - check if number is divisible by 3 and 5 should go first

}
