package String.Remove;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDup2(String str) {
        String strNoDup = "";

        // convert str to char[]
        char[] letters = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        // add each letter to set. It will remove duplicates - Set does not allow duplicates
        for(char ch : letters) {
            set.add(ch);
        }

        // put back to String from Set
        for(Character ch : set) {
            strNoDup += ch;
        }

        return strNoDup;
    }

    // Time Complexity: O(n)

}
