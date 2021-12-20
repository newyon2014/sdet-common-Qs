package String.Reverse;

public class RecursionReverseString {

    public String reverse(String input) {
        if (input.isEmpty()) {
            System.out.println("String is empty now");
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);
    }
}
