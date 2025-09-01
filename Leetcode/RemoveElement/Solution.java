/**
 * 27. Remove Element
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums.
 * Return k.
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements
 * of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 * 
 **/

class Solution {
    public int removeElement(int[] nums, int val) {

        // THe length of the "valid" portion of the array
        int len = nums.length;
        // pointer to traverse the array
        int i = 0;

        // loop unitl we've checked all valid elements
        while (i < len) {
            // if current element equals the value to remove
            if (nums[i] == val) {
                // replace it with the last valid element
                nums[i] = nums[len - 1];
                // reduce the length Iignore last element now)
                len--;

            } else {
                // increment pointer only if no replacement
                i++;
            }
        }
        // return the new length of the array
        return len;
    }
}

// ime Complexity: O(n)
// ✅ Space Complexity: O(1) — in-place modification