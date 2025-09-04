class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; // length of the valid deduplicated prefix

        // iterate over every number in the input array
        for (int x : nums) {
            // fewer then 2 elements so far, take the current one.
            // otherwise, ensure the current value 'x' is not the same as the value 2
            // positions back
            // guarantees we allow at most two duplicates
            if (k < 2 || nums[k - 2] != x) {
                nums[k] = x; // place current number at the next write position
                k++; // incement the write pointer
            }
        }
        // 'k' is the new length with at most two duplicates
        // k element of nums now contains the final result
        return k;
    }
}