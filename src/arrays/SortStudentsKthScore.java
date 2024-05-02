package Arrays;
import java.util.*;
public class SortStudentsKthScore {

public int[][] sortTheStudents(int[][] score, int k) {
        
Arrays.sort(score,Comparator.comparingDouble(a -> a[k]));
int i = 0 ;
int j = score.length-1;
while(i<j){
   int[] temp = score[i];
   score[i] = score[j];
   score[j] = temp;
   i++;
   j--;
} 
return score;
    }
    //another method
     public int[][] sortTheStudents1(int[][] score, int k) {
        Arrays.sort(score, (a,b) -> (b[k] - a[k])); 
        return score;
    }

    public static void main(String[] args)
    {

    }
}
