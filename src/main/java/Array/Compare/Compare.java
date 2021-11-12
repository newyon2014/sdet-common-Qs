package Array.Compare;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        //4. Find out the common element
        ArrayList<String> l8 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> l9 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));

        l8.retainAll(l9);
        System.out.println(l8);
    }
}
