package interview;

public class Problem122 {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};

        Problem122 solution = new Problem122();
        System.out.println(solution.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int profit = 0, totalprofit = 0;
        int buy = Integer.MAX_VALUE, sell;

        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = price - buy;
            if (profit <= sell) {
                profit = sell;
            } else {
                totalprofit += profit;
                profit = 0;
                buy = price;
            }
        }
        totalprofit += profit;
        return totalprofit;
    }
}
