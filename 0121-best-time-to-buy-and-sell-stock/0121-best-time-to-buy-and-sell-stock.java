class Solution {
    public int maxProfit(int[] prices) {
        
int minPrice = Integer.MAX_VALUE; // track lowest price
        int maxProfit = 0;               // track max profit

        for (int price : prices) {
            // update min price if found a smaller one
            if (price < minPrice) {
                minPrice = price;
            } else {
                // check profit if we sell today
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;

    }
}