/*
Problem: 875. Koko Eating Bananas

Approach:
- Binary Search on Eating Speed
- For each mid (speed), calculate total hours needed
- If hours <= h → try smaller speed
- Else → increase speed

Time Complexity: O(n log max)
Space Complexity: O(1)
*/

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // find max pile (upper bound)
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (canEat(piles, h, mid)) {
                answer = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1; // increase speed
            }
        }

        return answer;
    }

    private boolean canEat(int[] piles, int h, int k) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil division
        }

        return hours <= h;
    }
}