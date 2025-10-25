package easy;

class LC1716 {
    int totalMoney(int n) {
        int mondayValue = 1;
        int days = 0;
        int previousDay = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (days == 7) {
                days = 0;
                mondayValue++;
                previousDay = mondayValue;
                total += mondayValue;
            } else {
                total += previousDay + 1;
                previousDay++;
            }

            days++;
        }

        return total;
    }
}
