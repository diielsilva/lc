package easy;

import java.util.LinkedHashMap;
import java.util.Map;

class LC1876 {
    int countGoodSubstrings(String s) {
        int numberOfGoodStrings = 0;

        if (s.length() >= 3) {
            int startOfWindow = 0;
            int endOfWindow = 2;

            while (endOfWindow < s.length()) {
                Map<Character, Integer> seenWords = new LinkedHashMap<>();

                for (int i = startOfWindow; i <= endOfWindow; i++) {
                    if (!seenWords.containsKey(s.charAt(i))) {
                        seenWords.put(s.charAt(i), 1);
                    }
                }

                if (seenWords.size() == 3) {
                    numberOfGoodStrings++;
                }

                startOfWindow++;
                endOfWindow++;
            }
        }

        return numberOfGoodStrings;
    }
}
