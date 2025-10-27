package easy;

import java.util.HashMap;
import java.util.Map;

class LC217 {
    boolean containsDuplicate(int[] numbers) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int number : numbers) {
            if (cache.containsKey(number)) {
                return true;
            }

            cache.put(number, 1);
        }

        return false;
    }
}
