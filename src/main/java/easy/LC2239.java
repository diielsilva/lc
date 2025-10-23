package easy;

class LC2239 {
    int findClosestNumber(int[] numbers) {
        int smallest = Math.abs(numbers[0]);
        int smallestIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) < smallest) {
                smallest = Math.abs(numbers[i]);
                smallestIndex = i;
            } else if (Math.abs(numbers[i]) == smallest) {
                if (numbers[smallestIndex] < numbers[i]) {
                    smallestIndex = i;
                }
            }
        }

        return numbers[smallestIndex];
    }
}
