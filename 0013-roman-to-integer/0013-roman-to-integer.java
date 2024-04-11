import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);

        int sum = 0;
        int prevValue = 0; 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = symbol.get(currentChar);

            if (i > 0 && currentValue > prevValue) {
                sum += currentValue - 2 * prevValue; 
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }
}
