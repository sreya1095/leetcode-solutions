/*Time : O(n log k)
Space : O(n)*/

import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // min heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for(int key : map.keySet()){
            pq.add(key);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];

        for(int i = k - 1; i >= 0; i--){
            result[i] = pq.poll();
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

        System.out.println("Enter k:");
        int k = sc.nextInt();

        int[] result = topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}