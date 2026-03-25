import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, candidates, target, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(int index, int[] candidates, int target,
                                 List<Integer> current, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < candidates.length; i++){

            current.add(candidates[i]);

            // stay at same index → reuse element
            backtrack(i, candidates, target - candidates[i], current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            candidates[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("Combinations:");
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}