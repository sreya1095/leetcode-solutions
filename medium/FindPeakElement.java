/*
Problem: 162. Find Peak Element

Approach:
- Use Binary Search
- If middle element is smaller than next,
  peak exists on right side
- Otherwise peak exists on left side

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }

        return left;
    }
}