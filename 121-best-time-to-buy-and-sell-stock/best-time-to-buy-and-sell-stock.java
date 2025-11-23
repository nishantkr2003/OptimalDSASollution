class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int best = prices[0];


        for(int i=0;i<prices.length;i++){
            if(prices[i]>best){
                maxProfit = Math.max(maxProfit, prices[i]-best);
            }
            best = Math.min(best,prices[i]);
        }
        return maxProfit;
    }
}
























// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxprofit = 0;
//         int bestBuy = prices[0];
//         for(int i=0;i<prices.length;i++){   
//             if(prices[i] > bestBuy){
//                 maxprofit = Math.max(maxprofit,prices[i]-bestBuy);
//             }
//             bestBuy = Math.min(bestBuy,prices[i]);
//         }
//         return maxprofit;
//     }
// }


