package Numbers;

public class EvenOrOdd {
    // evenOrOdd(5)   -> Odd
    // evenOrOdd(2)   -> Even
    // evenOrOdd(100) -> Even
    // evenOrOdd(101) -> Odd

    public void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Time Complexity: O(1)
}
