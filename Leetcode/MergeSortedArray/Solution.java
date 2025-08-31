/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * Easy
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from nums1.
 * 
 **/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // pointer for the last valid element in nums1
        int p1 = m - 1;

        // pointer for the last element in nums2
        int p2 = n - 1;

        // pointer for the last position in nums1
        int i = m + n - 1;

        // conintue until we've palced all elements from nums2 into nums1
        while (p2 >= 0) {
            // If there are still elemtnts in nums1 to compare (p1 >= 0)
            // AND nums1's current element is larger than num2's current element
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                // place nums1's element in the current last position
                nums1[i] = nums1[p1];
                p1--; // move pointer in nums1 left
            } else {
                // otherwise, place nums2's elementat the current last position
                nums1[i] = nums2[p2];
                p2--; // move pointer in nums2 left
            }
            i--; // move the merge position left for the next largest element
        }
    }
}

// ✅ Time Complexity: O(m + n) — we touch each element once.
// ✅ Space Complexity: O(1) — in-place merge.