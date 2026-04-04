/*Time : O(n)
Space : O(1)*/

import java.util.*;

public class FindTheDifference {

    public static char findTheDifference(String s, String t){

        char result = 0;

        for(int i = 0; i < s.length(); i++){
            result ^= s.charAt(i);
        }

        for(int i = 0; i < t.length(); i++){
            result ^= t.charAt(i);
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string s:");
        String s = sc.nextLine();

        System.out.println("Enter string t:");
        String t = sc.nextLine();

        char result = findTheDifference(s, t);

        System.out.println("Extra character: " + result);
    }
}