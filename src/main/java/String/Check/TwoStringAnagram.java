package String.Check;

import java.util.Arrays;

public class TwoStringAnagram {
    // isAnagram("listen", "silent")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false

    public boolean isAnagram(String str, String str1) {
        // convert both String to char[]
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return Arrays.equals(arrStr, arrStr1);
    }

    // Time Complexity: O(n log n)
}
