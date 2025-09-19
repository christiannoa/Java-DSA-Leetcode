class Solution {
    public boolean canJump(int[] nums) {
        // maxReach stores the farthest index we can reach so far
        int maxReach = 0;

        // iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // if the current index is beyond the farthest we can reach, we're stuck
            if (i > maxReach) {
                return false;
            }

            // update farthest reachable index from here
            maxReach = Math.max(maxReach, i + nums[i]);

            // Early exit: if we can already reach or go beyond the last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // if loop completes, we could always move forward
        return true;
    }
}

// Time Complexity: O(n) - We traverse the array once.
// Space Complexity: O(1) - We use a constant amount of extra space.
// Greedy Approach: At each index, we check if we can reach further than before.
// If at any point, we find that we cannot move forward (i > maxReach), we
// return false.
// If we can reach or exceed the last index at any point, we return true
// immediately.

// Leetcode 55 - Jump Game
// https://leetcode.com/problems/jump-game/
/*
 * 55. Jump Game
 * You are given an integer array nums. You are initially positioned at the
 * array's first index,
 * and each element in the array represents your maximum jump length at that
 * position.
 * Return true if you can reach the last index, or false otherwise.
 */