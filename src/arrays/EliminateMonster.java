package Arrays;
import java.util.*;
public class EliminateMonster {
    public static void main(String[] args){

    }
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];
        for(int i = 0 ; i< n ; i++){
            time[i] = (double)dist[i] / speed[i] ;
        }
        Arrays.sort(time);

        for(int i = 0 ; i< n ;i++){
            if(time[i]<=i){
                return i;
            }
        }
        return n;
    }
}
