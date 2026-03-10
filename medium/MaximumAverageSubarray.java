import java.util.*;

public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        int maxSum = sum;

        for(int i=k;i<nums.length;i++){

            sum = sum + nums[i] - nums[i-k];

            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return (double)maxSum / k;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter window size k:");

        int k = sc.nextInt();

        double result = findMaxAverage(arr, k);

        System.out.println("Maximum Average: " + result);
    }
}