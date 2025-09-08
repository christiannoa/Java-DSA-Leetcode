/**
 * 189. Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps,
 * where k is non-negative.
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // Normalize k in case it's larger than array length

        // Step 1. Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2. Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3. Reverse the remaining elements
        reverse(nums, k, n - 1);

    }

    // helper mehtod to reverse elements in-place
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
}

// ✅ Time Complexity: O(n) (each element reversed at most twice)
// ✅ Space Complexity: O(1) (in-place)