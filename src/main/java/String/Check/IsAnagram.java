package String.Check;

import java.util.Arrays;

public class IsAnagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.replaceAll("\\s", "").length() !=
                s2.replaceAll("\\s", "").length()) {
            return false;
        }
        char arr1[] = s1.toLowerCase().toCharArray();
        char arr2[] = s1.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "Tac"));
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Listen", "Sil  ent"));
        System.out.println(isAnagram("LIVES", "Elvis"));

        System.out.println(String.valueOf(100).length());


    }
}
