package Array.Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonElementBetweenArray {

    public static void main(String[] args) {

        //3. Find the missing element
        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l7.removeAll(l6);
        System.out.println(l7);

        //4. Find out the common element
        ArrayList<String> l8 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> l9 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));

        l8.retainAll(l9);
        System.out.println(l8);
    }
}
