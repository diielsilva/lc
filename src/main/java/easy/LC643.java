package easy;

class LC643 {
    double findMaxAverage(int[] numbers, int k) {
        double average = 0D;
        int windowStart = 0;
        int windowEnd = k - 1;
        double windowValue = 0D;

        for (int i = 0; i <= windowEnd; i++) {
            windowValue += numbers[i];
        }

        average = windowValue / k;
        windowEnd++;

        for (; windowEnd < numbers.length; windowStart++) {
            windowValue += numbers[windowEnd];
            windowValue -= numbers[windowStart];

            double currentValue = windowValue / k;

            if (currentValue > average) {
                average = currentValue;
            }

            windowEnd++;
        }

        return average;
    }
}
