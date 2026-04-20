import java.util.*;

/*
Problem: Unique Number of Occurrences
LeetCode: 1207

Approach:
- Count frequency of each element using HashMap
- Store frequencies in HashSet
- If duplicate frequency found → return false

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int count : map.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = uniqueOccurrences(arr);

        System.out.println("Result: " + result);

        sc.close();
    }
}