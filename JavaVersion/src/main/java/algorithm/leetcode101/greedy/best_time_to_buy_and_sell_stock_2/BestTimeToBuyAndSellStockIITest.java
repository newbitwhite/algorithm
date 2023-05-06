package algorithm.leetcode101.greedy.best_time_to_buy_and_sell_stock_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockIITest {
    @Test
    public void test_max_profit(){
        BestTimeToBuyAndSellStockII buyAndSellStockII = new BestTimeToBuyAndSellStockII();
        int[] a = {7, 1, 5, 3, 6, 4};
        int i = buyAndSellStockII.maxProfit(a);
        System.out.println(i);
        Assertions.assertEquals(7, i);
        int l = buyAndSellStockII.maxProfit2(a);
        System.out.println(l);
        Assertions.assertEquals(7, l);

        int[] b = {1, 2, 3, 4, 5};
        int j = buyAndSellStockII.maxProfit(b);
        System.out.println(j);
        Assertions.assertEquals(4, j);

        int[] c = {7,6,4,3,1};
        int k = buyAndSellStockII.maxProfit(c);
        System.out.println(k);
        Assertions.assertEquals(0, k);
    }
}
