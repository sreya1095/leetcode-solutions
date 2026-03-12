/*Approach

We use Sliding Window + HashSet.
Steps:
1.Maintain two pointers left and right
2.Use HashSet to track characters
3.If duplicate found → move left
4.Track maximum length
TC:O(n)
SC:O(min(n,charset))*/

import java.util.*;

public class LongestSubStringWithoutRepeating {

    public static int longestSubstring(String s){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = sc.nextLine();

        int result = longestSubstring(input);

        System.out.println("Longest substring length: " + result);
    }
}