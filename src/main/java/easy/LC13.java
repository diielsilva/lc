package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class LC13 {
    int romanToInt(String wholeNumber) {
        Map<Character, Integer> romanNumbers = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        Queue<Character> characters = new LinkedList<>();

        for (char individualNumber : wholeNumber.toCharArray()) {
            characters.add(individualNumber);
        }

        int integer = 0;


        while (!characters.isEmpty()) {
            char firstNumber = characters.remove();

            switch (firstNumber) {
                case 'I':
                    if (!characters.isEmpty()) {
                        char firstOnQueue = characters.peek();

                        if (firstOnQueue == 'V') {
                            integer += romanNumbers.get('V') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else if (firstOnQueue == 'X') {
                            integer += romanNumbers.get('X') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else {
                            integer += romanNumbers.get(firstNumber);
                        }
                    } else {
                        integer += romanNumbers.get(firstNumber);
                    }

                    break;
                case 'X':
                    if (!characters.isEmpty()) {
                        char firstOnQueue = characters.peek();

                        if (firstOnQueue == 'L') {
                            integer += romanNumbers.get('L') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else if (firstOnQueue == 'C') {
                            integer += romanNumbers.get('C') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else {
                            integer += romanNumbers.get(firstNumber);
                        }
                    } else {
                        integer += romanNumbers.get(firstNumber);
                    }

                    break;
                case 'C':
                    if (!characters.isEmpty()) {
                        char firstOnQueue = characters.peek();

                        if (firstOnQueue == 'D') {
                            integer += romanNumbers.get('D') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else if (firstOnQueue == 'M') {
                            integer += romanNumbers.get('M') - romanNumbers.get(firstNumber);
                            characters.remove();
                        } else {
                            integer += romanNumbers.get(firstNumber);
                        }
                    } else {
                        integer += romanNumbers.get(firstNumber);
                    }

                    break;
                default:
                    integer += romanNumbers.get(firstNumber);
            }
        }

        return integer;
    }
}
