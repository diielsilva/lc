package easy;

class LC1652 {
    int[] decrypt(int[] code, int k) {
        int[] answer = new int[code.length];
        int abs = Math.abs(k);

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int steps = 0;
                int pos = i + 1;
                int sum = 0;

                while (steps < abs) {
                    if (pos >= code.length) {
                        pos = 0;
                    }

                    sum += code[pos];

                    steps++;
                    pos++;
                }

                answer[i] = sum;

            }
        } else if (k < 0) {
            for (int i = 0; i < code.length; i++) {
                int steps = 0;
                int pos = i - 1;
                int sum = 0;

                while (steps < abs) {
                    if (pos < 0) {
                        pos = code.length - 1;
                    }

                    sum += code[pos];

                    steps++;
                    pos--;
                }

                answer[i] = sum;

            }
        } else {
            for (int i = 0; i < code.length; i++) {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
