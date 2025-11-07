package easy;

import java.util.regex.Pattern;

class LC125 {
    boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || isNumeric(String.valueOf(s.charAt(i)))) {
                builder.append(s.charAt(i));
            }
        }

        String trimmedString = builder.toString();
        int start = 0;
        int end = trimmedString.length() - 1;

        while (start < end) {
            char a = trimmedString.charAt(start);
            char b = trimmedString.charAt(end);

            if (a != b) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    boolean isNumeric(String s) {
        String regex = "-?\\d+(\\.\\d+)?";
        return Pattern.matches(regex, s);
    }
}
