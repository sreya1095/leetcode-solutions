import java.util.*;

/*
Problem: Median of Two Sorted Arrays
LeetCode: 4 (Hard)

Approach:
1. Merge both arrays into a single array
2. Sort the merged array
3. Find median based on length (even/odd)

Time Complexity: O((n + m) log(n + m))
Space Complexity: O(n + m)
*/

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];
        int k = 0;

        // copy nums1
        for(int i = 0; i < n; i++){
            merged[k++] = nums1[i];
        }

        // copy nums2
        for(int j = 0; j < m; j++){
            merged[k++] = nums2[j];
        }

        // sort merged array
        Arrays.sort(merged);

        int len = merged.length;

        // find median
        if(len % 2 == 0){
            return (merged[len/2] + merged[len/2 - 1]) / 2.0;
        } else {
            return merged[len/2];
        }
    }

    // Main method for local testing (optional)
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }

        double result = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median: " + result);

        sc.close();
    }
}