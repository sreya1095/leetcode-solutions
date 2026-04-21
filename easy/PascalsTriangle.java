

/*
Problem: Pascal's Triangle
LeetCode: 118

Approach:
- Build triangle row by row
- First and last elements of each row are always 1
- Other elements = sum of two elements from previous row

Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/
import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){

                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        List<List<Integer>> result = generate(n);

        for(List<Integer> row : result){
            System.out.println(row);
        }

        sc.close();
    }
}