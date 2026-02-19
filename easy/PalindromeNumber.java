/*
Problem: Palindrome Number

Approach:
Reverse digits of number and compare with original.

Time Complexity: O(log n)
Space Complexity: O(1)

Concepts Used:
- While loop
- Modulus operator
- Integer division
*/
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if(original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
