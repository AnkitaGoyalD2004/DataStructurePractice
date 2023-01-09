package AdityaVermaDynamicProgramming;

public class UnboundedKnapSack {
public static int unboundedKnapsack(int weight[], int values[],int N, int W ){
	        if(N == 0){
	            return 0;
	        }
	        if(weight[N-1] <= W){
	            int a  = unboundedKnapsack(weight,values,N-1,W);
	            int b = unboundedKnapsack(weight,values,N,W-weight[N-1])+values[N-1];
	            return Math.max(a, b);
	        }else{
	            return unboundedKnapsack(weight,values,N-1,W);
	        }
	    }
	    public static int unboundedKnapsackDp(int weight[], int values[],int N, int W){
	        int t[][] = new int[weight.length+1][W+1];
	        for(int i =1;i<weight.length+1;i++){
	            for(int j = 1;j<W+1;j++){
	                if(weight[i-1]<=j){
	                    int a = t[i-1][j];
	                    int b = t[i][j-weight[i-1]]+values[i-1];
	                    t[i][j] = Math.max(a,b);
	                }else{
	                    t[i][j] = t[i-1][j];
	                }
	            }
	        }
	        return t[weight.length][W];
	    }
}
