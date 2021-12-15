package String.Reverse;

public class ReverseWordInSentenceWithRecursion {

   // I -  Base condition in recursion, if the input is empty then we just return (unwind the stack in recursion)
   // II - We are splitting input string into two parts - first element of array will contain the first word, second element
          // of array will contain the remaining sentence
   // III - Tail recursion - removes first word and appends it to the last

    public String reverse(String input) {
        if (input.isEmpty()) { // --> I
            return input;
        }
        String[] arr = input.split(" ", 2); // --> II
        String firstWord = arr[0];
        String remainingSentence;
        if (arr.length == 2)
            remainingSentence = arr[1];
        else
            remainingSentence = "";
        return reverse(remainingSentence) + firstWord + " "; // --> III
    }
}
