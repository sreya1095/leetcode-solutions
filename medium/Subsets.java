/*Time : O(2^n)
Space : O(n)*/

import java.util.*;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result){

        result.add(new ArrayList<>(current));

        for(int i = index; i < nums.length; i++){

            current.add(nums[i]);

            backtrack(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
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

        List<List<Integer>> result = subsets(nums);

        System.out.println("Subsets are:");
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}