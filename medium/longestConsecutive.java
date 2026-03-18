/*Time : O(n)
Space : O(n)*/

import java.util.*;

public class longestConsecutive {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int longest = 0;

        for(int i = 0; i < nums.length; i++){

            int num = nums[i];

            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = longestConsecutive(nums);

        System.out.println("Longest consecutive length: " + result);
    }
}