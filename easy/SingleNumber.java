/*Time :O(n)
Space : O(1)*/

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums){

        int result = 0;

        for(int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }

        return result;
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

        int result = singleNumber(nums);

        System.out.println("Single number: " + result);
    }
}