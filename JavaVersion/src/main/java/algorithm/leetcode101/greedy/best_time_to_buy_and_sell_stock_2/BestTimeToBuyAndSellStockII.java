package algorithm.leetcode101.greedy.best_time_to_buy_and_sell_stock_2;

/**
 * 122. Best Time to Buy and Sell Stock II
 * @author ：xiaobai
 * @date ：2022/1/21 10:53
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            totalProfit += Math.max(0, prices[i]-prices[i-1]);
        }
        return totalProfit;
    }


    public int maxProfit2(int[] prices) {
        boolean has = false;
        int totalProfit = 0;
        int currentStock = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (has && prices[i] > prices[i+1]){
                has = false;
                totalProfit += (prices[i] - currentStock);
                currentStock = 0;
            }

            if (!has && prices[i] < prices[i+1]){
                currentStock = prices[i];
                has = true;
            }
        }
        if (has){
            totalProfit += (prices[prices.length-1] - currentStock);
        }
        return totalProfit;
    }
}
