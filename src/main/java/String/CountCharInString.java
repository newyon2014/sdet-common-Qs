package String;

import java.util.HashMap;
import java.util.Map;

public class CountCharInString {
    // countLetters("hello")    -> {{'h', 1}, {'e', 1}, {'l', 2}, {'o', 1}}
    // countLetters("aauuchhh") -> {{'a', 2}, {'u', 2}, {'c', 1}, {'h', 3}}
    // countLetters("aaaaaa")   -> {{'a', 6}}
    // countLetters("abc")      -> {{'a', 1}, {'b', 1}, {'c', 1}}

    public Map<Character, Integer> countLetters(String str) {
        // if order is matter, we can use LinkedHashMap instead
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if map already contains the key, get the value and put back with +1
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) + 1);
            } else {
                // if does not contains char as key, new letter put with value 1
                letters.put(ch, 1);
            }
        }

        return letters;
    }

    // Time Complexity: O(n)
}
