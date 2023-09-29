package DynamicProgramming;
public class BuyAndSellCoolDown {
    
     public static int maxProfit(int[] prices){
        int[][] dp = new int[prices.length+1][2];
        return maxProfit1(0,0,prices,dp);  
      }
    
    public static  int maxProfit1(int i, int buy, int[] prices, int[][] dp){
      if(i >= prices.length) return 0;
      
      if(dp[i+1][buy] != 0){
         return dp[i+1][buy]; 
        }
      
      int x = 0;
      if(buy == 0){  
        int ans1 = maxProfit1(i + 1,1,prices,dp) - prices[i]; 
        int ans2 = maxProfit1(i + 1, 0, prices, dp);
        x = Math.max(ans1,ans2);
      }else{               
        int sell =  maxProfit1(i + 2,0,prices,dp) + prices[i]; 
        int noSell =  maxProfit1(i + 1,1,prices,dp); 
        x = Math.max(sell,noSell);
      }
      return dp[i+1][buy] = x;
    }
}
