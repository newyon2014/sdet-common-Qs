package String.Check;

public class IsSubSequenceofStr {
    public static boolean isSubsequence(String str, String seq) {
        int i = 0; // traverse str "abcde"
        int j = 0; // traverse seq "ace"

        while (i < str.length() && j < seq.length()) {
            if (str.charAt(i) == seq.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == seq.length();
    }
}
