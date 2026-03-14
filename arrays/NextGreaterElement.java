/*TC:0(n+m)
SC:O(n)*/

import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of nums1:");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter elements of nums1:");
        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter size of nums2:");
        int m = sc.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter elements of nums2:");
        for(int i=0;i<m;i++){
            nums2[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2){

            while(!stack.isEmpty() && num > stack.peek()){
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        System.out.println("Next greater elements:");

        for(int num : nums1){
            System.out.print(map.get(num) + " ");
        }
    }
}