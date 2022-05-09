package task.anagram;


import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        } else if (s1.length() != s2.length()) {
            return false;
        }
        List<Character> charS1 = makeCharList(s1);
        List<Character> charS2 = makeCharList(s2);
        for (Character i:charS1) {
            if (charS2.contains(i)){
                charS2.remove(i);
            }
            else{
                return false;
            }
        }
        return true;
    }

    private static List<Character> makeCharList(String string) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        return list;
    }
}
