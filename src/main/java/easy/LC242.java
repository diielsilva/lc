package easy;

import java.util.HashMap;
import java.util.Map;

class LC242 {
    boolean isAnagram(String s, String t) {
        Map<Character, Integer> sLetters = new HashMap<>();
        Map<Character, Integer> tLetters = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!sLetters.containsKey(s.charAt(i))) {
                sLetters.put(s.charAt(i), 1);
            } else {
                sLetters.put(s.charAt(i), sLetters.get(s.charAt(i)) + 1);
            }

            if (!tLetters.containsKey(t.charAt(i))) {
                tLetters.put(t.charAt(i), 1);
            } else {
                tLetters.put(t.charAt(i), tLetters.get(t.charAt(i)) + 1);
            }
        }


        if (sLetters.size() != tLetters.size()) {
            return false;
        }

        for (char key : sLetters.keySet()) {
            if (!tLetters.containsKey(key) || !tLetters.get(key).equals(sLetters.get(key))) {
                return false;
            }
        }

        return true;
    }
}
