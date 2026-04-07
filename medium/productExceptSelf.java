/*Time : O(n)
Space : O(1) (excluding output)*/

import java.util.*;

public class productExceptSelf {

    public static int[] productExceptSelf(int[] nums){

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // prefix
        for(int i = 1; i < n; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;

        // suffix
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
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

        int[] result = productExceptSelf(nums);

        System.out.println("Output:");
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}