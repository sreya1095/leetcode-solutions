/*
🧠 Approach:
- Iterate from left to right
- Extract digits using modulo
- Check:
    ❌ digit != 0
    ❌ number % digit == 0
- If valid → add to result

⏱ Time Complexity: O(n * d)
💾 Space Complexity: O(1) (excluding result)
*/

import java.util.*;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for(int i = left; i <= right; i++){

            int num = i;
            boolean isValid = true;

            while(num > 0){
                int digit = num % 10;

                if(digit == 0 || i % digit != 0){
                    isValid = false;
                    break;
                }

                num /= 10;
            }

            if(isValid){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        SelfDividingNumbers obj = new SelfDividingNumbers();

        List<Integer> result = obj.selfDividingNumbers(1, 22);

        System.out.println(result);
    }
}