/*Time Complexity : O(n+m)
Space Complexity : O(n)

Approach:
1.Store elements of first array in HashMap
2.Traverse second array
3.If element exists in map → add to result
4.Remove it from map to keep unique result*/

import java.util.*;

public class IntersectionOfArrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr1){
            map.put(num,1);
        }

        for(int num : arr2){

            if(map.containsKey(num)){
                result.add(num);
                map.remove(num);
            }

        }

        System.out.println("Intersection elements:");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}