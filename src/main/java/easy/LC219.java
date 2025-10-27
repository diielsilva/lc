package easy;

import java.util.*;

class LC219 {
    boolean containsNearbyDuplicate(int[] numbers, int num) {
        Map<Integer, List<Integer>> cache = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (cache.containsKey(numbers[i])) {
                cache.get(numbers[i]).add(i);
            } else {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                cache.put(numbers[i], indexes);
            }
        }

        for (int key : cache.keySet()) {
            List<Integer> indexes = cache.get(key);

            if (indexes.size() > 1) {
                for (int i = 0; i < indexes.size(); i++) {
                    for (int j = i + 1; j < indexes.size(); j++) {
                        if (Math.abs(indexes.get(i) - indexes.get(j)) <= num) {
                            return true;
                        }
                    }
                }
            }

        }

        return false;
    }
}
