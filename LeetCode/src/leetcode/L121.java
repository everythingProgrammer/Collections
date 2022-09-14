package leetcode;

public class L121 {


    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int max = prices[0];

        for(int i = 1; i<prices.length; i++){

            if(prices[i] > min){
                max = prices[i];
                if(max-min > maxProfit){
                    maxProfit = max-min;
                }
            }else if(prices[i] < min){
                min = prices[i];
            }
        }
    return maxProfit;

    }


}
