package String.Remove;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveVowels {
    public static String removeVowels(String str) {
        //  Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'); --> Set.of is Java 1.8 converted
        //  to Stream as below.
        Set<Character> vowels = Stream.of('a', 'e', 'i', 'o', 'u')
                .collect(Collectors.toCollection(HashSet::new));

        StringBuilder sb = new StringBuilder();

        char[] chars = str.toCharArray();
        for (Character ch : chars) {
            if (!vowels.contains(ch)) { // c b j k O(1)
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
