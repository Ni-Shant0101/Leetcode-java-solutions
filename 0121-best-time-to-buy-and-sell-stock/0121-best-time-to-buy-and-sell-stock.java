class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // best day to buy
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // best profit if sold today
            }
        }

        return maxProfit;

    }
}