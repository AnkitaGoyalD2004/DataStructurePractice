package Arrays;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[]args){

    }
    public static List<Integer> spiralOrder(int matrix[][]){
    List<Integer> ans = new ArrayList<Integer>();
    int startRow  = 0 , endRow = matrix.length-1;
    int startCol = 0 , endCol = matrix[0].length-1;
    while(startRow <= endRow && startCol <= endCol){
        //top
        for(int j=startCol; j<=endCol; j++){
            ans.add(matrix[startRow][j]);
        }
        // right
        for(int i=startRow+1; i<=endRow; i++){
            ans.add(matrix[i][endCol]);
        }
        // bottom
        for(int j= endCol-1; j>=startCol; j--){
            if(startRow==endRow){
                break;
            }
            ans.add(matrix[endRow][j]);
        }
        // left
        for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol==endCol){
                break;
            }
            ans.add(matrix[i][startCol]);
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;

          
    }
    return ans;
    }
}

