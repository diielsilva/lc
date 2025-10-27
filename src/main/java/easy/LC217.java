package easy;

import java.util.HashSet;
import java.util.Set;

class LC217 {
    boolean containsDuplicate(int[] numbers) {
        Set<Integer> cache = new HashSet<>();

        for (int number : numbers) {
            if (cache.contains(number)) {
                return true;
            }

            cache.add(number);
        }

        return false;
    }
}
