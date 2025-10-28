package medium;

import java.util.HashMap;
import java.util.Map;

class LC347 {
    int[] topKFrequent(int[] numbers, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int[] answer = new int[k];

        for (int number : numbers) {
            if (frequencies.containsKey(number)) {
                int frequency = frequencies.get(number) + 1;
                frequencies.put(number, frequency);
            } else {
                frequencies.put(number, 1);
            }
        }


        for (int i = 0; i < k; i++) {
            int index = 0;
            int biggest = Integer.MIN_VALUE;

            for (int number : frequencies.keySet()) {
                if (frequencies.get(number) > biggest) {
                    index = number;
                    biggest = frequencies.get(number);
                }
            }

            answer[i] = index;
            frequencies.remove(index);
        }

        return answer;
    }
}
