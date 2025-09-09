/**
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 * 
 * 
 */

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Track the minimum price thus far
        int maxProfit = 0; // track the maximum profit thus far

        // loop through each day's stock price
        for (int price : prices) {
            // upadte minPrice if we dound a new lower price
            if (price < minPrice) {
                minPrice = price;
                // otherwise, calculate profit if we sold today
            } else {
                int profit = price - minPrice;
                // update maxProfit if today's profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit; // return max found profit
    }
}

// ✅ Time Complexity: O(n) → one pass
// ✅ Space Complexity: O(1) → just two variables