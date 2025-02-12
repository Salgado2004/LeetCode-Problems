package interview;

public class Problem121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        Problem121 solution = new Problem121();
        System.out.println(solution.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE, sell;

        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = price - buy;
            profit = Math.max(profit, sell);
        }
        return profit;
    }
}
