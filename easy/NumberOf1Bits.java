/*Time : O(number of 1s)
Space :(1)*/ 

import java.util.*;

public class NumberOf1Bits {

    public static int hammingWeight(int n){

        int count = 0;

        while(n != 0){
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int result = hammingWeight(n);

        System.out.println("Number of 1 bits: " + result);
    }
}