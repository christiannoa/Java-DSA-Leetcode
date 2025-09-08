/**
 * 
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. Y
 * ou may assume that the majority element always exists in the array.
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 */

class Solution {
    public int majorityElement(int[] nums) {
        // candidte for majority element
        int candidate = 0;

        // conunter tob track the count of candidate
        int count = 0;

        // iterate through the array
        for (int num : nums) {
            // if current count is 0, choose the curent number as candidate
            if (count == 0) {
                candidate = num;
            }

            // if current number equals candidate, increment count
            // else decrement count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        // After one pass, the candidate is the majorite element
        return candidate;
    }
}

// ✅ Time Complexity: O(n) (one pass)
// ✅ Space Complexity: O(1)