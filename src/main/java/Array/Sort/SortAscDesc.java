package Array.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortAscDesc {
    public static void main(String[] args) {

        //1. Sort and then equals
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l1, Collections.reverseOrder());
        Collections.sort(l2, Comparator.reverseOrder());
    }
}
